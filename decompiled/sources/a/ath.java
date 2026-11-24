package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes.dex */
public final class ath implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1432a;
    public final ShapeableImageView b;
    public final ImageView c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;

    public ath(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f1432a = constraintLayout;
        this.b = shapeableImageView;
        this.c = imageView;
        this.d = imageView2;
        this.e = textView;
        this.f = textView2;
        this.g = textView3;
        this.h = textView4;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1432a;
    }
}
