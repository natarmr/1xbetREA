package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightCounter;

/* JADX INFO: loaded from: classes5.dex */
public final class kwx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCell f19024a;
    public final DsCellRightCounter b;
    public final DsCellLeftIcon c;
    public final DsCellMiddleTitle d;

    public kwx(DsMenuCell dsMenuCell, DsCellRightCounter dsCellRightCounter, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f19024a = dsMenuCell;
        this.b = dsCellRightCounter;
        this.c = dsCellLeftIcon;
        this.d = dsCellMiddleTitle;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f19024a;
    }
}
