package a;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes.dex */
public final class otx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f25850a;
    public final RoundCornerImageView b;
    public final View c;
    public final RoundCornerImageView d;
    public final View e;
    public final View f;
    public final TextView g;
    public final AppCompatTextView h;
    public final TextView i;
    public final TextView j;
    public final AppCompatTextView k;

    public otx(ConstraintLayout constraintLayout, RoundCornerImageView roundCornerImageView, View view, RoundCornerImageView roundCornerImageView2, View view2, View view3, TextView textView, AppCompatTextView appCompatTextView, TextView textView2, TextView textView3, AppCompatTextView appCompatTextView2) {
        this.f25850a = constraintLayout;
        this.b = roundCornerImageView;
        this.c = view;
        this.d = roundCornerImageView2;
        this.e = view2;
        this.f = view3;
        this.g = textView;
        this.h = appCompatTextView;
        this.i = textView2;
        this.j = textView3;
        this.k = appCompatTextView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f25850a;
    }
}
