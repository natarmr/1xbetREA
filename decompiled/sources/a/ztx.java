package a;

import android.view.View;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;

/* JADX INFO: loaded from: classes4.dex */
public final class ztx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCompactCell f44983a;
    public final DsMenuCompactCell b;

    public ztx(DsMenuCompactCell dsMenuCompactCell, DsMenuCompactCell dsMenuCompactCell2) {
        this.f44983a = dsMenuCompactCell;
        this.b = dsMenuCompactCell2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f44983a;
    }
}
