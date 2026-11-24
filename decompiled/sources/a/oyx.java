package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes5.dex */
public final class oyx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f26079a;
    public final DsCellMiddleTitle b;

    public oyx(DsSettingsCell dsSettingsCell, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f26079a = dsSettingsCell;
        this.b = dsCellMiddleTitle;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f26079a;
    }
}
