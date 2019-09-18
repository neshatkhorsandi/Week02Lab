package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet 
{

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String first = request.getParameter("firstField");
        String second = request.getParameter("secondField");
        String invalid = "Result: Invalid";
        
        
        if(!first.matches("\\d\\d") && !second.matches("\\d\\d"))
        {
            request.setAttribute("display",invalid);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            
            return;
        }
        if(request.getParameter("button").equals("+"))
        {
            int firstNumb = Integer.parseInt(first);
            int secondNumb= Integer.parseInt(second);
            
            int result = firstNumb + secondNumb;
            
            request.setAttribute("display", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            
            return;
        }
        if(request.getParameter("button").equals("-"))
        {
            int firstNumb = Integer.parseInt(first);
            int secondNumb= Integer.parseInt(second);
            
            int result = firstNumb - secondNumb;
            
            request.setAttribute("display", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            
            return;
        }
        if(request.getParameter("button").equals("*"))
        {
            int firstNumb = Integer.parseInt(first);
            int secondNumb= Integer.parseInt(second);
            
            int result = firstNumb * secondNumb;
            
            request.setAttribute("display", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            
            return;
        }
        if(request.getParameter("button").equals("%"))
        {
            int firstNumb = Integer.parseInt(first);
            int secondNumb= Integer.parseInt(second);
            
            int result = firstNumb % secondNumb;
            
            request.setAttribute("display", result);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
            
            return;
        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}