package stringimp;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khese
 */
public class Array {
    public static void main(String[] args) {
        int a[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        int sum = 0, max = a[0], secondLargest = a[0], maxIndex = 0;
        
//        System.out.println("Which element do you want to search? a = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10}");
//        Scanner sc = new Scanner(System.in);
//        int key = sc.nextInt();
        for (int i = 0; i < a.length; i++){
            sum = sum + a[i];
//            if (key == a[i]){
//                maxIndex = i;
//                System.out.println("The searched element is found at index : " + i);
//                System.exit(0);
//            }
            if (max < a[i]){
                secondLargest = max;
                max = a[i];
            }else if (a[i] > secondLargest){
                secondLargest = a[i];
            }
        }
        
        
        System.out.println("The searched element was not found.");
        System.out.println("The maximum value is : " + max);
        System.out.println("The second largest value is : "+ secondLargest);
        System.out.println(sum);
    }
}
