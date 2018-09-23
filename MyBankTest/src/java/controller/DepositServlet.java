/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;
import model.Account;
import model.History;
import model.JPAController.AccountJpaController;
import model.JPAController.HistoryJpaController;
import model.JPAController.exceptions.NonexistentEntityException;
import model.JPAController.exceptions.RollbackFailureException;

/**
 *
 * @author SARUNSUMETPANICH
 */
public class DepositServlet extends HttpServlet {

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
        String deposit = request.getParameter("deposit");
        Account account = (Account) request.getSession().getAttribute("loggedin");

        if (deposit != null) {
            int depositInt = Integer.parseInt(deposit);
            if (depositInt > 0) {
                AccountJpaController ajc = new AccountJpaController(ut, emf);
                Account findAcc = ajc.findAccount(account.getAccountid());
                if (findAcc != null) {
                    findAcc.setBalance(depositInt + account.getBalance());
                    try {
                        ajc.edit(findAcc);
                    } catch (RollbackFailureException rfe) {
                        System.out.println(rfe);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                    HistoryJpaController hjc = new HistoryJpaController(ut, emf);
                    History his = new History(hjc.getHistoryCount() + 1);

                    his.setAccountid(account);
                    his.setAmount(depositInt);
                    his.setBalance(account.getBalance());
                    his.setMethod("deposit");
                    his.setTime(new Date());

                    try {
                        hjc.create(his);
                    } catch (RollbackFailureException rfe) {
                        System.out.println(rfe);
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                    request.setAttribute("msg", "deposit Complete");
                    request.getSession().setAttribute("loggedin", findAcc);
                    getServletContext().getRequestDispatcher("/MyAccount").forward(request, response);
                    return;
                }
            }
            request.setAttribute("msg", "deposit Uncomplete");
            getServletContext().getRequestDispatcher("/MyAccount").forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/Deposit.jsp").forward(request, response);
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
