/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bigbrainproject01;


import java.util.concurrent.ThreadLocalRandom;


/**
 *
 * @author User
 */
public class NewMain {
   public static int[] arr = new int[]{0,15,44,60,65}; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int random_int = ThreadLocalRandom.current().nextInt(0,4);
       int input_int  = arr[random_int];
       int amount = binarySearch(arr,input_int);
        System.out.println("The amount of iron per dose required is: " + input_int +"mg.");
        System.out.println(Pharmacy(amount));
         
         
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

 public static String Pharmacy(int a){
     if (a == 0){
         return "No Rx should be prescribed";
     }
     else if (a == 1){
         return "Rx: BProtected Pedia, Fer-In-Sol, Fer-Iron (drops) [15 mg/1 mL]";
     }
     else if (a == 2){
         return "Rx: FeroSul (elixir) [40 mg/5 mL]";
     }
     else if (a == 3){
         return "Rx: Iron syrups [60 mg/5 mL]";
     }
     else if (a == 4){
         return "Rx: Ferro-Bob, FerrouSul (tablets) [65 mg/325 mg]";
     }
         return "";
 }
 
}
