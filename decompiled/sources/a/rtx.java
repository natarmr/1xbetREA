package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class rtx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f31098a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final View e;
    public final View f;

    public rtx(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, View view, View view2) {
        this.f31098a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = view;
        this.f = view2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f31098a;
    }
}
