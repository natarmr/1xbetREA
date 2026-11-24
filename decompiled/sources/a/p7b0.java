package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class p7b0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f26498a;
    public final ShapeableImageView b;
    public final FrameLayout c;
    public final TextView d;
    public final TextView e;

    public p7b0(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, FrameLayout frameLayout, TextView textView, TextView textView2) {
        this.f26498a = constraintLayout;
        this.b = shapeableImageView;
        this.c = frameLayout;
        this.d = textView;
        this.e = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f26498a;
    }
}
