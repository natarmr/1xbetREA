package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTwoButtons;

/* JADX INFO: loaded from: classes6.dex */
public final class iq8 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f15197a;
    public final iab b;
    public final DsPresetTwoButtons c;

    public iq8(LinearLayout linearLayout, iab iabVar, DsPresetTwoButtons dsPresetTwoButtons) {
        this.f15197a = linearLayout;
        this.b = iabVar;
        this.c = dsPresetTwoButtons;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f15197a;
    }
}
