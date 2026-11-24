package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes5.dex */
public final class bwx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCell f3349a;
    public final DsCellLeftIcon b;
    public final DsCellMiddleTitle c;

    public bwx(DsMenuCell dsMenuCell, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f3349a = dsMenuCell;
        this.b = dsCellLeftIcon;
        this.c = dsCellMiddleTitle;
    }

    public static bwx a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_line_menu_item, viewGroup, false);
        DsMenuCell dsMenuCell = (DsMenuCell) viewInflate;
        int i = R.id.icon;
        DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(viewInflate, R.id.icon);
        if (dsCellLeftIcon != null) {
            i = R.id.title;
            DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(viewInflate, R.id.title);
            if (dsCellMiddleTitle != null) {
                return new bwx(dsMenuCell, dsCellLeftIcon, dsCellMiddleTitle);
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3349a;
    }
}
