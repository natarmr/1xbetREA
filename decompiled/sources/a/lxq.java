package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
public final class lxq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f20827a;
    public final DsBottomBar b;
    public final DsSettingsCell c;
    public final DsCellMiddleTitle d;
    public final DsSettingsCell e;
    public final ComposeView f;
    public final DsNavigationBar g;
    public final FrameLayout h;
    public final View i;

    public lxq(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DsSettingsCell dsSettingsCell, DsCellMiddleTitle dsCellMiddleTitle, DsSettingsCell dsSettingsCell2, ComposeView composeView, DsNavigationBar dsNavigationBar, FrameLayout frameLayout, View view) {
        this.f20827a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dsSettingsCell;
        this.d = dsCellMiddleTitle;
        this.e = dsSettingsCell2;
        this.f = composeView;
        this.g = dsNavigationBar;
        this.h = frameLayout;
        this.i = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f20827a;
    }
}
