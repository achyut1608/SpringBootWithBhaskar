package com.boot.banking.actuator;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Slf4j
@Component
public class ReportBankingServiceHealth implements HealthIndicator {



    @Override
    public Health getHealth(boolean includeDetails) {
        return HealthIndicator.super.getHealth(includeDetails);
    }

    @Override
    public Health health() {
        return Health.up().withDetail("ReportBankingServiceHealth","Report service is up").build();
    }
}
