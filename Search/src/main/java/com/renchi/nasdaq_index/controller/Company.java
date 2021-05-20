package com.renchi.nasdaq_index.controller;


public class Company {

  private String symbol;
  private String name;
  private String last_Sale;
  private double net_Change;
  private String change;
  private double market_Cap;
  private String country;
  private long ipo_Year;
  private long volume;
  private String sector;
  private String industry;
  private String nasdaqUrl;
  private String yahooUrl;

  public String getYahooUrl() {
    return yahooUrl;
  }

  public void setYahooUrl(String yahooUrl) {
    this.yahooUrl = yahooUrl;
  }

  public String getNasdaqUrl() {
    return nasdaqUrl;
  }

  public void setNasdaqUrl(String nasdaqUrl) {
    this.nasdaqUrl = nasdaqUrl;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getLast_Sale() {
    return last_Sale;
  }

  public void setLast_Sale(String last_Sale) {
    this.last_Sale = last_Sale;
  }


  public double getNet_Change() {
    return net_Change;
  }

  public void setNet_Change(double net_Change) {
    this.net_Change = net_Change;
  }


  public String getChange() {
    return change;
  }

  public void setChange(String change) {
    this.change = change;
  }


  public double getMarket_Cap() {
    return market_Cap;
  }

  public void setMarket_Cap(double market_Cap) {
    this.market_Cap = market_Cap;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public long getIpo_Year() {
    return ipo_Year;
  }

  public void setIpo_Year(long ipo_Year) {
    this.ipo_Year = ipo_Year;
  }


  public long getVolume() {
    return volume;
  }

  public void setVolume(long volume) {
    this.volume = volume;
  }


  public String getSector() {
    return sector;
  }

  public void setSector(String sector) {
    this.sector = sector;
  }


  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }

}
