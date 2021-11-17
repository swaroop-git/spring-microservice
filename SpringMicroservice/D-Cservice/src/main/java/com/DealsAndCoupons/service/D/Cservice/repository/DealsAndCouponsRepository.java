package com.DealsAndCoupons.service.D.Cservice.repository;


import com.DealsAndCoupons.service.D.Cservice.entity.DealsandCoupons;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealsAndCouponsRepository extends MongoRepository<DealsandCoupons, String> {
}
