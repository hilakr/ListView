package com.example.tashtash.listview;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;


public class MainActivity extends Activity {


    private ITaskController taskController;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        taskController =  new Taskcontroller();
        ListView  lv = (ListView) findViewById(R.id.taskListView);
        if(lv!=null)
        {
            TaskListBaseAdapter taskAdapter = new TaskListBaseAdapter(this,taskController.GetTask());

            //WeatherListBaseAdapter adapter = new WeatherListBaseAdapter(this, controller.GetWeather());
            lv.setAdapter(taskAdapter);
            lv.setOnItemClickListener(new OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    Toast.makeText(MainActivity.this, "Item number " + (position + 1) + " was clicked", Toast.LENGTH_LONG).show();
                }
            });
        }
    }

    public void showNewTask (View view){
        Intent intent = new Intent (view.getContext(),TaskActivity.class);
        startActivity(intent);

    }


}
