package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.password_requirement.DsPasswordRequirement;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class r4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f29850a;
    public final DsBottomBar b;
    public final DsTextField c;
    public final DsNavigationBarBasic d;
    public final DsTextField e;
    public final DsPasswordRequirement f;
    public final FrameLayout g;

    public r4r(FrameLayout frameLayout, ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DsPasswordRequirement dsPasswordRequirement, DsTextField dsTextField, DsTextField dsTextField2, DsNavigationBarBasic dsNavigationBarBasic) {
        this.f29850a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dsTextField;
        this.d = dsNavigationBarBasic;
        this.e = dsTextField2;
        this.f = dsPasswordRequirement;
        this.g = frameLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f29850a;
    }
}
