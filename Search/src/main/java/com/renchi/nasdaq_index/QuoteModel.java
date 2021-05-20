package com.renchi.nasdaq_index;

import com.fasterxml.jackson.annotation.JsonProperty;


public class QuoteModel {

    String symbol;


    String open;


    String high;


    String low;


    String price;


    String volume;


    String latestDay;


    String previousClose;

    String change;


    String changePercentage;

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("01. symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("open")
    public String getOpen() {
        return open;
    }

    @JsonProperty("02. open")
    public void setOpen(String open) {
        this.open = open;
    }

    @JsonProperty("high")
    public String getHigh() {
        return high;
    }

    @JsonProperty("03. high")
    public void setHigh(String high) {
        this.high = high;
    }

    @JsonProperty("low")
    public String getLow() {
        return low;
    }

    @JsonProperty("04. low")
    public void setLow(String low) {
        this.low = low;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("05. price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("volume")
    public String getVolume() {
        return volume;
    }

    @JsonProperty("06. volume")
    public void setVolume(String volume) {
        this.volume = volume;
    }


    @JsonProperty("latestDay")
    public String getLatestDay() {
        return latestDay;
    }

    @JsonProperty("07. latest trading day")
    public void setLatestDay(String latestDay) {
        this.latestDay = latestDay;
    }

    @JsonProperty("previousClose")
    public String getPreviousClose() {
        return previousClose;
    }

    @JsonProperty("08. previous close")
    public void setPreviousClose(String previousClose) {
        this.previousClose = previousClose;
    }

    @JsonProperty("change")
    public String getChange() {
        return change;
    }

    @JsonProperty("09. change")
    public void setChange(String change) {
        this.change = change;
    }


    @JsonProperty("changePercentage")
    public String getChangePercentage() {
        return changePercentage;
    }

    @JsonProperty("10. change percent")
    public void setChangePercentage(String changePercentage) {
        this.changePercentage = changePercentage;
    }

    @Override
    public String toString() {
        return "QuoteModel{" +
                "symbol='" + symbol + '\'' +
                ", open='" + open + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", price='" + price + '\'' +
                ", volume='" + volume + '\'' +
                ", latestDay='" + latestDay + '\'' +
                ", previousClose='" + previousClose + '\'' +
                ", change='" + change + '\'' +
                ", changePercentage='" + changePercentage + '\'' +
                '}';
    }
}
