import Entities.TestDao;

/**
 * Created by User on 23.05.2017.
 */
public class TestService {

    public String hiFromService () {
        TestDao testDao = new TestDao();
        String text = "Hi, from service";
        return testDao.hiFromDao() + " " + text;
    }
}
