   char residency = 'N';
    int payment, items = 300;
    if (items > 400)
       if (residency == 'N')
          payment = 2500;
       else
          payment = 3000;
    else if (items > 200)
       if (residency == 'R')
          payment = 1500;
       else
          payment = 1000;
