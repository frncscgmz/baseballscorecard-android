package com.frncscgmz.baseball.scorecard;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.ListView;

public class MyScorecardsActivity extends Activity {
   private ListView lstvwScorecards;

   /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);

      lstvwScorecards = (ListView)findViewById(R.id.lv_scorecards);
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
