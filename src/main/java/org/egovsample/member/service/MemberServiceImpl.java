package org.egovsample.member.service;


import lombok.RequiredArgsConstructor;
import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.egovsample.member.entity.Member;
import org.egovsample.member.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class MemberServiceImpl extends EgovAbstractServiceImpl implements MemberService
{
    private final MemberRepository memberRepository;

    @Override
    public List<Member> getMembers()
    {
        return memberRepository.findAll();
    }

    @Transactional
    @Override
    public Long save(Member member)
    {
        return memberRepository.save(member).getId();
    }
}
