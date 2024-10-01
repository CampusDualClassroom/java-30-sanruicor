package com.campusdual.classroom;

public class Exercise30 {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {
            throw new DivisionByZeroException("No se puede dividir un número entre cero");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            System.out.println(divisionWithCustomException(10, 0));
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}


