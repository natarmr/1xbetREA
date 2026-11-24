package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightListCheckBox;

/* JADX INFO: loaded from: classes3.dex */
public final class ohv implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f25283a;
    public final DsCellRightListCheckBox b;
    public final DsCellMiddleTitle c;

    public ohv(DsSettingsCell dsSettingsCell, DsCellRightListCheckBox dsCellRightListCheckBox, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f25283a = dsSettingsCell;
        this.b = dsCellRightListCheckBox;
        this.c = dsCellMiddleTitle;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f25283a;
    }
}
