package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightCounter;

/* JADX INFO: loaded from: classes5.dex */
public final class awx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCell f1595a;
    public final DsCellRightCounter b;
    public final DsCellLeftIcon c;
    public final DsCellMiddleTitle d;

    public awx(DsMenuCell dsMenuCell, DsCellRightCounter dsCellRightCounter, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f1595a = dsMenuCell;
        this.b = dsCellRightCounter;
        this.c = dsCellLeftIcon;
        this.d = dsCellMiddleTitle;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1595a;
    }
}
