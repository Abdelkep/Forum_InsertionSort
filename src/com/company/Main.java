package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Forum InsertionSort

            Scanner in = new Scanner(System.in);
            System.out.print("Banyak data : ");
            int N = in.nextInt();
            int data[] = new int[N];
            for (int i = 0; i < N; i++) {
                System.out.print("data ke-" + (i + 1) + " : ");
                data[i] = in.nextInt();
            }
            //prose isertion sort
            for (int i = 1; i < data.length; i++) {
                int key = data[i];
                int j = i;
                while (j > 0 && data[j - 1] > key) {
                    data[j] = data[j - 1];
                    j--;
                }
                data[j] = key;
            }
            //hasil pengurutan
            System.out.print("Data yang telah urut : ");
            for (int i = 0; i < data.length; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();


        }

    }
