package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;

/* JADX INFO: loaded from: classes6.dex */
public final class er10 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f8260a;
    public final DsCellMiddleTitle b;
    public final DsCellRightSwitch c;

    public er10(DsSettingsCell dsSettingsCell, DsCellMiddleTitle dsCellMiddleTitle, DsCellRightSwitch dsCellRightSwitch) {
        this.f8260a = dsSettingsCell;
        this.b = dsCellMiddleTitle;
        this.c = dsCellRightSwitch;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f8260a;
    }
}
