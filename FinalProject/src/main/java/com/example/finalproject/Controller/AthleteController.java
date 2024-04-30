package com.example.finalproject.Controller;

import com.example.finalproject.API.ApiResponse;
import com.example.finalproject.Model.Athlete;
import com.example.finalproject.Service.AthleteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/athlete")
@RequiredArgsConstructor
public class AthleteController {
    private final AthleteService athleteService;
    @GetMapping("/get")
    public ResponseEntity getAllAthletes(){
        return ResponseEntity.status(200).body(athleteService.getAllAthletes());
    }

    @PostMapping("/add")
    public ResponseEntity addAthlete(@RequestBody @Valid Athlete athlete){
        athleteService.addAthlete(athlete);
        return ResponseEntity.status(200).body(new ApiResponse("Athlete added"));
    }

    @PutMapping("/update/{athleteId}")
    public ResponseEntity updateAthlete(@PathVariable Integer athleteId , @RequestBody @Valid Athlete athlete){
        athleteService.updateAthlete(athleteId , athlete);
        return ResponseEntity.status(200).body(new ApiResponse("Athlete updated"));
    }

    @DeleteMapping("/delete/{athleteId}")
    public ResponseEntity deleteAthlete(@PathVariable Integer athleteId ){
        athleteService.deleteAthlete(athleteId);
        return ResponseEntity.status(200).body(new ApiResponse("Athlete deleted"));
    }
}
