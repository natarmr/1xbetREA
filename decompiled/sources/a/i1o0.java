package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.xplatform.cyber.game.universal.impl.presentation.dartslive.view.DartsLiveView;
import org.xplatform.cyber.game.universal.impl.presentation.dartslive.view.SectorView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final class i1o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DartsLiveView f14010a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final ImageView i;
    public final View j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final SectorView q;
    public final SyntheticTimerView r;
    public final TextView s;

    public i1o0(DartsLiveView dartsLiveView, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, ImageView imageView, View view2, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, SectorView sectorView, SyntheticTimerView syntheticTimerView, TextView textView13) {
        this.f14010a = dartsLiveView;
        this.b = view;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.g = textView5;
        this.h = textView6;
        this.i = imageView;
        this.j = view2;
        this.k = textView7;
        this.l = textView8;
        this.m = textView9;
        this.n = textView10;
        this.o = textView11;
        this.p = textView12;
        this.q = sectorView;
        this.r = syntheticTimerView;
        this.s = textView13;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f14010a;
    }
}
