package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;

/* JADX INFO: loaded from: classes5.dex */
public final class itx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCompactCell f15371a;
    public final DsMenuCompactCell b;

    public itx(DsMenuCompactCell dsMenuCompactCell, DsMenuCompactCell dsMenuCompactCell2) {
        this.f15371a = dsMenuCompactCell;
        this.b = dsMenuCompactCell2;
    }

    public static itx a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_compact_menu_grid_line_menu_item, viewGroup, false);
        if (viewInflate != null) {
            DsMenuCompactCell dsMenuCompactCell = (DsMenuCompactCell) viewInflate;
            return new itx(dsMenuCompactCell, dsMenuCompactCell);
        }
        hny.u("rootView");
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f15371a;
    }
}
