int month = 8, temp = 100;
if (month >= 6 && month <= 9 && temp <= 60)
    System.out.println("Low");
else if (month >= 6 && month <= 9 && temp >= 90)
    System.out.println("High");
else if (month >= 6 && month <= 9 && temp > 60 && temp < 90)
    System.out.println("Normal");
else
    System.out.println("Unknown");
