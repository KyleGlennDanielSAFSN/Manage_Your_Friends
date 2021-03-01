/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managefriends;
public class Friends {
private String firstName;
private String lastName;
//friend #
public static int totalFriend = 0;
/**
 *
 * @author Kyle Glenn Daniel SaFSN
 */
public Friends(String fName, String lName) {
    firstName = fName;
    lastName = lName;
    totalFriend++;
    System.out.println("Friend " + firstName + " " + lastName + " Has been added to the registry. Friend Number is " + totalFriend);
}
public void printLastName(){
System.out.println("Last Name is: " + lastName);
}
public static void printInformation(){
System.out.println("This is a template that stores info about friends");
}
}