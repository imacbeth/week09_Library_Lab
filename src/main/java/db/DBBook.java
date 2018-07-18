package db;

import models.Book;
import models.Borrower;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class DBBook {

    private static Session session;

    public static Borrower getBorrowerForBook(Book book){
        session = HibernateUtil.getSessionFactory().openSession();
        Borrower borrower = null;

        try{
            Criteria cr = session.createCriteria(Borrower.class);
            cr.add(Restrictions.eq("book", book));
            borrower = (Borrower)cr.uniqueResult();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return borrower;
    }

}
