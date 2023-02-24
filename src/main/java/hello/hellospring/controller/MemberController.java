package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller//component가 들어있음
public class MemberController {

    private final MemberService memberService;

    @Autowired // memberService를 연결해준다.
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
