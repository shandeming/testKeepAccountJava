package com.shine.keepAccount.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.shine.keepAccount.entity.Bill;
import com.shine.keepAccount.mapper.BillMapper;
import com.shine.keepAccount.service.BillService;
import com.shine.keepAccount.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/bill")
@CrossOrigin(origins = "*")
public class BillController {

    @Autowired
    BillService billService;

    @GetMapping("/getAllBill")
    public List<Bill> getAllBill() {
        List<Bill> allBill = billService.getAllBill();
        return allBill;
    }

    @GetMapping("/getBillById")
    public Bill getBillById(int id) {
        return billService.getBillById(id);
    }

    @PostMapping("/addBill")
    public int addBill(@RequestBody Bill bill) {
        return billService.addBill(bill);
    }

    @PostMapping("/updateBill")
    public int updateBill(@RequestBody Bill bill) {
        return billService.updateBill(bill);
    }

    @GetMapping("/export")
    public void export(HttpServletResponse response) throws IOException {
        List<Bill> allBill = billService.getAllBill();
        ExcelUtil.transfer(allBill, response);
    }
}
