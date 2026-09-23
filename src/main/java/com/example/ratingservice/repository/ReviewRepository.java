package com.example.ratingservice.repository;

import com.example.ratingservice.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository <Review,Long>{
}
