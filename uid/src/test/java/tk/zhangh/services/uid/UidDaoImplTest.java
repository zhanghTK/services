package tk.zhangh.services.uid;

import lombok.extern.java.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import tk.zhangh.services.uid.dao.UidDao;

/**
 * Created by ZhangHao on 2017/11/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Log
@Transactional
public class UidDaoImplTest {

    @Autowired
    private UidDao uidDao;

    @Test
    public void getId() throws Exception {
        String stub = this.getClass().getName();
        log.info(uidDao.getId(stub));
        log.info(uidDao.getId(stub));
        log.info(uidDao.getId(stub));
        log.info(uidDao.getId(stub));
    }

}