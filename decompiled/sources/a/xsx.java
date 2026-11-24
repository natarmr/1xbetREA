package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class xsx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f41438a;
    public final ImageView b;
    public final RoundCornerImageView c;
    public final ImageView d;
    public final RoundCornerImageView e;
    public final ImageView f;
    public final RoundCornerImageView g;
    public final ImageView h;
    public final RoundCornerImageView i;
    public final ImageView j;
    public final RecyclerView k;
    public final TextView l;

    public xsx(ConstraintLayout constraintLayout, ImageView imageView, RoundCornerImageView roundCornerImageView, ImageView imageView2, RoundCornerImageView roundCornerImageView2, ImageView imageView3, RoundCornerImageView roundCornerImageView3, ImageView imageView4, RoundCornerImageView roundCornerImageView4, ImageView imageView5, RecyclerView recyclerView, TextView textView) {
        this.f41438a = constraintLayout;
        this.b = imageView;
        this.c = roundCornerImageView;
        this.d = imageView2;
        this.e = roundCornerImageView2;
        this.f = imageView3;
        this.g = roundCornerImageView3;
        this.h = imageView4;
        this.i = roundCornerImageView4;
        this.j = imageView5;
        this.k = recyclerView;
        this.l = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f41438a;
    }
}
