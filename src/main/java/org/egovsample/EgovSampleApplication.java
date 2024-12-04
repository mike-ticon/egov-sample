package org.egovsample;

import org.egovsample.member.entity.Member;
import org.egovsample.member.service.MemberService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;
import java.util.UUID;

@SpringBootApplication
public class EgovSampleApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(EgovSampleApplication.class, args);
    }

    private final MemberService memberService;

    public EgovSampleApplication(MemberService memberService)
    {
        this.memberService = memberService;
    }

    @Bean
    public CommandLineRunner startup()
    {
        return args -> {
            for(int i = 0; i < 100; i++){
                memberService.save(Member.builder()
                        .username(UUID.randomUUID().toString().substring(0, 10))
                        .age(new Random().nextInt(41) + 10)
                        .build());
            }
        };

    }
}
