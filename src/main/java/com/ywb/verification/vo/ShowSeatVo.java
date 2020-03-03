package com.ywb.verification.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("Show_Seat_VIEW")
@Data
public class ShowSeatVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private long id;
    private String theaterName;
    private String time;
    private int price;
    private long movieId;
    private int shouchu;
    private int sum;

}
