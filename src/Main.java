import forum.Entries;
import forum.Topic;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Entries> c=new ArrayList<>();
        Entries a= new Entries("Jack","vmi");
        Entries b = new Entries("Jackie","chan");
        c.add(a);
        c.add(b);
        Topic firsttopic = new Topic("Elso tema",c);
        System.out.println("név:"+a.name+" "+"comment:"+a.comment+" "+"Dátum:"+a.date+" "+"id:"+a.id);
        System.out.println("név:"+b.name+" "+"comment:"+b.comment+" "+"Dátum:"+b.date+" "+"id:"+b.id);
        for (int i=0;i<firsttopic.entries.size();i++)
        {
            System.out.println(firsttopic.name+" "+"Név:"+firsttopic.entries.get(i).name+" "+"Comment:"+firsttopic.entries.get(i).comment+" "+"Dátum:"+firsttopic.entries.get(i).date+" "+"ID:"+firsttopic.entries.get(i).id);
        }
        System.out.println(c.get(0).name);
    }
}
