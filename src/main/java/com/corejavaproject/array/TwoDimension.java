package com.corejavaproject.array;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TwoDimension {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        arr[0][2] = 10;
        arr[1][2] = 20;
        arr[2][2] = 30;
        arr[3][2] = 40;
        arr[4][2] = 50;

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < args.length; j++) {
                log.info(i);
            }

        int [][] Arr = {{10, 20}, {15, 22}, {35, 50}};
    }
}
