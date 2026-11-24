package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public final class is10 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f15284a;
    public final ImageView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;
    public final TextView g;

    public is10(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, TextView textView) {
        this.f15284a = linearLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = imageView3;
        this.e = imageView4;
        this.f = imageView5;
        this.g = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f15284a;
    }
}
