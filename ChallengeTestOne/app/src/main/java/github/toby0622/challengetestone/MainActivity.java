package github.toby0622.challengetestone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegisterButton (View view) {
        TextView firstNameTxt = findViewById(R.id.firstNameView);
        TextView lastNameTxt = findViewById(R.id.lastNameView);
        TextView emailTxt = findViewById(R.id.emailView);

        EditText firstNameEdit = findViewById(R.id.firstNameTxt);
        EditText lastNameEdit = findViewById(R.id.lastNameTxt);
        EditText emailEdit = findViewById(R.id.emailTxt);

        firstNameTxt.setText("First Name: " + firstNameEdit.getText().toString());
        lastNameTxt.setText("Last Name: " + lastNameEdit.getText().toString());
        emailTxt.setText("Email: " + emailEdit.getText().toString());
    }
}