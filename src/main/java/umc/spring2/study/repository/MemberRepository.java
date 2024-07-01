package umc.spring2.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring2.study.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
