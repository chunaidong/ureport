package com.wangmike.ureport.config;

import com.bstek.ureport.definition.datasource.BuildinDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * <pre>
 *    @author  : wangchun
 *    @time    : 2020/7/6 14:20
 *    @desc    : 输入描述
 *    @version : v1.0
 * </pre>
 */
@Component
public class ReportDataSource implements BuildinDatasource {

    @Value("${ureport.datasource.name}")
    private String dataSourceName;

    @Override
    public String name() {
        return dataSourceName;
    }
    @Autowired
    private DataSource dataSource;

    @Override
    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
