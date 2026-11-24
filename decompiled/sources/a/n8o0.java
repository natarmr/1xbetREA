package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class n8o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f23101a;
    public final LinearLayout b;
    public final ImageView c;
    public final FrameLayout d;
    public final TextView e;

    public n8o0(ConstraintLayout constraintLayout, LinearLayout linearLayout, ImageView imageView, FrameLayout frameLayout, TextView textView) {
        this.f23101a = constraintLayout;
        this.b = linearLayout;
        this.c = imageView;
        this.d = frameLayout;
        this.e = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f23101a;
    }
}
