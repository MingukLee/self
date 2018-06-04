package js.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JsTest1Servlet
 */
@WebServlet(name = "JsTest1", urlPatterns = { "/jsTest1" })
public class JsTest1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JsTest1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		String data = request.getParameter("data");
		//System.out.println(data);
		// 3. 비즈니스 로직 처리 
		//String result ;//= "보내주신 "+data+"를 잘 받았습니다.";
		String result = null;
		if(data.equals("mslove1")) {
			result = "1";
		}else {
			result= "2";
		}
		// ※ 새로운 페이지로 보낸는것이 아니다.
		// 4. 응답해주기 .
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(result);
		
		response.getWriter().close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
