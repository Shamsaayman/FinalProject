package com.example.finalproject.Repository;

import com.example.finalproject.Model.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AthleteRepository extends JpaRepository<Athlete,Integer> {
    Athlete findAthleteByAthleteId(Integer athleteId);
}
