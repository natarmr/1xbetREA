package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes5.dex */
public final class rku0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f30667a;
    public final DsCellMiddleTitle b;
    public final DsCellRightLabel c;
    public final DsSeparator d;

    public rku0(DsSettingsCell dsSettingsCell, DsCellMiddleTitle dsCellMiddleTitle, DsCellRightLabel dsCellRightLabel, DsSeparator dsSeparator) {
        this.f30667a = dsSettingsCell;
        this.b = dsCellMiddleTitle;
        this.c = dsCellRightLabel;
        this.d = dsSeparator;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f30667a;
    }
}
