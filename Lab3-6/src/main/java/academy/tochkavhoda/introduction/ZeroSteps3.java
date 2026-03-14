package academy.tochkavhoda.introduction;

public class ZeroSteps3 {
    // 1. Возвращает сумму чисел массива
    public int sum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // 2. Возвращает произведение чисел массива
    public int mul(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int product = 1;
        for (int num : array) {
            product *= num;
        }
        return product;
    }

    // 3. Возвращает минимальное число массива
    public int min(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MAX_VALUE;
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // 4. Возвращает максимальное число массива
    public int max(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // 5. Возвращает среднее значение чисел массива
    public double average(int[] array) {
        if (array == null || array.length == 0) {
            return 0.0;
        }

        return (double) sum(array) / array.length;
    }

    // 6. Проверяет, упорядочен ли массив строго по убыванию
    public boolean isSortedDescendant(int[] array) {
        if (array == null || array.length <= 1) {
            return true;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                return false;
            }
        }
        return true;
    }
    // 7. Возводит все элементы массива в куб
    public void cube(int[] array) {
        if (array == null) return;

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
        }
    }

    // 8. Проверяет наличие элемента в массиве
    public boolean find(int[] array, int value) {
        if (array == null) return false;

        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    // 9. Переворачивает массив
    public void reverse(int[] array) {
        if (array == null) return;

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    // 10. Проверяет, является ли массив палиндромом
    public boolean isPalindrome(int[] array) {
        if (array == null || array.length <= 1) {
            return true;
        }

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    // 11. Заменяет элементы на квадраты до первого нуля
    public void replaceBySquare(int[] array) {
        if (array == null) return;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                break;
            }
            array[i] = array[i] * array[i];
        }
    }

    // 12. Произведение ненулевых элементов
    public int mulNonZero(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int product = 1;
        boolean hasNonZero = false;

        for (int num : array) {
            if (num != 0) {
                product *= num;
                hasNonZero = true;
            }
        }

        return hasNonZero ? product : 0;
    }

    // 13. Проверяет, все ли элементы положительные
    public boolean allPositive(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }

        for (int num : array) {
            if (num <= 0) {
                return false;
            }
        }
        return true;
    }

    // 14. Проверяет, все ли элементы равны
    public boolean allEqual(int[] array) {
        if (array == null || array.length <= 1) {
            return true;
        }

        int first = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != first) {
                return false;
            }
        }
        return true;
    }

    // 15. Находит первый элемент, больший своих соседей
    public int greaterThanNeighbours(int[] array) {
        if (array == null || array.length < 3) {
            return -1;
        }

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    // 16. Проверяет, есть ли элемент равный полусумме соседей
    public boolean neighboursAverage(double[] array) {
        if (array == null || array.length < 3) {
            return false;
        }

        for (int i = 1; i < array.length - 1; i++) {
            double average = (array[i - 1] + array[i + 1]) / 2.0;
            if (Math.abs(array[i] - average) < 1e-10) { // учет погрешности double
                return true;
            }
        }
        return false;
    }

    // 17. Сумма элементов между двумя нулями
    public int sumBetween2Zeros(int[] array) {
        if (array == null) return 0;

        int firstZeroIndex = -1;
        int secondZeroIndex = -1;

        // Находим первый ноль
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                firstZeroIndex = i;
                break;
            }
        }

        // Находим второй ноль
        for (int i = firstZeroIndex + 1; i < array.length; i++) {
            if (array[i] == 0) {
                secondZeroIndex = i;
                break;
            }
        }

        if (firstZeroIndex == -1 || secondZeroIndex == -1) {
            return 0;
        }

        // Суммируем элементы между нулями
        int sum = 0;
        for (int i = firstZeroIndex + 1; i < secondZeroIndex; i++) {
            sum += array[i];
        }
        return sum;
    }

    // 18. Количество совпадающих элементов на одинаковых позициях
    public int sameAtPosition(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return 0;
        }

        int count = 0;
        int minLength = Math.min(array1.length, array2.length);

        for (int i = 0; i < minLength; i++) {
            if (array1[i] == array2[i]) {
                count++;
            }
        }
        return count;
    }

    // 19. Проверяет, есть ли позиция с нулями в обоих массивах
    public boolean bothZeroAtPosition(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return false;
        }

        int minLength = Math.min(array1.length, array2.length);

        for (int i = 0; i < minLength; i++) {
            if (array1[i] == 0 && array2[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // 20. Заменяет элементы на накопленную сумму
    public void accumulatedSum(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            array[i] = sum;
        }
    }

    // 21. Слияние двух упорядоченных массивов
    public int[] mergeArrays(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return new int[0];
        }

        int[] result = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) {
                result[k++] = array1[i++];
            } else {
                result[k++] = array2[j++];
            }
        }

        // Добавляем оставшиеся элементы
        while (i < array1.length) {
            result[k++] = array1[i++];
        }

        while (j < array2.length) {
            result[k++] = array2[j++];
        }

        return result;
    }
    // 22. Количество точек, попадающих в круг с центром в (0,0)
    public int insideCircle(int[] x, int[] y, int radius) {
        if (x == null || y == null || x.length != y.length) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < x.length; i++) {
            // Расстояние от точки до центра (0,0)
            double distanceSquared = x[i] * x[i] + y[i] * y[i];
            // Проверяем, что точка внутри круга (включая границу)
            if (distanceSquared <= radius * radius) {
                count++;
            }
        }
        return count;
    }

    // 23. Скалярное произведение двух массивов
    public double scalarProduct(double[] array1, double[] array2) {
        if (array1 == null || array2 == null || array1.length != array2.length) {
            return 0.0;
        }

        double product = 0.0;
        for (int i = 0; i < array1.length; i++) {
            product += array1[i] * array2[i];
        }
        return product;
    }
}
