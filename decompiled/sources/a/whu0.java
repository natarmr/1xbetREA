package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.bonus_games.impl.lottery.presentation.views.ErasableView;

/* JADX INFO: loaded from: classes3.dex */
public final class whu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f39184a;
    public final View b;
    public final ErasableView c;
    public final ErasableView d;
    public final ErasableView e;
    public final ErasableView f;
    public final ErasableView g;
    public final ErasableView h;
    public final ErasableView i;
    public final ErasableView j;
    public final ErasableView k;
    public final TextView l;

    public whu0(ConstraintLayout constraintLayout, View view, ErasableView erasableView, ErasableView erasableView2, ErasableView erasableView3, ErasableView erasableView4, ErasableView erasableView5, ErasableView erasableView6, ErasableView erasableView7, ErasableView erasableView8, ErasableView erasableView9, TextView textView) {
        this.f39184a = constraintLayout;
        this.b = view;
        this.c = erasableView;
        this.d = erasableView2;
        this.e = erasableView3;
        this.f = erasableView4;
        this.g = erasableView5;
        this.h = erasableView6;
        this.i = erasableView7;
        this.j = erasableView8;
        this.k = erasableView9;
        this.l = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f39184a;
    }
}
