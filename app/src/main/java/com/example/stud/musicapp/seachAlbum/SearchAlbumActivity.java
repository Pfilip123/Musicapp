package com.example.stud.musicapp.seachAlbum;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;

import com.example.stud.musicapp.R;

public class SearchAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_album);
        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        SharedPreferences sharedPreferences;
        sharedPreferences = getPreferences(MODE_PRIVATE);

        EditText etQuery;
        RecyclerView rvList;


        String album = sharedPreferences .getString( "query" , null );
        etQuery.setText(artist);


        etQuery = findViewById(R.id.etQuery);
        rvList = findViewById(R.id.rvList);



        Button bSearch = findViewById(R.id.bSearch);
    bSearch.setOnClickLisner(new View.OnClickListener() {

        getSupportActionBar();

        setDisplayHomeAsUpEnabled(true);

        sharedPreferences = getPreferences(MODE_PRIVATE);

        String query = etQuery.getText().toString();

        rememberQuery(query);

        public void onClickView(View view) {
            String query = etQuery.getText().toString();
            rememberQuery(query);

        }

    });


    private void rememberQuery (String query) {

        SharedPreferences.Editor editor = SharedPreferences.edit();
        editor.putString("query", query);
        editor.apply();
    }



    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true ;
    }
    }

