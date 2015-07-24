package sifat.com.loginregistrar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class Login extends Activity {
    Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view){
        Toast.makeText(activity, "login() fired",Toast.LENGTH_SHORT).show();
    }
}
