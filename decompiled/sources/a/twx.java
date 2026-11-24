package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes5.dex */
public final class twx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f34672a;
    public final DsCellMiddleTitle b;
    public final DsSettingsCell c;
    public final DsSeparator d;

    public twx(LinearLayout linearLayout, DsCellMiddleTitle dsCellMiddleTitle, DsSettingsCell dsSettingsCell, DsSeparator dsSeparator) {
        this.f34672a = linearLayout;
        this.b = dsCellMiddleTitle;
        this.c = dsSettingsCell;
        this.d = dsSeparator;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f34672a;
    }
}
