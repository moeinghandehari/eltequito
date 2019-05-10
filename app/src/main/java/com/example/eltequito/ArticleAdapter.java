package com.example.eltequito;

        import android.app.Activity;
        import android.provider.ContactsContract;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

        import java.util.ArrayList;

public class ArticleAdapter extends ArrayAdapter<Article> {

    public ArticleAdapter(Activity context, ArrayList<Article> articles) {
        super(context, 0, articles);
    }

    ///// constructor
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ////////// find and set the view which is going to convert
        View view = convertView;

        /////////// set or add view
        if (view == null)
            view = LayoutInflater.from(getContext()).inflate(R.layout.article_view, parent, false);

        Article article = getItem(position);

        TextView nameView = (TextView) view.findViewById(R.id.articleNameView);
        nameView.setText(article.getmName());

        TextView priceView = (TextView) view.findViewById(R.id.articlePriceView);
        priceView.setText(String.valueOf(article.getmPrice()));

        ImageView imageView = (ImageView) view.findViewById(R.id.ic_article);
        if (article.getimageResourceId() != -1)
            imageView.setImageResource((article.getimageResourceId()));
        else
            imageView.setImageResource(R.drawable.icon_maxican_food);

        return view;
    }
}