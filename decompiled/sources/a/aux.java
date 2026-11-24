package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;

/* JADX INFO: loaded from: classes4.dex */
public final class aux implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCell f1500a;
    public final DsMenuCell b;
    public final DsCellRightBanner c;
    public final DsCellLeftIcon d;
    public final DsCellMiddleTitle e;

    public aux(DsMenuCell dsMenuCell, DsMenuCell dsMenuCell2, DsCellRightBanner dsCellRightBanner, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f1500a = dsMenuCell;
        this.b = dsMenuCell2;
        this.c = dsCellRightBanner;
        this.d = dsCellLeftIcon;
        this.e = dsCellMiddleTitle;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1500a;
    }
}
