package com.arrayoperations;

public class ArrayProblems {
    int arr[] = new int[]{1, 2, 3, 4, 5, 1, 2, 3};

    public void printArrayElemnts() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public void copyArrayElemts() {
        int arrDemo[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arrDemo.length; j++) {
                arrDemo[j] = arr[i];
            }
            System.out.println(arrDemo[i] + " ");
        }
    }

    public void printDuplicateelements() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j] + " ");
                }
            }
        }
    }

    public void printReverseorder() {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }

    public void arrayAtOddPosition() {
        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }

    public void arrayAtEvenPosition() {
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }

    public void largestArrayElement() {
        int arrMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arrMax)
                arrMax = arr[i];
        }
        System.out.println("Largest Elemnt in the array " + arrMax);
    }

    public void smallestArrayElemnt() {
        int arrMin = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arrMin)
                arrMin = arr[i];
        }
        System.out.println("Smallest Elemnt in the array " + arrMin);

    }

    public void numberOfElemntsInArray() {
        System.out.println("No of elemnts in the array are :" + arr.length);
    }

    public void sumOfAllElemntsInArray() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum of the elemnts present in the array :" + sum);
    }

    public void removeDuplicateElements() {
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[l - 1];
                    l--;

                }
            }
        }
        System.out.println("Array without duplicate elemnts");
        for (int i = 0; i < l; i++)
            System.out.println(arr[i] + " ");
    }

    public static void main(String[] args) {
        ArrayProblems arrayProblems = new ArrayProblems();
        System.out.println("First Array Elements :");
        arrayProblems.printArrayElemnts();
        System.out.println("Copying First Array Elemnts :");
        arrayProblems.copyArrayElemts();
        System.out.println("Duplicate Elements :");
        arrayProblems.printDuplicateelements();
        System.out.println("Reverse Order :");
        arrayProblems.printReverseorder();
        System.out.println("Array At Odd Position :");
        arrayProblems.arrayAtOddPosition();
        System.out.println("Array At Even Position :");
        arrayProblems.arrayAtEvenPosition();
        arrayProblems.largestArrayElement();
        arrayProblems.smallestArrayElemnt();
        arrayProblems.numberOfElemntsInArray();
        arrayProblems.sumOfAllElemntsInArray();
        arrayProblems.removeDuplicateElements();
    }
}
