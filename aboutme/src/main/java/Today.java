

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.naming.java.javaURLContextFactory;

/**
 * Servlet implementation class Today
 */
@WebServlet("/today")
public class Today extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	String name = "한상범";
	public String getNow() {
		
		return LocalDateTime.now().toString();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Time</title>");
		out.println("<link rel=\"stylesheet\" href=\"./index.css\"/>");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class=\"timetext\">현재시간 : " + getNow() + "<br></div>");
		out.println("</body>");
		out.println("</html>");
		out.println("<a href=\"http://localhost:8080/aboutme/practice/index.html\" class=\"time\">메인화면</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
