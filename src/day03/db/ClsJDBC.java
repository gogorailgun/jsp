package day03.db;

import java.sql.*;

public class ClsJDBC {
	
	public ClsJDBC() {
		try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			System.out.println("### 드라이버 로딩 실패 ###");
		}
	}
	
	public Connection getCon() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hello", "hello");
		} catch(Exception e) {
			System.out.println("### Connection get Fail ###");
		}
		
		return con;
	}
	
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
		} catch(Exception e) {
			System.out.println("### Statement get Fail ###");
		}
		return stmt;
	}
	
	// 질의명령이 들어가있기 때문에 sql을 같이 넣어준다
	public PreparedStatement getPSTMT(Connection con, String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
		} catch(Exception e) {
			System.out.println("### PreparedStatement get Fail ###");
		}
		return pstmt;
	}
	
	// 자원 반환해주는 함수
	public void Close(Object o) {
		try {
			if(o instanceof Connection) {
				((Connection) o).close();
			} else if(o instanceof Statement) {
				((Statement) o).close();
			} else if(o instanceof PreparedStatement) {
				((PreparedStatement) o).close();
			} else if(o instanceof ResultSet) {
				((ResultSet) o).close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
