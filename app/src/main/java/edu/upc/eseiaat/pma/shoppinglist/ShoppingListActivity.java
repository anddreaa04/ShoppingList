package edu.upc.eseiaat.pma.shoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingListActivity extends AppCompatActivity {

    private ArrayList<String> itemList;
    private ArrayAdapter<String> adapter;

    private ListView list;
    private Button btn_add;
    private EditText edit_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);

        list = (ListView)findViewById(R.id.list);
        btn_add = (Button)findViewById(R.id.btn_add);
        edit_item = (EditText)findViewById(R.id.edit_item);

        itemList=new ArrayList<>();
        itemList.add("Patatas");
        itemList.add("Cebolla");
        itemList.add("Chocolate");
        itemList.add("Papel WC");

        adapter= new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1,
                itemList
        );


        list.setAdapter(adapter);
    }
}
