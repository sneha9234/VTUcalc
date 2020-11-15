package com.sneha.vtusgpaandcgpacalculator.drawernav.bottom_navi.recycler_view;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sneha.vtusgpaandcgpacalculator.R;
import com.sneha.vtusgpaandcgpacalculator.sqlitepackage.dbmanager;

import java.util.ArrayList;



public class sgpa_frag extends Fragment {
    //View view;
    private RecyclerView recyclerview;
    adapter_sgpa ac;
    TextView tv_noContent;

    ArrayList<POJO> sgpaArrayList = new ArrayList<>();

    public sgpa_frag() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        setHasOptionsMenu(true);

        View view = inflater.inflate(R.layout.fragment_sgpa_frag, container, false);
        recyclerview = (RecyclerView) view.findViewById(R.id.rc1);
        tv_noContent = (TextView) view.findViewById(R.id.tv_noContent);
        sgpaArrayList = new ArrayList<>();
        Fetchdata1();
        ac = new adapter_sgpa(sgpaArrayList);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));

        if (sgpaArrayList.isEmpty()) {
            recyclerview.setVisibility(View.GONE);
            tv_noContent.setVisibility(View.VISIBLE);
            tv_noContent.setText("Look's like you have not saved any SGPA calculation.");

        } else {
            tv_noContent.setVisibility(View.GONE);
            recyclerview.setVisibility(View.VISIBLE);
            recyclerview.setAdapter(ac);
        }
        return view;
    }

    private void Fetchdata1() {
        dbmanager db = new dbmanager(getContext());

        Cursor cursor = db.fetch_data1();

        if (cursor != null) {

            // cursor.moveToFirst();

            while (cursor.moveToNext()) {

                POJO pj = new POJO();
                pj.setSname(cursor.getString(0));
                pj.setSemester(cursor.getString(1));
                pj.setSgpa(cursor.getString(2));
                pj.setPercent(cursor.getString(3));
                pj.setSchemes(cursor.getString(4));
                sgpaArrayList.add(pj);
            }

        }


    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {

        inflater.inflate(R.menu.search_menu, menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();

        searchView.onActionViewExpanded();
        searchView.setIconifiedByDefault(false);
        searchView.setQueryHint("Search by name ... ");

        if (!searchView.isFocused()) {
            searchView.clearFocus();
        }

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                ac.getFilter().filter(newText, new Filter.FilterListener() {
                    @Override
                    public void onFilterComplete(int i) {
                        if(i == 0){
                            recyclerview.setVisibility(View.GONE);
                            tv_noContent.setVisibility(View.VISIBLE);
                            tv_noContent.setText("No matching results found");
                        }else{
                            tv_noContent.setVisibility(View.GONE);
                            recyclerview.setVisibility(View.VISIBLE);
                        }
                    }
                });
                return false;
            }

        });
    }

}
