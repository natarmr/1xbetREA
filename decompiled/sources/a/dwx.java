package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class dwx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f6820a;
    public final RoundCornerImageView b;
    public final RoundCornerImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final View h;
    public final View i;

    public dwx(ConstraintLayout constraintLayout, RoundCornerImageView roundCornerImageView, RoundCornerImageView roundCornerImageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view, View view2) {
        this.f6820a = constraintLayout;
        this.b = roundCornerImageView;
        this.c = roundCornerImageView2;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
        this.h = view;
        this.i = view2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f6820a;
    }
}
