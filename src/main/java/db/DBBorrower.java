package db;

import models.Book;
import models.Borrower;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.Set;

public class DBBorrower {

    private static Transaction transaction;
    private static Session session;

    public static Set<Book> getBooks(Borrower borrower) {

        session = HibernateUtil.getSessionFactory().openSession();
        Set<Book> books = null;
        try {
            Criteria cr = session.createCriteria(Book.class);
            cr.add(Restrictions.eq("borrower", borrower));
            books = (Set) cr.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return books;

    }

}
