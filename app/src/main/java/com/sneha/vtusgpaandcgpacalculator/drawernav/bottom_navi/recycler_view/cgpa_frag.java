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

public class cgpa_frag extends Fragment {

    private RecyclerView recyclerview;
    adapter_cgpa ac;
    TextView tv_noContent2;

    ArrayList<POJO> cgpaArrayList = new ArrayList<>();

    public cgpa_frag() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        setHasOptionsMenu(true);

        View view = inflater.inflate(R.layout.fragment_cgpa_frag, container, false);
        recyclerview = view.findViewById(R.id.rc2);
        tv_noContent2 = view.findViewById(R.id.tv_noContent2);
        cgpaArrayList = new ArrayList<>();
        Fetchdata2();
        ac = new adapter_cgpa(cgpaArrayList);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        if(cgpaArrayList.isEmpty()){
            recyclerview.setVisibility(View.GONE);
            tv_noContent2.setVisibility(View.VISIBLE);
            tv_noContent2.setText("Look's like you have not saved any CGPA calculation.");

        }else{
            tv_noContent2.setVisibility(View.GONE);
            recyclerview.setVisibility(View.VISIBLE);
            recyclerview.setAdapter(ac);
        }

        return view;
    }

    private void Fetchdata2() {
        dbmanager db = new dbmanager(getContext());

        Cursor cursor = db.fetch_data2();

        if (cursor != null) {

            while (cursor.moveToNext()) {

                POJO pj = new POJO();
                pj.setCname(cursor.getString(0));
                pj.setNo_of_sems(cursor.getString(1));
                pj.setCgpa(cursor.getString(2));
                pj.setPercentage(cursor.getString(3));
                pj.setSchemec(cursor.getString(4));
                cgpaArrayList.add(pj);
            }
            // ac = new adapter_cgpa(cgpaArrayList);
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

        if(!searchView.isFocused()) {
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
                            tv_noContent2.setVisibility(View.VISIBLE);
                            tv_noContent2.setText("No matching results found");
                        }else{
                            tv_noContent2.setVisibility(View.GONE);
                            recyclerview.setVisibility(View.VISIBLE);
                        }
                    }
                });
                return false;
            }
        });
    }
}