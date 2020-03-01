package c.sakshi.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickFunction(View view){
        EditText myTextField = (EditText)findViewById(R.id.userName);
        String str = myTextField.getText().toString();


        goToActivity2(str);
    }


    private void goToActivity2(String s) {
        Intent intent = new Intent(this, activity2.class);
        intent.putExtra("Welcome",s);
        startActivity(intent);
    }


}
