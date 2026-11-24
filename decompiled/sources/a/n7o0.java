package a;

import android.view.View;
import org.xplatform.cyber.game.universal.impl.presentation.roulette.gamefield.RouletteView;

/* JADX INFO: loaded from: classes4.dex */
public final class n7o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RouletteView f23051a;
    public final RouletteView b;

    public n7o0(RouletteView rouletteView, RouletteView rouletteView2) {
        this.f23051a = rouletteView;
        this.b = rouletteView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f23051a;
    }
}
