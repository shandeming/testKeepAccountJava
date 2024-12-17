package com.shine.keepAccount.util;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.shine.keepAccount.entity.Bill;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ExcelUtil {

    public static <T> void transfer(List<T> data, HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("utf-8");
        String fileName = "test";
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream()).head(data.get(0).getClass()).excelType(ExcelTypeEnum.XLSX).sheet("账单").doWrite(data);
    }
}
