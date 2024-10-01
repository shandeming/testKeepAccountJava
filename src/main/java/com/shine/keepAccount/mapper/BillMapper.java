package com.shine.keepAccount.mapper;

import com.shine.keepAccount.entity.Bill;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface BillMapper {
    public List<Bill> getAllBill();
    public Bill getBillById(int id);
    public int addBill(Bill bill);
    public int updateBill(Bill bill);
}
