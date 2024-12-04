package org.egovsample.member.repository;

import org.egovsample.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long>
{
    
}
