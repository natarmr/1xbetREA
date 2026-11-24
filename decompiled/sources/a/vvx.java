package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;

/* JADX INFO: loaded from: classes3.dex */
public final class vvx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f38123a;
    public final DsCellMiddleTitle b;
    public final DsCellRightLabel c;

    public vvx(DsSettingsCell dsSettingsCell, DsCellMiddleTitle dsCellMiddleTitle, DsCellRightLabel dsCellRightLabel) {
        this.f38123a = dsSettingsCell;
        this.b = dsCellMiddleTitle;
        this.c = dsCellRightLabel;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38123a;
    }
}
