package org.example.dataprocessor.cleaning;
import org.example.dataprocessor.enums.CleaningType;

public class CleaningFactory {
    public static ICleaningType getCleaningByType(CleaningType cleaningType) {
        if (cleaningType == CleaningType.REMOVE_NEGATIVES) {
            return new RemoveNegativesCleaning();
        }
        if (cleaningType == CleaningType.REPLACE_NEGATIVES_WITH_ZERO) {
            return new ReplaceNegativesWithZeroCleaning();
        }
        throw new RuntimeException("Invalid CleaningType");
    }
}
