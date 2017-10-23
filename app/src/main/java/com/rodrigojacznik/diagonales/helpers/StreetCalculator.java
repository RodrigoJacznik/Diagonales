package com.rodrigojacznik.diagonales.helpers;

import com.rodrigojacznik.diagonales.R;

public class StreetCalculator {
    static public String calculateStreet(Integer street, Integer number) {
        int numberLength = number.toString().length();
        int numberEndPart = 1;
        int significantNumberPart;

        int firstStreet = 0;
        int secondStreet;

        if (numberLength == 4) {
            numberEndPart = 2;
        }

        significantNumberPart = Integer.valueOf(number.toString().substring(0, numberEndPart));

        // paralela a 7
        if (street >= 1 && street < 32) {
            firstStreet = significantNumberPart * 2 + 32;
        }

        // paralela a 50
        if (street >= 32 && street <= 72) {
            firstStreet = significantNumberPart * 2 - 5;
        }

        // diagonales 73, 74, 79, 80
        if (street == 73 || street == 74 || street == 79 || street == 80) {
            firstStreet = significantNumberPart - 5;
        }

        if (street == 75 || street == 76) {
            firstStreet = significantNumberPart + 14;
        }

        if (street == 77 || street == 78) {
            firstStreet = significantNumberPart + 1;
        }

        // Ingresaron mal la calle
        if (firstStreet == 0) {
            return "";
        }

        // No existe la calle 52
        if (firstStreet == 52) {
            firstStreet = 53;
        }

        secondStreet = firstStreet + 1;

        // No existe la calle 52
        if (secondStreet == 52) {
            secondStreet += 1;
        }

        return street.toString() + " e/ " + firstStreet + " y " + secondStreet;
    }
}
