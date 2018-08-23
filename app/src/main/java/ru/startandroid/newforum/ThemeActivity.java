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

    private ArrayList<Message> getMessages(int themeId){
        return (ArrayList<Message>) Arrays.asList(
                new Message("asdasd", "ololosh", "1234"),
                new Message("asdasdasdasd", "tvoya mamka", "12345")
                ); //TODO get messages from server
    }
}
