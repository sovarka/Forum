package ru.startandroid.newforum.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ru.startandroid.newforum.R;
import ru.startandroid.newforum.ThemeActivity;
import ru.startandroid.newforum.model.Theme;

public class ThemeAdapter extends BaseAdapter {

    private Context ctx;
    private LayoutInflater lInflater;
    private List<Theme> themes;

    public ThemeAdapter(Context ctx, List<Theme> themes) {
        this.ctx = ctx;
        this.themes = themes;
        lInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return themes.size();
    }

    @Override
    public Object getItem(int i) {
        return themes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = lInflater.inflate(R.layout.theme_item, parent, false);
        }

        final Theme theme = themes.get(i);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ctx, ThemeActivity.class);
                intent.putExtra("themeId", theme.id);
                ctx.startActivity(intent);
            }
        };
        parent.setOnClickListener(listener);

        ((TextView) view.findViewById(R.id.theme_title)).setText(theme.getTitle());
        ((TextView) view.findViewById(R.id.message_count)).setText("" + theme.getAnswersCount()+" комм.");
        ((TextView) view.findViewById(R.id.author_name)).setText(theme.getLastAuthor());
        ((TextView) view.findViewById(R.id.date)).setText(theme.getDate());

        return view;
    }
}
