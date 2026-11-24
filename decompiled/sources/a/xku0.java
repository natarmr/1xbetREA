package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;

/* JADX INFO: loaded from: classes.dex */
public final class xku0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f41046a;
    public final DsCellLeftIcon b;
    public final DsCellMiddleTitle c;
    public final DsCellRightSwitch d;

    public xku0(DsSettingsCell dsSettingsCell, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle, DsCellRightSwitch dsCellRightSwitch) {
        this.f41046a = dsSettingsCell;
        this.b = dsCellLeftIcon;
        this.c = dsCellMiddleTitle;
        this.d = dsCellRightSwitch;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f41046a;
    }
}
