package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightButton;

/* JADX INFO: loaded from: classes3.dex */
public final class kvx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f18976a;
    public final DsCellRightButton b;
    public final DsCellLeftIcon c;
    public final DsCellMiddleTitle d;

    public kvx(DsSettingsCell dsSettingsCell, DsCellRightButton dsCellRightButton, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f18976a = dsSettingsCell;
        this.b = dsCellRightButton;
        this.c = dsCellLeftIcon;
        this.d = dsCellMiddleTitle;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f18976a;
    }
}
