package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes.dex */
public final class bsx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f3155a;
    public final DsCellLeftIcon b;
    public final DsCellMiddleTitle c;
    public final DsSettingsCell d;
    public final DsSeparator e;

    public bsx(LinearLayout linearLayout, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle, DsSettingsCell dsSettingsCell, DsSeparator dsSeparator) {
        this.f3155a = linearLayout;
        this.b = dsCellLeftIcon;
        this.c = dsCellMiddleTitle;
        this.d = dsSettingsCell;
        this.e = dsSeparator;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3155a;
    }
}
