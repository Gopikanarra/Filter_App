import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DemoFilter")
public class TargetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static {
		System.out.println("servlet loading..!");
	}
	public TargetServlet() {
		System.out.println("servlet instatiation !!!");
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	System.out.println("servlet initialization...!");
	PrintWriter pw=response.getWriter();
	pw.println("<h2> this is target servlet</h2>");
	
	}
	public void destroy() {
		System.out.println("servlet deinstatiation!!");
	}

}
