package com.skypro;

import com.skypro.exception.WrongLoginException;
import com.skypro.exception.WrongPasswordException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        char[] login = {'a', 'a', 'a','a', 'a', 'a', 'a', 'a', 'a', '_', '1', '2','3', '4','5','6','7','8', '9', 'W'};
        char[] password = {'b', 'b', 'b','b', 'b', 'b', 'b', 'b', 'b', '_', '1', '2','3', '4','5','6','7','8', '9'};
        char[] confirmPassword = {'b', 'b', 'b','b', 'b', 'b', 'b', 'b', 'b', '_', '1', '2','3', '4','5','6','7','8'};

        System.out.println(userDataVerification(login, password, confirmPassword));

    }

    public static boolean userDataVerification(char[] login, char[] password, char[] confirmPassword) {
        boolean result = true;
        try {
            if (login.length > 20) {
                throw new WrongLoginException();
            }

            if (password.length >= 20) {
                throw new WrongLoginException();
            }

            if (!Arrays.equals(confirmPassword, password)) {
                throw new WrongPasswordException();
            }
        } catch (WrongLoginException e) {
            System.out.println("количество символов не соответствует требованиям");
            result = false;
        } catch (WrongPasswordException e) {
            System.out.println("пароль не подтвержден");
            result = false;
        }

            return result;
    }


}