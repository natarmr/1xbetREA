package a;

import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;

/* JADX INFO: loaded from: classes5.dex */
public final class n2k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f22804a;
    public final DsMenuCell b;
    public final DsCellMiddleTitle c;

    public n2k(FrameLayout frameLayout, DsMenuCell dsMenuCell, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f22804a = frameLayout;
        this.b = dsMenuCell;
        this.c = dsCellMiddleTitle;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f22804a;
    }
}
