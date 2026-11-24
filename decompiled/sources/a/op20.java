package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes.dex */
public final class op20 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f25620a;
    public final ShapeableImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;

    public op20(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f25620a = constraintLayout;
        this.b = shapeableImageView;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.g = textView5;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f25620a;
    }
}
