import java.util.Comparator;
import java.util.List;

public class Collections {
    public static <T extends Comparable<? super T>> int binarySearch(List<T> list, T key) {
        int startIndex = 0;
        int endIndex = list.size() - 1;

        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) >>> 1;
            T middleInt = list.get(middleIndex);
            int compareResult = middleInt.compareTo(key);
            if (compareResult == 0)
                return middleIndex;
            if (compareResult < 0) {
                startIndex = middleIndex + 1;
            } else {
                endIndex = middleIndex - 1;
            }
        }
        return -(startIndex + 1);
    }
    public static <T> int binarySearch(List<T> list, T key, Comparator<? super T> c) {
        int startIndex = 0;
        int endIndex = list.size() - 1;

        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) >>> 1;
            T middleInt = list.get(middleIndex);
            int compareResult = c.compare(middleInt, key);
            if (compareResult == 0)
                return middleIndex;
            if (compareResult < 0) {
                startIndex = middleIndex + 1;
            } else {
                endIndex = middleIndex - 1;
            }
        }
        return -(startIndex + 1);
    }

}
