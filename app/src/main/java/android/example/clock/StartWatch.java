package android.example.clock;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartWatch extends AppCompatActivity {

    // одна хранит количество секунд,
    // вторая проверяет работает или нет
    private int seconds;
    private boolean running;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_watch);
    }

    public void  onClickStart(View view){
        running = true;
    }

    public void  onClickStop(View view){
        running = false;
    }

    public void  onClickReset(View view){
        running = false;
        seconds = 0;
    }


    private void runTimer() {
    }



}