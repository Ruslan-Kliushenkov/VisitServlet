package servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import entities.VisitList;
import pojo.Visit;
import utils.VisitCounter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class VisitServlet  extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        VisitCounter.incVisits();
        resp.setContentType("application/json");

        PrintWriter answer = resp.getWriter();

        answer.println(new ObjectMapper().writeValueAsString(VisitList.getVisits()));

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        VisitCounter.incVisits();
        String name = request.getParameter("name");
        String date = request.getParameter("date");
        String city = request.getParameter("city");
        VisitList.addVisit(new Visit(name, date,city));
        response.setStatus(201);
    }
}
