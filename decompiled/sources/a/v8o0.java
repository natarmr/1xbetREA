package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class v8o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f36996a;
    public final ImageView b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;

    public v8o0(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.f36996a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = textView;
        this.e = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36996a;
    }
}
