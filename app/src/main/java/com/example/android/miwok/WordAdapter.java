package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<word> {

    private int mBgColor;

    public WordAdapter(Activity context, ArrayList<word> words, int bgColor){
       super(context, 0, words);
       mBgColor = bgColor;

   }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final word currentWord = getItem(position);
        boolean hasImage = currentWord.HasImage();


        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if(hasImage) {
            imageView.setImageResource(currentWord.getImageResourceId());
        }
        else{
            imageView.setVisibility(View.GONE);
        }

        View textContainer = (View) listItemView.findViewById(R.id.colorChange);
        textContainer.setBackgroundColor(ContextCompat.getColor(getContext(), mBgColor));
        return listItemView;
    }
}
