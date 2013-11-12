package com.frncscgmz.baseball.scorecard.adapters;

import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.frncscgmz.baseball.scorecard.pojo.Scorecard;
import com.frncscgmz.baseball.scorecard.R;

public class ScorecardsAdapter extends ArrayAdapter<Scorecard> {
   private final Context context;
   private final int lstItemId;
   private final Scorecard[] values;

   public ScorecardsAdapter(Context context, int lstItemId,
            Scorecard[] values) {
         super(context, R.layout.main, values);
         this.context   = context;
         this.lstItemId = lstItemId;
         this.values    = values;
      }

   @Override
   public View getView(int position, View convertView, ViewGroup parent) {
      LayoutInflater inflater = (LayoutInflater) context
         .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

      View rowView = inflater.inflate(lstItemId, parent, false);

      Scorecard sc = getItem(position);

      return rowView;
   }
}
