package phinhph25802.example.appfastfood_admin_main.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import hainb21127.poly.appfastfood_admin.R;

public class Splash extends AppCompatActivity {

    Button btn_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        btn_start = findViewById(R.id.btn_getstart);

        Intent intent = new Intent(this, Login.class);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
//                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
////                if (user != null){
////                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
////                }else {
////                    startActivity(intent);
////                }
            }
        });
    }
}