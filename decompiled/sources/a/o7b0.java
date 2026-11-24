package a;

import android.view.View;
import org.xplatform.uikit_sport.sport_cell.DsSportCell;
import org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView;
import org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView;
import org.xplatform.uikit_sport.sport_cell.right.SportCellRightView;

/* JADX INFO: loaded from: classes4.dex */
public final class o7b0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsSportCell f24779a;
    public final SportCellLeftView b;
    public final SportCellMiddleView c;
    public final SportCellRightView d;

    public o7b0(DsSportCell dsSportCell, SportCellLeftView sportCellLeftView, SportCellMiddleView sportCellMiddleView, SportCellRightView sportCellRightView) {
        this.f24779a = dsSportCell;
        this.b = sportCellLeftView;
        this.c = sportCellMiddleView;
        this.d = sportCellRightView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24779a;
    }
}
