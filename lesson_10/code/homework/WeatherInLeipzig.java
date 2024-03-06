package homework;

/*
Collect data on daytime temperatures in your city and the past week into an array.
Print the temperature that was on Tuesday and then on Thursday.
Find the average temperature for the past week.
*/

public class WeatherInLeipzig {
    public static void main(String[] args) {

        // Temperatures over the last week in Leipzig
        int[] temperatures = {9, 12, 8, 5, 7, 8, 12};

        System.out.println("Temperature on Tuesday: " + temperatures[1] + "° ");
        System.out.println("Temperature on Thursday: " + temperatures[3] + "° ");

        // Calculating the average temperature for the past week
        int sum = 0;
        for (int temperature : temperatures) {
            sum += temperature;
        }
        double averageTemperature = sum / temperatures.length;
        System.out.println("Average temperature over the past week in Leipzig: " + averageTemperature + "° ");
    }
}
