import java.util.*;
class abd{
   
    void area(int h, int b ){
        System.out.println("Area="+(h*b)/2);
    }
    void area(int a,int b, int c ){
        int s =(a+b+c)/2;
        double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area="+area);
    }
    void area(int d ){
        double h=Math.sqrt(3);
        h=h/4*d*d;
        System.out.println("Area="+h);
    }
}
class overloading {
    public static void main(String[] args) {
        abd on=new abd();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the respective number according to your choice\n");
        System.out.println("1. To find area of right angled triangle. \n2. To find area of isosceles triangle. \n3. To find area of equilateral triangle.");
        int w=sc.nextInt();
        switch(w){
            case 1 :System.out.println("Enter height & breadth of triangle     .");
                    int h=sc.nextInt();
                    int b=sc.nextInt();
                    on.area(h,b);
                    break;
            case 2 :System.out.println("Enter 3 sides of the triangle          .");
                    int a=sc.nextInt();
                    int z=sc.nextInt();
                    int c=sc.nextInt();
                    if(a+z>c&&z+c>a&&a+c>z){
                        on.area(a,z,c);
                    }
                    else{
                        System.out.println("Triangle is not possible");
                    }
                    break;
            case 3 :System.out.println("Enter side of triangle     .");
                    int q=sc.nextInt();
                    on.area(q);
                    break;
        }
    }
}
