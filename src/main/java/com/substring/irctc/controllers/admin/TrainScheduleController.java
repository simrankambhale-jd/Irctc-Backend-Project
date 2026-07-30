package com.substring.irctc.controllers.admin;

import com.substring.irctc.dto.TrainScheduleDto;
import com.substring.irctc.service.TrainScheduleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/train-schedules")
public class TrainScheduleController {

    private TrainScheduleService trainScheduleService;

    public TrainScheduleController(TrainScheduleService trainScheduleService) {
        this.trainScheduleService = trainScheduleService;
    }

    @PostMapping
    public ResponseEntity<TrainScheduleDto> createTrainSchedule(@RequestBody TrainScheduleDto trainScheduleDto) {

        TrainScheduleDto createdSchedule = trainScheduleService.createSchedule(trainScheduleDto);
        return new ResponseEntity<>(createdSchedule, HttpStatus.CREATED);
    }

    @GetMapping("/train/{trainId}")
    public List<TrainScheduleDto> getTrainSchedulesByTrainId(@PathVariable Long trainId) {

        return trainScheduleService.getTrainSchedulesByTrainId(trainId);
    }

    @DeleteMapping("/{trainScheduleId}")
    public ResponseEntity<Void> deleteTrainSchedule(@PathVariable Long trainScheduleId) {

        trainScheduleService.deleteTrainSchedule(trainScheduleId);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{trainScheduleId}")
    public ResponseEntity<TrainScheduleDto> updateTrainSchedule(@PathVariable Long trainScheduleId,
            @RequestBody TrainScheduleDto trainScheduleDto) {

        TrainScheduleDto updatedSchedule = trainScheduleService.updateTrainSchedule(trainScheduleId, trainScheduleDto);
        return ResponseEntity.ok(updatedSchedule);
    }
}
