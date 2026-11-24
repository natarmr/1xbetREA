package a;

import android.view.View;
import android.widget.TextView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;
import org.xplatform.cyber.game.universal.impl.presentation.victoryformula.VictoryFormulaView;

/* JADX INFO: loaded from: classes4.dex */
public final class u8o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VictoryFormulaView f35241a;
    public final View b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final View i;
    public final View j;
    public final View k;
    public final View l;
    public final SyntheticTimerView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public final TextView x;

    public u8o0(VictoryFormulaView victoryFormulaView, View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8, View view9, View view10, View view11, SyntheticTimerView syntheticTimerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        this.f35241a = victoryFormulaView;
        this.b = view;
        this.c = view2;
        this.d = view3;
        this.e = view4;
        this.f = view5;
        this.g = view6;
        this.h = view7;
        this.i = view8;
        this.j = view9;
        this.k = view10;
        this.l = view11;
        this.m = syntheticTimerView;
        this.n = textView;
        this.o = textView2;
        this.p = textView3;
        this.q = textView4;
        this.r = textView5;
        this.s = textView6;
        this.t = textView7;
        this.u = textView8;
        this.v = textView9;
        this.w = textView10;
        this.x = textView11;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f35241a;
    }
}
