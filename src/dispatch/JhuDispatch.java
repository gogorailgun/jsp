package dispatch;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import controller.*;

import java.io.*;
import java.util.*;

public class JhuDispatch extends HttpServlet {
	// 1. map 만들고
	public HashMap<String, JhuMain> map;
	
	public void init(ServletConfig config) throws ServletException {
		/*	
		  	서버가 기동된 후 최초로 *.jhu 라는 요청이 왔을때 한번만 실행되는 함수.
		  	처음 서블릿이 시작되면 properties 파일을 읽어서 map으로 만들어준다.
		  	Properties 함수를 이용해 작업한다.
		 */ 
		Properties prop = new Properties();
		FileInputStream fin = null;
		try {
			// 읽어올 파일의 경로를 알아낸다.
			String spath = this.getClass().getResource("").getPath();
//			System.out.println("### dispath spath : " + spath); << 실제 경로
			
			fin = new FileInputStream(spath + "../resources/jhuProperties.properties");
			prop.load(fin);
			
			// 컨트롤러 잘 불러오나 확인
//			System.out.println("prop - /main.jhu : " + prop.get("/main.jhu"));
			
		} catch(Exception e) {
			System.out.println("### .jhu init 실패. ###");
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch(Exception e) {}
		}
	}
}
