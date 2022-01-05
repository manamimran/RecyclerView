package Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recyclerview.R;

import java.util.ArrayList;
import models.RecipeModel;


public class RecipeAdapter extends RecyclerView.Adapter <RecipeAdapter.viewHolder>{

    ArrayList<RecipeModel> list;
    Context context;

    public RecipeAdapter(ArrayList<RecipeModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {              //layout infilate

        View view = LayoutInflater.from(context).inflate(R.layout.sample_row , parent , false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {         //set layout fo image and text

        RecipeModel model =list.get(position);

        holder.imageview.setImageResource(model.getPic());
        holder.textview.setText(model.getText());

        switch(position){
            case 0:
                holder.imageview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Toast.makeText(context,  "image one is clicked", Toast.LENGTH_SHORT).show();

                    }
                });

                holder.textview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "option one is clicked", Toast.LENGTH_SHORT).show();
                    }
                });

            break;

            case 1:
                holder.imageview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Toast.makeText(context,  "image two is clicked", Toast.LENGTH_SHORT).show();

                    }
                });

                holder.textview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(context, "option two is clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            default:
        }

    }

    @Override
    public int getItemCount() {

        return list.size();

    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView imageview;
        TextView textview;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
imageview =  itemView.findViewById(R.id.imageView);
textview =  itemView.findViewById(R.id.textView);

        }
    }




}
