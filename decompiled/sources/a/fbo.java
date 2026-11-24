package a;

import android.view.View;
import android.widget.TextView;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleDice;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes6.dex */
public final class fbo implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EventCardMiddleDice f9270a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final SportScore j;
    public final TextView k;
    public final TextView l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;

    public fbo(EventCardMiddleDice eventCardMiddleDice, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, SportScore sportScore, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15) {
        this.f9270a = eventCardMiddleDice;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = textView4;
        this.f = textView5;
        this.g = textView6;
        this.h = textView7;
        this.i = textView8;
        this.j = sportScore;
        this.k = textView9;
        this.l = textView10;
        this.m = textView11;
        this.n = textView12;
        this.o = textView13;
        this.p = textView14;
        this.q = textView15;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f9270a;
    }
}
