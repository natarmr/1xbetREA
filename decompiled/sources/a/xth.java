package a;

import android.view.View;
import org.xplatform.uikit_sport.sport_cell.DsSportCell;
import org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView;
import org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView;

/* JADX INFO: loaded from: classes4.dex */
public final class xth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSportCell f41465a;
    public final SportCellLeftView b;
    public final SportCellMiddleView c;

    public xth(DsSportCell dsSportCell, SportCellLeftView sportCellLeftView, SportCellMiddleView sportCellMiddleView) {
        this.f41465a = dsSportCell;
        this.b = sportCellLeftView;
        this.c = sportCellMiddleView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f41465a;
    }
}
