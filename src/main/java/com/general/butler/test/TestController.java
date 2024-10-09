package com.general.butler.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.general.butler.test
 * fileName       : TestController
 * author         : jbkim
 * date           : 2024-10-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-10-10        jbkim       최초 생성
 */
@Slf4j
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {
Z
    private static TestService testService;

    @PostMapping("/save")
    public String saveTest(String param) {
        log.info("param :: {}", param);
        return "SUCCESS";
    }
}
