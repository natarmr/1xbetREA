package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes3.dex */
public final class ktk implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f18870a;
    public final DsCellMiddleTitle b;
    public final DsSeparator c;
    public final DsSettingsCell d;

    public ktk(DsSettingsCell dsSettingsCell, DsSettingsCell dsSettingsCell2, DsCellMiddleTitle dsCellMiddleTitle, DsSeparator dsSeparator) {
        this.f18870a = dsSettingsCell;
        this.b = dsCellMiddleTitle;
        this.c = dsSeparator;
        this.d = dsSettingsCell2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f18870a;
    }
}
