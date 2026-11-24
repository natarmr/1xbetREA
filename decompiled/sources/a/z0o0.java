package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballFieldView;
import org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballPeriodView;
import org.xplatform.cyber.game.universal.impl.presentation.cardfootball.views.CardFootballView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final class z0o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardFootballView f43579a;
    public final CardFootballPeriodView b;
    public final CardFootballFieldView c;
    public final LinearLayout d;
    public final LinearLayout e;
    public final CardFootballPeriodView f;
    public final CardFootballFieldView g;
    public final SyntheticTimerView h;
    public final CardFootballPeriodView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;

    public z0o0(CardFootballView cardFootballView, CardFootballPeriodView cardFootballPeriodView, CardFootballFieldView cardFootballFieldView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout, LinearLayout linearLayout2, CardFootballPeriodView cardFootballPeriodView2, CardFootballFieldView cardFootballFieldView2, SyntheticTimerView syntheticTimerView, CardFootballPeriodView cardFootballPeriodView3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10) {
        this.f43579a = cardFootballView;
        this.b = cardFootballPeriodView;
        this.c = cardFootballFieldView;
        this.d = linearLayout;
        this.e = linearLayout2;
        this.f = cardFootballPeriodView2;
        this.g = cardFootballFieldView2;
        this.h = syntheticTimerView;
        this.i = cardFootballPeriodView3;
        this.j = textView;
        this.k = textView2;
        this.l = textView3;
        this.m = textView4;
        this.n = textView5;
        this.o = textView6;
        this.p = textView7;
        this.q = textView8;
        this.r = textView9;
        this.s = textView10;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43579a;
    }
}
