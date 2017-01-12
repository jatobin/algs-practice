package com.algspractice.node.probs.trees;

/**
 * Created by jtobin on 06/02/15.
 */
public class QuantilesMain {

    public static void main(String[] args) {
//        if (args.length != 1) {
//            System.out.println("You need to specify one file path.");
//            System.exit(-1);
//        }
//        String filepath = args[1];
//
        int quantiles = 4;
        int size = 10;

        int[] values = new int[] {0,1,2,3,4,5,6,7,8,9};
        int[] counts = new int[] {1,1,1,1,1,1,1,1,1,1};

        //expect to return

        int[] newvals   = new int[]{3, 6, 7, 8, 10, 13, 15, 16, 20};
        int[] newcnts = new int[]{1, 1, 1, 2,  1,  1,  1,  1,  1};

        int[] quants = Quantiles.getQuantiles(quantiles, size, newvals, newcnts);

        for (int i : quants) {
            System.out.println(i); //expecting 7,10,15
        }
        System.out.println();
        System.out.println("Next batch:");
        newvals = new int[] {3, 6, 7, 8, 9, 10, 13, 15, 16, 20};
        newcnts = new int[] {1, 1, 1, 2, 1,  1,  1,  1,  1,  1};

        quants = Quantiles.getQuantiles(quantiles, size, newvals, newcnts);

        for (int i : quants) {
            System.out.println(i); //expecting 7,9,15
        }
    }
}
