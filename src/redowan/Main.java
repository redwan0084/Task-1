package redowan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        String section;
        System.out.print("Enter the Section:");
        section=input.nextLine();

        Info  info =new Info ();
        Hobby hobby =new Hobby ();

        System.out.println("Your Section is:"+section);
        System.out.println("Name is:"+info.name);
        System.out.println("Id is:"+info.id);
        System.out.println("Hobby is:"+hobby .hobbyName);

    }
}
