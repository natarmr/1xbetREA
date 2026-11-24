package a;

import android.view.View;
import org.xplatform.cyber.game.universal.impl.presentation.indianpoker.SyntheticIndianPokerView;

/* JADX INFO: loaded from: classes4.dex */
public final class z5o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SyntheticIndianPokerView f43827a;
    public final SyntheticIndianPokerView b;

    public z5o0(SyntheticIndianPokerView syntheticIndianPokerView, SyntheticIndianPokerView syntheticIndianPokerView2) {
        this.f43827a = syntheticIndianPokerView;
        this.b = syntheticIndianPokerView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43827a;
    }
}
