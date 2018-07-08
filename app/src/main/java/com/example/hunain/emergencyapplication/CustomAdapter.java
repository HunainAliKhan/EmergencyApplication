package com.example.hunain.emergencyapplication;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.PersonViewHolder>{

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        TextView driverph;
        TextView dept;
        TextView drivername;
        TextView branchname;

        PersonViewHolder(View maps) {
            super(maps);
            branchname= (TextView)itemView.findViewById(R.id.branchName);
            driverph = (TextView)itemView.findViewById(R.id.driverPhoneNumber);
            dept = (TextView)itemView.findViewById(R.id.driverDepartment);
            drivername = (TextView)itemView.findViewById(R.id.driverName);
        }
    }
    List<historydata> persons;

    CustomAdapter(List<historydata> persons){
        this.persons = persons;
    }
    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_maps, parent, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        holder.drivername.setText(persons.get(position).drivername);
        holder.driverph.setText(persons.get(position).driverph);
        holder.dept.setText(persons.get(position).dept);
        holder.branchname.setText(persons.get(position).branchname);
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

}