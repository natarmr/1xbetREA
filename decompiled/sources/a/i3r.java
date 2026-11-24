package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final class i3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f14110a;
    public final DsBottomBar b;
    public final DsCellRightSwitch c;
    public final DsNavigationBar d;
    public final DsTextField e;
    public final DsTextField f;
    public final DsTextField g;
    public final DsTextField h;

    public i3r(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DsCellRightSwitch dsCellRightSwitch, DsNavigationBar dsNavigationBar, DsTextField dsTextField, DsTextField dsTextField2, DsTextField dsTextField3, DsTextField dsTextField4) {
        this.f14110a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dsCellRightSwitch;
        this.d = dsNavigationBar;
        this.e = dsTextField;
        this.f = dsTextField2;
        this.g = dsTextField3;
        this.h = dsTextField4;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f14110a;
    }
}
