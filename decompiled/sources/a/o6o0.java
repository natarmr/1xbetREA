package a;

import android.view.View;
import org.xplatform.cyber.game.universal.impl.presentation.powerofpower.timer.PowerOfPowerTimerView;

/* JADX INFO: loaded from: classes4.dex */
public final class o6o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PowerOfPowerTimerView f24748a;
    public final PowerOfPowerTimerView b;

    public o6o0(PowerOfPowerTimerView powerOfPowerTimerView, PowerOfPowerTimerView powerOfPowerTimerView2) {
        this.f24748a = powerOfPowerTimerView;
        this.b = powerOfPowerTimerView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24748a;
    }
}
