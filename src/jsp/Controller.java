package jsp;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "com.Controller")
public class Controller extends HttpServlet {
    private ArrayList<Person> list=null;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Post");
        ServletContext context = getServletConfig().getServletContext();
        String sex = null;
       String name = null;
        String date = null;
        try {
            sex = (request.getParameter("sex"));
            name = (request.getParameter("name"));
            date =  (request.getParameter("date"));
        }
        catch (NumberFormatException e){
            System.out.println("Ввели текст каким то макаром");

        }
        if (list == null) {
            list = new ArrayList<Person>();
            context.setAttribute("list", list);
        }
        list.add(new Person(name,sex,date));
        context.setAttribute("list", list);
        ArrayList<Person> arrayList = (ArrayList<Person>) context.getAttribute("list");
        getServletConfig().getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
