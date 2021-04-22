package com.example.fibweb.controller;

import com.example.fibweb.service.FibonacciService;
import org.springframework.web.bind.annotation.*;

@RestController
public class FibonacciController {
    private final FibonacciService fibonacciService;

    public FibonacciController(FibonacciService fibonacciService) {
        this.fibonacciService = fibonacciService;
    }

    @GetMapping("/compute/{id}")
    public long computeFibonacci(@PathVariable int id) {
        final long fib = fibonacciService.compute(id);
        return fib;
    }
}
