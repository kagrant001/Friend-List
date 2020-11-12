
/**
 * Driver class for Person class
 *
 * @author Kayden Grant
 * @version 11/11/20
 */
public class PersonDriver
{
    public static void main(String[] args)
    {        
        System.out.println("POSITIVE TESTING");
        
        Person Kayden = new Person("Kayden");
        Person Conor = new Person("Conor");
        Person Hadley = new Person("Hadley");
        Person Hazel = new Person("Hazel");
        Person Beau = new Person("Beau");
        Person Sal = new Person("Sal");
        
        Kayden.addFriend(Conor);
        Kayden.addFriend(Hadley);
        Kayden.addFriend("Bob");
        Conor.addFriend(Kayden);
        Hadley.addFriend(Conor);
        Hazel.addFriend(Conor);
        Beau.addFriend(Conor);
        Sal.addFriend(Conor);
        Kayden.removeFriend("Bob");        
        
        Kayden.listFriends();
        Conor.listFriends();
        Hadley.listFriends();
        Hazel.listFriends();
        Beau.listFriends();
        Sal.listFriends();  
        
        System.out.println();
        System.out.println("NEGATIVE TESTING");
        
        Person invalid = new Person("");
        Kayden.addFriend(Kayden);
        Kayden.addFriend(Conor);
        Kayden.removeFriend("Bob");
        
        System.out.println();
        System.out.println("BOUNTARY TESTING");
        
        Sal.removeFriend("Conor");
        Kayden.addFriend(Hazel);
        Kayden.addFriend(Beau);
        Kayden.addFriend(Sal);
        Kayden.addFriend("Gregory");
        Kayden.listFriends();
    }
}
