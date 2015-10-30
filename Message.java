
//Task 5
public class Message
{
    Subject   subject;
    String    messageText;
    User      from;
    User      to;

    public Message(Subject subject, User from, User to, String messageText)
    {
        // TODO initialize Subject field
        this.from           = from;
        this.to             = to;
        this.messageText    = messageText;
        this.subject        = subject;
    } 

    public void displayMessage()
    {
        // TODO display message similar to that shown in Question-2 Figure 3
        String nameFrom = from.firstName;
        String nameTo   = to.firstName;
        System.out.println("Message subject: " + subject + " " + nameFrom + " says \""+messageText + "\" to " + nameTo);
     }

    public void displayMessageContent()
    {
        System.out.println(messageText);
    }
}