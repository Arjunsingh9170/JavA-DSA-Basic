class Human {
    void eat()
    {
        System.out.println("eating..");
    }
    
}
class child extends Human{
    void drink()
    {
        System.out.println("drinking..");
    }
}
class Babychild extends child{
    void weeping()
    {
        System.out.println("weeping..");
    }
}
class printvsprintln{
    public static void main(String args[]){
        Babychild d=new Babychild();
        d.weeping();
        d.eat();
        d.drink();
        
    }

}