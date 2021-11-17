package com.DealsAndCoupons.service.D.Cservice.controller;


import com.DealsAndCoupons.service.D.Cservice.entity.DealsandCoupons;
import com.DealsAndCoupons.service.D.Cservice.service.DealsandCouponsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DealsAndCouponsController {

    @Autowired
    private DealsandCouponsService dealsandCouponsService;


    @GetMapping("/deals")
    public List<DealsandCoupons> fetchDealsAndCouponsList() {
        return dealsandCouponsService.fetchdeals();

    }

    @GetMapping("/deals/{_id}")
    public DealsandCoupons fetchDealsAndCouponsById(@PathVariable("_id") String _id) {
        return dealsandCouponsService.fetchdealsById(_id);
    }
}
