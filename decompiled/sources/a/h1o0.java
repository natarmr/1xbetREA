package a;

import android.view.View;
import org.xplatform.cyber.game.universal.impl.presentation.dartslive.view.DartsLiveView;

/* JADX INFO: loaded from: classes3.dex */
public final class h1o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DartsLiveView f12294a;
    public final DartsLiveView b;

    public h1o0(DartsLiveView dartsLiveView, DartsLiveView dartsLiveView2) {
        this.f12294a = dartsLiveView;
        this.b = dartsLiveView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f12294a;
    }
}
