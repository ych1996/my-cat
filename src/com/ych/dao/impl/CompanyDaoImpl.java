package com.ych.dao.impl;

import com.ych.dao.CompanyDao;
import com.ych.domain.Company;
import com.ych.utils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CompanyDaoImpl implements CompanyDao {
    @Override
    public List<Company> getAll() {
        String sql = "select * from company";
        Connection connection = DbUtils.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet res = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
