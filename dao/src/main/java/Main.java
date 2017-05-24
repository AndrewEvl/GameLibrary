import entities.Emploees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


/**
 * Created by User on 24.05.2017.
 */
public class Main {
    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        Emploees emploees = new Emploees();
        emploees.setName("no getters and setters");
        session.saveOrUpdate(emploees);

        Emploees find = session.find(Emploees.class, 1L);
        System.out.println(find);

        List<Emploees> resulList = session.createQuery("from Emploees",Emploees.class).getResultList();
        resulList.forEach(System.out::println);

//        session.delete("from emploees where emploees.id='1'");

        session.close();
        sessionFactory.close();
    }
}
