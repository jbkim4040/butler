package com.general.butler.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * packageName    : com.general.butler.test
 * fileName       : TestService
 * author         : jbkim
 * date           : 2024-10-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-10        jbkim       최초 생성
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;
    public String test(Test test) {
        Test result = testRepository.save(test);
        log.info("result :: " + result.toString());

        return result.getTestId().equals(0) ? "FAIL" : "SUCCESS";
    }

    public void scheduleTest() {
        Test test = Test.builder().testMemo("test").tester("test").build();
        testRepository.save(test);
    }
}
