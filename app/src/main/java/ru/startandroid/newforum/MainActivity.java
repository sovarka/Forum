package ru.startandroid.newforum;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.startandroid.newforum.adapters.ThemeAdapter;
import ru.startandroid.newforum.model.Theme;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fab:
                Intent intent = new Intent(this, NewTheme.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Theme> themes = Arrays.asList(
                new Theme("Изменение раписания","Мария Кузнецова","27.05.2018",2,true, 0),
                new Theme("Каникулы","Петр Иванов","25.05.2018",4,false, 1),
                new Theme("Математика","Иван Зайцев","10.05.2018",17,true, 2)
        );


        ThemeAdapter adapter = new ThemeAdapter(this, themes);
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);
        FloatingActionButton newAction = findViewById(R.id.fab);
        newAction.setOnClickListener(this);

//        URL url = null;
//        try {
//            url = new URL("http://77.73.26.195:8000");
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//        HttpURLConnection con = null;
//        try {
//            con = (HttpURLConnection) url.openConnection();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            con.setRequestMethod("POST");
//        } catch (ProtocolException e) {
//            e.printStackTrace();
//        }
//        Map<String, String> parameters = new HashMap<>();
//        parameters.put("param1", "val");
//
//        con.setDoOutput(true);
//        DataOutputStream out = null;
//        try {
//            out = new DataOutputStream(con.getOutputStream());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            out.writeBytes(ParameterStringBuilder.getParamsString(parameters));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            out.flush();
//            out.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//

    }

    public static class ParameterStringBuilder {
        public static String getParamsString(Map<String, String> params)
                throws UnsupportedEncodingException {
            StringBuilder result = new StringBuilder();

            for (Map.Entry<String, String> entry : params.entrySet()) {
                result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                result.append("=");
                result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                result.append("&");
            }

            String resultString = result.toString();
            return resultString.length() > 0
                    ? resultString.substring(0, resultString.length() - 1)
                    : resultString;
        }
    }
}
