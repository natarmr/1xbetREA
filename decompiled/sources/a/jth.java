package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class jth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f17100a;
    public final ImageView b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;

    public jth(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f17100a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
        this.h = textView5;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f17100a;
    }
}
