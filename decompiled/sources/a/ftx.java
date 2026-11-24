package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;

/* JADX INFO: loaded from: classes4.dex */
public final class ftx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCompactCell f10137a;
    public final DsMenuCompactCell b;

    public ftx(DsMenuCompactCell dsMenuCompactCell, DsMenuCompactCell dsMenuCompactCell2) {
        this.f10137a = dsMenuCompactCell;
        this.b = dsMenuCompactCell2;
    }

    public static ftx a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_compact_grid_line_menu_item, viewGroup, false);
        if (viewInflate != null) {
            DsMenuCompactCell dsMenuCompactCell = (DsMenuCompactCell) viewInflate;
            return new ftx(dsMenuCompactCell, dsMenuCompactCell);
        }
        hny.u("rootView");
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10137a;
    }
}
