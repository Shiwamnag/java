class parent {
    void display(){
        System.out .println("this is the parent class method");
    }
}
class child1 extends parent{
    void display()
{
    System.out.println("this is the chlid1 class methd");
}

}
class child2 extends parent{
    void display(){
        System.out.println("this is the chlid2 class methd");
    }
}
class abstraction{
    public static void main(String args[]){
        parent p= new parent();
        p.display();
        child1 ob1= new child1();
        child2 ob2= new child2();
        ob1.display();
        ob2.display();
        p=ob1;//the object child1 has been reference variable p
                //by parent refrence variable p
        p.display();
        //the object child2 has been referred 
        //by parents refrence variable p
        p.display();
        
    }
}
