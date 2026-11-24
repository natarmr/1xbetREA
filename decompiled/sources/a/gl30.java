package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class gl30 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f11472a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;

    public gl30(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f11472a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.g = textView5;
        this.h = textView6;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f11472a;
    }
}
