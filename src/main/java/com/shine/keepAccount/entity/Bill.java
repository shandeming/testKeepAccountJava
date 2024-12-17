package com.shine.keepAccount.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Bill {
    //id,name,category,amount,createTime
    @ExcelProperty("id")
    private int id;
    @ExcelProperty("name")
    private String name;
    @ExcelProperty("category")
    private String category;
    @ExcelProperty("amount")
    private double amount;
    @ExcelProperty("createTime")
    private LocalDateTime createTime;

    public static void main(String[] args) {
        Bill b = new Bill().builder().id(1).name("test").category("test").amount(100).createTime(LocalDateTime.now()).build();

    }
}



