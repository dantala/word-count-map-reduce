package com.dantala.crunch.word.count;

import org.apache.crunch.DoFn;
import org.apache.crunch.Emitter;

public class WordCountDoFn extends DoFn<String, String> {

    private static final long serialVersionUID = -5742012462148169225L;

    @Override
    public void process(String line, Emitter<String> emitter) {
        for (final String word : line.split("\\s+")) {
            emitter.emit(word);
        }
    }

}
