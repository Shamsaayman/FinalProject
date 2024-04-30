package com.example.finalproject.Repository;

import com.example.finalproject.Model.Fan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FanRepository extends JpaRepository<Fan,Integer> {
    Fan findFanByFanId(Integer fanId);
}
