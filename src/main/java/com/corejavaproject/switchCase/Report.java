package com.corejavaproject.switchCase;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Report {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.info("Enter the Weekday ");
        String days = scanner.next();

        Report report = new Report();
        String response = report.getReport(days);
        log.info("Response:{}", response);
    }

    public  String getReport(String days){
        String report;

        switch(days){
            case "Day 01" :
             report = "Monday";
             break;
            case "Day 02" :
                report = "Tuesday";
                break;
            case "Day 03" :
                report = "Wednesday";
                break;
            case "Day 04" :
                report = "Thursday";
                break;
            case "Day 05" :
                report = "Friday";
                break;
            default:
                report = "Weekend";
        }
        return report;
    }
}
