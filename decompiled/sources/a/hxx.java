package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;

/* JADX INFO: loaded from: classes5.dex */
public final class hxx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCell f13834a;
    public final DsMenuCell b;
    public final DsCellRightBanner c;
    public final DsCellLeftIcon d;
    public final DsCellMiddleTitle e;

    public hxx(DsMenuCell dsMenuCell, DsMenuCell dsMenuCell2, DsCellRightBanner dsCellRightBanner, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f13834a = dsMenuCell;
        this.b = dsMenuCell2;
        this.c = dsCellRightBanner;
        this.d = dsCellLeftIcon;
        this.e = dsCellMiddleTitle;
    }

    public static hxx a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_settings_alert, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        DsMenuCell dsMenuCell = (DsMenuCell) viewInflate;
        int i = R.id.banner;
        DsCellRightBanner dsCellRightBanner = (DsCellRightBanner) yum0.f(viewInflate, R.id.banner);
        if (dsCellRightBanner != null) {
            i = R.id.icon;
            DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewInflate, R.id.icon);
            if (dsCellLeftIcon != null) {
                i = R.id.text;
                DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewInflate, R.id.text);
                if (dsCellMiddleTitle != null) {
                    return new hxx(dsMenuCell, dsMenuCell, dsCellRightBanner, dsCellLeftIcon, dsCellMiddleTitle);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f13834a;
    }
}
