package a;

import android.view.View;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;

/* JADX INFO: loaded from: classes3.dex */
public final class htx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCompactCell f13656a;
    public final DsMenuCompactCell b;

    public htx(DsMenuCompactCell dsMenuCompactCell, DsMenuCompactCell dsMenuCompactCell2) {
        this.f13656a = dsMenuCompactCell;
        this.b = dsMenuCompactCell2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f13656a;
    }
}
