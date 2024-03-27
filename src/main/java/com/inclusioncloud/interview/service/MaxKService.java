package com.inclusioncloud.interview.service;

/**
 * Interface for calculating the maximum K value.
 */
public interface MaxKService {
    /**
     * Calculates the maximum K value based on given parameters.
     *
     * @param x The first integer parameter.
     * @param y The second integer parameter.
     * @param n The third integer parameter.
     * @return The calculated maximum K value.
     */
    int findMaxK(int x, int y, int n);
}