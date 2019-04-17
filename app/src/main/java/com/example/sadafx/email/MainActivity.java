package com.example.sadafx.email;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView username;
    private TextView password;
    private Button login;
    private Button forgot_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_login);

        findviews();
        onclick();

    }

    private void findviews(){
        username = (TextView) findViewById(R.id.enter_email);
        password = (TextView) findViewById(R.id.enter_password);
        login = (Button) findViewById(R.id.log_in);
        forgot_password = (Button) findViewById(R.id.forget_password);
    }

    private void onclick(){
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View login) {

                EmailMenuActivity emailMenuFrame = new EmailMenuActivity();
                getFragmentManager().beginTransaction()
                        .add(R.id.frame_container,emailMenuFrame)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }

}
