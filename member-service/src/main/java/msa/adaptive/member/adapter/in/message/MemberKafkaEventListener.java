package msa.adaptive.member.adapter.in.message;

import msa.adaptive.member.application.port.out.KafkaConsumer;
import msa.adaptive.member.domain.event.MemberCreatedEvent;
import msa.adaptive.member.domain.model.value.MemberId;
import org.springframework.stereotype.Component;

@Component
public class MemberKafkaEventListener implements KafkaConsumer {

    @Override
    public void consume(MemberCreatedEvent event) {
        MemberId memberId = event.getMemberId();
    }
}
