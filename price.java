int price;
int tier = 2;
int year = 1995;
switch (tier)
{
  case 1:
  case 2:
    if (year < 1990)
      price = 300;
    else
      price = 400;
    break;
  case 3:
  case 4:
    if (year < 2000)
       price = 500;
    else
       price = 600;
       break;
}
