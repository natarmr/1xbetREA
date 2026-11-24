package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class g1o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f10524a;
    public final LinearLayout b;
    public final LinearLayout c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;
    public final ImageView g;
    public final TextView h;
    public final LinearLayout i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;

    public g1o0(ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, LinearLayout linearLayout3, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f10524a = constraintLayout;
        this.b = linearLayout;
        this.c = linearLayout2;
        this.d = imageView;
        this.e = imageView2;
        this.f = imageView3;
        this.g = imageView4;
        this.h = textView;
        this.i = linearLayout3;
        this.j = textView2;
        this.k = textView3;
        this.l = textView4;
        this.m = textView5;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10524a;
    }
}
