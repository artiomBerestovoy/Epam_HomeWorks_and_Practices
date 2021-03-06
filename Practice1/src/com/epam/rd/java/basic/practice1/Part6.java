package com.epam.rd.java.basic.practice1;

public class Part6 {

    public static void main(String[] args) {
    	if (args.length == 0) {
    		System.out.print("");
    		System.exit(0);
    	}
    	
        int[] numbArray = new int[Integer.parseInt(args[0])];
        int j = 0;
        
        for (int i = 2; j < numbArray.length; i++) {
            boolean isPrime = true;
            int count = 0;

            for (int k = 2; isPrime; k++) {
                if ((i % k) == 0) {
                    count++;
                }
                if (count > 1) {
                    isPrime = false;
                }
                if (k == i) {
                    isPrime = false;
                }
            }
            if (count == 1) {
                numbArray[j++] = i;
            }
        }
        print(numbArray);
    }
    
    public static void print(int [] list) {
    	StringBuilder sb = new StringBuilder();

        for (int i = 0; i < list.length; i++) {
            sb.append(list[i]);
            sb.append(' ');
            }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb.toString());
    }

}