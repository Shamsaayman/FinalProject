package com.example.finalproject.Service;

import com.example.finalproject.API.ApiException;
import com.example.finalproject.Model.Fan;
import com.example.finalproject.Repository.FanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FanService {
    private final FanRepository fanRepository;

    public List<Fan> getAllFans(){
        return fanRepository.findAll();
    }


    public void addFan(Fan fan){
        fanRepository.save(fan);
    }

    public void updateFan(Integer fanId , Fan fan){
        Fan f = fanRepository.findFanByFanId(fanId);
        if (f == null){
            throw new ApiException("Invalid Id");
        }
        f.setUsername(fan.getUsername());
        f.setEmail(fan.getEmail());
        f.setPassword(fan.getPassword());
        f.setAge(fan.getAge());
        f.setFavoriteSport(fan.getFavoriteSport());
        fanRepository.save(f);
    }

    public void deleteFan(Integer fanId){
        Fan f = fanRepository.findFanByFanId(fanId);
        if (f == null){
            throw new ApiException("Invalid Id");
        }
        fanRepository.delete(f);

    }
}
