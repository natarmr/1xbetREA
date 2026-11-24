package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.xplatform.cyber.game.universal.impl.presentation.seka.SyntheticSekaView;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final class w7o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SyntheticSekaView f38684a;
    public final ImageView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;
    public final ImageView g;
    public final SyntheticTimerView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;

    public w7o0(SyntheticSekaView syntheticSekaView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, SyntheticTimerView syntheticTimerView, TextView textView, TextView textView2, TextView textView3) {
        this.f38684a = syntheticSekaView;
        this.b = imageView;
        this.c = imageView2;
        this.d = imageView3;
        this.e = imageView4;
        this.f = imageView5;
        this.g = imageView6;
        this.h = syntheticTimerView;
        this.i = textView;
        this.j = textView2;
        this.k = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38684a;
    }
}
