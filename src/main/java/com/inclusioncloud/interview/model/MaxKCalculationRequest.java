package com.inclusioncloud.interview.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Model class representing a request for calculating the maximum K value.
 */
@Getter
@Setter
public class MaxKCalculationRequest {
    private int x;
    private int y;
    private int n;
}
