package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class tfh implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f33865a;
    public final ShapeableImageView b;
    public final ShapeableImageView c;
    public final TextView d;

    public tfh(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, TextView textView) {
        this.f33865a = constraintLayout;
        this.b = shapeableImageView;
        this.c = shapeableImageView2;
        this.d = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f33865a;
    }
}
