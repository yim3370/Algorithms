package Algorithms.백준.단계별로풀어보기.for문;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 2438 문제 별찍기-1
public class Step9 {
    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count  = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < count; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
