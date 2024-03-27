package com.inclusioncloud.interview.controller;

import com.inclusioncloud.interview.model.MaxKCalculationRequest;
import com.inclusioncloud.interview.service.MaxKService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

/**
 * Controller class to handle requests related to calculating Max K.
 */
@RestController
@RequestMapping("/api")
public class MaxKController {
    @Autowired
    private MaxKService maxKService;

    /**
     * Retrieves the maximum K value based on given parameters.
     *
     * @param x The first integer parameter.
     * @param y The second integer parameter.
     * @param n The third integer parameter.
     * @return ResponseEntity containing the calculated maximum K value.
     */
    @GetMapping("/max-k")
    public ResponseEntity<Integer> getMaxK(@RequestParam int x, @RequestParam int y, @RequestParam int n) {
        try {
            return ResponseEntity.ok(maxKService.findMaxK(x, y, n));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    /**
     * Calculates the maximum K value based on the provided request.
     *
     * @param request The request containing parameters for calculation.
     * @return ResponseEntity containing the calculated maximum K value.
     */
    @PostMapping("/max-k/calculate")
    public ResponseEntity<Integer> calculateMaxK(@RequestBody MaxKCalculationRequest request) {
        try {
            return ResponseEntity.ok(maxKService.findMaxK(request.getX(), request.getY(), request.getN()));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }

    /**
     * Handles IllegalArgumentException and returns a bad request response.
     *
     * @param e The IllegalArgumentException object.
     * @return ResponseEntity containing the error message.
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
