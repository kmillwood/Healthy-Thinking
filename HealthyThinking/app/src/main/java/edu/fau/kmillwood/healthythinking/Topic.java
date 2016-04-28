package edu.fau.kmillwood.healthythinking;

/**
 * Created by Khalil on 4/8/2016.
 */
public class Topic {

    // name of topic under a category
    String tName;

    // information for topic
    String tInfo;

    public Topic(String name, String info)
    {
        tName = name;
        tInfo = info;
    }

    public String getName()
    {
        return tName;
    }

    public String getInfo()
    {
        return tInfo;
    }
}
