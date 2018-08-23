package ru.startandroid.newforum;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

import ru.startandroid.newforum.adapters.MessageAdapter;
import ru.startandroid.newforum.model.Message;

public class ThemeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);

        Bundle bundle = getIntent().getExtras();

        int themeId = bundle.getInt("themeId");

        ArrayList<Message> messages = getMessages(themeId);
        MessageAdapter adapter = new MessageAdapter(this, messages);
        ListView listView = findViewById(R.id.messages_list);
        listView.setAdapter(adapter);
    }

    private ArrayList<Message> getMessages(int themeId) {
        ArrayList<Message> list = new ArrayList<Message>();
        list.add(new Message("Kukareky", "Petya", "23.04.17"));
        list.add(new Message("lalala", "Masha", "11.03.17"));
        return list;
         //TODO get messages from server
    }
}
