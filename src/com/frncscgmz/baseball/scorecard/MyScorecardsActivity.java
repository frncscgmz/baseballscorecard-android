package com.frncscgmz.baseball.scorecard;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.ListView;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import com.frncscgmz.baseball.scorecard.pojo.Scorecard;
import com.frncscgmz.baseball.scorecard.adapters.ScorecardsAdapter;

public class MyScorecardsActivity extends Activity {
   private ListView lstvwScorecards;

   /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);

      lstvwScorecards = (ListView)findViewById(R.id.lv_scorecards);

      /* Test */
      List<Scorecard> lstScs = new ArrayList<Scorecard>();
      lstScs.add(new Scorecard(1,"Orioles","Dodgers",
               "Chavez Ravine",new Date()));
      lstScs.add(new Scorecard(2,"Pirates","A's",
               "Olympic Colisseum",new Date()));
      Scorecard[] arrSC = lstScs
         .toArray(new Scorecard[lstScs.size()]);

      ScorecardsAdapter scAdapter = 
         new ScorecardsAdapter(this,R.layout.item_lst_scpreview,arrSC);
      lstvwScorecards.setAdapter(scAdapter);
   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.myscorecards, menu);
      return super.onCreateOptionsMenu(menu);
   }

   @Override
   public boolean onOptionsItemSelected(MenuItem item) {
      switch (item.getItemId()) {
         case R.id.action_new:{
            Intent intent = new Intent(this,NewScorecardActivity.class);
               startActivity(intent);
            return true;
         }

      }
      return super.onOptionsItemSelected(item);
   }
}
