import java.io.*;
import java.awt.*;
import javax.swing.*;

public class NewClass{
    public String name;
    private int age;

    NewClass(String name, int age){
        this.name = name;
        this.age = age;
    }
    private String getName(){
        return name;
    }

    public static void main(String[] args) {
        NewClass newObj = new NewClass("Ram", 22);
        System.out.println(newObj.getName());
    }
}



