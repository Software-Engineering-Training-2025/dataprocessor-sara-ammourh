package org.example.dataprocessor.analysis;
import java.util.List;

import static java.lang.Double.NaN;

public class MeanAnalysis implements IAnalysisType {
    public double analyze(List<Integer> data) {
        if (data.isEmpty()){
            return NaN;
        }
        int sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += data.get(i);
        }
        return (double) sum / data.size();
    }
}
