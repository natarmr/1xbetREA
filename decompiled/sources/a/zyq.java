package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class zyq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f45217a;
    public final DsButton b;
    public final DsBottomBar c;
    public final DsNavigationBarBasic d;
    public final FrameLayout e;
    public final DsTextField f;

    public zyq(ConstraintLayout constraintLayout, DsButton dsButton, DsBottomBar dsBottomBar, DsNavigationBarBasic dsNavigationBarBasic, FrameLayout frameLayout, DsTextField dsTextField) {
        this.f45217a = constraintLayout;
        this.b = dsButton;
        this.c = dsBottomBar;
        this.d = dsNavigationBarBasic;
        this.e = frameLayout;
        this.f = dsTextField;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f45217a;
    }
}
