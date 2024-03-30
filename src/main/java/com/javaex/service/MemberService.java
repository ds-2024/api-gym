package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.MemberDao;
import com.javaex.vo.MemberVo;


@Service
public class MemberService {

	@Autowired
	private MemberDao memberDao;

	// 로그인
	public MemberVo exeLogin(MemberVo memberVo) {
		System.out.println("MemberService.exeLogin()");
		MemberVo authUser = memberDao.memberSelectByIdPw(memberVo);
		return authUser;
	}

	// 로그인 후 로그인 성공한 멤버 페이지
	public MemberVo exeGetMemberInfo(int no) {
		System.out.println("MemberService.exeGetMemberInfo()");

		MemberVo memberVo = memberDao.memberSelectOneByNo(no);
		return memberVo;
	}

	// 성공후 회원정보 수정
	public int exeModify(MemberVo memberVo) {
		System.out.println("MemberService.exeModify()");

		int count = memberDao.memberUpdate(memberVo);
		System.out.println(memberVo);
		return count;
	}

}