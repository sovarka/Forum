package ru.startandroid.newforum.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import ru.startandroid.newforum.NewTheme;
import ru.startandroid.newforum.R;
import ru.startandroid.newforum.ThemeActivity;
import ru.startandroid.newforum.model.Message;

public class MessageAdapter extends BaseAdapter{

    private Context ctx;
    private LayoutInflater lInflater;
    private ArrayList<Message> messages;

    public MessageAdapter(Context ctx, ArrayList<Message> messages) {
        this.ctx = ctx;
        this.messages = messages;
        lInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return messages.size();
    }

    @Override
    public Object getItem(int i) {
        return messages.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = lInflater.inflate(R.layout.theme_item, parent, false);
        }

        Message message = messages.get(i);
        ((TextView) view.findViewById(R.id.message_author_name)).setText(message.author);
        ((TextView) view.findViewById(R.id.message_date)).setText(message.date);
        ((TextView) view.findViewById(R.id.message_text)).setText(message.text);

        return view;
    }
}
