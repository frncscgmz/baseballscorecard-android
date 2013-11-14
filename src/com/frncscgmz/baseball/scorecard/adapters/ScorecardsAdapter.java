package com.frncscgmz.baseball.scorecard.adapters;

import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.text.Format;

import com.frncscgmz.baseball.scorecard.pojo.Scorecard;
import com.frncscgmz.baseball.scorecard.R;

public class ScorecardsAdapter extends ArrayAdapter<Scorecard> {
   private final Context context;
   private final int lstItemId;
   private final Scorecard[] values;
   Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");

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

      TextView txtVisitor  = (TextView) rowView
         .findViewById(R.id.d_scp_visitor_team);
      TextView txtHome     = (TextView) rowView
         .findViewById(R.id.d_scp_home_team);
      /*TextView txtBallpark = (TextView) rowView
         .findViewById(R.id.d_scp_ballpark);
      TextView txtDate = (TextView) rowView
         .findViewById(R.id.d_scp_date);*/

      Scorecard sc = getItem(position);
      txtVisitor.setText(sc.getTeamVisitor());
      txtHome.setText(sc.getTeamHome());
      /*txtBallpark.setText(sc.getBallpark());
      txtDate.setText(formatter.format(sc.getGameDate()));*/

      return rowView;
   }
}
