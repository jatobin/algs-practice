package com.algspractice.node.probs.trees;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by jtobin on 06/02/15.
 */
public class Quantiles {

    /*
    Given a number of Q quantiles, calculate the value at each of the quantiles
     */

    /**
     *
     * @param num_quantiles - number of quantiles the problem is to be divided into
     * @param size - the size of values or counts
     * @param values - the set of values. values is paired with count. values[i] ~ counts[i]. Guaranteed unique.
     * @param counts - the set of counts for each value. not unique.
     * @return returns the values at each of the quantiles. Size is Q-1
     */
    public static int[] getQuantiles(int num_quantiles, int size, int[] values, int[] counts) {

        if (values.length != counts.length) {
            System.out.println("Cannot associate values to counts: Size mismatch");
            return new int[]{};
        }
        if (num_quantiles <= 0) {
            System.out.println("You must specify a positive integer for the number of quantiles.");
            return new int[] {};
        }

        int[] return_arr = new int[num_quantiles-1];

        //treemap sorts in ascending order, as you insert. n *log(n) time. no wasted time sorting, or holding  excess
        //things in memory

        //value should be the key because the the quantiles are conditional on an ascending, ordered list
        TreeMap<Integer, Integer> value_count_map = new TreeMap<Integer, Integer>();

        int total_size = 0;
        for (int i = 0; i < values.length; i++ ) {
            value_count_map.put(values[i], counts[i]);
            total_size += counts[i];
        }

        int[] quantile_indexes = getAllQuantileIndexes(num_quantiles, total_size);

        for (int i = 0; i < quantile_indexes.length; i++) {
            return_arr[i] = valueForIndex(value_count_map, quantile_indexes[i]);
        }
        return return_arr;
    }

    /**
     *
     * @param num_quantiles The number of quantiles desired for this data set
     * @param size The size of the dataset
     * @return An array containing all of the quantile indexes in the dataset
     */
    private static int[] getAllQuantileIndexes(int num_quantiles, int size) {
        int[] quants = new int[num_quantiles-1];
        for (int k = 1; k < num_quantiles; k++) {
            quants[k-1] = (int) Math.ceil((size * k) / num_quantiles);
        }
        return quants;

    }

    /**
     *
     * @param map - TreeMap containing the value - count pairs
     * @param quantile_index the particular quantile index we are looking for.
     * @return the value at the quantile index
     */
    private static int valueForIndex(TreeMap<Integer, Integer> map, int quantile_index) {
    //we don't want to explicitly enumerate all arrays, so just keep it in map form.
        long tmp_total = 0;
        //treemap has preserved order.
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            //wording is a little backwards - the getValue returns the count, and getKey returns the value of the int
            tmp_total += entry.getValue();
            if (tmp_total > quantile_index) return entry.getKey();
        }

        return 0;
    }

}
