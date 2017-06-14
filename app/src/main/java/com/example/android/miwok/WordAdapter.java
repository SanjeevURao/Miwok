package com.example.android.miwok;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by sanjeev on 9/6/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mcolorId;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView Default = (TextView)listItemView.findViewById(R.id.default_text_view);
        Default.setText(currentWord.getmDefaultTranslation());

        TextView Miwok = (TextView)listItemView.findViewById(R.id.miwok_text_view);
        Miwok.setText(currentWord.getmMiwokTranslation());

        ImageView image = (ImageView)listItemView.findViewById(R.id.image);

        if(currentWord.hasImage()) {
            image.setImageResource(currentWord.getImageId());
            image.setVisibility(View.VISIBLE);
        }
        else
            image.setVisibility(View.GONE);


        View text = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext() , mcolorId);
        text.setBackgroundColor(color);

        return listItemView;

    }
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Word> words , int color) {

        super(context, 0, words);
        mcolorId=color;

    }

}
