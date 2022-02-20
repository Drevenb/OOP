package com.company;

import java.util.Scanner;
public class Main {

    //Завдання 1. Максимум із двох чисел

    /*public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println ("Введите 2 числа ");
        int n = k.nextInt();
        int m = k.nextInt();
        System.out.println("Answer is "+(n*(n/m)+m*(m/n))/(m/n+n/m));

    }
}


//Завдання 2. Високосний рік
        package com.company;

        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите число ");
        int year = n.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("YES");
        } else ;
        {
            System.out.println("NO");

        }
    }
}





//Завдання 3. Тестуюча система
        package com.company;

        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Введите 2 числа ");
        int a = k.nextInt();
        int b = k.nextInt();
        if (a != 1 && b != 1) {
            System.out.println("YES");
        } else {
            if (a == 1 && b == 1) {
                System.out.println("YES");

            } else {
                System.out.println("NO");

            }
        }
    }
}


//Завдання 4. Знак числа
        package com.company;

        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Введите 2 числа ");
        int a = k.nextInt();
        int b = k.nextInt();

        if (a>b) {
            System.out.println("1");
        } else {
            if (a<b) {
                System.out.println("2");

            } else {
                System.out.println("0");

            }
        }
    }
}

//Завдання 6. Максимум із трьох
        package com.company;

        import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Введите 3 числа ");
        int a = k.nextInt();
        int b = k.nextInt();
        int c = k.nextInt();

        if (a < b) {
            a = b;
            if (a < c) {
                a = c;
                System.out.println("" + a);
            }
        }
    }
}
*/

//Завдання 7. Ладья
/*public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.println("Введите 4 числа ");
    int x1 = n.nextInt();
    int y1 = n.nextInt();
    int x2 = n.nextInt();
    int y2 = n.nextInt();
    if (x1==x2 || y1==y2) {
        System.out.println("Yes");
    }else {
        System.out.println("No");
    }
    }
}*/

    //Завдання 8. Слон
/*public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.println("Введите 4 числа ");
    int x1 = n.nextInt();
    int y1 = n.nextInt();
    int x2 = n.nextInt();
    int y2 = n.nextInt();
    int dx = x1 - x2;
    int dy = y1 - y2;
    if (dx < 0) {
        dx = -dx;
        if (dy < 0) {
            dy = -dy;
            if (dx == dy){

                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
}
*/
//Завдання 9. Ферзь
/*public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.println("Введите 4 числа ");
    int x1 = n.nextInt();
    int y1 = n.nextInt();
    int x2 = n.nextInt();
    int y2 = n.nextInt();
    int dx=x1-x2;
    int dy=y1-y2;
    if (dx<0){
        dx=-dx;
    }
    if (dy<0){
        dy=-dy;
    }

    if(x1==x2 || y1==y2 || dx==dy){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
 }
}
*/
//Завдання 10. Король
/*    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите 4 числа ");
        int x1 = n.nextInt();
        int y1 = n.nextInt();
        int x2 = n.nextInt();
        int y2 = n.nextInt();
        int dx = x1 - x2;
        int dy = y1 - y2;
        if (dx < 0) {
            dx = -dx;
        }
        if (dy < 0) {
            dy = -dy;
        }

        if (dx + dy == 1) {
            System.out.println("Yes");
        } else {
            if (dx + dy == 2 && dx == 1 && dy == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
*/
//Завдання 11. Кінь
    /*public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите 4 числа ");
        int x1 = n.nextInt();
        int y1 = n.nextInt();
        int x2 = n.nextInt();
        int y2 = n.nextInt();
        int dx = x1 - x2;
        int dy = y1 - y2;
        if (dx < 0){
            dx = -dx;
        }
        if (dy < 0) {
            dy = -dy;
        }
        if ((dx+dy)==3 && dx!=0 && dy!=0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        }
    }
     */
//Завдання 12. Шоколадка
    /*public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Введите 3 числа ");
        int n = x.nextInt();
        int m = x.nextInt();
        int k = x.nextInt();
        if (k<=m*n &&(k%n==0 || k%m==0)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        }
    }
*/

//Завдання 13. Фішки
/*public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.println("Введите число ");
    int m = n.nextInt();
    if (m % 4 == 0 || m == 1) {
        System.out.println("Yes");
    } else {
        System.out.println("No");
      }
   }
}
*/

//Завдання 14. Рівняння
/*public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.println("Введите 2 числa ");
    int a = n.nextInt();
    int b = n.nextInt();
    if (a==0 && b==0){
        System.out.println("INF");
    } else {
        if ( a==0 || b%a!=0){
            System.out.println("No");
        } else {
            System.out.println(""+(-b/a));
        }
        }
    }
    }
 */

    //Завдання 15. Складне рівняння
    /*public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите 4 числа ");
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();
        int d = n.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("INF");
        } else {
            if (a == 0 || b % a != 0 || c * (-b / a) + d == 0) {
                System.out.println("No");
            } else {
                System.out.println("" + (-b / a));
            }
        }
    }
}
*/

    //Завдання 16. Решта
   /* public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите 4 числа ");
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();
        int d = n.nextInt();
        int rRes = c - a;
        int kRes = d - b;
        if (kRes < 0) {
            kRes += 100;
            rRes--;
        }
        System.out.println(rRes+" "+kRes);
    }
}
*/

//Завдання 17. Морозиво
/*public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.println("Введите число ");
    int k = n.nextInt();
    if (k!=1 && k!=2 && k!=4 && k!=7 ) {
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
}
}
*/

//Завдання 18. Котлети
/*public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    System.out.println("Введите 3 числа ");
    int n = x.nextInt();
    int m = x.nextInt();
    int k = x.nextInt();
    int time =0;
    if (n<k) {
        time = 2 * m;
    }else{
    time =2*n/k*m;
        if (2 * n % k !=0){
            time += m;
    }
        System.out.println(time);
    }
  }
}
 */

//Завдання 19. Кількість рівних із трьох
/*public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    System.out.println("Введите 3 числа ");
    int a = x.nextInt();
    int b = x.nextInt();
    int c = x.nextInt();
    if (a == b && b == c){
        System.out.println("3");
    }else {
        if (a == b || b == c || a == c) {
            System.out.println("2");
        }else{
            System.out.println("0");
        }
        }
    }
}
*/

//Завдання 20. Корови
public static void main(String[] args) {
    Scanner k = new Scanner(System.in);
    System.out.println("Введите число ");
    int n = k.nextInt();
    if ( n%10==0 || (n%10>=5 && n%10<=9)||(n>=11 && n<=14)){
        System.out.println(n+" korov");
    }else{
        if(n%10==1){
            System.out.println(n+" korova");

        }else {
            System.out.println(n+" korovy");
        }
        }
    }
}
