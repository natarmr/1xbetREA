package a;

import android.view.View;
import org.xplatform.uikit_sport.sport_cell.DsSportCell;
import org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView;
import org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView;
import org.xplatform.uikit_sport.sport_cell.right.SportCellRightView;

/* JADX INFO: loaded from: classes4.dex */
public final class z3b0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSportCell f43711a;
    public final SportCellLeftView b;
    public final SportCellMiddleView c;
    public final SportCellRightView d;

    public z3b0(DsSportCell dsSportCell, SportCellLeftView sportCellLeftView, SportCellMiddleView sportCellMiddleView, SportCellRightView sportCellRightView) {
        this.f43711a = dsSportCell;
        this.b = sportCellLeftView;
        this.c = sportCellMiddleView;
        this.d = sportCellRightView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43711a;
    }
}
