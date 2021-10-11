package com.example.recyclerview;
import android.content.ClipData;
import android.support.v4.*;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public abstract class Adapter extends RecyclerView.Adapter <Adapter.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        TextView description;
        public ViewHolder(View ITEMView)
        {
            super(ITEMView.View);
            name=(TextView) itemView.findViewById(R.id.coffee);
            name=(TextView) itemView.findViewById(R.id.hotdrinks);
            name=(TextView)itemView.findViewById(R.id.colddrinks);
        }
    }

    private Context context;
    private List<Items>items;

    public Adapter(Context c,List<Items>item_list)
    {
        this.context=c;
        items=item_list;
    }
    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int ViewType)
    {
        View view= LayoutInflater.from(context).inflate(R.layout.items_layout,parent,false);
        return new ViewHolder(view);
    }

    public void OnBindViewHolder(Adapter.ViewHolder holder, int position)
    {
        Item i=items.get(position);
        holder.name.setText(i.getname());
        holder.description.setText(i.getDescription());

    }

    @Override
    public int getItemCount()
    {
        return items.size;
    }

}

