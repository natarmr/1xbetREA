package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.tile_matching.presentation.views.TileMatchingCoeffView;
import org.xplatform.tile_matching.presentation.views.TileMatchingGameFieldView;

/* JADX INFO: loaded from: classes6.dex */
public final class w5r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f38597a;
    public final View b;
    public final ImageView c;
    public final TileMatchingCoeffView d;
    public final TileMatchingCoeffView e;
    public final TileMatchingCoeffView f;
    public final TileMatchingCoeffView g;
    public final TileMatchingCoeffView h;
    public final TileMatchingCoeffView i;
    public final ConstraintLayout j;
    public final TileMatchingGameFieldView k;
    public final ImageView l;
    public final TextView m;
    public final TextView n;

    public w5r(ConstraintLayout constraintLayout, View view, ImageView imageView, TileMatchingCoeffView tileMatchingCoeffView, TileMatchingCoeffView tileMatchingCoeffView2, TileMatchingCoeffView tileMatchingCoeffView3, TileMatchingCoeffView tileMatchingCoeffView4, TileMatchingCoeffView tileMatchingCoeffView5, TileMatchingCoeffView tileMatchingCoeffView6, ConstraintLayout constraintLayout2, TileMatchingGameFieldView tileMatchingGameFieldView, ImageView imageView2, TextView textView, TextView textView2) {
        this.f38597a = constraintLayout;
        this.b = view;
        this.c = imageView;
        this.d = tileMatchingCoeffView;
        this.e = tileMatchingCoeffView2;
        this.f = tileMatchingCoeffView3;
        this.g = tileMatchingCoeffView4;
        this.h = tileMatchingCoeffView5;
        this.i = tileMatchingCoeffView6;
        this.j = constraintLayout2;
        this.k = tileMatchingGameFieldView;
        this.l = imageView2;
        this.m = textView;
        this.n = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38597a;
    }
}
