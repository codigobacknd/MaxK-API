package com.inclusioncloud.interview.service;

import org.springframework.stereotype.Service;

@Service
public class MaxKServiceImpl implements MaxKService{
    @Override
    public int findMaxK(int x, int y, int n) {
        int k = (n - y) / x * x + y;
        return k;
    }
}
