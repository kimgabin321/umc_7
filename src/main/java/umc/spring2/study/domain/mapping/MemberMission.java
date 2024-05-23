package umc.spring2.study.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import umc.spring2.study.domain.common.BaseEntity;
import umc.spring2.study.domain.enums.MissionStatus;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberMission extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private MissionStatus status;
}
