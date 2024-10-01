package com.shine.keepAccount;

import com.shine.keepAccount.entity.Bill;
import com.shine.keepAccount.mapper.BillMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
public class BillTest {
    @Autowired
    BillMapper billMapper;
    @Test
    void testGetAllBill() {
        List<Bill> allBill = billMapper.getAllBill();
        for (Bill bill : allBill) {
            System.out.println(bill);
        }
        Assert.isTrue(allBill.size() > 0, "查询失败");
    }
    @Test
    void testGetBillById() {
        Bill bill = billMapper.getBillById(1);
        System.out.println(bill);
        Assert.notNull(bill, "查询失败");
    }
    @Test
    void testAddBill() {
        Bill bill = new Bill();
        bill.setAmount(99999);
        bill.setCategory("test");
        int result=billMapper.addBill(bill);
        System.out.println(result);
        Assert.isTrue(result==1, "添加失败");
    }
    @Test
    void testUpdateBill() {
        Bill bill = new Bill();
        bill.setId(3);
        bill.setAmount(10000);
        bill.setCategory("test");
        int result=billMapper.updateBill(bill);
        System.out.println(result);
        Assert.isTrue(result==1, "更新失败");
    }
}
