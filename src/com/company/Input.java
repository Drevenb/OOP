package com.company;

import java.util.Scanner;
public class Input {
    // Завдання №1. Гіпотенуза
    /*public static void main(String[] args) {
int a=12;
int b=5;
int c=a*a+b*b;
double z = Math.sqrt(c);
        System.out.println("Hypotenuse= "+z);
    }
}


 //Завдання №2. Наступне та попереднє



/*public class Input  {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number");

        int Number = n.nextInt();
        System.out.println("The next number for the number "+Number+ " is " +(Number+1));
    }
}


//Завдання №3,4 . Поділ яблук – 1/2
/*package com.company;

import java.util.Scanner;
    public class Input {
        public static void main(String[] args) {
            Scanner n = new Scanner(System.in);
            System.out.println ("Введите 2 любых целых числа: ");//всегда делим на количество школьников
            int number1 = n.nextInt();//Количество яблок
            int number2 = n.nextInt();//Количество школьников
            int sum = number1/number2;
            System.out.print("Количество яблок: " +sum);
            int r = number1 % number2;
            System.out.println("\nОстаток в корзине: " +r);
        }
    }


//Завдання №5. Остання цифра
/*package com.company;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number");

        int Number = n.nextInt();
        System.out.println("The last digit of the given number "+Number%10);
    }
}


//Завдання №6. Число десятків двозначного числа
/*package com.company;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number");

            int Number = n.nextInt();
        if (Number < 100) ;
        else System.out.println("Не двузначное число.");
            System.out.println("The number of dozens is " + Number / 10);
      }
  }


//Завдання №7. Число десятків
/*package com.company;

import java.util.Scanner;

public class Itput {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number");

        int Number = n.nextInt();
        if (Number > 0) ;
        else System.out.println("Вы ввели отрицательное число.");
        System.out.println("The number of dozens is " + Number / 10 % 10);
    }
}

// Завдання №8. Сума цифр
package com.company;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number");

        int Number = n.nextInt();
        int s = 0, m = 1;
        for (int i = 0; i < 3; i++) {
            m *= Number % 10;
            s += Number % 10;
            Number /= 10;
        }
        System.out.println("Summ: " + s);
    }
}

//Завдання №9. Наступне парне
package com.company;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number");

        int Number = n.nextInt();
        System.out.println("The next pair number for the number "+Number+ " is " +(Number-Number%2+2));
    }
}

//Завдання №10. Електронний годинник – 1
package com.company;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number");

        int Number = n.nextInt();
        if(Number <= 59) {
            System.out.println("Прошло 0 часов и "+Number+ " минут ");
        } else if(Number > 1440) {
            Number = Number- ((Number/1440)*1440);
            System.out.println("Прошло "+Number/60+" часов и "+Number%60+" минут");
        } else {
            System.out.println("Прошло "+Number/60+" часов и "+Number%60+" минут");
    }
    }
}

//Завдання №11. Електронний годинник - 2
package com.company;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.Scanner;
public class Input {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number");
        int Number = n.nextInt();
        try {
            System.out.println(LocalTime.ofSecondOfDay(Number % (24 * 60 * 60)));
        } catch (DateTimeException e) {
            e.printStackTrace();
        }
    }
}

//Завдання №12. Обмін значень
package com.company;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println ("Введите 2 любых целых числа: ");
        int a = n.nextInt();
        int b = n.nextInt();
        a = a + b - (b = a);
        System.out.println (a+" "+b);
    }

}

//Завдання №13. Кінець уроків
package com.company;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println ("Enter number");
        int Number = n.nextInt();
        Number =Number *45 + (Number/2)*5 + ((Number+1)/2-1)*15;
        System.out.println("The end of the lesson is "+(Number/60 + 9)+" "+Number%60);
    }

}

//Завдання №14. Вартість покупки
package com.company;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println ("Введите 3 числа ");
        int a = k.nextInt();
        int b = k.nextInt();
        int n = k.nextInt();

        System.out.println((a * n + (b * n) / 100) + " " + (b * n) % 100);
    }

}

//Завдання №15. Різниця часів
package com.company;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println ("Введите 6 чисел ");
        int h1 = k.nextInt();
        int m1 = k.nextInt();
        int s1 = k.nextInt();
        int h2 = k.nextInt();
        int m2 = k.nextInt();
        int s2 = k.nextInt();

        System.out.println((h2-h1)*3600 + (m2-m1)*60 + (s2-s1));
    }

}

//Завдання №16. Автопробіг
package com.company;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println ("Введите 2 числа ");
        int n = k.nextInt();
        int m = k.nextInt();

        System.out.println((m+n-1)/n);
    }

}

//Завдання №17. Поділ яблук - 3
package com.company;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println ("Введите 2 числа ");
        int n = k.nextInt();
        int m = k.nextInt();//количество яблок

        System.out.println("\nСкольким школьникам достанеться больше " +(m-(m/n) * n));

    }
}

//Завдання №18. Равлик
package com.company;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println ("Введите 2 числа ");
        int h = k.nextInt();
        int a = k.nextInt();
        int b = k.nextInt();
        while (a>b) {
            System.out.println("День, на который доползёт улиточка "+((h - a - 1) / (a - b) + 2));
            break;
        }
    }
}

//Завдання №19. Симетричне число
package com.company;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println ("Введите число ");
        int Number = n.nextInt();
        int a= (Number/1000);
        int b= (Number/100%10);
        int c=(Number/10%10);
        int d=(Number%10);
        System.out.println("Answer is "+((a * 10+b)-(d * 10+c)+1));


        }
    }

//Завдання №20. Перевірте подільність
package com.company;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println ("Введите 2 числа ");
        int n = k.nextInt();
        int m = k.nextInt();
        int a1=n%m;
        int a2=m%n;
        System.out.println("Answer is "+(a1*a2+1));


        }
    }

//Завдання №21. Максимум
package com.company;

import java.util.Scanner;
public class Input {*/
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println ("Введите 2 числа ");
        int n = k.nextInt();
        int m = k.nextInt();
        System.out.println("Answer is "+(n*(n/m)+m*(m/n))/(m/n+n/m));

        }
    }

