package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class hux implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f13701a;
    public final ImageView b;
    public final ImageView c;
    public final TextView d;

    public hux(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView) {
        this.f13701a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f13701a;
    }
}
