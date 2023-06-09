package com.uca.dao;

import java.sql.*;

public class _Initializer {

    public static void Init(){
        Connection connection = _Connector.getInstance();

        try {
            PreparedStatement statement;

            //Init articles table
            statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS users (id int primary key auto_increment, firstname varchar(100), lastname varchar(100), username varchar(100), password varchar(100));");
            statement.executeUpdate();

            //Todo Remove me !
            statement = connection.prepareStatement("INSERT INTO users(firstname, lastname, username, password) VALUES(?, ?, ?, ?);");
            statement.setString(1, "Theodore");
            statement.setString(2, "Muillerez");
            statement.setString(3, "theomui");
            statement.setString(4, "monmotdepasse");
            statement.executeUpdate();

        } catch (Exception e){
            System.out.println(e.toString());
            throw new RuntimeException("could not create database !");
        }
    }
}
