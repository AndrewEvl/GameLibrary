import entities.Developer;
import entities.DeveloperTest;


/**
 * Created by User on 23.05.2017.
 */
public class TestService {

    public Developer developerSetviceTest () {
        return new DeveloperTest().developerDaoTest();
    }
}
