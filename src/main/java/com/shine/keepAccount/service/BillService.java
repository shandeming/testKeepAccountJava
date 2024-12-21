package com.shine.keepAccount.service;

import com.shine.keepAccount.entity.Bill;
import com.shine.keepAccount.mapper.BillMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BillService {

    private final BillMapper billMapper;

    public BillService(BillMapper billMapper) {
        this.billMapper = billMapper;
    }

    public List<Bill> getAllBill(){
        return billMapper.getAllBill();
    }

    public Bill getBillById(int id){
        Bill bill = billMapper.getBillById(id);
        return bill;
    }

    public int addBill(Bill bill){
        return billMapper.addBill(bill);
    }
    public int updateBill(Bill bill){
        return billMapper.updateBill(bill);
    }
}
