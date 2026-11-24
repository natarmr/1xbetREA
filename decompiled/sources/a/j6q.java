package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import org.xplatform.feature.fin_bet.impl.presentation.view.FinBetView;
import org.xplatform.ui_core.viewcomponents.layouts.frame.ProgressBarWithSandClockNew;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes4.dex */
public final class j6q implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f16000a;
    public final Group b;
    public final Group c;
    public final FrameLayout d;
    public final FinBetView e;
    public final ProgressBarWithSandClockNew f;
    public final AppCompatImageView g;
    public final AppCompatImageView h;
    public final LottieView i;
    public final DsNavigationBarBasic j;
    public final FrameLayout k;
    public final View l;
    public final ConstraintLayout m;
    public final View n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final TextView v;

    public j6q(ConstraintLayout constraintLayout, Group group, Group group2, FrameLayout frameLayout, FinBetView finBetView, ProgressBarWithSandClockNew progressBarWithSandClockNew, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LottieView lottieView, DsNavigationBarBasic dsNavigationBarBasic, FrameLayout frameLayout2, View view, ConstraintLayout constraintLayout2, View view2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.f16000a = constraintLayout;
        this.b = group;
        this.c = group2;
        this.d = frameLayout;
        this.e = finBetView;
        this.f = progressBarWithSandClockNew;
        this.g = appCompatImageView;
        this.h = appCompatImageView2;
        this.i = lottieView;
        this.j = dsNavigationBarBasic;
        this.k = frameLayout2;
        this.l = view;
        this.m = constraintLayout2;
        this.n = view2;
        this.o = textView;
        this.p = textView2;
        this.q = textView3;
        this.r = textView4;
        this.s = textView5;
        this.t = textView6;
        this.u = textView7;
        this.v = textView8;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f16000a;
    }
}
