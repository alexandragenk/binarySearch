import java.util.Comparator;

public class Arrays {

    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        int startIndex = fromIndex;
        int endIndex = toIndex - 1;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + endIndex >>> 1;
            byte middleInt = a[middleIndex];
            if (middleInt == key)
                return middleIndex;
            if (middleInt < key)
                startIndex = middleIndex + 1;
            else endIndex = middleIndex - 1;
        }
        return -(startIndex + 1);
    }

    public static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        int startIndex = fromIndex;
        int endIndex = toIndex - 1;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + endIndex >>> 1;
            char middleInt = a[middleIndex];
            if (middleInt == key)
                return middleIndex;
            if (middleInt < key)
                startIndex = middleIndex + 1;
            else endIndex = middleIndex - 1;
        }
        return -(startIndex + 1);
    }

    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        int startIndex = fromIndex;
        int endIndex = toIndex - 1;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + endIndex >>> 1;
            double middleInt = a[middleIndex];
            if (middleInt == key)
                return middleIndex;
            if (middleInt < key)
                startIndex = middleIndex + 1;
            else endIndex = middleIndex - 1;
        }
        return -(startIndex + 1);
    }

    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        int startIndex = fromIndex;
        int endIndex = toIndex - 1;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + endIndex >>> 1;
            float middleInt = a[middleIndex];
            if (middleInt == key)
                return middleIndex;
            if (middleInt < key)
                startIndex = middleIndex + 1;
            else endIndex = middleIndex - 1;
        }
        return -(startIndex + 1);
    }

    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        int startIndex = fromIndex;
        int endIndex = toIndex - 1;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + endIndex >>> 1;
            int middleInt = a[middleIndex];
            if (middleInt == key)
                return middleIndex;
            if (middleInt < key)
                startIndex = middleIndex + 1;
            else endIndex = middleIndex - 1;
        }
        return -(startIndex + 1);
    }

    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        int startIndex = fromIndex;
        int endIndex = toIndex - 1;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + endIndex >>> 1;
            long middleInt = a[middleIndex];
            if (middleInt == key)
                return middleIndex;
            if (middleInt < key)
                startIndex = middleIndex + 1;
            else endIndex = middleIndex - 1;
        }
        return -(startIndex + 1);
    }

    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        int startIndex = fromIndex;
        int endIndex = toIndex - 1;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + endIndex >>> 1;
            short middleInt = a[middleIndex];
            if (middleInt == key)
                return middleIndex;
            if (middleInt < key)
                startIndex = middleIndex + 1;
            else endIndex = middleIndex - 1;
        }
        return -(startIndex + 1);
    }

    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch(a, 0, a.length, key, c);
    }

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        int startIndex = fromIndex;
        int endIndex = toIndex - 1;

        while (startIndex <= endIndex) {
            int middleIndex = startIndex + endIndex >>> 1;
            T middleInt = a[middleIndex];
            int compareResult = c.compare(middleInt, key);
            if (compareResult == 0)
                return middleIndex;
            if (compareResult < 0)
                startIndex = middleIndex + 1;
            else endIndex = middleIndex - 1;
        }
        return -(startIndex + 1);
    }
}
