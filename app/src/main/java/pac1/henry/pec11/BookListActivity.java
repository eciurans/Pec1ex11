package pac1.henry.pec11;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BookListActivity extends AppCompatActivity {
    private ListView listview;

   // ArrayList names = new ArrayList<String>();
   private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_list);
        listview = (ListView) findViewById(R.id.laLlista);

        names = new ArrayList<String>();
        for (int i =0; i <20; i++) {
            names.add(i +  "  Item " +  i);
        }

/*
        names = new ArrayList<String>();
        names.add("1  Item 1");
        names.add("2  Item 2");
        names.add("3  Item 3");
        names.add("4  Item 4");
        names.add("5  Item 5");
*/
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        listview.setAdapter(adapter);

        boolean esUnaTablet;
        if (findViewById(R.id.mostraDetalls) != null) {
            //mostraDetalls es el id del frame layout que hi ha a book_list.xml en cas
            // de resolució w900dp --> som a una tablet
            esUnaTablet = true;
        }




    }

}
