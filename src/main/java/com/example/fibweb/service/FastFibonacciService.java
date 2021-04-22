package com.example.fibweb.service;

import org.springframework.stereotype.Service;

@Service
public class FastFibonacciService implements FibonacciService {
    @Override
    public long compute(int index) {
        long a = 0;
        long b = 1;

        for (int i = 0; i < index; i++) {
            long tmp = a+b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
