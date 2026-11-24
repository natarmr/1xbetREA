package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes5.dex */
public final class lrx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCell f20552a;
    public final DsCellLeftIcon b;
    public final DsCellMiddleTitle c;

    public lrx(DsMenuCell dsMenuCell, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f20552a = dsMenuCell;
        this.b = dsCellLeftIcon;
        this.c = dsCellMiddleTitle;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f20552a;
    }
}
