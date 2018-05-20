package com.itou.pachi;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InputActivity extends AppCompatActivity {

  private Button save;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.input_layout);

    String blogStr = "https://www.p-world.co.jp/ishikawa/homerun-kanazawa.htm";
    TextView blogLink = (TextView)findViewById(R.id.pachi1_url);
    blogLink.setText(blogStr);

  }

}
