package com.design_patterns.strategy_pattern;

public class ZIPCompression implements CompressionStrategy {

    @Override
    public void compress() {
        System.out.println("ZIP Compression");
    }
}
