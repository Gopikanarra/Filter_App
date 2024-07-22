import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class DemoFilter
 */
@WebFilter("/DemoFilter")
public class DemoFilter extends HttpFilter implements Filter {
    public DemoFilter() {
        super();
        
    }
    public void init(FilterConfig fConfig) throws ServletException {
    	
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    	
    	// place your code here
    	PrintWriter pw=response.getWriter();
    	pw.println("<h2>i am in filter demo before processing</h2>");
    	
    	// pass the request along the filter chain
    	chain.doFilter(request, response);//if this line is not there it doesn't reach to the target servlet
    	pw.print("<h1>i am good after target</h1>");
    }
    
    
	public void destroy() {
		
	}


	

}
