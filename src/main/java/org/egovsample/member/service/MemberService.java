package org.egovsample.member.service;

import org.egovsample.member.entity.Member;

import java.util.List;

public interface MemberService
{
    List<Member> getMembers();

    Long save(Member member);
}
