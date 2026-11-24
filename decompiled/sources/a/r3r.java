package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTextFieldBasic;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;

/* JADX INFO: loaded from: classes5.dex */
public final class r3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f29801a;
    public final DsButton b;
    public final DsPresetTextFieldBasic c;
    public final LinearLayout d;
    public final DsCellRightSwitch e;

    public r3r(LinearLayout linearLayout, DsButton dsButton, DsPresetTextFieldBasic dsPresetTextFieldBasic, LinearLayout linearLayout2, DsCellRightSwitch dsCellRightSwitch) {
        this.f29801a = linearLayout;
        this.b = dsButton;
        this.c = dsPresetTextFieldBasic;
        this.d = linearLayout2;
        this.e = dsCellRightSwitch;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f29801a;
    }
}
