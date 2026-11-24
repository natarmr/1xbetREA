package a;

import android.view.View;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightAccordion;

/* JADX INFO: loaded from: classes5.dex */
public final class krx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCell f18789a;
    public final DsCellRightAccordion b;
    public final DsCellLeftIcon c;
    public final DsCellMiddleTitle d;

    public krx(DsMenuCell dsMenuCell, DsCellRightAccordion dsCellRightAccordion, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle) {
        this.f18789a = dsMenuCell;
        this.b = dsCellRightAccordion;
        this.c = dsCellLeftIcon;
        this.d = dsCellMiddleTitle;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f18789a;
    }
}
