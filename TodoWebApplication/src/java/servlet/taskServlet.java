/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;
import model.Account;
import model.Task;
import model.controller.TaskJpaController;

/**
 *
 * @author SARUNSUMETPANICH
 */
public class taskServlet extends HttpServlet {

    @PersistenceUnit(unitName = "TodoWebApplicationPU")
    EntityManagerFactory emf;

    @Resource
    UserTransaction uts;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        TaskJpaController tjc = new TaskJpaController(uts, emf);
        HttpSession session = request.getSession();
        List<Task> taskList = tjc.findTaskEntities();
        request.setAttribute("task", taskList);
        session.setAttribute("task", taskList);
        getServletContext().getRequestDispatcher("/Task.jsp").forward(request, response);

        String newtask = request.getParameter("newtask");
        if (newtask != null && newtask.trim().length() > 0) {
            Account account = (Account) request.getSession().getAttribute("loggedin");
            Task task = new Task(newtask, account);

            try {
                tjc.create(task);
            } catch (Exception ex) {
                Logger.getLogger(taskServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
