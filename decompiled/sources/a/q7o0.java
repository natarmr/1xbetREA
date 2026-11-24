package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.xplatform.cyber.game.universal.impl.presentation.roulette.gamefield.RouletteView;

/* JADX INFO: loaded from: classes4.dex */
public final class q7o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouletteView f28261a;
    public final ImageView b;
    public final TextView c;

    public q7o0(RouletteView rouletteView, ImageView imageView, TextView textView) {
        this.f28261a = rouletteView;
        this.b = imageView;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f28261a;
    }
}
