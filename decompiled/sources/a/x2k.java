package a;

import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;

/* JADX INFO: loaded from: classes5.dex */
public final class x2k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f40172a;
    public final DsCellLeftIcon b;
    public final DsCellMiddleTitle c;
    public final DsCellRightBanner d;
    public final DsMenuCell e;

    public x2k(FrameLayout frameLayout, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle, DsCellRightBanner dsCellRightBanner, DsMenuCell dsMenuCell) {
        this.f40172a = frameLayout;
        this.b = dsCellLeftIcon;
        this.c = dsCellMiddleTitle;
        this.d = dsCellRightBanner;
        this.e = dsMenuCell;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f40172a;
    }
}
