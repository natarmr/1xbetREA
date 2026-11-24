package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class c4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3739a;
    public final DsNavigationBarBasic b;
    public final ComposeView c;

    public c4r(ConstraintLayout constraintLayout, DsNavigationBarBasic dsNavigationBarBasic, ComposeView composeView) {
        this.f3739a = constraintLayout;
        this.b = dsNavigationBarBasic;
        this.c = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3739a;
    }
}
