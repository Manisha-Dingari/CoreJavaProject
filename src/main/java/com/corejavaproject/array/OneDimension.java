package com.corejavaproject.array;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class OneDimension {

    public static void main(String[] args)
    {
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = 0; i < arr.length; i++)
            log.info(i);
    }

    int[] arr2 = { 10, 20, 15, 22, 35 };
}
