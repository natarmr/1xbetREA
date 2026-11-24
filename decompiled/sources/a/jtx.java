package a;

import android.view.View;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;

/* JADX INFO: loaded from: classes4.dex */
public final class jtx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCompactCell f17123a;
    public final DsMenuCompactCell b;

    public jtx(DsMenuCompactCell dsMenuCompactCell, DsMenuCompactCell dsMenuCompactCell2) {
        this.f17123a = dsMenuCompactCell;
        this.b = dsMenuCompactCell2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f17123a;
    }
}
