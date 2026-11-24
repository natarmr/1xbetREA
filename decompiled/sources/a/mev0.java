package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes6.dex */
public final class mev0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f21667a;
    public final DsCellLeftIcon b;
    public final DsSettingsCell c;
    public final DsCellMiddleTitle d;

    public mev0(DsSettingsCell dsSettingsCell, DsSettingsCell dsSettingsCell2, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f21667a = dsSettingsCell;
        this.b = dsCellLeftIcon;
        this.c = dsSettingsCell2;
        this.d = dsCellMiddleTitle;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f21667a;
    }
}
