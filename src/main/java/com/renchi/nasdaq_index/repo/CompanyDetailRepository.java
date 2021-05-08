package com.renchi.nasdaq_index.repo;

import com.renchi.nasdaq_index.controller.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class CompanyDetailRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;



    public Company getCompanyAAPL() {
        return jdbcTemplate.queryForObject("select * from nasdaq_screener_1620100786537 where Symbol='AAPL';",new CompanyRowMapper());
    }

    public Company getCompanyByName(String name) {
        return jdbcTemplate.queryForObject("select * from nasdaq_screener_1620100786537 where Symbol=?;", new CompanyRowMapper(), name);
    }
}

class CompanyRowMapper implements RowMapper<Company> {


    @Override
    public Company mapRow(ResultSet resultSet, int i) throws SQLException {
        Company c = new Company();
        c .setChange(resultSet.getString("Change"));
        c.setSymbol(resultSet.getString("Symbol"));
        c.setName(resultSet.getString("Name"));
        c.setCountry(resultSet.getString("Country"));
        c.setIndustry(resultSet.getString("Industry"));
        c.setIpo_Year(resultSet.getInt("IPO Year"));
        c.setVolume(resultSet.getInt("Volume"));
        c.setSector(resultSet.getString("Sector"));
        c.setNet_Change(resultSet.getDouble("Net Change"));
        c.setMarket_Cap(resultSet.getDouble("Market Cap"));
        c.setLast_Sale(resultSet.getString("Last Sale"));
        return c;
    }
}