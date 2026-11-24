package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;

/* JADX INFO: loaded from: classes5.dex */
public final class xtx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCell f41485a;
    public final DsMenuCell b;
    public final DsCellRightBanner c;
    public final DsCellLeftIcon d;
    public final DsCellMiddleTitle e;

    public xtx(DsMenuCell dsMenuCell, DsMenuCell dsMenuCell2, DsCellRightBanner dsCellRightBanner, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f41485a = dsMenuCell;
        this.b = dsMenuCell2;
        this.c = dsCellRightBanner;
        this.d = dsCellLeftIcon;
        this.e = dsCellMiddleTitle;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f41485a;
    }
}
