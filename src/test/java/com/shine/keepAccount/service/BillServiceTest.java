package com.shine.keepAccount.service;

import com.shine.keepAccount.entity.Bill;
import com.shine.keepAccount.mapper.BillMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
public class BillServiceTest {
    @InjectMocks
    private BillService billService;

    @Mock
    private BillMapper billMapper;

    @Test
    void testGetAllBill() {
        // Mocking the response from billMapper
        List<Bill> mockBills = Arrays.asList(new Bill(), new Bill());
        Mockito.when(billService.getAllBill()).thenReturn(mockBills);
//        Mockito.doReturn(mockBills).when(billService).getAllBill();
        // Calling the service method
        List<Bill> allBills = billService.getAllBill();
        System.out.println(allBills.toString());

        // Asserting the result
        Assert.isTrue(allBills.size() > 0, "查询失败");
    }

    @Test
    void testGetBillById() {
        // Mocking the response from billMapper
        Bill mockBill = new Bill();
        mockBill.setId(1);
        mockBill.setAmount(1000);
        mockBill.setCategory("test");
        Mockito.when(billMapper.getBillById(anyInt())).thenReturn(mockBill);
        // Calling the service method
        Bill bill = billService.getBillById(1);
        Assert.notNull(bill, "查询失败");
    }
}