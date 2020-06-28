package com.epam.rd.java.basic.practice1;

public class Part3 {

    public static void main(String[] args) {
        if (args.length == 0) {
        	System.out.print("1 2 asd sad");
        	System.exit(0);
        }
    	StringBuilder sb = new StringBuilder();

        for (int i = 0; i < args.length; i++) {
            sb.append(args[i]);
            sb.append(' ');
            }

        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb.toString());

    }

}