package com.corejavaproject.switchCase;

public class Report2 {
    public String getReport2(String region){

        String report = switch (region){  // java 13
            case "Day 01":
                yield "Monday";
            case "Day 02":
                yield "Tuesday";
            case "Day 03":
                yield "Wednesday";
            case "Day 04":
                yield "Thursday";
            default:
                yield "Weekend";
        };
        return report;
    }
}
