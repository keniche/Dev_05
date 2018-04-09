package android.lifeistech.com.dev_05;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String name;
    String[] people =  {"にっち","けん","ちさき","しんの"};
    String[] food = {"ガスパチョ", "ピンチョス", "ハモン・イベリコ", "パエリア"};
    TextView nameTextView;
    TextView foodTextView;
    TextView verbTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        nameTextView = (TextView)findViewById(R.id.nameTextView);
        foodTextView = (TextView)findViewById(R.id.foodTextView);
        verbTextView = (TextView)findViewById(R.id.verbTextView);
    }
    public void serveFood(View v){
        Random randomName = new Random();
        int index = randomName.nextInt(4);
        name = people[index];
            //教科書にString nameって書いてあるけど、間違い？
        nameTextView.setText(name + "に");

        Random randomFood = new Random();
        foodTextView.setText(food[randomFood.nextInt(4)] + "を");

        Random random = new Random();
        if(random.nextInt(2)<1){
            verbTextView.setText("よそえました！！");
        }else{
            verbTextView.setText("よそえませんでした...");
        }
    }

}
