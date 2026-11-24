package a;

import android.view.View;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;

/* JADX INFO: loaded from: classes.dex */
public final class svx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCompactCell f32892a;
    public final DsMenuCompactCell b;

    public svx(DsMenuCompactCell dsMenuCompactCell, DsMenuCompactCell dsMenuCompactCell2) {
        this.f32892a = dsMenuCompactCell;
        this.b = dsMenuCompactCell2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f32892a;
    }
}
