package com.dantala.crunch.word.count;

import org.apache.crunch.PCollection;
import org.apache.crunch.PTable;
import org.apache.crunch.Pipeline;
import org.apache.crunch.impl.mr.MRPipeline;
import org.apache.crunch.types.writable.Writables;

public class WordCountCrunch {

    public static void main(String[] args) {

        final Pipeline pipeline = new MRPipeline(WordCountCrunch.class);

        final PCollection<String> lines = pipeline.readTextFile(args[0]);

        final PCollection<String> words = lines.parallelDo(new WordCountDoFn(), Writables.strings());

        final PTable<String, Long> counts = words.count();

        pipeline.writeTextFile(counts, args[1]);

        pipeline.done();
    }

}
