package io.github.waldxn.DSAHelper.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
public class AlgorithmServiceTest {

    @Autowired
    AlgorithmService algorithmService;

    @Test
    public void testBubbleSortSortedInput() {
        List<Integer> input = List.of(1, 2, 3, 4, 5);
        List<List<Integer>> expectedSteps = List.of(input);

        List<List<Integer>> resultSteps = algorithmService.bubbleSort(input);

        assertEquals("Sorted input steps do not match", expectedSteps, resultSteps);
    }

    @Test
    public void testBubbleSortReversedInput() {
        List<Integer> input = List.of(1, 2, 3, 4, 5);
        List<List<Integer>> expectedSteps;

    }
}
