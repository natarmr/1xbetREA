package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes.dex */
public final class ith implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f15353a;
    public final ShapeableImageView b;
    public final ImageView c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;

    public ith(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3) {
        this.f15353a = constraintLayout;
        this.b = shapeableImageView;
        this.c = imageView;
        this.d = imageView2;
        this.e = textView;
        this.f = textView2;
        this.g = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f15353a;
    }
}
