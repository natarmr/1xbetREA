package a;

import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;

/* JADX INFO: loaded from: classes5.dex */
public final class gj90 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f11386a;
    public final DsCellMiddleTitle b;
    public final DsCellRightLabel c;
    public final DsSettingsCell d;

    public gj90(FrameLayout frameLayout, DsCellMiddleTitle dsCellMiddleTitle, DsCellRightLabel dsCellRightLabel, DsSettingsCell dsSettingsCell) {
        this.f11386a = frameLayout;
        this.b = dsCellMiddleTitle;
        this.c = dsCellRightLabel;
        this.d = dsSettingsCell;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f11386a;
    }
}
