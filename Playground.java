package com.me;

import static java.lang.Math.sqrt;

import java.io.IOException;



/**
 * Created by brady.buford on 6/20/2017.
 */
public class Playground
{


    public static void main(String[] args) throws IOException
    {
        long time1 = System.nanoTime();


        System.out.println("hello");



        long time2 = System.nanoTime();
        long timeTaken_sec = (time2 - time1) / 1000000;
        System.out.println("Time taken " + timeTaken_sec + " millisecond");



    }
}







//    long time1 = System.nanoTime();

//    long time2 = System.nanoTime();
//    long timeTaken_sec = (time2 - time1) / 1000000;
//    System.out.println("Time taken: " + timeTaken_sec + " millisecond");