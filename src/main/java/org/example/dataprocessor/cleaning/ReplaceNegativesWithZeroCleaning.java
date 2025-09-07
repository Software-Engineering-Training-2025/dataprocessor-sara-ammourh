package org.example.dataprocessor.cleaning;
import java.util.ArrayList;
import java.util.List;

public class ReplaceNegativesWithZeroCleaning implements ICleaningType {
    @Override
    public List<Integer> clean(List<Integer> data) {
        List<Integer> dataCopy = new ArrayList<>();
        for (int j = 0; j < data.size(); j++){
            if (data.get(j) >= 0) {
                dataCopy.add(data.get(j));
            }
            else {
                dataCopy.add(0);
            }
        }
        return dataCopy;
    }
}
