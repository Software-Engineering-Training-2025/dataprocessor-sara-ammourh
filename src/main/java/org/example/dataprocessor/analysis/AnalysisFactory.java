package org.example.dataprocessor.analysis;
import org.example.dataprocessor.enums.AnalysisType;

public class AnalysisFactory {
    public static IAnalysisType getAnalysisByType(AnalysisType analysisType) {
        if (analysisType == AnalysisType.MEAN) {
            return new MeanAnalysis();
        }
        if (analysisType == AnalysisType.MEDIAN) {
            return new MedianAnalysis();
        }
        if (analysisType == AnalysisType.STD_DEV) {
            return new StandardDeviationAnalysis();
        }
        if (analysisType == AnalysisType.P90_NEAREST_RANK) {
            return new P90NearestRankAnalysis();
        }
        if (analysisType == AnalysisType.TOP3_FREQUENT_COUNT_SUM) {
            return new Top3FrequentCountSumAnalysis();
        }
        throw new RuntimeException("Invalid AnalysisType");
    }
}
