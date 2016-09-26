package qianfeng.innerstorageapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void click(View view) { // 按钮点击

        File filesDir = this.getFilesDir();
        Log.d("google-my:", "click: " + filesDir);

    }
}
