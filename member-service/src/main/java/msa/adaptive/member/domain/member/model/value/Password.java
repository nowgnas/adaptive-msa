package msa.adaptive.member.domain.member.model.value;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Password {

    private String value;

    public static Password getNewInstance(String newPassword) {
        return Password.builder().value(newPassword).build();
    }

    public boolean match(String currentPassword) {
        return this.getValue().equals(currentPassword);
    }
}
