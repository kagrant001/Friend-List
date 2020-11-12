
/**
 * Write a description of class Person here.
 *
 * @author Kayden Grant
 * @version 11/11/20
 */
public class Person
{
    // instance variables
    private String name;
    private Person[] friends;
    private int numFriends = 0;

    private void setName(String name)
    {
        if(name.length() < 3)
        {
            System.out.println("Invalid name: Not long enough");
        } 
        else 
        {
            this.name = name;
        }
    }

    /**
     * Constructor for objects of class Person
     */
    public Person(String name)
    {
        setName(name);
        friends = new Person[5];

    }

    //equals override determines if both people are named the same
    public boolean equals(Person p)
    {
        return this.name.equals(p.name);
    }

    //toString override to get the name of the person
    public void toString(Person p)
    {
        return "This person's name is: "+this.name;
    }   

    public void addFriend(Person p)
    {
        int tempCounter = 0;
        boolean addFriend = false;
        //blocks adding youself
        if(this.name.equals(p.name))
        {
            System.out.println("Cannot add yourself as a friend");
        } 
        else
        {
            for(int i=0; i<friends.length; i++)
            {                       
                if(friends[i] != null)
                {
                    tempCounter++;
                }
                //if your friends list is full dont add them
                if(tempCounter == friends.length)                      
                {
                    System.out.println("Sorry you cannot add another friend, your friends list is full"); 
                    addFriend = false;
                    break;
                } 
                //if person has the same name as one of your friends - dont add them
                else if(friends[i] != null)
                {
                    if(friends[i].name.equals(p.name))
                    {
                        System.out.println("Cannot add a friend you already have added");
                        addFriend = false;
                        break;
                    }
                }             
                else
                {
                    addFriend = true;
                }
                //if conditions above are true then add the friend into the array at position i
                if(addFriend = true && friends[i] == null)
                {
                    System.out.println("Adding "+p.name+" to "+this.name+"'s friends list....");
                    friends[i] = p;
                    numFriends++;
                    break;
                }
            }  
        }
    }

    //addFriend overload with String instead
    public void addFriend(String name)
    {
        Person p = new Person(name);
        int tempCounter = 0;
        boolean addFriend = false;
        //blocks adding youself
        if(this.name.equals(p.name))
        {
            System.out.println("Cannot add yourself as a friend");
        } 
        else
        {
            for(int i=0; i<friends.length; i++)
            {                       
                if(friends[i] != null)
                {
                    tempCounter++;
                }
                //if your friends list is full dont add them
                if(tempCounter == friends.length)                      
                {
                    System.out.println("Sorry you cannot add another friend, your friends list is full"); 
                    addFriend = false;
                    break;
                } 
                //if person has the same name as one of your friends - dont add them
                else if(friends[i] != null)
                {
                    if(friends[i].name.equals(p.name))
                    {
                        System.out.println("Cannot add a friend you already have added");
                        addFriend = false;
                        break;
                    }
                }
                else
                {
                    addFriend = true;
                }
                //if conditions above are true then add the friend into the array at position i
                if(addFriend = true && friends[i] == null)
                {
                    System.out.println("Adding "+p.name+" to "+this.name+"'s friends list....");
                    friends[i] = p;
                    numFriends++;
                    break;
                }
            }
        }
    }

    public void removeFriend(String name)
    {
        boolean removeFriend = false;
        if(numFriends > 1)
        {
            for(int i=0; i<friends.length; i++)
            {
                if(friends[i] != null)
                {
                    if(friends[i].name.equals(name))
                    {
                        friends[i] = null;
                        removeFriend = true; 
                        System.out.println("Removing "+name+" from your friends list....");
                        break;
                    }
                }
            }
            if(removeFriend == false)
            {
                System.out.println(name+" was never on your friends list or previously removed");
            }
        }
        else
        {
            System.out.println("Cannot remove friend when you only have one friend");
        }
    }

    public void listFriends()
    {      
        System.out.println(this.name+"'s Friends List:");       
        for(int i=0; i<friends.length; i++)
        {
            if(friends[i] == null)
            {
                System.out.println("Slot "+(i+1)+": Empty");
            }
            else
            {
                System.out.println("Slot "+(i+1)+": "+friends[i].name);
            }            
        }
    }
}
