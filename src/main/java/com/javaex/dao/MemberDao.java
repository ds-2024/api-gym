package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.LessonVo;
import com.javaex.vo.MemberVo;
import com.javaex.vo.PtVo;


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

	// 회원가입
	public int join(MemberVo memberVo) {
		System.out.println("MemberDao.userModify()");
		int count = sqlSession.insert("member.join", memberVo);
		System.out.println(count);
		return count;
	}

	// id 중복체크
	public int check(String id) {
		System.out.println("MemberDao.userModify()");
		System.out.println(id);
		int count = sqlSession.selectOne("member.idCheck", id);
		System.out.println(count);
		return count;
	}

	// 로그인 후 로그인 성공한 멤버 페이지 + 수정폼
	public MemberVo memberSelectOneByNo(int no) {

		System.out.println("MemberDao.memberSelectOneByNo()");
		System.out.println(no);
		MemberVo memberVo = sqlSession.selectOne("member.selectMemberInfo", no);
		System.out.println(memberVo);
		return memberVo;
	}

	// 회원정보수정
	public int memberUpdate(MemberVo memberVo) {

		System.out.println("MemberDao.memberUpdate()");
		int count = sqlSession.update("member.update", memberVo);
		System.out.println(count);
		return count;
	}

	// 해당회원 정보 1명 정보 가져오기
	public MemberVo ptmemberSelectOneByNo(int no) {
		System.out.println("MemberDao.ptmemberSelectOneByNo()");
		
		MemberVo ptmemberVo = sqlSession.selectOne("member.selectMemberInfo", no);
		return ptmemberVo;
	}
	
	// 해당회원의 pt 리스트 정보
	public List<PtVo> ptInfoSelectList(int no) {
		System.out.println("MemberDao.ptInfoSelectList()");

		List<PtVo> ptInfoList = sqlSession.selectList("member.selectMemberPt" ,no);
		return ptInfoList;
	}
	
	
	// 회원정보 + 해당회원의 lesson 리스트정보
	public List<LessonVo> memberLessonSelectList(int ptNo) {
		System.out.println("MemberDao.MbLessonSelectList()");

		List<LessonVo> mblessonList = sqlSession.selectList("member.selectLessonByPtNo" ,ptNo);

		return mblessonList;
	}
	

}