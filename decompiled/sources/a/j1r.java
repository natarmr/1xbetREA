package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;
import org.xplatform.uikit.components.authorization_buttons.DsAuthorizationButtons;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
public final class j1r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f15749a;
    public final DsAccountSelection b;
    public final DsAuthorizationButtons c;
    public final DsNavigationBar d;
    public final FrameLayout e;
    public final d5e0 f;
    public final DsNavigationBar g;

    public j1r(ConstraintLayout constraintLayout, DsAccountSelection dsAccountSelection, DsAuthorizationButtons dsAuthorizationButtons, DsNavigationBar dsNavigationBar, FrameLayout frameLayout, d5e0 d5e0Var, DsNavigationBar dsNavigationBar2) {
        this.f15749a = constraintLayout;
        this.b = dsAccountSelection;
        this.c = dsAuthorizationButtons;
        this.d = dsNavigationBar;
        this.e = frameLayout;
        this.f = d5e0Var;
        this.g = dsNavigationBar2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f15749a;
    }
}
