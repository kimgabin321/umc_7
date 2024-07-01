package umc.spring2.study.service.MemberService;

import umc.spring2.study.domain.Member;

import java.util.Optional;

public interface MemberQueryService {

    Optional<Member> findMember(Long id);

}