package com.itou.pachi;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ListViewAdapter extends AppCompatActivity {

  static class ViewHolder {
    TextView textView;

  }

  private LayoutInflater inflater;
  private int itemLayoutId;
  private String[] titles;
  private int[] ids;

  ListViewAdapter(Context context, int itemLayoutId,
                  String[] scenes, int[] photos) {
    super();
    this.inflater = (LayoutInflater)
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    this.itemLayoutId = itemLayoutId;
    this.titles = scenes;
    this.ids = photos;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    ViewHolder holder;
    // 最初だけ View を inflate して、それを再利用する
    if (convertView == null) {
      // activity_main.xml に list.xml を inflate して convertView とする
      convertView = inflater.inflate(itemLayoutId, parent, false);
      // ViewHolder を生成
      holder = new ViewHolder();
      holder.textView = convertView.findViewById(R.id.textView);
      convertView.setTag(holder);
    }
    // holder を使って再利用
    else {
      holder = (ViewHolder) convertView.getTag();
    }

    holder.textView.setText(titles[position]);

    return convertView;
  }

  @Override
  public int getCount() {
    // texts 配列の要素数
    return titles.length;
  }

  @Override
  public Object getItem(int position) {
    return null;
  }

  @Override
  public long getItemId(int position) {
    return 0;
  }


}