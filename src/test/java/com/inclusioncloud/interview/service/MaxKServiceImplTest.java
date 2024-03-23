package com.inclusioncloud.interview.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MaxKServiceImplTest {
    private MaxKServiceImpl maxKService = new MaxKServiceImpl();

    @Test
    public void findMaxK_ValidInput_ReturnsCorrectMaximumK() {
        Assertions.assertEquals(12339, maxKService.findMaxK(7, 5, 12345));
        Assertions.assertEquals(0, maxKService.findMaxK(5, 0, 4));
        Assertions.assertEquals(15, maxKService.findMaxK(10, 5, 15));
        Assertions.assertEquals(54306, maxKService.findMaxK(17, 8, 54321));
        Assertions.assertEquals(999999995, maxKService.findMaxK(499999993, 9, 1000000000));
        Assertions.assertEquals(185, maxKService.findMaxK(10, 5, 187));
        Assertions.assertEquals(999999998, maxKService.findMaxK(2, 0, 999999999));
    }
}