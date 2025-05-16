package com.data.session9_javaweb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ScreenRoom {
    private Long id;
    private String screenRoomName;
    private Integer totalSeat;

}
