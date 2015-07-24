package sifat.com.loginregistrar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    TextView login,register;
    Activity activity = this;
    UserLocalStore userLocalStore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (TextView)findViewById(R.id.btn_login);
        register = (TextView)findViewById(R.id.btn_register);
        userLocalStore = new UserLocalStore(activity);
    }

    public void loginActivity(View v){
//        Toast.makeText(activity,"login() fired", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }


    @Override
    protected void onStart() {
        super.onStart();
        if(authenticate()==true){
            displayUserDetails();
        }
    }

    private void displayUserDetails(){
        User user = userLocalStore.getLoggedInUser();

    }

    private boolean authenticate(){
        return userLocalStore.getUserLoggedIn();
    }

    public void registerActivity(View v){
//        Toast.makeText(activity,"register() fired", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }

}
