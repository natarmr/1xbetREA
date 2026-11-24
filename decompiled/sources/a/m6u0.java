package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.password_requirement.DsBulletList;
import org.xplatform.uikit_sport.sport_cell.middle.SportCellMiddleView;

/* JADX INFO: loaded from: classes5.dex */
public final class m6u0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f21288a;
    public final DsBulletList b;
    public final SportCellMiddleView c;
    public final View d;

    public m6u0(ConstraintLayout constraintLayout, DsBulletList dsBulletList, SportCellMiddleView sportCellMiddleView, View view) {
        this.f21288a = constraintLayout;
        this.b = dsBulletList;
        this.c = sportCellMiddleView;
        this.d = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f21288a;
    }
}
