package com.renchi.watchlist.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Watchlist {

    private long watchlistId;
    private String watchlistName;
    private String userId;
    @JsonProperty("jsonMsg")
    private WatchlistItem[] jsonMsg;



    public long getWatchlistId() {
        return watchlistId;
    }

    public void setWatchlistId(long watchlistId) {
        this.watchlistId = watchlistId;
    }


    public String getWatchlistName() {
        return watchlistName;
    }

    public void setWatchlistName(String watchlistName) {
        this.watchlistName = watchlistName;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public WatchlistItem[] getJsonMsg(){

        return jsonMsg;
    }

    public void setJsonMsg(WatchlistItem[] jsonMsg) {
        this.jsonMsg = jsonMsg;
    }


}

