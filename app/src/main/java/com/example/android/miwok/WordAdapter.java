package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Rean on 8/23/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mBackgroundColor;

    public WordAdapter(Context context, ArrayList<Word> wordsArrayList, int backgroundColor) {
        super(context, 0, wordsArrayList);
        mBackgroundColor = backgroundColor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }

        Word currentWord = getItem(position);

        View linearLayout = listItemView.findViewById(R.id.text_layout);
        linearLayout.setBackgroundResource(mBackgroundColor);

        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.default_text);
        defaultTranslation.setText(currentWord.getmDefaultTranslation());

        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwok_text);
        miwokTranslation.setText(currentWord.getMiwokTranslation());

        ImageView listImage = (ImageView) listItemView.findViewById(R.id.list_image);

        if (currentWord.hasImage()) {
            listImage.setImageResource(currentWord.getListImage());
            listImage.setVisibility(View.VISIBLE);
        } else {
            listImage.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
