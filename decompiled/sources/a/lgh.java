package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class lgh implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f20008a;
    public final ShapeableImageView b;
    public final TextView c;

    public lgh(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, TextView textView) {
        this.f20008a = constraintLayout;
        this.b = shapeableImageView;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f20008a;
    }
}
