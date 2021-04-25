package com.example.myapplication.training;

import java.util.Arrays;

/**
 * Набор тренингов по работе с массивами в java.
 * <p>
 * Задания определены в комментариях методов.
 * <p>
 * Проверка может быть осуществлена запуском тестов.
 * <p>
 * Доступна проверка тестированием @see ArraysTrainingTest.
 */
public class ArraysTraining {

    /**
     * Метод должен сортировать входящий массив
     * по возрастранию пузырьковым методом
     *
     * @param valuesArray массив для сортировки
     * @return отсортированный массив
     */
    public int[] sort(int[] valuesArray) {
        //TODO: implement it
        for (int i=0; i<valuesArray.length-1; i++)
        {
            for (int j=i+1; j<valuesArray.length; j++)
            {
                if (valuesArray[i] > valuesArray[j]) {
                    // swap
                    int a = valuesArray[i];
                    valuesArray[i] = valuesArray[j];
                    valuesArray[j] = a;
                }
            }
        }
        return valuesArray;
    }

    /**
     * Метод должен возвращать максимальное
     * значение из введенных. Если входящие числа
     * отсутствуют - вернуть 0
     *
     * @param values входящие числа
     * @return максимальное число или 0
     */
    public int maxValue(int... values) {
        //TODO: implement it
        if (values.length ==0 ) return 0;

        int max = values[0];

        for (int i=1; i<values.length; i++)
        {
            if (max<values[i])
            {
                max = values[i];
            }
        }

        return max;
    }

    /**
     * Переставить элементы массива
     * в обратном порядке
     *
     * @param array массив для преобразования
     * @return входящий массив в обратном порядке
     */
    public int[] reverse(int[] array) {
        //TODO: implement it
        for (int i=0; i<array.length / 2; i++)
        {
            //swap
            int a = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = a;
        }

        return array;
    }

    /**
     * Метод должен вернуть массив,
     * состоящий из чисел Фибоначчи
     *
     * @param numbersCount количество чисел Фибоначчи,
     *                     требуемое в исходящем массиве.
     *                     Если numbersCount < 1, исходный
     *                     массив должен быть пуст.
     * @return массив из чисел Фибоначчи
     */

    public int[] fibonacciNumbers(int numbersCount) {
        //TODO: implement it
        if (numbersCount<1)  return new int[]{};
        int[] fibonacci = new int[numbersCount];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i=2; i<numbersCount; i++)
        {
            fibonacci[i] = fibonacci[i-2] + fibonacci[i - 1];
        }

        return fibonacci;
    }

    /**
     * В данном массиве найти максимальное
     * количество одинаковых элементов.
     *
     * @param array массив для выборки
     * @return количество максимально встречающихся
     * элементов
     */
    public int maxCountSymbol(int[] array) {
        //TODO: implement it
        if (array.length == 0)  return 0;

        Arrays.sort(array);

        int max = 1;
        int current = 1;

        for (int i=1; i<array.length; i++)
        {
            if (array[i]==array[i-1])
            {
                current++;
            }
            else {
                if (current>max)
                {
                    max = current;
                }
                current = 1;
            }
        }

        return max;
    }
}
