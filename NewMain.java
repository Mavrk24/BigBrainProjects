/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bigbrainproject01;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class NewMain {
   public static int[] arr = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter search number-- ");  
        int input_int= sc.nextInt(); 
        System.out.println(binarySearch(arr,input_int));
         
         
    }
 
 public static int binarySearch(int[] nums, int target){
  
  if(nums == null || nums.length == 0)
    return -1;

  int left = 0, right = nums.length - 1;
  while(left <= right){
    // Prevent (left + right) overflow
    int mid = left + (right - left) / 2;
    if(nums[mid] == target){ return mid; }
    else if(nums[mid] < target) { left = mid + 1; }
    else { right = mid - 1; }
  }

  // End Condition: left > right
  return -1;
}
    
}
