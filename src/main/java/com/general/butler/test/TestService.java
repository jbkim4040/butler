package com.general.butler.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
        testRepository.save(test);

        Test result = testRepository.findById(test.getTestId()).get();
        log.info("result :: " + result.toString());

        return result.getTestId().equals(0) ? "FAIL" : "SUCCESS";
    }
}
