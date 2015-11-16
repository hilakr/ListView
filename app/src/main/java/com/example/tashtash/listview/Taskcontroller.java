package com.example.tashtash.listview;

/**
 * Created by User on 16/11/2015.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 07/11/2015.
 */
public class Taskcontroller implements ITaskController {
    private IDataTaskAccess dao;
    Taskcontroller()
    {
        descriptionList = new ArrayList<String>();
        descriptionList.add("get a job");
        descriptionList.add("take vacation");
        descriptionList.add("prepare shanker homework");
        descriptionList.add("get life");
        dao = MoockTaskDAO.getInstance();
    }
    private List<String> descriptionList;

    public List<TaskItem> GetTask() {
        return dao.GetTask();
    }

}
