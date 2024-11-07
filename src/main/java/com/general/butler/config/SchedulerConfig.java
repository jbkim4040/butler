package com.general.butler.config;

import com.general.butler.test.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * packageName    : com.general.butler.config
 * fileName       : SchedulerConfig
 * author         : jbkim
 * date           : 2024-11-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-07        jbkim       최초 생성
 */
@Slf4j
@Configuration
@RequiredArgsConstructor
public class SchedulerConfig {

    private final TestService testService;

    @Scheduled(cron = "0 0/1 * * * *")
    public void run() {
        testService.scheduleTest();
    }
}
