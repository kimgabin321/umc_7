package umc.spring2.study.service.MemberService;

import umc.spring2.study.domain.Member;
import umc.spring2.study.web.dto.MemberRequestDTO;

public interface MemberCommandService {

    Member joinMember(MemberRequestDTO.JoinDto request);
}