package org.egovsample.member.controller;

import lombok.RequiredArgsConstructor;
import org.egovsample.member.entity.Member;
import org.egovsample.member.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/members")
@RestController
public class MemberController
{
    private final MemberService memberService;

    @GetMapping
    public ResponseEntity<?> getMembers()
    {
        List<Member> members =
                memberService.getMembers();

        return ResponseEntity.ok(members);
    }
}
