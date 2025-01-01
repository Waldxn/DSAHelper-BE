package io.github.waldxn.DSAHelper.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlgorithmService {

    public List<List<Integer>> bubbleSort(List<Integer> array) {
        List<List<Integer>> steps = new ArrayList<>();
        steps.add(new ArrayList<>(array));
        int n = array.size();

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1; j++) {
                // Swap if current is greater than the next
                if (array.get(j) > array.get(j + 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);

                    steps.add(new ArrayList<>(array));
                    swapped = true;
                }
            }

            // If no swaps happened during this pass, array is sorted
            if (!swapped) {
                break;
            }
        }
        return steps;
    }

    public List<List<Integer>> selectionSort(List<Integer> array) {
        List<List<Integer>> steps = new ArrayList<>();
        steps.add(new ArrayList<>(array));
        int n = array.size();

        for (int i = 0; i < n - 1; i++) {
            int min_index = i;

            // Find the minimum element in the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (array.get(j) < array.get(min_index)) {
                    min_index = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted portion
            if (min_index != i) {
                int temp = array.get(min_index);
                array.set(min_index, array.get(i));
                array.set(i, temp);
                steps.add(new ArrayList<>(array));
            }
        }
        return steps;
    }

    public List<List<Integer>> mergeSort(List<Integer> array) {
        List<List<Integer>> steps = new ArrayList<>();
        steps.add(new ArrayList<>(array));
        int n = array.size();

        return null;
    }
}
