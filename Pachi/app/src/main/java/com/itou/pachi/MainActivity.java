package com.itou.pachi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {

  private static final String[] scenes = {
          "Homeran",
          "DSJパチンコ",
          "King観光"
  };

  // ちょっと冗長的ですが分かり易くするために
  private static final int[] photos = {
          R.drawable.shop_kanazawa,
          R.drawable.shop_kanazawa,
          R.drawable.shop_kanazawa
  };

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // ListViewのインスタンスを生成
    ListView listView = findViewById(R.id.list_view);

    // BaseAdapter を継承したadapterのインスタンスを生成
    // レイアウトファイル list.xml を activity_main.xml に
    // inflate するためにadapterに引数として渡す
    BaseAdapter adapter = new ListViewAdapter(this.getApplicationContext(),
            R.layout.list, scenes, photos);

    // ListViewにadapterをセット
    listView.setAdapter(adapter);

    // クリックリスナーをセット
    listView.setOnItemClickListener(this);

  }

  @Override
  public void onItemClick(AdapterView<?> parent, View v,
                          int position, long id) {

    Intent intent = new Intent(
            this.getApplicationContext(), PachiActivity.class);

    // clickされたpositionのtextとphotoのID
    String selectedText = scenes[position];
    int selectedPhoto = photos[position];
    // インテントにセット
    intent.putExtra("Text", selectedText);
    intent.putExtra("Photo", selectedPhoto);

    // SubActivityへ遷移
    startActivity(intent);
  }
}