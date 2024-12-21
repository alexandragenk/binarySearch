import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArraysTest {
    @Test
    public void testBinarySearchByte() {
        byte[] array = new byte[127];
        for (byte i = 0; i < 127; i++){
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            byte value = array[i];
            int foundIndex = Arrays.binarySearch(array, value);

            Assert.assertEquals(
                    "Ошибка! Элемент " + value + " должен быть на индексе " + i +
                            ", но найден на индексе " + foundIndex, i, foundIndex);
        }
    }
    @Test
    public void testBinarySearchChar() {
        char[] array = new char[Character.MAX_VALUE];
        for (char i = 0; i < Character.MAX_VALUE; i++){
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            char value = array[i];
            int foundIndex = Arrays.binarySearch(array, value);

            Assert.assertEquals(
                    "Ошибка! Элемент " + value + " должен быть на индексе " + i +
                            ", но найден на индексе " + foundIndex, i, foundIndex);
        }
    }
    @Test
    public void testBinarySearchDouble() {
        double[] array = new double[1000000];
        for (int i = 0; i < 1000000; i++){
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            double value = array[i];
            int foundIndex = Arrays.binarySearch(array, value);

            Assert.assertEquals(
                    "Ошибка! Элемент " + value + " должен быть на индексе " + i +
                            ", но найден на индексе " + foundIndex, i, foundIndex);
        }
    }
    @Test
    public void testBinarySearchFloat() {
        float[] array = new float[1000000];
        for (int i = 0; i < 1000000; i++){
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            float value = array[i];
            int foundIndex = Arrays.binarySearch(array, value);

            Assert.assertEquals(
                    "Ошибка! Элемент " + value + " должен быть на индексе " + i +
                            ", но найден на индексе " + foundIndex, i, foundIndex);
        }
    }

    @Test
    public void testBinarySearchInt() {
        int[] array = new int[1000000];
        for (int i = 0; i < 1000000; i++){
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int foundIndex = Arrays.binarySearch(array, value);

            Assert.assertEquals(
                    "Ошибка! Элемент " + value + " должен быть на индексе " + i +
                            ", но найден на индексе " + foundIndex, i, foundIndex);
        }
    }

    @Test
    public void testBinarySearchLong() {
        long[] array = new long[1000000];
        for (int i = 0; i < 1000000; i++){
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            long value = array[i];
            int foundIndex = Arrays.binarySearch(array, value);

            Assert.assertEquals(
                    "Ошибка! Элемент " + value + " должен быть на индексе " + i +
                            ", но найден на индексе " + foundIndex, i, foundIndex);
        }
    }

    @Test
    public void testBinarySearchShort() {
        short[] array = new short[Short.MAX_VALUE];
        for (short i = 0; i < Short.MAX_VALUE; i++){
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            short value = array[i];
            int foundIndex = Arrays.binarySearch(array, value);

            Assert.assertEquals(
                    "Ошибка! Элемент " + value + " должен быть на индексе " + i +
                            ", но найден на индексе " + foundIndex, i, foundIndex);
        }
    }
    @Test
    public void testBinarySearchT() {
        Integer[] array = new Integer[1000000];
        for (int i = 0; i < 1000000; i++){
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int foundIndex = Arrays.binarySearch(array, value, Comparator.naturalOrder());

            Assert.assertEquals(
                    "Ошибка! Элемент " + value + " должен быть на индексе " + i +
                            ", но найден на индексе " + foundIndex, i, foundIndex);
        }
    }

    @Test
    public void testBinarySearchList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++){
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            int foundIndex = Collections.binarySearch(list, value, Comparator.naturalOrder());

            Assert.assertEquals(
                    "Ошибка! Элемент " + value + " должен быть на индексе " + i +
                            ", но найден на индексе " + foundIndex, i, foundIndex);
        }
    }

    @Test
    public void testBinarySearchComparableList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            int foundIndex = Collections.binarySearch(list, value);

            Assert.assertEquals(
                    "Ошибка! Элемент " + value + " должен быть на индексе " + i +
                            ", но найден на индексе " + foundIndex, i, foundIndex);
        }
    }
}

