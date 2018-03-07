package com.feng.structurewebpj;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class TextActivity extends AppCompatActivity {
    private TextView textView;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        context = this;
        textView = findViewById(R.id.invidation_help_details);
        String start = "在求助", end = "帮助过您";
        float leftWidth =( getDisplayWidth()-dip2px(context,185)) * 2 - getWidth(textView, start + end) - 20;
        String desc = "测试容测试adafdafwag分享到人工wagdafdafwagdafdafwagd分钟购销合同常态化";
//        String desc = ToSBC(olddesc);
        String temp = TextUtils.ellipsize(desc, textView.getPaint(), leftWidth, TextUtils.TruncateAt.END).toString();
        SpannableString spannableString = new SpannableString(start + temp + end);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#f78365")), start.length(), (start + temp).length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(spannableString);

    }
    public static String ToSBC(String input) {
        char c[] = input.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                c[i] = '\u3000';
            } else if (c[i] < '\177') {
                c[i] = (char) (c[i] + 65248);
            }
        }
        return new String(c);
    }
    private int getDisplayWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    private float getWidth(TextView textView, String text) {
        TextPaint textPaint = textView.getPaint();
        textPaint.setTextSize(textView.getTextSize());
        float textPaintWidth = textPaint.measureText(text);
        return textPaintWidth;
    }

    // px 转 dip
    public  int dip2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }
}
