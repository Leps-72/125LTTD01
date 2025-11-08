package com.example.recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.model.KyNiem;

import java.util.List;

public class KyNiemAdapter extends RecyclerView.Adapter<KyNiemAdapter.ViewHolder> {
    private Context context;
    private List<KyNiem> kyNiemList;

    public KyNiemAdapter(Context context, List<KyNiem> kyNiemList) {
        this.context = context;
        this.kyNiemList = kyNiemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_kyniem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        KyNiem kyNiem = kyNiemList.get(position);
        holder.txtTieuDe.setText(kyNiem.getTieuDe());
        holder.imgKyNiem.setImageResource(kyNiem.getHinhAnh());

        // Sự kiện click toàn CardView
        holder.cardViewItem.setOnClickListener(v ->
                Toast.makeText(context, "Bạn đã chọn: " + kyNiem.getTieuDe(), Toast.LENGTH_SHORT).show()
        );
    }

    @Override
    public int getItemCount() {
        return kyNiemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgKyNiem;
        TextView txtTieuDe;
        CardView cardViewItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgKyNiem = itemView.findViewById(R.id.imgKyNiem);
            txtTieuDe = itemView.findViewById(R.id.txtTieuDe);
            cardViewItem = itemView.findViewById(R.id.cardViewItem);
        }
    }
}
