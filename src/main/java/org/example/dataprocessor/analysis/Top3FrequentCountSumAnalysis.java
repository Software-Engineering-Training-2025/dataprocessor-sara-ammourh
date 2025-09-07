package org.example.dataprocessor.analysis;
import java.util.*;

public class Top3FrequentCountSumAnalysis implements IAnalysisType {
    @Override
    public double analyze(List<Integer> data) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int item: data) {
            int count = frequencyMap.getOrDefault(item, 0) + 1;
            frequencyMap.put(item, count);
        }
        double sum = 0;
        List<Integer> values = new ArrayList<>();
        for(int key: frequencyMap.keySet()) {
            values.add(frequencyMap.get(key));
        }
        Collections.sort(values);
        Collections.reverse(values);
        for(int index = 0; index < Math.min(values.size(), 3); index++) {
            sum += values.get(index);
        }
        return sum;
    }
}
