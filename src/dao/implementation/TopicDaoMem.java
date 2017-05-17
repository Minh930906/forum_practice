package dao.implementation;

import dao.TopicDao;
import forum.Topic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by minh on 2017.05.17..
 */
public class TopicDaoMem implements TopicDao{

    private List<Topic> DATA = new ArrayList<>();


    @Override
    public void addTopic(Topic topic) {
        int size=(DATA.size()+1);
        topic.setId(size);
        DATA.add(topic);
    }
}
