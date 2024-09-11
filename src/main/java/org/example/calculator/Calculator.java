package org.example.calculator;

/**
 * TODO Goal of this class is to solve some mathematics operations. Create methods as follows:
 * <p>
 * 1. method 'sum' receives 2 parameters of type 'int' and returns their sum
 * 2. method 'difference' receives 2 parameters of type 'int' (ex. param1, param2) and returns the result of 'param1 - param2'
 * 3. method 'divide' receives 2 parameters of type 'int' (ex. param1, param2) and return the result of 'param1 / param2'
 * - also the method checks if 'param2' is 0 and in this case throws an exception
 * 4. method 'factor' receives 2 parameters of type 'int' (ex. param1, param2) and returns their products
 * <p>
 * For each method write unit tests to assure it works as expected.
 */
public class Calculator {

    public static int sum(int param1, int param2) {
        return param1 + param2;
    }

    public static int difference(int param1, int param2) {
        return param1 - param2;
    }

    public static int divide(int param1, int param2) throws Exception {
        if (param2 == 0) {
            throw new Exception();
        }
        return param1 / param2;

    }

    public static int factor(int param1, int param2) {
        return param1 * param2;
    }

}
