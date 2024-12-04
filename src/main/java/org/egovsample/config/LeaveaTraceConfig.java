package org.egovsample.config;

import org.egovframe.rte.fdl.cmmn.trace.LeaveaTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LeaveaTraceConfig
{
    @Bean
    public LeaveaTrace leaveaTrace()
    {
        return new LeaveaTrace();
    }
}
