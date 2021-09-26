package servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import utils.VisitCounter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/statistic")
public class StatisticServlet extends HttpServlet {

    private final HashMap<String, String> info = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        VisitCounter.incVisits();

        resp.setContentType("application/json");

        PrintWriter answer = resp.getWriter();

        answer.println(new ObjectMapper().writeValueAsString(VisitCounter.getVisits()) + LocalDate.now());

    }
}
