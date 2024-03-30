package com.javaex.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.MemberService;
import com.javaex.util.JsonResult;
import com.javaex.util.JwtUtil;
import com.javaex.vo.MemberVo;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class MemberController {

	 @Autowired
	private MemberService memberService;

	// 로그인
	@PostMapping("/api/member/login")
	public JsonResult login(@RequestBody MemberVo memberVo, HttpServletResponse response) {
		System.out.println("MemberController.login()");

		MemberVo authUser = memberService.exeLogin(memberVo);
		System.out.println(authUser);

		if (authUser != null) {
			// 토큰 발급 헤더에 실어 보낸다
			JwtUtil.createTokenAndSetHeader(response, "" + authUser.getNo());
			return JsonResult.success(authUser);
		} else {
			return JsonResult.fail("로그인 실패");
		}
	}
	
	// 로그인 후 로그인 성공한 멤버 페이지(1명 데이터 가져오기)
	@GetMapping(value="/api/member/login")
	public JsonResult afterlogin(HttpServletRequest request) {
		System.out.println("MemberController.afterlogin()");
		
		// JWT 토큰에서 no 값을 추출
	    int no = JwtUtil.getNoFromHeader(request);
	    System.out.println(no);

	    // 토큰 추출
		//String token = JwtUtil.getTokenByHeader(request);
		//System.out.println("token=" + token);
		
	    // 토큰을 사용하여 사용자 인증 및 회원 정보 가져오기
		MemberVo memberVo = memberService.exeGetMemberInfo(no);

		return JsonResult.success(memberVo);
		
	}
	
	// 회원정보 수정
	@PutMapping("/api/member/modify/{no}")
	public MemberVo modify(@RequestBody MemberVo memberVo) {
		System.out.println("MemberController.modify()");

		int no = memberVo.getNo();
		System.out.println(no);
		if (no == memberVo.getNo()) {// 정상
			// db에 수정시킨다
			memberService.exeModify(memberVo);

			System.out.println(memberVo);

		}
		return memberVo;
	}

	
	

}