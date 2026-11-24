package a;

import android.view.View;
import org.xplatform.cyber.game.counterstrike.impl.presentation.statistic.tablet.Cs2StatisticTabletView;

/* JADX INFO: loaded from: classes4.dex */
public final class eth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cs2StatisticTabletView f8375a;

    public eth(Cs2StatisticTabletView cs2StatisticTabletView) {
        this.f8375a = cs2StatisticTabletView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f8375a;
    }
}
