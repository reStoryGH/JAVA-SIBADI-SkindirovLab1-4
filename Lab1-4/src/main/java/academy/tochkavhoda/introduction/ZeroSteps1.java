package academy.tochkavhoda.introduction;

public class ZeroSteps1 {
    // 1. Возвращает сумму чисел x и y
    public int sum(int x, int y) {
        return x + y;
    }

    // 2. Возвращает произведение чисел x и y
    public int mul(int x, int y) {
        return x * y;
    }

    // 3. Возвращает частное от деления чисел x и y
    public int div(int x, int y) {
        return x / y;
    }

    // 4. Возвращает остаток от деления чисел x и y
    public int mod(int x, int y) {
        return x % y;
    }

    // 5. Возвращает true, если x равен y, иначе false
    public boolean isEqual(int x, int y) {
        return x == y;
    }

    // 6. Возвращает true, если x больше y, иначе false
    public boolean isGreater(int x, int y) {
        return x > y;
    }

    // 7. Прямоугольный треугольник задан двумя катетами. Найти его площадь
    public double calculateTriangleSquare(int side1, int side2) {
        return (side1 * side2) / 2.0;
    }
    // 8. Прямоугольный треугольник задан двумя катетами. Найти его периметр
    public double calculateTrianglePerimeter(int side1, int side2) {
        double hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
        return side1 + side2 + hypotenuse;
    }

    // 9.Получить число, которое получится из него путем выписывания его цифр в обратном порядке.
    public int reverseNumber(int number) {
        int digit1 = number / 100;         
        int digit2 = (number / 10) % 10;   
        int digit3 = number % 10;         
        return digit3 * 100 + digit2 * 10 + digit1;
    }

    // 10. Дано целое число. Возвести его в степень 15, используя не более 5 умножений
    public long calculate15Degree(int number) {
        long result = number;           
        result = result * result;       
        result = result * result;       
        result = result * result;       
        result = result * result;       
        result = result / number;       
        return result;
    }

    // 11. Проверка, лежит ли точка внутри прямоугольника
    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    // 12. Находит квадратный корень абсолютной величины числа
    public double sqrtAbs(int number) {
        return Math.sqrt(Math.abs(number));
    }

    // 13. Проверка существования треугольника с тремя сторонами
    public boolean isTriangleExist(int side1, int side2, int side3) {
        return side1 + side2 > side3 &&
                side1 + side3 > side2 &&
                side2 + side3 > side1;
    }

    // 14. Возвращает произведение цифр четырехзначного целого числа
    public int getDigitsProduction(int number) {
        number = Math.abs(number);
        int production = 1;
        while (number > 0) {
            production *= number % 10;
            number /= 10;
        }
        return production;
    }

    // 15. Возвращает true, если круг радиуса radius может поместиться внутри квадрата со стороной side, не
    //касаясь окружности, иначе false
    public boolean isCircleInsideSquare(int radius, int side) {
        return 2 * radius < side;
    }

    // 16. Возвращает символ с кодом code
    public char getCharByCode(short code) {
        return (char) code;
    }

    // 17. Возвращает код символа character
    public short getCodeByChar(char character) {
        return (short) character;
    }

    // 18. Возвращает символ, который имеет код на offset больше, чем символ ch
    public char getCharByCodeAndOffset(char ch, short offset) {
        return (char) (ch + offset);
    }

    // 19. Проверка, код ch1 больше или равен коду ch2
    public boolean isGreaterOrEqual(char ch1, char ch2) {
        return ch1 >= ch2;
    }

    // 20. Возвращает символ с кодом, равным полусумме кодов ch1 и ch2
    public char getAverageChar(char ch1, char ch2) {
        return (char) ((ch1 + ch2) / 2);
    }
}
