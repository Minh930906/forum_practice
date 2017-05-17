package forum;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Created by minh on 2017.05.16..
 */
public class Entries {
    public int id;
    public String name;
    public LocalDateTime date;
    public String comment;
    public List<Entries> entries;

    public Entries(String name,String comment){
        this.setName(name);
        this.setComment(comment);
        this.setDate();
        this.setId();
    }

    public void setComment(String comment){
        this.comment=comment;
    }

    public void setId(){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setDate(){
        this.date=date.now();
    }

    public LocalDateTime getDate(){
        return date;
    }

    public List<Entries> getEntries(){
        return entries;
    }

}
