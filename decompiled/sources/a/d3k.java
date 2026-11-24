package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.views.FixedSelectionTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class d3k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f5406a;
    public final ImageView b;
    public final ImageView c;
    public final ConstraintLayout d;
    public final FixedSelectionTextView e;
    public final TextView f;

    public d3k(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, FixedSelectionTextView fixedSelectionTextView, TextView textView) {
        this.f5406a = linearLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = constraintLayout;
        this.e = fixedSelectionTextView;
        this.f = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f5406a;
    }
}
