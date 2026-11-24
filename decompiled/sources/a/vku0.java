package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;

/* JADX INFO: loaded from: classes5.dex */
public final class vku0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f37594a;
    public final DsCellLeftIcon b;
    public final DsCellMiddleTitle c;
    public final DsCellRightLabel d;

    public vku0(DsSettingsCell dsSettingsCell, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle, DsCellRightLabel dsCellRightLabel) {
        this.f37594a = dsSettingsCell;
        this.b = dsCellLeftIcon;
        this.c = dsCellMiddleTitle;
        this.d = dsCellRightLabel;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f37594a;
    }
}
