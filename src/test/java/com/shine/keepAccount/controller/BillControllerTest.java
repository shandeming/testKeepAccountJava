package com.shine.keepAccount.controller;

import com.shine.keepAccount.entity.Bill;
import com.shine.keepAccount.mapper.BillMapper;
import com.shine.keepAccount.service.BillService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BillController.class)
public class BillControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BillService billService;

    @MockBean
    private BillMapper billMapper;

    @Test
    void getAllBill() throws Exception {
        List<Bill> bills=new ArrayList<>();
        Bill bill1=new Bill();
        bill1.setId(1);
        bill1.setAmount(1000);
        bill1.setCategory("test");
        bills.add(bill1);
        Mockito.when(billService.getAllBill()).thenReturn(bills);
        mockMvc.perform(get("/bill/getAllBill"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].id", is(1)))
                .andExpect(jsonPath("$[0].amount", is(1000.0)))
                .andExpect(jsonPath("$[0].category", is("test")));
    }

    @Test
    void getBillById() {
    }

    @Test
    void addBill() {
    }

    @Test
    void updateBill() {
    }

    @Test
    void export() {
    }
}