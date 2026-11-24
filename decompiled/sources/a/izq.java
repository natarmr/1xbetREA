package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class izq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f15647a;
    public final DsBottomBar b;
    public final DsSettingsCell c;
    public final DsTextField d;
    public final DsNavigationBarBasic e;
    public final FrameLayout f;
    public final View g;

    public izq(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, DsSettingsCell dsSettingsCell, DsTextField dsTextField, DsNavigationBarBasic dsNavigationBarBasic, FrameLayout frameLayout, View view) {
        this.f15647a = constraintLayout;
        this.b = dsBottomBar;
        this.c = dsSettingsCell;
        this.d = dsTextField;
        this.e = dsNavigationBarBasic;
        this.f = frameLayout;
        this.g = view;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f15647a;
    }
}
