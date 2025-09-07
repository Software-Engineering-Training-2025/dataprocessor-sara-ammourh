package mylib.statistics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// I made this statistical package just to reuse mean method
public class Stat {
    public static double mean(List<Integer> data) {
        int sum = 0;
        for (int i=0; i < data.size() ;i++) {
            sum += data.get(i);
        }
        return (double) sum/data.size();
    }

    public static double median(List<Integer> data) {
        List<Integer> dataCopy = new ArrayList<Integer>(data);
        Collections.sort(dataCopy);
        // size of list is odd
        if (dataCopy.size() % 2 != 0) {
            return dataCopy.get(dataCopy.size()/2);
        }
        // size of list is even
        else {
            int firstNumber = dataCopy.get((dataCopy.size() - 1) / 2);
            int secondNumber = dataCopy.get(dataCopy.size() / 2);
            return ((double) (firstNumber + secondNumber) / 2);
        }
    }
    public static double standardDeviation(List<Integer> data) {
        double meanValue = mean(data);
        double sumOfSquaredDeviations = 0.0;
        for (int i = 0; i < data.size(); i++) {
            sumOfSquaredDeviations += Math.pow(data.get(i) -  meanValue, 2);
        }
        return Math.sqrt(sumOfSquaredDeviations / data.size());
    }
    public static double percentileNearestRank(List<Integer> data, int percentile) {
        List<Integer> dataCopy = new ArrayList<>(data);
        Collections.sort(dataCopy);
        int rank = (int) Math.ceil(dataCopy.size() * (percentile / 100.0));
        return (double) dataCopy.get(rank - 1); // adding - 1 will turn the rank to 0-based index
    }
    // to be implemented later:
//    public static double topKFrequentCountSum(List<Integer> data, int k) {}
}
