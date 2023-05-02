package ke.co.kodelite.tooti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String BASE_URL=" https://api.sandbox.africastalking.com/version1/airtime/send";
    //API Key=10e8cc16fbe6db8ed31a6c33d62ed0026fc20d8e16aa10ed5fffe8852d62d78d
    //App name

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}