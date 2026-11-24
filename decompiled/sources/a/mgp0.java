package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public final class mgp0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f21754a;
    public final ImageView b;
    public final ImageView c;
    public final TextView d;

    public mgp0(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.f21754a = linearLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f21754a;
    }
}
