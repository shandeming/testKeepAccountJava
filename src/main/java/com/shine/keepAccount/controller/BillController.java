package com.shine.keepAccount.controller;

import com.shine.keepAccount.entity.Bill;
import com.shine.keepAccount.mapper.BillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bill")
@CrossOrigin(origins = "*")
public class BillController {
    @Autowired
    BillMapper billMapper;
    @GetMapping("/getAllBill")
    public List<Bill> getAllBill() {
        List<Bill> allBill = billMapper.getAllBill();
        for (Bill bill : allBill) {
            System.out.println(bill);
        }
        return allBill;
    }
    @GetMapping("/getBillById")
    public Bill getBillById(int id) {
        return billMapper.getBillById(id);
    }
    @GetMapping("/addBill")
    public int addBill(Bill bill) {
        return billMapper.addBill(bill);
    }
    @GetMapping("/updateBill")
    public int updateBill(Bill bill) {
        return billMapper.updateBill(bill);
    }
}
