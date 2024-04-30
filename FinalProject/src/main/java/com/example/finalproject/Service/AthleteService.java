package com.example.finalproject.Service;

import com.example.finalproject.API.ApiException;
import com.example.finalproject.Model.Athlete;
import com.example.finalproject.Repository.AthleteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AthleteService {
    private final AthleteRepository athleteRepository;

    public List<Athlete> getAllAthletes(){
        return athleteRepository.findAll();
    }


    public void addAthlete(Athlete athlete){
        athleteRepository.save(athlete);
    }

    public void updateAthlete(Integer athleteId , Athlete athlete){
        Athlete a = athleteRepository.findAthleteByAthleteId(athleteId);
        if (a == null){
            throw new ApiException("Invalid Id");
        }
        a.setUsername(athlete.getUsername());
        a.setEmail(athlete.getEmail());
        a.setPassword(athlete.getPassword());
        a.setAge(athlete.getAge());
        a.setGender(athlete.getGender());
        a.setSport(athlete.getSport());
        a.setWeight(athlete.getWeight());
        a.setHeight(athlete.getHeight());
        a.setCategory(athlete.getCategory());
        athleteRepository.save(a);
    }

    public void deleteAthlete(Integer athleteId){
        Athlete a = athleteRepository.findAthleteByAthleteId(athleteId);
        if (a == null){
            throw new ApiException("Invalid Id");
        }

        athleteRepository.delete(a);

    }
}
