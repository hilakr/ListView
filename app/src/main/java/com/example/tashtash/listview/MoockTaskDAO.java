package com.example.tashtash.listview;

/**
 * Created by User on 16/11/2015.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by User on 07/11/2015.
 */
public class MoockTaskDAO implements IDataTaskAccess {

    private List<String> descriptionList;

    private static MoockTaskDAO instance;

    private MoockTaskDAO() {
        descriptionList = new ArrayList<String>();
        descriptionList.add("get a job");
        descriptionList.add("take vacation");
        descriptionList.add("prepare shanker homework");
        descriptionList.add("get life");
    }
    /*
     * Single tone implement.
     */
    public static MoockTaskDAO getInstance()
    {
        if(instance ==  null)
            instance = new MoockTaskDAO();
        return instance;
    }

    public List <TaskItem> GetTask() { return GenerateRandomTask();}
    private List<TaskItem> GenerateRandomTask (){
        List<TaskItem> taskItems = new ArrayList<TaskItem>();
        for (int i = 0; i < 7; i++) {
            Random rand = new Random();

            int n = rand.nextInt(2);
            int image;
            switch (n) {
                case 0:
                    image = R.drawable.done;
                    break;
                case 1:
                    image = R.drawable.undone;
                    break;
                default:
                    image = R.drawable.done;
                    break;
            }

            TaskItem item = new TaskItem(descriptionList.get(n), 0, image);
            taskItems.add(item);
        }
        return taskItems;
    }

}