package entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Lino on 28.05.2017.
 */
public class DeveloperTest {

    public Developer developerDaoTest() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Developer devFind = session.find(Developer.class, 3L);
        return devFind;
    }
}
