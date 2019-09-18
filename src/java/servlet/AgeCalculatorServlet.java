package servlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        try
        {
            String age = request.getParameter("ageField");
            String error = "You must give your current age";
        
            request.setAttribute("ageValue", age);
        
        
                if (age == null || age.equals(""))
                {
                    request.setAttribute("ageValue",error);
                    getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
           
                    return;
                }
        
            int answer = Integer.parseInt(age)+1;
            String display = "Your age next birthday will be" + " " + answer; 
            request.setAttribute("ageValue",display);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
         }
         catch (NumberFormatException e)
         {
                String notNumber = "You must enter a number";
                request.setAttribute("ageValue",notNumber);
		getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
         }
    }
    }
