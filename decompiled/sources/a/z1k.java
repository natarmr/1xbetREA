package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import org.xplatform.ui_core.viewcomponents.views.FixedSelectionTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class z1k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f43625a;
    public final LinearLayout b;
    public final ShapeableImageView c;
    public final ImageView d;
    public final ConstraintLayout e;
    public final TextView f;
    public final TextView g;
    public final FixedSelectionTextView h;
    public final TextView i;

    public z1k(ConstraintLayout constraintLayout, LinearLayout linearLayout, ShapeableImageView shapeableImageView, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, FixedSelectionTextView fixedSelectionTextView, TextView textView3) {
        this.f43625a = constraintLayout;
        this.b = linearLayout;
        this.c = shapeableImageView;
        this.d = imageView;
        this.e = constraintLayout2;
        this.f = textView;
        this.g = textView2;
        this.h = fixedSelectionTextView;
        this.i = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43625a;
    }
}
