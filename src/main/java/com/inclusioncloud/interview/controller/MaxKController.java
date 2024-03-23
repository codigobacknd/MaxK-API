package com.inclusioncloud.interview.controller;

import com.inclusioncloud.interview.model.MaxKCalculationRequest;
import com.inclusioncloud.interview.service.MaxKService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MaxKController {
    @Autowired
    private MaxKService maxKService;

    @GetMapping("/max-k")
    public ResponseEntity<Integer> getMaxK(@RequestParam int x, @RequestParam int y, @RequestParam int n) {
        return ResponseEntity.ok(maxKService.findMaxK(x, y, n));
    }

    @PostMapping("/max-k/calculate")
    public ResponseEntity<Integer> calculateMaxK(@RequestBody MaxKCalculationRequest request) {
        return ResponseEntity.ok(maxKService.findMaxK(request.getX(), request.getY(), request.getN()));
    }
}
