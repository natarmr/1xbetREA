package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.views.FixedSelectionTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class a2k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f128a;
    public final LinearLayout b;
    public final ImageView c;
    public final ImageView d;
    public final ConstraintLayout e;
    public final FixedSelectionTextView f;
    public final TextView g;

    public a2k(ConstraintLayout constraintLayout, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, FixedSelectionTextView fixedSelectionTextView, TextView textView) {
        this.f128a = constraintLayout;
        this.b = linearLayout;
        this.c = imageView;
        this.d = imageView2;
        this.e = constraintLayout2;
        this.f = fixedSelectionTextView;
        this.g = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f128a;
    }
}
