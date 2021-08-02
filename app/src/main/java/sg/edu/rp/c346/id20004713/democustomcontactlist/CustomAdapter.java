package sg.edu.rp.c346.id20004713.democustomcontactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Contact> contactList;


    public CustomAdapter(Context context, int resource, ArrayList<Contact> object) {
        super(context, resource, object);
        parent_context = context;
        layout_id = resource;
        contactList = object;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvCountryCode = rowView.findViewById(R.id.tvCountryCode);
        TextView tvPhoneNum = rowView.findViewById(R.id.tvPhoneNum);
        ImageView imageView = rowView.findViewById(R.id.iv);

        // Obtain the Android Version information based on the position
        Contact currentVersion = contactList.get(position);

        // Set values to the TextView to display the corresponding information
        tvName.setText(currentVersion.getName());
        tvCountryCode.setText(("+" + currentVersion.getCountryCode()));
        tvPhoneNum.setText((currentVersion.getPhoneNum() + ""));

        if (currentVersion.getGender() == 'M'){
            imageView.setImageResource(R.drawable.male);
        }

        return rowView;
    }
}
