package org.example.dataprocessor.analysis;
import mylib.statistics.Stat;
import java.util.List;


public class MeanAnalysis implements IAnalysisType {
    @Override
    public double analyze(List<Integer> data) {
        if (data == null || data.isEmpty()){
            return Double.NaN;
        }
        return Stat.mean(data);
    }
}
