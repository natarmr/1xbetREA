package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class gux implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f11952a;
    public final ImageView b;
    public final TextView c;
    public final View d;

    public gux(LinearLayout linearLayout, ImageView imageView, TextView textView, View view) {
        this.f11952a = linearLayout;
        this.b = imageView;
        this.c = textView;
        this.d = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f11952a;
    }
}
