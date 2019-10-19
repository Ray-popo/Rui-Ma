import java.util.ArrayList;
import java.util.List;

public class Phonebook {
   private List<Individual> info=null;

   public Phonebook() {
       info = new ArrayList<Individual>();
   }

   public int addContact(Individual contact){
       Individual in=findName(contact.getName());
       if(in==null)
       {
           info.add(contact);
          
           return 1;
       }
       return -1;
   }
   public Individual findName(String s) {
       for (Individual c : info) {
           if (c.getName().equalsIgnoreCase(s)) {
               return c;
           }
       }
       return null;
   }
}