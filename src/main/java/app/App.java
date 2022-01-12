package app;

import com.github.javafaker.Faker;
import dao.BookDAO;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtils;

public class App {
    public static void main(String[] args) {

        Faker faker = new Faker();
        BookDAO bookDAO = new BookDAO();
        //Get an object by id

        System.out.println(bookDAO.getBookById(5L));

//        Session session = factory.openSession();
////        System.out.println(session.get(Book.class, 1L));
////        session.close();
////
////        // Insert into table
////        session = factory.openSession();
//       Transaction transaction = session.beginTransaction();
////        session.save(new Book(2L,faker.book().author()));
////        transaction.commit();
////        session.close();

//
//        //Delete from table
////        session = factory.openSession();
////        transaction = session.beginTransaction();
////        final Book book = session.get(Book.class,1L);
////        session.delete(book);
////        transaction.commit();
////        session.close();
//
//        //Update book in table
//        session = factory.openSession();
//        transaction = session.beginTransaction();
//        final Book book2 = session.get(Book.class,3L);
//        book2.setAuthor("Noul autor");
//        session.saveOrUpdate(book2);
//        transaction.commit();
//        session.close();
//
//bookDAO.insertIntoTable(new Book(faker.book().author()));
//bookDAO.deleteFromTable(5L);
//bookDAO.updateBook();
        bookDAO.getAllBooks();



    }
}
