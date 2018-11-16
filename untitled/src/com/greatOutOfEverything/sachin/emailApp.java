package com.greatOutOfEverything.sachin;

import java.util.Scanner;

public class emailApp {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmail;
    private int defaultPasswordlength=10;
    private int mailboxCapacity=500;
    private String email;
    private String companySuffux="great";
    //constructor to receive the firstName And LastName

public emailApp(String firstName,String lastName){
    this.firstName=firstName;
    this.lastName=lastName;
    System.out.println(firstName+lastName);

    //Generate a password

    this.password = randomPassword(defaultPasswordlength);
    System.out.println("Your password is"+ this.password);

    //call a method asking for the department

    this.department=setDepartment();
    System.out.println(firstName+" "+lastName +" has been with the "+"Department that is "+this.department);

    //Make a email generating function
    email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffux+".com";
    System.out.println("Your email is :"+ email);
}

    //Ask for the department

    private String setDepartment(){
        System.out.println("Enter the department \n1 for " +
                "sales \n2 for development \n3 for Accounts");
        Scanner sc =new Scanner(System.in);
        int deepchoice = sc.nextInt();
        if(deepchoice==1) return "sales";
        else if(deepchoice ==2 )return "dev";
        else if(deepchoice==3) return "acct";
        else {
            return "";
        }
    }

    //Generate random password
    private String randomPassword(int length){
        String passwordSet= "ABCDEFGHIGHKLMNOPQRSTUVWXYZ!@#$%^&*";
        char[] password= new char[length];
        for(int i=0;i<length;i++){
            int random=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(random);

        }
        return new String(password);
    }
    //Set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }
    //change the password
    public void setPassword(String password){
        this.password=password;
    }

    //change the alternate mail
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail=alternateEmail;
    }
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
    return password;
    }


}
