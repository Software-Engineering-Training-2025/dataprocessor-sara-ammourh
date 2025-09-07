package org.example.dataprocessor.analysis;
import mylib.statistics.Stat;
import java.util.List;

public class P90NearestRank implements IAnalysisType {
    @Override
    public double analyze(List<Integer> data) {
        if (data == null || data.isEmpty()) {
            return Double.NaN;
        }
        return Stat.percentileNearestRank(data, 90);
    }
}
