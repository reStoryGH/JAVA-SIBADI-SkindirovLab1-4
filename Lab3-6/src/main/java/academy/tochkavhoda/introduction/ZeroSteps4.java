package academy.tochkavhoda.introduction;

public class ZeroSteps4 {
    // 1. Минимальный элемент матрицы
    public int min(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return Integer.MAX_VALUE;
        }

        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    // 2. Максимальный элемент матрицы
    public int max(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    // 3. Поиск элемента в матрице
    public boolean find(int[][] matrix, int value) {
        if (matrix == null) return false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == value) {
                    return true;
                }
            }
        }
        return false;
    }

    // 4. Проверка упорядоченности всех строк по убыванию
    public boolean isSortedDescendant(int[][] matrix) {
        if (matrix == null) return true;

        for (int i = 0; i < matrix.length; i++) {
            // Проверяем каждую строку
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] <= matrix[i][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    // 5. Количество строк без нулевых элементов
    public int hasNoZeroRows(int[][] matrix) {
        if (matrix == null) return 0;

        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            boolean hasZero = false;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    hasZero = true;
                    break;
                }
            }
            if (!hasZero) {
                count++;
            }
        }
        return count;
    }

    // 6. Проверка наличия полностью нулевой строки
    public boolean hasFullZeroRow(int[][] matrix) {
        if (matrix == null) return false;

        for (int i = 0; i < matrix.length; i++) {
            // Проверяем что строка не пустая
            if (matrix[i] != null && matrix[i].length > 0) {
                boolean allZero = true;
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] != 0) {
                        allZero = false;
                        break;
                    }
                }
                if (allZero) {
                    return true;
                }
            }
        }
        return false;
    }

    // 7. Проверка симметричности матрицы
    public boolean isSymmetric(int[][] matrix) {
        if (matrix == null) return true;

        // Проверяем что матрица квадратная
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            if (matrix[i].length != n) {
                return false;
            }
        }

        // Проверяем симметричность
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    // 8. Максимальный элемент на главной диагонали
    public int mainDiagonalMax(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            // Проверяем что строка существует и имеет достаточную длину
            if (i < matrix[i].length) {
                if (matrix[i][i] > max) {
                    max = matrix[i][i];
                }
            }
        }
        return max;
    }

    // 9. Сумма положительных элементов главной диагонали
    public int mainDiagonalPositivesSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            if (i < matrix[i].length && matrix[i][i] > 0) {
                sum += matrix[i][i];
            }
        }
        return sum;
    }

    // 10. Максимальный элемент на побочной диагонали
    public int secondaryDiagonalMax(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            // Проверяем что элемент существует
            if (j < matrix[i].length) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    // 11. Сумма положительных элементов побочной диагонали
    public int secondaryDiagonalPositivesSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            if (j < matrix[i].length && matrix[i][j] > 0) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public int[][] matrixSum(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return new int[0][0];
        }

        // Проверяем что матрицы не пустые и имеют одинаковые размеры
        if (matrix1.length == 0 || matrix2.length == 0 ||
                matrix1.length != matrix2.length) {
            return new int[0][0];
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;

        // Проверяем что matrix2 имеет те же размеры
        if (matrix2.length != rows || matrix2[0].length != cols) {
            return new int[0][0];
        }

        // Дополнительная проверка: все строки должны иметь одинаковую длину
        for (int i = 1; i < rows; i++) {
            if (matrix1[i].length != cols || matrix2[i].length != cols) {
                return new int[0][0];
            }
        }

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }
    // 13. Транспонирование квадратной матрицы
    public void transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;

        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Меняем местами matrix[i][j] и matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // 14. Обмен четных и нечетных строк
    public void interchange(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;

        for (int i = 0; i < matrix.length - 1; i += 2) {
            // Меняем местами строки i и i+1
            int[] temp = matrix[i];
            matrix[i] = matrix[i + 1];
            matrix[i + 1] = temp;
        }
    }

    // 15. Преобразование в одномерный массив по строкам
    public int[] toLinearByRow(int[][] matrix) {
        if (matrix == null) return new int[0];

        // Считаем общее количество элементов
        int totalElements = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] != null) {
                totalElements += matrix[i].length;
            }
        }

        // Создаем результирующий массив
        int[] result = new int[totalElements];
        int index = 0;

        // Заполняем по строкам
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] != null) {
                for (int j = 0; j < matrix[i].length; j++) {
                    result[index++] = matrix[i][j];
                }
            }
        }

        return result;
    }

    // 16. Преобразование в одномерный массив по столбцам (для квадратной матрицы)
    public int[] toLinearByColumn(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[0];

        int n = matrix.length;
        int totalElements = n * n;
        int[] result = new int[totalElements];
        int index = 0;

        // Заполняем по столбцам
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                result[index++] = matrix[i][j];
            }
        }

        return result;
    }

    // 17. Элементы верхнего треугольника по строкам
    public int[] toLinearByRowUpperTriangle(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[0];

        int n = matrix.length;
        // Количество элементов в верхнем треугольнике (включая диагональ)
        int totalElements = n * (n + 1) / 2;
        int[] result = new int[totalElements];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                result[index++] = matrix[i][j];
            }
        }

        return result;
    }

    // 18. Сумма элементов в каждой строке до barrier
    public int sumUntilNotFoundInRow(int[][] matrix, int barrier) {
        if (matrix == null) return 0;

        int totalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] != null) {
                int rowSum = 0;
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == barrier) {
                        break; // Прекращаем суммирование в этой строке
                    }
                    rowSum += matrix[i][j];
                }
                totalSum += rowSum;
            }
        }

        return totalSum;
    }

    // 19. Сумма элементов во всей матрице до первого barrier
    public int sumUntilNotFound(int[][] matrix, int barrier) {
        if (matrix == null) return 0;

        int totalSum = 0;
        boolean barrierFound = false;

        for (int i = 0; i < matrix.length && !barrierFound; i++) {
            if (matrix[i] != null) {
                for (int j = 0; j < matrix[i].length && !barrierFound; j++) {
                    if (matrix[i][j] == barrier) {
                        barrierFound = true;
                        break; // Прекращаем суммирование во всей матрице
                    }
                    totalSum += matrix[i][j];
                }
            }
        }

        return totalSum;
    }
}
