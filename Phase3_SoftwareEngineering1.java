/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phase3_softwareengineering1;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author hp
 */
public class Phase3_SoftwareEngineering1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println();
        System.out.println("welcom in masroqa Application");
        ArrayList<User> Register=new ArrayList<>();
        ArrayList<ItemFound>Found=new ArrayList<>();
        String name;
        String email;
        String password;
        int phone;
        float age;
        boolean status = false;
        while(true)
        {
            
        System.out.println("1-Register\n2-Log-in\n3-Exit\n");
        int n=input.nextInt();
        if(n==1)
        {
            User U=new User();
            System.out.println("name:");
            name=input.next();
            U.setName(name);
            System.out.println("email:");
            email=input.next();
            U.setEmail(email);
            System.out.println("phone:");
            phone=input.nextInt();
            U.setPhone(phone);
            System.out.println("age:");
            age=input.nextFloat();
            U.setAge(age);
            System.out.println("password:");
            password=input.next();
            U.setPassword(password);
            Register.add(U);
        }
        else if(n==2)
        {
            System.out.println("name:");
            name=input.next();
            System.out.println("email:");
            email=input.next();
            System.out.println("password:");
            password=input.next();
            for(int i=0;i<Register.size();i++)
            {
                if(name.equals(Register.get(i).getName())&&email.equals(Register.get(i).getEmail())&&password.equals(Register.get(i).getPassword()))
                {
                    status=true;
                    break;
                }
                else
                {
                    status=false;
                }
            }
            if(status==true)
            {
                while(true)
                {
                    System.out.println("you can use Application\n1-SharePost\n2-Search\n3-showAllitem\n4-log-out\n");
                    int c=input.nextInt();
                    if(c==1)
                    {
                        ItemFound F=new ItemFound();
                        System.out.println("please enter name of item that you found");
                        String NA=new String();
                        NA=input.next();
                        F.Name=NA;
                        System.out.println("please enter ID for item that you found");
                        int id=input.nextInt();
                        F.Id=id;
                        System.out.println("please enter Description of item that you found");
                        String des=new String();
                        des=input.next();
                        F.setDes(des);
                        Found.add(F);
                    }
                    else if(c==2)
                    {
                        System.out.println("please enter name of item that you found");
                        String N=new String();
                        N=input.next();
                        boolean b=false;
                        for(int i=0;i<Found.size();i++)
                        {
                            if(N.equals(Found.get(i).Name))
                                {
                                System.out.println(Found.get(i).Id+"\n"+Found.get(i).Name+"\n"+Found.get(i).getDes()+"\n*****\n");
                                b=true;
                                }
                        }
                        if(b==false)
                        {
                            System.out.println("the item not found in applicaition now");
                        }
                    }
                    else if(c==3)
                    {
                        for(int i=0;i<Found.size();i++)
                        {
                            System.out.println(Found.get(i).Id+"\n"+Found.get(i).Name+"\n"+Found.get(i).getDes()+"\n*****\n");
                        }
                    }
                    else if(c==4)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("this option not in the list");
                    }
                }
            }
            else
                {
                    System.out.println("the user name and email not Registered in an application please register then use application");
                }
        }
        else if(n==3)
            {
                break;
            }
        else
        {
            System.out.println("This option not found in the list.");
        }
        for(int i=0;i<Register.size();i++)
        {
            //System.out.println(Register.get(i).getName()+"\n"+Register.get(i).getEmail()+"\n"+Register.get(i).getPhone()+"\n"+Register.get(i).getAge());
           //name=Register.get(i).getName();
           //email=Register.get(i).getEmail();
           //phone=Register.get(i).getPhone();
           //age=Register.get(i).getAge();
           
        }
        
        }
    }
}
