import java.util.*;
class Animal 
    {
      void eat()
           {
            System.out.println("eating...");
           }

    }
    class Dog extends Animal {
        void bark()
        {
            System.out.println("barking...");
        }
    }
    class babyDog extends Dog{
        void sleep()
        {
            System.out.println("sleeping");
        }
    }
    class TestInharitance2{
        public static void main(String args[]){
            babyDog d=new babyDog();
            d.sleep();
            d.bark();
            d.eat();
        }
    }
    

