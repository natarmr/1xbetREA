package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;

/* JADX INFO: loaded from: classes6.dex */
public final class q3w implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCell f28071a;
    public final DsCellMiddleTitle b;
    public final DsCellRightBanner c;

    public q3w(DsMenuCell dsMenuCell, DsCellMiddleTitle dsCellMiddleTitle, DsCellRightBanner dsCellRightBanner) {
        this.f28071a = dsMenuCell;
        this.b = dsCellMiddleTitle;
        this.c = dsCellRightBanner;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f28071a;
    }
}
