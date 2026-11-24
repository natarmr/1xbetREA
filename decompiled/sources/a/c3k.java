package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.imageview.ShapeableImageView;
import org.xplatform.ui_core.viewcomponents.views.FixedSelectionTextView;

/* JADX INFO: loaded from: classes.dex */
public final class c3k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f3679a;
    public final LinearLayout b;
    public final ShapeableImageView c;
    public final ConstraintLayout d;
    public final FrameLayout e;
    public final Group f;
    public final TextView g;
    public final TextView h;
    public final FixedSelectionTextView i;
    public final TextView j;
    public final TextView k;
    public final View l;

    public c3k(LinearLayout linearLayout, LinearLayout linearLayout2, ShapeableImageView shapeableImageView, ConstraintLayout constraintLayout, FrameLayout frameLayout, Group group, TextView textView, TextView textView2, FixedSelectionTextView fixedSelectionTextView, TextView textView3, TextView textView4, View view) {
        this.f3679a = linearLayout;
        this.b = linearLayout2;
        this.c = shapeableImageView;
        this.d = constraintLayout;
        this.e = frameLayout;
        this.f = group;
        this.g = textView;
        this.h = textView2;
        this.i = fixedSelectionTextView;
        this.j = textView3;
        this.k = textView4;
        this.l = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3679a;
    }
}
