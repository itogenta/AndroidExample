package com.itou.pachi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  private static final String[] pachi = {
          "Ventnor",
          "Wroxall",
          "Whitewell",
          "Ryde",
          "StLawrence",
          "Lake",
          "Sandown",
          "Shanklin"
  };


  private Button button_input;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.pachi_main);

    button_input=(Button)findViewById(R.id.input_button);
    button_input.setOnClickListener(this);

    ListView listView = findViewById(R.id.list_view);

    BaseAdapter adapter = new BaseAdapter(this.getApplicationContext(),
            R.layout.list, pachi , null) {
      @Override
      public int getCount() {
        return 0;
      }

      @Override
      public Object getItem(int i) {
        return null;
      }

      @Override
      public long getItemId(int i) {
        return 0;
      }

      @Override
      public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
      }
    };

    // ListViewにadapterをセット
    listView.setAdapter(adapter);


  }
  public void onClick(View v) {

    if(v==button_input){
      Intent intent = new Intent(this, InputActivity.class);
      startActivityForResult(intent, 0);
    }

  }
}
