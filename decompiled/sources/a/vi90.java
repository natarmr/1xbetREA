package a;

import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes5.dex */
public final class vi90 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f37468a;
    public final DsCellLeftIcon b;
    public final DsCellMiddleTitle c;
    public final DsSettingsCell d;

    public vi90(FrameLayout frameLayout, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle, DsSettingsCell dsSettingsCell) {
        this.f37468a = frameLayout;
        this.b = dsCellLeftIcon;
        this.c = dsCellMiddleTitle;
        this.d = dsSettingsCell;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f37468a;
    }
}
