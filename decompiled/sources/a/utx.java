package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes3.dex */
public final class utx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f36276a;
    public final DsCellMiddleTitle b;
    public final DsSettingsCell c;
    public final DsSeparator d;

    public utx(DsSettingsCell dsSettingsCell, DsSettingsCell dsSettingsCell2, DsCellMiddleTitle dsCellMiddleTitle, DsSeparator dsSeparator) {
        this.f36276a = dsSettingsCell;
        this.b = dsCellMiddleTitle;
        this.c = dsSettingsCell2;
        this.d = dsSeparator;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36276a;
    }
}
