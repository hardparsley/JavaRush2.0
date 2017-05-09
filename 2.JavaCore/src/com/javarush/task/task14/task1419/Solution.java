package com.javarush.task.task14.task1419;

import java.awt.*;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.file.FileAlreadyExistsException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            throw new ArithmeticException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalAccessException();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new IndexOutOfBoundsException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new ArrayIndexOutOfBoundsException();

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            throw new BufferOverflowException();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new ClassCastException();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new DataFormatException();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new IOException();

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new HeadlessException();

        } catch (Exception e) {
            exceptions.add(e);
        }


    }
}
