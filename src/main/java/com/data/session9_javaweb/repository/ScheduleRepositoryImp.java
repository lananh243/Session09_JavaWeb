package com.data.session9_javaweb.repository;

import com.data.session9_javaweb.connection.ConnectionDB;
import com.data.session9_javaweb.model.Schedule;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
@Repository
public class ScheduleRepositoryImp implements ScheduleRepository {
    @Override
    public List<Schedule> findAllScheduleByMovie() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Schedule> scheduleList = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call find_all_schedule()}");
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Schedule schedule = new Schedule();
                schedule.setId(rs.getLong("id"));
                schedule.setMovieId(rs.getLong("movieId"));
                schedule.setShowTime(rs.getDate("showTime"));
                schedule.setScreenRoomId(rs.getLong("screenRoomId"));
                schedule.setAvailableSeats(rs.getInt("availableSeats"));
                schedule.setFormat(rs.getString("format"));
                scheduleList.add(schedule);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn);
        }
        return scheduleList;
    }

    @Override
    public List<Schedule> getSchedulesByMovieId(Long movieId) {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Schedule> scheduleList = new ArrayList<>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call get_schedule_by_movieId(?)}");
            callSt.setLong(1, movieId);
            ResultSet rs = callSt.executeQuery();
            while (rs.next()) {
                Schedule schedule = new Schedule();
                schedule.setId(rs.getLong("id"));
                schedule.setMovieId(rs.getLong("movieId"));
                schedule.setShowTime(rs.getTimestamp("showTime"));
                schedule.setScreenRoomId(rs.getLong("screenRoomId"));
                schedule.setAvailableSeats(rs.getInt("availableSeats"));
                schedule.setFormat(rs.getString("format"));
                scheduleList.add(schedule);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn);
        }
        return scheduleList;
    }
}
