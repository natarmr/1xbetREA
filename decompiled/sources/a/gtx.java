package a;

import android.view.View;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;

/* JADX INFO: loaded from: classes5.dex */
public final class gtx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCompactCell f11902a;
    public final DsMenuCompactCell b;

    public gtx(DsMenuCompactCell dsMenuCompactCell, DsMenuCompactCell dsMenuCompactCell2) {
        this.f11902a = dsMenuCompactCell;
        this.b = dsMenuCompactCell2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f11902a;
    }
}
