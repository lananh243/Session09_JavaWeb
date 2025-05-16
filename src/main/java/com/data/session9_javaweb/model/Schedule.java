package com.data.session9_javaweb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Schedule {
    private Long id;
    private Long movieId;
    private Date showTime;
    private Long screenRoomId;
    private Integer availableSeats;
    private  String format;
}
