package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes4.dex */
public final class exx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f8599a;
    public final DsCellRightSwitch b;
    public final DsCellMiddleTitle c;
    public final DsSeparator d;
    public final DsSettingsCell e;

    public exx(DsSettingsCell dsSettingsCell, DsCellRightSwitch dsCellRightSwitch, DsCellMiddleTitle dsCellMiddleTitle, DsSeparator dsSeparator, DsSettingsCell dsSettingsCell2) {
        this.f8599a = dsSettingsCell;
        this.b = dsCellRightSwitch;
        this.c = dsCellMiddleTitle;
        this.d = dsSeparator;
        this.e = dsSettingsCell2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f8599a;
    }
}
