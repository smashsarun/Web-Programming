/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;
import model.Account;
import model.JPAController.AccountJpaController;

/**
 *
 * @author SARUNSUMETPANICH
 */
public class LoginServlet extends HttpServlet {
    @PersistenceUnit(unitName = "MyBankTestPU")
    EntityManagerFactory emf;
    
    @Resource
    UserTransaction ut;

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
        String accid = request.getParameter("accid");
        String pin = request.getParameter("pin");
        
        if (accid != null && accid.trim().length() != 0
            && pin != null && pin.trim().length() != 0) {
            
            AccountJpaController ajc = new AccountJpaController(ut, emf);
            Account account = ajc.findAccount(Integer.parseInt(accid));
            
            if (account.getPin() == Integer.parseInt(pin)) {
                request.getSession().setAttribute("loggedin", account);
                getServletContext().getRequestDispatcher("/MyAccount").forward(request, response);
            }
            request.setAttribute("msg", "invalid username or password!");
            getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
        }
        getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
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
