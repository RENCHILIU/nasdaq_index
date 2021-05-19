package com.renchi.watchlist.repo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.renchi.watchlist.model.Watchlist;
import com.renchi.watchlist.model.WatchlistItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class WatchlistRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void saveWatchlist(Watchlist watchlist) {
        try {

            String jsonString = convertJsonMsg(watchlist.getJsonMsg());
            jdbcTemplate.update("insert into Watchlist(watchlist_id, watchlist_name, user_id, json_msg)\n" +
                            "values (?, ?, ?,?)",
                    watchlist.getWatchlistId(),
                    watchlist.getWatchlistName(),
                    watchlist.getUserId(),
                    jsonString
            );
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public Watchlist getWatchlistById(String userId) {
        return jdbcTemplate.queryForObject("select * from Watchlist where user_ID=?", new WatchlistRowMapper(), userId);

    }

    public String convertJsonMsg(WatchlistItem[] WatchlistItem)  throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(WatchlistItem);
    }
}

class WatchlistRowMapper implements RowMapper<Watchlist> {


    @Override
    public Watchlist mapRow(ResultSet resultSet, int i) throws SQLException {
        Watchlist watchlist = new Watchlist();
        watchlist.setWatchlistId(resultSet.getInt("watchlist_id"));
        watchlist.setWatchlistName(resultSet.getString("watchlist_name"));
        watchlist.setUserId(resultSet.getString("user_id"));
        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonString = resultSet.getString("json_msg");
            watchlist.setJsonMsg(mapper.readValue(jsonString, WatchlistItem[].class));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return watchlist;
    }
}
