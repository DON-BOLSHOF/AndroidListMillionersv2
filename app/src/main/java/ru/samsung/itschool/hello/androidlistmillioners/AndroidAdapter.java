package ru.samsung.itschool.hello.androidlistmillioners;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class AndroidAdapter extends ArrayAdapter<Person> {

    public AndroidAdapter(Context context, Person[] persons) {
        super(context, R.layout.adapter_layot, persons);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Person person = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_layot, null);
        }

// Заполняем адаптер
        ((TextView) convertView.findViewById(R.id.name)).setText(person.name);
        ((TextView) convertView.findViewById(R.id.money)).setText(person.money);
// Выбираем картинку для месяца

        ((ImageView) convertView.findViewById(R.id.flag)).setImageResource(person.flag);
        return convertView;
    }
}