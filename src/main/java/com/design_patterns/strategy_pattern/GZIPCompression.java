package com.design_patterns.strategy_pattern;

public class GZIPCompression implements CompressionStrategy {

    @Override
    public void compress() {
        System.out.println("GZIP Compression");
    }
}
