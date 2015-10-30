import java.util.ArrayList;
import java.util.Collections;

public class MessageSort
{
    //Task 9
    public static void selectionSort(Message[] m)
    {
        //TODO... 
        for (int i = 0; i < m.length; i += 1)
            for (int j = i; j < m.length; j += 1)                
                if (m[i].messageText.compareTo(m[j].messageText)>0)
                {
                  swap(m, i, j);
                }        
    }

    private static void swap(Message[] arMsg, int to, int from)
    {
        //TODO...
        Message tempMsg = arMsg[to];
        arMsg[to]       = arMsg[from];
        arMsg[from]     = tempMsg;
    }

    //Task 10
    public static void selectionSort(ArrayList<Message> m)
    {
        //TODO...
        for (int i = 0; i < m.size(); i += 1)
            for (int j = i; j < m.size(); j += 1)                  
                if (m.get(i).messageText.compareTo(m.get(j).messageText)>0)
                {
                  swap(m, i, j);
                }
    }

    private static void swap(ArrayList<Message> list, int to, int from)
    {
        //TODO...
        Collections.swap(list, to, from);        
    }

}
