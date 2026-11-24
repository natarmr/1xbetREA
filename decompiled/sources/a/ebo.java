package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.xplatform.uikit.components.timer.DsTimer;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCyberPoker;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes6.dex */
public final class ebo implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EventCardMiddleCyberPoker f7528a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;
    public final ImageView g;
    public final ImageView h;
    public final TextView i;
    public final ImageView j;
    public final TextView k;
    public final ImageView l;
    public final ImageView m;
    public final TextView n;
    public final SportScore o;
    public final TextView p;
    public final ImageView q;
    public final TextView r;
    public final ImageView s;
    public final ImageView t;
    public final DsTimer u;

    public ebo(EventCardMiddleCyberPoker eventCardMiddleCyberPoker, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, TextView textView3, ImageView imageView6, TextView textView4, ImageView imageView7, ImageView imageView8, TextView textView5, SportScore sportScore, TextView textView6, ImageView imageView9, TextView textView7, ImageView imageView10, ImageView imageView11, DsTimer dsTimer) {
        this.f7528a = eventCardMiddleCyberPoker;
        this.b = textView;
        this.c = textView2;
        this.d = imageView;
        this.e = imageView2;
        this.f = imageView3;
        this.g = imageView4;
        this.h = imageView5;
        this.i = textView3;
        this.j = imageView6;
        this.k = textView4;
        this.l = imageView7;
        this.m = imageView8;
        this.n = textView5;
        this.o = sportScore;
        this.p = textView6;
        this.q = imageView9;
        this.r = textView7;
        this.s = imageView10;
        this.t = imageView11;
        this.u = dsTimer;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f7528a;
    }
}
