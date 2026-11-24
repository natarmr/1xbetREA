package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes4.dex */
public final class f2r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f8827a;
    public final DsCellRightSwitch b;
    public final DsCellRightSwitch c;
    public final DsCellRightSwitch d;
    public final DsNavigationBar e;
    public final DsSettingsCell f;
    public final DsSettingsCell g;

    public f2r(LinearLayout linearLayout, DsCellRightSwitch dsCellRightSwitch, DsCellRightSwitch dsCellRightSwitch2, DsCellRightSwitch dsCellRightSwitch3, DsNavigationBar dsNavigationBar, DsSettingsCell dsSettingsCell, DsSettingsCell dsSettingsCell2) {
        this.f8827a = linearLayout;
        this.b = dsCellRightSwitch;
        this.c = dsCellRightSwitch2;
        this.d = dsCellRightSwitch3;
        this.e = dsNavigationBar;
        this.f = dsSettingsCell;
        this.g = dsSettingsCell2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f8827a;
    }
}
