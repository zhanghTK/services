package tk.zhangh.services.uid.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ZhangHao on 2017/11/18.
 */
@Component
public class UidDaoImpl implements UidDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public String getId(String stub) {
        jdbcTemplate.update("REPLACE INTO uid_sequence (stub) VALUE (?)", stub);
        return jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID()", String.class);
    }
}
