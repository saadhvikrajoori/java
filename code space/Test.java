class Animal {
    String color;
    Animal(String c){
        color = c;
}
}
class Dog extends Animal {
int height;
Dog(String c,int ht){
super(c);
height = ht;
}
public void bark(){
 System.out.println("Dog is barking..");
}
}
class BabyDog extends Dog {
int weight;
BabyDog(String c,int ht, int wt){   
super(c,ht);
weight = wt;
}
public void weep(){
System.out.println("BabyDog is weeping..");
    }
}
public class Test {
public static void main(String[] args){
BabyDog bd = new BabyDog("Brown", 50, 10);
bd.bark();
bd.weep();
System.out.println("Color: " + bd.color + ", Height: " + bd.height + ", Weight: " + bd.weight);
    }
}
