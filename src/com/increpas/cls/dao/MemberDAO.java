package com.increpas.cls.dao;

import java.sql.*;

import db.*;

import day03.db.*;
import day03.sql.*;
public class MemberDAO {
	ClsDBCP db;
//	ClsJDBC db;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	MemberSQL mSQL;
	
	public MemberDAO() {
		db = new ClsDBCP();
//		db = new ClsJDBC();
		mSQL = new MemberSQL();
	}
	
	// 로그인 데이터베이스작업 전담 처리함수
	public int getLoginCnt(String sid, String spw) {
		int cnt = 0 ;
		// 할일
		// 1. 커넥션 얻어오고
		con = db.getCon();
		// 2. 질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.SEL_LOGIN_CNT);
		// 3. PreparedStatement 가져오고
		pstmt = db.getPSTMT(con, sql);
		try {
			// 4. 질의명령 완성하고
			pstmt.setString(1, sid);
			pstmt.setString(2, spw);
			// 5. 질의명령 보내고 결과 받고
			rs = pstmt.executeQuery();
			// 6. 결과 꺼내고
			rs.next();
			cnt = rs.getInt("cnt");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		// 7. 데이터 넘겨주고
		return cnt;
	}
}
