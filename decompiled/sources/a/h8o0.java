package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class h8o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f12638a;
    public final LinearLayout b;
    public final ImageView c;
    public final TextView d;

    public h8o0(ConstraintLayout constraintLayout, LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f12638a = constraintLayout;
        this.b = linearLayout;
        this.c = imageView;
        this.d = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f12638a;
    }
}
