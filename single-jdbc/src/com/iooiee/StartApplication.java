package com.iooiee;

import java.sql.*;

/**
 * Description:
 *
 * @Author: Yanggc
 * DateTime: 10/16 10:29
 */

public class StartApplication {

    private static final String URL = "jdbc:mysql://192.168.3.23:3307/ldd_saas?" + "useUnicode=true&characterEncoding=UTF8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "My123456";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            query(connection, "1");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private static void query(Connection conn, String queryParams) throws SQLException {
        String sql = "SELECT * FROM saas_label WHERE label_id = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, queryParams);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int clubId = resultSet.getInt(2);
                String clubName = resultSet.getString(3);
                System.out.println(">>>>clubId" + clubId+"clubName>>>"+clubName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
