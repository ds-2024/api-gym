package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.MemberVo;


@Repository
public class MemberDao {

	@Autowired
	private SqlSession sqlSession;

	// 로그인
	public MemberVo memberSelectByIdPw(MemberVo memberVo) {
		System.out.println("MemberDao.memberSelectByIdPw()");
		MemberVo authUser = sqlSession.selectOne("member.selectByIdPw", memberVo);
		return authUser;
	}

	// 로그인 후 로그인 성공한 멤버 페이지
	public MemberVo memberSelectOneByNo(int no) {

		System.out.println("MemberDao.memberSelectOneByNo()");

		MemberVo memberVo = sqlSession.selectOne("member.selectOneByNo", no);
		return memberVo;
	}

	// 회원정보수정
	public int memberUpdate(MemberVo memberVo) {

		System.out.println("MemberDao.memberUpdate()");
		int count = sqlSession.update("member.update", memberVo);

		return count;
	}
}