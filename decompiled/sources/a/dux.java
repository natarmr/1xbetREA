package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;

/* JADX INFO: loaded from: classes3.dex */
public final class dux implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCell f6717a;
    public final DsCellRightBanner b;
    public final DsCellLeftIcon c;
    public final DsCellMiddleTitle d;

    public dux(DsMenuCell dsMenuCell, DsCellRightBanner dsCellRightBanner, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f6717a = dsMenuCell;
        this.b = dsCellRightBanner;
        this.c = dsCellLeftIcon;
        this.d = dsCellMiddleTitle;
    }

    public static dux a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_end_icon_line_menu_item, viewGroup, false);
        DsMenuCell dsMenuCell = (DsMenuCell) viewInflate;
        int i = R.id.decorIcon;
        DsCellRightBanner dsCellRightBanner = (DsCellRightBanner) yum0.f(viewInflate, R.id.decorIcon);
        if (dsCellRightBanner != null) {
            i = R.id.icon;
            DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewInflate, R.id.icon);
            if (dsCellLeftIcon != null) {
                i = R.id.title;
                DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewInflate, R.id.title);
                if (dsCellMiddleTitle != null) {
                    return new dux(dsMenuCell, dsCellRightBanner, dsCellLeftIcon, dsCellMiddleTitle);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f6717a;
    }
}
