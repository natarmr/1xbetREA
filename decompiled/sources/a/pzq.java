package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;
import org.xplatform.uikit.components.authorization_buttons.DsAuthorizationButtons;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes.dex */
public final class pzq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f27859a;
    public final DsAccountSelection b;
    public final DsAuthorizationButtons c;
    public final CoordinatorLayout d;
    public final ComposeView e;
    public final DsMenuCell f;
    public final DsMenuCell g;
    public final ComposeView h;
    public final FrameLayout i;
    public final FrameLayout j;
    public final DsMenuCell k;
    public final DsNavigationBar l;
    public final NestedScrollView m;
    public final DsMenuCell n;
    public final DsCellLeftIcon o;
    public final DsCellMiddleTitle p;
    public final RecyclerView q;
    public final DsMenuCell r;

    public pzq(ConstraintLayout constraintLayout, DsAccountSelection dsAccountSelection, DsAuthorizationButtons dsAuthorizationButtons, CoordinatorLayout coordinatorLayout, ComposeView composeView, DsMenuCell dsMenuCell, DsMenuCell dsMenuCell2, ComposeView composeView2, FrameLayout frameLayout, FrameLayout frameLayout2, DsMenuCell dsMenuCell3, DsNavigationBar dsNavigationBar, NestedScrollView nestedScrollView, DsMenuCell dsMenuCell4, DsCellLeftIcon dsCellLeftIcon, DsCellMiddleTitle dsCellMiddleTitle, RecyclerView recyclerView, DsMenuCell dsMenuCell5) {
        this.f27859a = constraintLayout;
        this.b = dsAccountSelection;
        this.c = dsAuthorizationButtons;
        this.d = coordinatorLayout;
        this.e = composeView;
        this.f = dsMenuCell;
        this.g = dsMenuCell2;
        this.h = composeView2;
        this.i = frameLayout;
        this.j = frameLayout2;
        this.k = dsMenuCell3;
        this.l = dsNavigationBar;
        this.m = nestedScrollView;
        this.n = dsMenuCell4;
        this.o = dsCellLeftIcon;
        this.p = dsCellMiddleTitle;
        this.q = recyclerView;
        this.r = dsMenuCell5;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f27859a;
    }
}
