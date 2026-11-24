package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.cyber.game.universal.impl.presentation.powerofpower.table.PowerOfPowerColumnView;
import org.xplatform.cyber.game.universal.impl.presentation.powerofpower.table.PowerOfPowerScrollableTableView;

/* JADX INFO: loaded from: classes4.dex */
public final class kqb0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f18715a;
    public final PowerOfPowerColumnView b;
    public final PowerOfPowerScrollableTableView c;

    public kqb0(LinearLayout linearLayout, PowerOfPowerColumnView powerOfPowerColumnView, PowerOfPowerScrollableTableView powerOfPowerScrollableTableView) {
        this.f18715a = linearLayout;
        this.b = powerOfPowerColumnView;
        this.c = powerOfPowerScrollableTableView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f18715a;
    }
}
