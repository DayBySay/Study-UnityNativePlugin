package daybysay.com.nativepluginandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import daybysay.com.mylog.MyLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyLog log = new MyLog();
        log.output("test dayo");
    }
}
