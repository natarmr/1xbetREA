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
public final class wxx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCell f39950a;
    public final DsCellRightBanner b;
    public final DsCellLeftIcon c;
    public final DsCellMiddleTitle d;

    public wxx(DsMenuCell dsMenuCell, DsCellRightBanner dsCellRightBanner, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f39950a = dsMenuCell;
        this.b = dsCellRightBanner;
        this.c = dsCellLeftIcon;
        this.d = dsCellMiddleTitle;
    }

    public static wxx a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_special_line_menu_item, viewGroup, false);
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
                    return new wxx(dsMenuCell, dsCellRightBanner, dsCellLeftIcon, dsCellMiddleTitle);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f39950a;
    }
}
