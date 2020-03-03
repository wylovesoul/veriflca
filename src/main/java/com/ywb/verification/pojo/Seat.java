package com.ywb.verification.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class Seat implements Serializable {
    private static final long serialVersionUID = 1L;
    private long showId;
    private int row;
    private int col;
    private int isBooked;


}
