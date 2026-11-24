package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightRadioButton;

/* JADX INFO: loaded from: classes4.dex */
public final class pxx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f27778a;
    public final DsCellLeftIcon b;
    public final DsCellMiddleTitle c;
    public final DsCellRightRadioButton d;
    public final DsSettingsCell e;

    public pxx(DsSettingsCell dsSettingsCell, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle, DsCellRightRadioButton dsCellRightRadioButton, DsSettingsCell dsSettingsCell2) {
        this.f27778a = dsSettingsCell;
        this.b = dsCellLeftIcon;
        this.c = dsCellMiddleTitle;
        this.d = dsCellRightRadioButton;
        this.e = dsSettingsCell2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f27778a;
    }
}
