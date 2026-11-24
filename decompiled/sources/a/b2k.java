package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import org.xplatform.ui_core.viewcomponents.views.FixedSelectionTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class b2k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f1855a;
    public final ShapeableImageView b;
    public final ImageView c;
    public final ShapeableImageView d;
    public final ConstraintLayout e;
    public final FixedSelectionTextView f;
    public final ImageView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;

    public b2k(LinearLayout linearLayout, ShapeableImageView shapeableImageView, ImageView imageView, ShapeableImageView shapeableImageView2, ConstraintLayout constraintLayout, FixedSelectionTextView fixedSelectionTextView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3) {
        this.f1855a = linearLayout;
        this.b = shapeableImageView;
        this.c = imageView;
        this.d = shapeableImageView2;
        this.e = constraintLayout;
        this.f = fixedSelectionTextView;
        this.g = imageView2;
        this.h = textView;
        this.i = textView2;
        this.j = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1855a;
    }
}
