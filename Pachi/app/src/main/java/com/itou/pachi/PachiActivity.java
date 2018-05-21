package com.itou.pachi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PachiActivity extends AppCompatActivity implements View.OnClickListener {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.detail_pachi_layout);

    String blogStr = "https://www.p-world.co.jp/ishikawa/homerun-kanazawa.htm";
    TextView blogLink = (TextView)findViewById(R.id.pachi1_url);
    blogLink.setText(blogStr);

  }

  @Override
  public void onClick(View view) {

  }
}
