package a;

import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightMediumLabel;

/* JADX INFO: loaded from: classes5.dex */
public final class si90 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f32251a;
    public final DsCellMiddleTitle b;
    public final DsCellRightMediumLabel c;
    public final DsSettingsCell d;

    public si90(FrameLayout frameLayout, DsCellMiddleTitle dsCellMiddleTitle, DsCellRightMediumLabel dsCellRightMediumLabel, DsSettingsCell dsSettingsCell) {
        this.f32251a = frameLayout;
        this.b = dsCellMiddleTitle;
        this.c = dsCellRightMediumLabel;
        this.d = dsSettingsCell;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f32251a;
    }
}
