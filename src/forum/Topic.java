package forum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minh on 2017.05.16..
 */
public class Topic {
    public int id;
    public String name;
    public ArrayList<Entries> entries;

    public Topic(String name, List<Entries> entries){
        this.setName(name);
        this.entries=new ArrayList<>();
        setEntries((ArrayList<Entries>) entries);
    }

    public void setId(int size){
        this.id=id;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public ArrayList getEntries(){
        return this.entries;
    }

    public void setEntries(ArrayList<Entries> entries){
        this.entries=entries;
    }

    public void addEntries(Entries entries){
        this.entries.add(entries);
    }
}
