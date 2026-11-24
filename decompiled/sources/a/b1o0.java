package a;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class b1o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f1817a;
    public final ImageView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;
    public final ImageView g;

    public b1o0(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6) {
        this.f1817a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = imageView3;
        this.e = imageView4;
        this.f = imageView5;
        this.g = imageView6;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1817a;
    }
}
