package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightRadioButton;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes6.dex */
public final class btx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f3205a;
    public final DsCellRightRadioButton b;
    public final DsSeparator c;
    public final DsCellMiddleTitle d;

    public btx(DsSettingsCell dsSettingsCell, DsCellRightRadioButton dsCellRightRadioButton, DsSeparator dsSeparator, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f3205a = dsSettingsCell;
        this.b = dsCellRightRadioButton;
        this.c = dsSeparator;
        this.d = dsCellMiddleTitle;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3205a;
    }
}
