package online.zhlcamus.service;

import online.zhlcamus.dao.DataDao;
import org.springframework.stereotype.Service;

/**
 * @author camus
 */
@Service
public class HelloService {
    private static final DataDao dataDao = new DataDao("camus");

    public String hello() {
        return "hello, here is " + dataDao.getName();
    }
}
