package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes.dex */
public final class trx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f34438a;
    public final DsCellMiddleTitle b;
    public final DsCellLeftIcon c;
    public final DsCellRightLabel d;
    public final DsSeparator e;

    public trx(DsSettingsCell dsSettingsCell, DsCellMiddleTitle dsCellMiddleTitle, DsCellLeftIcon dsCellLeftIcon, DsCellRightLabel dsCellRightLabel, DsSeparator dsSeparator) {
        this.f34438a = dsSettingsCell;
        this.b = dsCellMiddleTitle;
        this.c = dsCellLeftIcon;
        this.d = dsCellRightLabel;
        this.e = dsSeparator;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f34438a;
    }
}
