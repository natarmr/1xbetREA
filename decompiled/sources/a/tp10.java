package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes2.dex */
public final class tp10 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f34310a;
    public final DsCellMiddleTitle b;
    public final DsCellLeftIcon c;

    public tp10(DsSettingsCell dsSettingsCell, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f34310a = dsSettingsCell;
        this.b = dsCellMiddleTitle;
        this.c = dsCellLeftIcon;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f34310a;
    }
}
