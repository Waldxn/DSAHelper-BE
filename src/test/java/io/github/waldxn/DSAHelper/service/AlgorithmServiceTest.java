package io.github.waldxn.DSAHelper.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
public class AlgorithmServiceTest {

    @Autowired
    AlgorithmService algorithmService;

    @Test
    public void testBubbleSortSortedInput() {
        var input = List.of(1, 2, 3, 4, 5);
        var expectedSteps = List.of(input);

        assertEquals("Sorted input steps do not match", expectedSteps, algorithmService.bubbleSort(input));
    }

    @Test
    public void testBubbleSortReversedInput() {
        var input = new ArrayList<>(List.of(5, 4, 3, 2, 1));
        var expectedSteps = List.of(
                List.of(5, 4, 3, 2, 1),
                List.of(4, 5, 3, 2, 1),
                List.of(4, 3, 5, 2, 1),
                List.of(4, 3, 2, 5, 1),
                List.of(4, 3, 2, 1, 5),
                List.of(3, 4, 2, 1, 5),
                List.of(3, 2, 4, 1, 5),
                List.of(3, 2, 1, 4, 5),
                List.of(2, 3, 1, 4, 5),
                List.of(2, 1, 3, 4, 5),
                List.of(1, 2, 3, 4, 5)
        );

        assertEquals("Reversed input does not match", expectedSteps, algorithmService.bubbleSort(input));

    }
}
