package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.xplatform.cyber.game.universal.impl.presentation.indianpoker.SyntheticIndianPokerView;
import org.xplatform.uikit.components.timer.DsTimer;

/* JADX INFO: loaded from: classes4.dex */
public final class c6o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SyntheticIndianPokerView f3827a;
    public final ImageView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;
    public final ImageView g;
    public final ImageView h;
    public final ImageView i;
    public final DsTimer j;
    public final TextView k;
    public final TextView l;
    public final TextView m;

    public c6o0(SyntheticIndianPokerView syntheticIndianPokerView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, DsTimer dsTimer, TextView textView, TextView textView2, TextView textView3) {
        this.f3827a = syntheticIndianPokerView;
        this.b = imageView;
        this.c = imageView2;
        this.d = imageView3;
        this.e = imageView4;
        this.f = imageView5;
        this.g = imageView6;
        this.h = imageView7;
        this.i = imageView8;
        this.j = dsTimer;
        this.k = textView;
        this.l = textView2;
        this.m = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3827a;
    }
}
