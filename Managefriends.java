
package managefriends;

/**
 *
 * @author Kyle Glenn Daniel
 */
public class Managefriends {


    public static void main(String[] args) {
        // used real friends so feel free to doxx them
    Friends friend1 = new Friends("Kobey","Vaughan");
    Friends friend2 = new Friends ("Haley" , "White");
    Friends friend3 = new Friends (" Nathan", "King");
    // show that they have last names
    friend1.printLastName();
    friend2.printLastName();
    friend3.printLastName();
    // show off 3 of my friends (imaginary or otherwise)
    System.out.println("Total number of friends: " + Friends.totalFriend);;
    
    Friends.printInformation();
            
    }
    
}
