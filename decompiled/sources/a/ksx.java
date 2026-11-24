package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes3.dex */
public final class ksx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f18836a;
    public final DsCellMiddleTitle b;
    public final DsSettingsCell c;

    public ksx(DsSettingsCell dsSettingsCell, DsCellMiddleTitle dsCellMiddleTitle, DsSettingsCell dsSettingsCell2) {
        this.f18836a = dsSettingsCell;
        this.b = dsCellMiddleTitle;
        this.c = dsSettingsCell2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f18836a;
    }
}
