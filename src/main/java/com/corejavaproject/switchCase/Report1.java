package com.corejavaproject.switchCase;

public class Report1 {
    public String getReport1(String region){
    String report = switch (region) {  // java 12
        case "Day 01" -> "Monday";
        case "Day 02" -> "Tuesday";
        case "Day 03", "Wednesday" -> "Wednesday";
        default -> "Weekend";
    };
    return report;
}
}
