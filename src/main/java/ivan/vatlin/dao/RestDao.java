package ivan.vatlin.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RestDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int incrementCounter() {
        String sqlQuery = "select counter from counter where id = 1";
        int count;
        try {
            count = jdbcTemplate.queryForObject(sqlQuery, Integer.class);
        } catch (NullPointerException e) {
            return -1;
        }

        String sqlUpdate = "update counter set counter = counter+1 where id = 1";
        jdbcTemplate.update(sqlUpdate);
        return count;
    }
}
