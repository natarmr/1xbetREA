package a;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.CustomCutTextView;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes.dex */
public final class ntx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f24122a;
    public final Group b;
    public final Group c;
    public final RoundCornerImageView d;
    public final RoundCornerImageView e;
    public final RoundCornerImageView f;
    public final RoundCornerImageView g;
    public final RoundCornerImageView h;
    public final RoundCornerImageView i;
    public final TextView j;
    public final CustomCutTextView k;
    public final AppCompatTextView l;
    public final CustomCutTextView m;

    public ntx(ConstraintLayout constraintLayout, Group group, Group group2, RoundCornerImageView roundCornerImageView, RoundCornerImageView roundCornerImageView2, RoundCornerImageView roundCornerImageView3, RoundCornerImageView roundCornerImageView4, RoundCornerImageView roundCornerImageView5, RoundCornerImageView roundCornerImageView6, TextView textView, CustomCutTextView customCutTextView, AppCompatTextView appCompatTextView, CustomCutTextView customCutTextView2) {
        this.f24122a = constraintLayout;
        this.b = group;
        this.c = group2;
        this.d = roundCornerImageView;
        this.e = roundCornerImageView2;
        this.f = roundCornerImageView3;
        this.g = roundCornerImageView4;
        this.h = roundCornerImageView5;
        this.i = roundCornerImageView6;
        this.j = textView;
        this.k = customCutTextView;
        this.l = appCompatTextView;
        this.m = customCutTextView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24122a;
    }
}
