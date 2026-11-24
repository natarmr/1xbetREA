package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;

/* JADX INFO: loaded from: classes5.dex */
public final class jxx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSettingsCell f17332a;
    public final DsCellLeftIcon b;
    public final DsCellMiddleTitle c;
    public final DsCellRightLabel d;
    public final DsSettingsCell e;

    public jxx(DsSettingsCell dsSettingsCell, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle, DsCellRightLabel dsCellRightLabel, DsSettingsCell dsSettingsCell2) {
        this.f17332a = dsSettingsCell;
        this.b = dsCellLeftIcon;
        this.c = dsCellMiddleTitle;
        this.d = dsCellRightLabel;
        this.e = dsSettingsCell2;
    }

    public static jxx a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_settings_cell_accordion, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.cliIcon;
        DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewInflate, R.id.cliIcon);
        if (dsCellLeftIcon != null) {
            i = R.id.cmtTitle;
            DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewInflate, R.id.cmtTitle);
            if (dsCellMiddleTitle != null) {
                i = R.id.crlLabelText;
                DsCellRightLabel dsCellRightLabel = (DsCellRightLabel) yum0.f(viewInflate, R.id.crlLabelText);
                if (dsCellRightLabel != null) {
                    DsSettingsCell dsSettingsCell = (DsSettingsCell) viewInflate;
                    return new jxx(dsSettingsCell, dsCellLeftIcon, dsCellMiddleTitle, dsCellRightLabel, dsSettingsCell);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f17332a;
    }
}
