package a;

import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.bonus_games.impl.lottery.presentation.views.LotteryView;

/* JADX INFO: loaded from: classes3.dex */
public final class e1r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f7049a;
    public final LotteryView b;

    public e1r(FrameLayout frameLayout, LotteryView lotteryView) {
        this.f7049a = frameLayout;
        this.b = lotteryView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f7049a;
    }
}
