package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.password_requirement.DsPasswordRequirement;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class qzq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f29591a;
    public final DsBottomBar b;
    public final DsNavigationBarBasic c;
    public final DsPasswordRequirement d;
    public final FrameLayout e;
    public final DsTextField f;
    public final DsTextField g;

    public qzq(FrameLayout frameLayout, ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DsPasswordRequirement dsPasswordRequirement, DsTextField dsTextField, DsTextField dsTextField2, DsNavigationBarBasic dsNavigationBarBasic) {
        this.f29591a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dsNavigationBarBasic;
        this.d = dsPasswordRequirement;
        this.e = frameLayout;
        this.f = dsTextField;
        this.g = dsTextField2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f29591a;
    }
}
