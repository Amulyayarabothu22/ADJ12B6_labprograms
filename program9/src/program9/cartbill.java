package program9;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class cartbill
 */
@WebServlet("/cartbill")
public class cartbill extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public cartbill() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(true);
		
		int totamt = 0;
		Enumeration names = session.getAttributeNames();
		
		while(names.hasMoreElements()) {
			String name = names.nextElement().toString();
			String value = session.getAttribute(name).toString();
			totamt += Integer.parseInt(value);
		}
		
		String javaamt = "";
		String Camt = "";
		String pythonamt="";
		String cplusamt = "";
		if(session.getAttribute("javaamt") != null) {
			javaamt = session.getAttribute("javaamt").toString();
		}
		if(session.getAttribute("Camt") != null) {
			Camt = session.getAttribute("Camt").toString();
		}
		if(session.getAttribute("pythonamt") != null) {
			pythonamt = session.getAttribute("pythonamt").toString();
		}
		if(session.getAttribute("cplusamt") != null) {
			cplusamt = session.getAttribute("cplusamt").toString();
		}
		
		out.println("<table border = 2 style = 'background-color:lightgray'>");
		out.println("<tr><td>Java:</td><td>" + javaamt + "</td></tr>");
		out.println("<tr><td>C:</td><td>" + Camt + "</td></tr>");
		out.println("<tr><td>Python:</td><td>" + pythonamt + "</td></tr>");
		out.println("<tr><td>C++:</td><td>" + cplusamt + "</td></tr>");
		out.println("<tr><td>Total amount:</td><td>" + totamt + "</td></tr>");
		out.println("</table>");
		session.invalidate();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
