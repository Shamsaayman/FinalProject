package com.example.finalproject.Controller;

import com.example.finalproject.API.ApiResponse;
import com.example.finalproject.Model.Fan;
import com.example.finalproject.Service.FanService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/fan")
@RequiredArgsConstructor
public class FanController {
    private final FanService fanService;

    @GetMapping("/get")
    public ResponseEntity getAllFans(){
        return ResponseEntity.status(200).body(fanService.getAllFans());
    }

    @PostMapping("/add")
    public ResponseEntity addFan(@RequestBody @Valid Fan fan){
        fanService.addFan(fan);
        return ResponseEntity.status(200).body(new ApiResponse("Fan added"));
    }

    @PutMapping("/update/{fanId}")
    public ResponseEntity updateFan(@PathVariable Integer fanId , @RequestBody @Valid Fan fan){
        fanService.updateFan(fanId , fan);
        return ResponseEntity.status(200).body(new ApiResponse("Fan updated"));
    }

    @DeleteMapping("/delete/{fanId}")
    public ResponseEntity deleteFan(@PathVariable Integer fanId ){
        fanService.deleteFan(fanId);
        return ResponseEntity.status(200).body(new ApiResponse("Fan deleted"));
    }

}
