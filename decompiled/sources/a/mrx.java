package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;

/* JADX INFO: loaded from: classes5.dex */
public final class mrx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCell f22293a;
    public final DsCellRightBanner b;
    public final DsCellLeftIcon c;
    public final DsCellMiddleTitle d;

    public mrx(DsMenuCell dsMenuCell, DsCellRightBanner dsCellRightBanner, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f22293a = dsMenuCell;
        this.b = dsCellRightBanner;
        this.c = dsCellLeftIcon;
        this.d = dsCellMiddleTitle;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f22293a;
    }
}
