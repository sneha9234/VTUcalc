package com.sneha.vtusgpaandcgpacalculator.drawernav.bottom_navi.recycler_view;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sneha.vtusgpaandcgpacalculator.R;
import com.sneha.vtusgpaandcgpacalculator.sqlitepackage.dbmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class adapter_sgpa extends RecyclerView.Adapter<adapter_sgpa.Viewholder> implements Filterable {

    ArrayList<POJO> sgpaArrayList;
    ArrayList<POJO> sgpaArrayListcopy;
    String filterPattern = "";

    public adapter_sgpa(ArrayList<POJO> sgpaArrayList) {
        this.sgpaArrayList = sgpaArrayList;
        sgpaArrayListcopy = new ArrayList<>(sgpaArrayList);
    }

    @NonNull
    @Override
    public adapter_sgpa.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View listitem = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_sgpa, parent, false);
        return new Viewholder(listitem);
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_sgpa.Viewholder holder, int position) {

        POJO sgpa= sgpaArrayList.get(position);

        if (!filterPattern.equals("")) {
            String tmpSname = sgpa.getSname();
            int startPos = tmpSname.toLowerCase(Locale.US).indexOf(filterPattern.toLowerCase(Locale.US));
            int endPos = startPos + filterPattern.length();
            if (startPos != -1) {
                Spannable spannable = new SpannableString(tmpSname);
                ColorStateList greenColor = new ColorStateList(new int[][]{new int[]{}}, new int[]{Color.RED});
                TextAppearanceSpan highlightSpan = new TextAppearanceSpan(null, Typeface.BOLD, -1, greenColor, null);
                spannable.setSpan(highlightSpan, startPos, endPos, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                holder.sname.setText(spannable);
            } else {
                holder.sname.setText(sgpa.getSname());
            }
        } else {
            holder.sname.setText(sgpa.getSname());
        }
        holder.semester.setText(sgpa.getSemester());
        holder.sgpa.setText(sgpa.getSgpa());
        holder.percent.setText(sgpa.getPercent());
        holder.schemes.setText(sgpa.getSchemes());
    }

    @Override
    public int getItemCount() {
        return sgpaArrayList.size();
    }

    @Override
    public Filter getFilter() {
        return new Filter() {

            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                List<POJO> filteredList = new ArrayList<>();

                if (TextUtils.isEmpty(constraint)) {
                    filterPattern="";
                    filteredList.addAll(sgpaArrayListcopy);
                } else {
                    filterPattern = constraint.toString().toLowerCase().trim();
                    for (POJO item : sgpaArrayListcopy) {
                        if (item.getSname().toLowerCase().contains(filterPattern)) {
                            filteredList.add(item);
                  //      }else{
                  //          filteredList.remove(item);
                        }
                    }
                }

                FilterResults results = new FilterResults();
                results.values = filteredList;
                results.count = filteredList.size();

                return results;
            }

            @Override
            public void publishResults(CharSequence constraint, FilterResults results) {

                sgpaArrayList.clear();
                sgpaArrayList.addAll((List)results.values);
                notifyDataSetChanged();
            }
        };
    }


    public class Viewholder extends RecyclerView.ViewHolder {

        TextView sname, semester, sgpa, percent, schemes;
        ImageButton btndelete1;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            sname = (TextView) itemView.findViewById(R.id.textView2);
            semester = (TextView) itemView.findViewById(R.id.semester);
            sgpa = (TextView) itemView.findViewById(R.id.textV);
            percent = (TextView) itemView.findViewById(R.id.textVw);
            schemes = (TextView) itemView.findViewById(R.id.scheme1);
            btndelete1 = (ImageButton) itemView.findViewById(R.id.btndelete1);


            btndelete1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                final AlertDialog.Builder alert = new AlertDialog.Builder(v.getContext());
                    alert.setMessage("Are you sure you want to delete this?");

                    alert.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                    }
                });
                    alert.setPositiveButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                    }
                });
                final AlertDialog dialogs  = alert.create();
                    dialogs.show();
                    dialogs.getButton(androidx.appcompat.app.AlertDialog.BUTTON_NEGATIVE).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        delete(getAdapterPosition());
                        dialogs.dismiss();

                    }
                });
                    dialogs.getButton(androidx.appcompat.app.AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        dialogs.dismiss();
                    }
                });

            }
        });
    }

    private void delete(int adapterPosition) {

            sgpaArrayList.remove(adapterPosition);
            notifyDataSetChanged();
            final String sns = sname.getText().toString();
            final String semrs = semester.getText().toString();
            final String schs = schemes.getText().toString();

            dbmanager db = new dbmanager(itemView.getContext());
            db.delete1(sns, semrs, schs);
        }
    }
}