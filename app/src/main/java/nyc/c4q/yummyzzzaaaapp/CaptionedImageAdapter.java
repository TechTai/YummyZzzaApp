package nyc.c4q.yummyzzzaaaapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.drawable.Drawable;

public class CaptionedImageAdapter extends RecyclerView.Adapter<CaptionedImageAdapter.ViewHolder>{

    private String [] captions;
    private int [] imageIds;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder (CardView view){
            super(view);
            cardView = view;
        }
    }

    public CaptionedImageAdapter(String [] captions, int [] imageIds) {
        this.captions = captions;
        this.imageIds = imageIds;
    }

    @Override
    public CaptionedImageAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_captioned_image, parent, false);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        CardView cardView = holder.cardView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.description_image);
        Drawable drawable = cardView.getResources().getDrawable(imageIds[position]);
        imageView.setContentDescription(captions[position]);
        TextView textView = (TextView) cardView.findViewById(R.id.description_text);
        textView.setText(captions[position]);
    }

    @Override
    public int getItemCount(){
        return captions.length;

    }

}

