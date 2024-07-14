package msa.adaptive.member.domain.delivery.model.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import msa.adaptive.member.domain.delivery.model.value.Address;
import msa.adaptive.member.domain.member.model.value.MemberNo;

@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Delivery {

    private MemberNo memberNo;
    private Address address;

}
