//Question 4 Task 3
import java.util.ArrayList;
public class Group
{
    String groupName;
    ArrayList<User> members;

    /**
     * @param 
     */
    public Group(String groupName)
    {
        //TODO
        members = new ArrayList<User>();
        this.groupName = groupName;
    }

    /**
     * @param
     */
    public void addGroupMember(User user)
    {
        //TODO
        members.add(user);
    }

    /**
     * Send a message to the inbox of each group member
     * 
     * @param 
     */
    public void broadcastMessage(Message message)
    {
        //TODO 
        for(User user : members)
        {
          user.inbox.add(message);
        }
    }

    /*
     * @return all the group names in a single string
     * Use the \n between each name to ensure printed on separate lines
     */
    private String groupList()
    {
        String names = "";
        //TODO
        for(User user : members)
        {
          names +=  user.firstName + "\n";
        }
        return names;
    }

    @Override
    public String toString() {

        return "GroupName=" + groupName + "\n" + groupList();
    } 
}
