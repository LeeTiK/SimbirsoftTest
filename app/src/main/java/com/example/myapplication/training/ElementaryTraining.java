package com.example.myapplication.training;

/**
 * Набор тренингов по работе с примитивными типами java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see ElementaryTrainingTest.
 */
public class ElementaryTraining {

    /**
     * Метод должен возвращать среднее значение
     * для введенных параметров
     *
     * @param firstValue  первый элемент
     * @param secondValue второй элемент
     * @return среднее значение для введенных чисел
     */
    public double averageValue(int firstValue, int secondValue) {
        //TODO: implement it
        return (firstValue + secondValue) / 2;
    }

    /**
     * Пользователь вводит три числа.
     * Произвести манипуляции и вернуть сумму новых чисел
     *
     * @param firstValue  увеличить в два раза
     * @param secondValue уменьшить на три
     * @param thirdValue  возвести в квадрат
     * @return сумма новых трех чисел
     */
    public double complicatedAmount(int firstValue, int secondValue, int thirdValue) {
        //TODO: implement it
        double answer = (firstValue * 2) + (secondValue - 3) + (thirdValue * thirdValue);
        return answer;
    }

    /**
     * Метод должен поменять значение в соответствии с условием.
     * Если значение больше 3, то увеличить
     * на 10, иначе уменьшить на 10.
     *
     * @param value число для изменения
     * @return новое значение
     */
    public int changeValue(int value) {
        //TODO: implement it
        return value > 3 ? value + 10 : value - 10;
    }

    /**
     * Метод должен менять местами первую
     * и последнюю цифру числа.
     * Обрабатывать максимум пятизначное число.
     * Если число < 10, вернуть
     * то же число
     *
     * @param value число для перестановки
     * @return новое число
     */
    // число может быть отрицательным ??
    // можно было сделать и через стригу, но более затратно
    public int swapNumbers(int value) {
        //TODO: implement it
        if (value<10 || value>=100000) return value;

        int numberOfTens = 1;
        int valueLocal = value;

        while (valueLocal>9)
        {
            valueLocal /=10;
            numberOfTens *=10;
        }

        int firstDigit = valueLocal;
        int lastDigit = value % 10;

        int answer = (value - firstDigit*numberOfTens - lastDigit) + lastDigit*numberOfTens + firstDigit;

        return answer;
    }

    /**
     * Изменить значение четных цифр числа на ноль.
     * Счет начинать с единицы.
     * Обрабатывать максимум пятизначное число.
     * Если число < 10 вернуть
     * то же число.
     *
     * @param value число для изменения
     * @return новое число
     */

    // можно было сделать и через стригу, но более затратно
    public int zeroEvenNumber(int value) {
        //TODO: implement it
        if (value<10 || value>=100000) return value;

        int numberOfTens = 1;
        int valueLocal = value;
        int answer = 0;
        int i =1;

        while (valueLocal>0)
        {
            int digital = valueLocal % 10;
            valueLocal /= 10;

            if (i%2 == 1) {
                answer += digital * numberOfTens;
            }

            numberOfTens *= 10;
            i++;
        }

        return answer;
    }
}
