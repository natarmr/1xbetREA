package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes5.dex */
public final class sku0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f32369a;
    public final DsCellMiddleTitle b;
    public final DsCellRightSwitch c;
    public final DsSeparator d;

    public sku0(DsSettingsCell dsSettingsCell, DsCellMiddleTitle dsCellMiddleTitle, DsCellRightSwitch dsCellRightSwitch, DsSeparator dsSeparator) {
        this.f32369a = dsSettingsCell;
        this.b = dsCellMiddleTitle;
        this.c = dsCellRightSwitch;
        this.d = dsSeparator;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f32369a;
    }
}
