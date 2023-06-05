/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jodic
 */
public class Mergesort {
    public static void main(String[] args){
        String[] words = {"elephant", "zebra", "dog", "cat1", "fox","emu","cat2","cow"};
        String[] sortedwords = mergeSort(words, words.length);
        System.out.println("this is the sorted list");
        for (String sortedword : sortedwords) {
            System.out.println(sortedword);
        }
    }

    public static String[] mergeSort(String[] unsorted, int n) {
        if (n <= 1) {
            return unsorted;
        } else {
            int midpoint = n / 2;
            String[] a = new String[n / 2];
            for (int i = 0; i < midpoint; i++) {
                a[i] = unsorted[i];
            }
            String[] b = new String[n / 2];
            for (int j = 0; j < midpoint; j++) {
                b[j] = unsorted[midpoint + j];
            }
            a = mergeSort(a, n / 2);
            b = mergeSort(b, n / 2);

            String[] sorted = new String[n];
            return Mergesort.mergeTwoArraysStr(sorted, a, b, n / 2, n / 2);
            }
        }
    public static String[] mergeTwoArraysStr(String a[] , String left[], String right[], int leftn, int rightn){
        int idxleft= 0;
        int idxright= 0;
        int idxa= 0;
        while(idxleft<leftn && idxright<rightn){
            //this has to compare the two strings
            for(int i = 0; i<left[idxleft].length(); i++){
                    if(left[idxleft].charAt(i)==right[idxright].charAt(i)){
          
                    }
               else if(left[idxleft].charAt(i)>right[idxright].charAt(i)){
                a[idxa]=left[idxleft];
                idxa++;
                idxleft++;
                break;

            }
            else if(left[idxleft].charAt(i)<right[idxright].charAt(i)){
                a[idxa]=right[idxright];
                idxa++;
                idxright++;
                break;

            }
            }
        }
        if(idxleft < leftn){
            for(int i =idxleft; i<leftn; i++){
                a[idxa]= left[i];
                idxa++;
            }
        }
        if(idxright<rightn){
            for(int i =idxright; i<rightn; i++){
                a[idxa]=right[i];
                idxa++;
            }
        }
        return a;
    }
    /*
    public static int[] mergeTwoArrays(int a[], int left[], int right[], int leftn, int rightn){
        int idxleft= 0;
        int idxright= 0;
        int idxa= 0;
        while(idxleft<leftn && idxright<rightn){
            if(left[idxleft]<right[idxright]){
                a[idxa]=left[idxleft];
                idxa++;
                idxleft++;

            }
            else{
                a[idxa]=right[idxright];
                idxa++;
                idxright++;

            }
        }
        if(idxleft < leftn){
            for(int i =idxleft; i<leftn; i++){
                a[idxa]= left[i];
                idxa++;
            }
        }
        if(idxright<rightn){
            //loop through the remaining ones
            for(int i =idxright; i<rightn; i++){
                a[idxa]=right[i];
                idxa++;
            }
        }
        return a;
    }

     */
}

