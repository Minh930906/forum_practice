package dao.implementation;

import dao.EntriesDao;
import forum.Entries;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minh on 2017.05.16..
 */
public class EntriesDaoMem implements EntriesDao {

    private List<Entries> DATA = new ArrayList<>();


    @Override
    public void addentries(Entries entries) {
        int size=(DATA.size()+1);
        entries.setId();
        DATA.add(entries);
    }

}
