package board.show.dto;

import board.show.domain.entity.MemberEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDto {

    private Long id;
    private String name;
    private String password;
    private LocalDateTime createDate;
    private LocalDateTime modifiedDate;

    public MemberEntity toEntity() {
        return MemberEntity.builder().id(id)
                .name(name)
                .password(password)
                .build();
    }

    @Builder
    public MemberDto(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}
