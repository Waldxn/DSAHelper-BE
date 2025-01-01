package io.github.waldxn.DSAHelper.controller;

import io.github.waldxn.DSAHelper.service.AlgorithmService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadFactory;

@RestController
@RequestMapping("/api")
public class AlgorithmController {

    private final AlgorithmService algorithmService;

    public AlgorithmController(AlgorithmService algorithmService) {
        this.algorithmService = algorithmService;
    }

    @PostMapping("/bubblesort")
    public CompletableFuture<List<List<Integer>>> bubbleSort(@RequestBody List<Integer> array) {

        CompletableFuture<List<List<Integer>>> resultFuture = new CompletableFuture<>();

        ThreadFactory factory = Thread.ofVirtual()
                .name("Bubble-Sort-Thread-", 1).factory();

        factory.newThread(() -> resultFuture.complete(algorithmService.bubbleSort(array))).start();

        return resultFuture;
    }

    @PostMapping("/selectionsort")
    public CompletableFuture<List<List<Integer>>> selectionSort(@RequestBody List<Integer> array) {

        CompletableFuture<List<List<Integer>>> resultFuture = new CompletableFuture<>();

        ThreadFactory factory = Thread.ofVirtual()
                .name("Selection-Sort-Thread-", 1).factory();

        factory.newThread(() -> resultFuture.complete(algorithmService.selectionSort(array))).start();

        return resultFuture;
    }

    @PostMapping("/mergesort")
    public CompletableFuture<List<List<Integer>>> mergeSort(@RequestBody List<Integer> array) {

        CompletableFuture<List<List<Integer>>> resultFuture = new CompletableFuture<>();

        ThreadFactory factory = Thread.ofVirtual()
                .name("Merge-Sort-Thread-", 1).factory();

        factory.newThread(() -> resultFuture.complete(algorithmService.mergeSort(array))).start();

        return resultFuture;
    }
}
