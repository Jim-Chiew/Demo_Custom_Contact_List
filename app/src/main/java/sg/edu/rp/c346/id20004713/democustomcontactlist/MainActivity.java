package sg.edu.rp.c346.id20004713.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    ArrayList<Contact> al;
    CustomAdapter CustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.lv);

        al = new ArrayList<>();
        Contact item1 = new Contact("Mary", 65, 1234567, 'F');
        Contact item2 = new Contact("Ken", 65, 7654321, 'M');
        al.add(item1);
        al.add(item2);

        CustomAdapter = new CustomAdapter(this, R.layout.row, al);
        lvContact.setAdapter(CustomAdapter);
    }
}