package tk.zhangh.services.uid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tk.zhangh.services.uid.dao.UidDao;

/**
 * Created by ZhangHao on 2017/11/20.
 */
@Component
public class UidServiceImpl implements UidService {

    @Autowired
    private UidDao uidDao;

    @Override
    public String getId(String stub) {
        return uidDao.getId(stub);
    }
}
