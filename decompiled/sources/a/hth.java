package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class hth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f13634a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;

    public hth(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f13634a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f13634a;
    }
}
