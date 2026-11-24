package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import org.xplatform.ui_core.viewcomponents.views.FixedSelectionTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class c2k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f3627a;
    public final ImageView b;
    public final ShapeableImageView c;
    public final AppCompatImageView d;
    public final ConstraintLayout e;
    public final FixedSelectionTextView f;
    public final ImageView g;
    public final TextView h;

    public c2k(LinearLayout linearLayout, ImageView imageView, ShapeableImageView shapeableImageView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, FixedSelectionTextView fixedSelectionTextView, ImageView imageView2, TextView textView) {
        this.f3627a = linearLayout;
        this.b = imageView;
        this.c = shapeableImageView;
        this.d = appCompatImageView;
        this.e = constraintLayout;
        this.f = fixedSelectionTextView;
        this.g = imageView2;
        this.h = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3627a;
    }
}
