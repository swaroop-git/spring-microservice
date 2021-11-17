package com.DealsAndCoupons.service.D.Cservice.service;

import com.DealsAndCoupons.service.D.Cservice.entity.DealsandCoupons;
import com.DealsAndCoupons.service.D.Cservice.repository.DealsAndCouponsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealsAndCouponsServiceImpl implements DealsandCouponsService{


    @Autowired
    DealsAndCouponsRepository dealsAndCouponsRepository;

    @Override
    public List<DealsandCoupons> fetchdeals() {
        return dealsAndCouponsRepository.findAll();
    }

    @Override
    public DealsandCoupons fetchdealsById(String _id) {
        return dealsAndCouponsRepository.findById(_id).get();
    }
}
