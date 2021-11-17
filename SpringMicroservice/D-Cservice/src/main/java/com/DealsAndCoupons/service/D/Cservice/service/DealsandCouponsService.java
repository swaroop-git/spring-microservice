package com.DealsAndCoupons.service.D.Cservice.service;


import com.DealsAndCoupons.service.D.Cservice.entity.DealsandCoupons;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DealsandCouponsService {

    public List<DealsandCoupons> fetchdeals();

    public DealsandCoupons fetchdealsById(String _id);
}
