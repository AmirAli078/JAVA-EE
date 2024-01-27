package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DBConnection.DbConnection;

import Dao.BookDaoImpli;
import entity.BookDtls;

@WebServlet("/editbooks")
public class EditBooksServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String bookName = req.getParameter("bookName");
            String author = req.getParameter("author");
            String price = req.getParameter("price");
            String category = req.getParameter("category");

            BookDtls book = new BookDtls();
            book.setBookName(bookName);
            book.setAuther(author);
            book.setPrice(price);
           

            book.setStatus(category);

            BookDaoImpli dao = new BookDaoImpli(DbConnection.getConnection());
            boolean success = dao.updateEditBook(book);
            HttpSession session = req.getSession();

            if (success) {
                session.setAttribute("successmsg", "Book is Edited Successfully!");
                resp.sendRedirect("Admin/all_books.jsp");
            } else {
                session.setAttribute("failmsg", "Something went wrong on the server");
                resp.sendRedirect("Admin/all_books.jsp");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
