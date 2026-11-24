package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes.dex */
public final class osx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f25804a;
    public final View b;
    public final ImageView c;
    public final RoundCornerImageView d;
    public final ImageView e;
    public final RoundCornerImageView f;
    public final View g;
    public final View h;
    public final TextView i;
    public final AppCompatTextView j;
    public final TextView k;
    public final AppCompatTextView l;
    public final TextView m;
    public final AppCompatTextView n;

    public osx(ConstraintLayout constraintLayout, View view, ImageView imageView, RoundCornerImageView roundCornerImageView, ImageView imageView2, RoundCornerImageView roundCornerImageView2, View view2, View view3, TextView textView, AppCompatTextView appCompatTextView, TextView textView2, AppCompatTextView appCompatTextView2, TextView textView3, AppCompatTextView appCompatTextView3) {
        this.f25804a = constraintLayout;
        this.b = view;
        this.c = imageView;
        this.d = roundCornerImageView;
        this.e = imageView2;
        this.f = roundCornerImageView2;
        this.g = view2;
        this.h = view3;
        this.i = textView;
        this.j = appCompatTextView;
        this.k = textView2;
        this.l = appCompatTextView2;
        this.m = textView3;
        this.n = appCompatTextView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f25804a;
    }
}
