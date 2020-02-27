package ivan.vatlin.services;

import ivan.vatlin.dao.RestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestService {
    @Autowired
    private RestDao restDao;

    public int incrementCounter() {
        return restDao.incrementCounter();
    }
}
