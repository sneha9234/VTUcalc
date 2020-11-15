package com.sneha.vtusgpaandcgpacalculator.drawernav.bottom_navi.recycler_view;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.sneha.vtusgpaandcgpacalculator.R;
import com.sneha.vtusgpaandcgpacalculator.sqlitepackage.dbmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class adapter_cgpa extends RecyclerView.Adapter<adapter_cgpa.Viewholder> implements Filterable {

    ArrayList<POJO> cgpaArrayList;
    ArrayList<POJO> cgpaArrayListcopy;
    String filterPattern = "";

    public adapter_cgpa(ArrayList<POJO> cgpaArrayList) {
        this.cgpaArrayList = cgpaArrayList;
        cgpaArrayListcopy = new ArrayList<>(cgpaArrayList);
    }

    @NonNull
    @Override
    public adapter_cgpa.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View listitem = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_cgpa, parent, false);
        return new Viewholder(listitem);
    }

    @Override
    public void onBindViewHolder(@NonNull adapter_cgpa.Viewholder holder, int position) {

        POJO cgpa = cgpaArrayList.get(position);

        if (!filterPattern.equals("")) {
            String tmpCname = cgpa.getCname();
            int startPos = tmpCname.toLowerCase(Locale.US).indexOf(filterPattern.toLowerCase(Locale.US));
            int endPos = startPos + filterPattern.length();
            if (startPos != -1) {
                Spannable spannable = new SpannableString(tmpCname);
                ColorStateList greenColor = new ColorStateList(new int[][]{new int[]{}}, new int[]{Color.RED});
                TextAppearanceSpan highlightSpan = new TextAppearanceSpan(null, Typeface.BOLD, -1, greenColor, null);
                spannable.setSpan(highlightSpan, startPos, endPos, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                holder.cname.setText(spannable);
            } else {
                holder.cname.setText(cgpa.getCname());
            }
        } else {
            holder.cname.setText(cgpa.getCname());
        }

        holder.no_of_sems.setText(cgpa.getNo_of_sems());
        holder.cgpa.setText(cgpa.getCgpa());
        holder.percentage.setText(cgpa.getPercentage());
        holder.schemec.setText(cgpa.getSchemec());
    }

    @Override
    public int getItemCount() {
        return cgpaArrayList.size();
    }


    @Override
    public Filter getFilter() {
        return new Filter() {

            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                List<POJO> filteredList = new ArrayList<>();

                if (TextUtils.isEmpty(constraint)) {
                    filterPattern="";
                    filteredList.addAll(cgpaArrayListcopy);
                } else {
                    filterPattern = constraint.toString().toLowerCase().trim();
                    for (POJO item : cgpaArrayListcopy) {
                        if (item.getCname().toLowerCase().contains(filterPattern)) {
                            filteredList.add(item);
   //                     } else {
   //                         filteredList.remove(item);
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

                cgpaArrayList.clear();
                cgpaArrayList.addAll((List) results.values);
                notifyDataSetChanged();
            }
        };
    }


    public class Viewholder extends RecyclerView.ViewHolder {

        TextView cname, no_of_sems, cgpa, percentage, schemec;
        ImageButton btndelete2;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            cname = itemView.findViewById(R.id.name);
            no_of_sems = itemView.findViewById(R.id.no_of_sem);
            cgpa = itemView.findViewById(R.id.textView49);
            percentage = itemView.findViewById(R.id.textView55);
            schemec = itemView.findViewById(R.id.scheme2);
            btndelete2 = itemView.findViewById(R.id.btndelete2);

            btndelete2.setOnClickListener(new View.OnClickListener() {
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
                    final AlertDialog dialogs = alert.create();
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

            cgpaArrayList.remove(adapterPosition);
            notifyDataSetChanged();
            final String snc = cname.getText().toString();
            final String semrc = no_of_sems.getText().toString();
            final String schc = schemec.getText().toString();

            dbmanager db = new dbmanager(itemView.getContext());
            db.delete2(snc, semrc, schc);
        }
    }
}