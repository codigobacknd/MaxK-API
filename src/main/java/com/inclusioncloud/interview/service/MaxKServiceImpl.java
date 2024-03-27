package com.inclusioncloud.interview.service;

import org.springframework.stereotype.Service;

/**
 * Implementation of the MaxKService interface for calculating the maximum K value.
 */
@Service
public class MaxKServiceImpl implements MaxKService {
    /**
     * Calculates the maximum K value based on given parameters.
     *
     * @param x The first integer parameter.
     * @param y The second integer parameter.
     * @param n The third integer parameter.
     * @return The calculated maximum K value.
     * @throws IllegalArgumentException if the input parameters are invalid.
     */
    @Override
    public int findMaxK(int x, int y, int n) {
        if (x <= 0) {
            throw new IllegalArgumentException("The value of X must be greater than 0");
        }
        if (y < 0 || y >= x) {
            throw new IllegalArgumentException("The value of Y must be greater than or equal to 0 and less than X");
        }
        if (n < y) {
            throw new IllegalArgumentException("The value of N must be greater than or equal to Y");
        }

        int k = (n - y) / x * x + y;
        return k;
    }
}