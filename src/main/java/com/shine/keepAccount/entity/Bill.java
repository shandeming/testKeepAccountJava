package com.shine.keepAccount.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Bill {
    //id,name,category,amount,createTime
    private int id;
    private String name;
    private String category;
    private double amount;
    private LocalDateTime createTime;
}
