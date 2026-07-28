class Student{
String name;
int age;
String course;
Student(){
name = "Unknown";
age = 0;
course = "Not Assigned";
}
Student(String n,int a){
name = n;
age = a;
course = "Not Assigned";
}
Student(String n, int a , String c){
name = n;
age = a;
course = c;
}
void display(){
System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
}
}
public class ConstructorOverloadingDemo{
public static void main(String[] args) {
Student s1 = new Student(); s 
Student s2 = new Student("Rahul", 20);
Student s3 = new Student("Priya", 22, "Computer Science");
s1.display();
s2.display();
s3.display();
}
}
