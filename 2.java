int number = 1, factor = 20;
do
{
    number = number * factor;
    factor = factor / 2;
    if (factor < 4)
        break;
} while (number < 800);
System.out.println(number);
