package academy.tochkavhoda.introduction;

public class ZeroSteps2 {
    // 1. Возвращает сумму квадратов целых чисел от 1 до count
    public int sumSquares(int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i * i;
        }
        return sum;
    }

    // 2. Возвращает сумму нечетных целых чисел от 1 до count
    public int sumOdds(int count) {
        int sum = 0;
        for (int i = 1; i <= count; i += 2) {
            sum += i;
        }
        return sum;
    }

    // 3. Возвращает сумму обратных величин целых чисел от 1 до count
    public double sumInverses(int count) {
        double sum = 0.0;
        for (int i = 1; i <= count; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    // 4. Возвращает произведение целых чисел от 1 до count (факториал от count)
    public long factorial(int count) {
        if (count < 0) return 0;
        long result = 1;
        for (int i = 2; i <= count; i++) {
            result *= i;
        }
        return result;
    }

    // 5. Возвращает произведение цифр целого числа value
    public int prodDigits(int value) {
        if (value == 0) return 0;

        value = Math.abs(value);
        int product = 1;

        while (value > 0) {
            product *= value % 10;
            value /= 10;
        }

        return product;
    }

    // 6. Возвращает число Фибоначчи номер number (без рекурсии)
    public int fibonacci(int number) {
        if (number <= 0) return 0;
        if (number == 1) return 1;

        int prev1 = 0;
        int prev2 = 1;
        int current = 0;

        for (int i = 2; i <= number; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }

    // 7. Возвращает сумму всех степеней 2 от 2^0 до 2^max
    public long sum2Powers(int max) {
        long sum = 0;
        long power = 1; // 2^0

        for (int i = 0; i <= max; i++) {
            sum += power;
            power *= 2; // следующая степень
        }

        return sum;
    }
    // 8. Сумма квадратов с барьером
    public int sumSquaresWithBarrier(int count, int barrier) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            int square = i * i;
            sum += square;

            if (sum > barrier) {
                break;
            }
        }
        return sum;
    }

    // 9. Сумма всех произведений i*j
    public int sumPairProd(int count1, int count2) {
        int sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                sum += i * j;
            }
        }
        return sum;
    }

    // 10. Сумма произведений i*j с барьером
    public int sumPairProdWithBarrier(int count1, int count2, int barrier) {
        int sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                int product = i * j;
                if (product < barrier) {
                    sum += product;
                }
            }
        }
        return sum;
    }

    // 11. Сумма обратных величин 1/(i*j)
    public double sumInversePairProd(int count1, int count2) {
        double sum = 0.0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                sum += 1.0 / (i * j);
            }
        }
        return sum;
    }

    // 12. Сумма тройных произведений i*j*k
    public int sumTripleProd(int count1, int count2, int count3) {
        int sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                for (int k = 1; k <= count3; k++) {
                    sum += i * j * k;
                }
            }
        }
        return sum;
    }

    // 13. Вычисление числа e
    public double calculateE() {
        double sum = 1.0;
        double term = 1.0;
        int n = 1;

        while (term >= 1E-6) {
            term /= n;
            sum += term;
            n++;
        }
        return sum;
    }

    // 14. Вычисление числа π
    public double calculatePi() {
        double sum = 0.0;
        double term;
        int sign = 1;
        int denominator = 1;

        do {
            term = sign * (1.0 / denominator);
            sum += term;
            sign = -sign;
            denominator += 2;
        } while (Math.abs(term) >= 1E-8);

        return 4 * sum;
    }
    // 15. Вычисление площади круга методом Монте-Карло
    public double calculateCircleSquare(double length, int count) {
        if (count <= 0) return 0;

        int k = 0;
        double radius = length / 2.0;
        double centerX = length / 2.0;
        double centerY = length / 2.0;

        for (int i = 0; i < count; i++) {
            double x = Math.random() * length;
            double y = Math.random() * length;

            double dx = x - centerX;
            double dy = y - centerY;
            double distanceSquared = dx * dx + dy * dy;

            if (distanceSquared <= radius * radius) {
                k++;
            }
        }

        return length * length * k / count;
    }
}
