/*
 * Copyright 2019 tuhu.cn All right reserved. This software is the
 * confidential and proprietary information of tuhu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tuhu.cn
 */
package com.springinaction.profiles;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author zhangjundong
 * @date 2019/7/310:20
 */
public class DataSourceConfigTest {


    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes=DataSourceConfig.class)
    @ActiveProfiles("dev")
    public static class DevDataSourceTest{

        @Autowired
        private DataSource dataSource;

        @Test
        public void shouldBeEmbeddedDatasource(){
            assertNotNull(dataSource);
            JdbcTemplate jdbc=new JdbcTemplate(dataSource);
            List<String> results=jdbc.query("select id,name from Things", new RowMapper<String>() {
                public String mapRow(ResultSet resultSet, int i) throws SQLException {
                    return resultSet.getLong("id")+":"+ resultSet.getString("name");
                }
            });
            assertEquals(1,results.size());
            assertEquals("1:A",results.get(0));
        }
    }
}
