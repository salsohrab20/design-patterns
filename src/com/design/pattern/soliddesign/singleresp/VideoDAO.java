package com.design.pattern.soliddesign.singleresp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.design.pattern.soliddesign.liskovsubstitution.*;
public class VideoDAO {

    public void persistToDb(VideoManager video) throws SQLException {
       //call the connection class to get details of connection

        Connection con = new ConnectionDAO().createConnection();
        Statement stmt = con.createStatement();
        String sql = "INSERT INTO Video (Title,Time,Likes,Views) " +
                "VALUES (" + video.getTitle() + "," + video.getTime() + "," + video.getLikes() + "," + video.getViews() +")";
        stmt.executeUpdate(sql);
    }
}
