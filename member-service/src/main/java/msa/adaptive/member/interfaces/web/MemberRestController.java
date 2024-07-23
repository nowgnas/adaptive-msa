package msa.adaptive.member.interfaces.web;

import msa.adaptive.member.application.port.input.GetMemberQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/general")
public class MemberRestController {
  @GetMapping("/teset")
  public void test(@RequestBody GetMemberQuery getMemberQuery) {
    // do something

  }
}
