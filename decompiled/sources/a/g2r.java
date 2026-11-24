package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
public final class g2r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f10574a;
    public final DsNavigationBar b;
    public final FragmentContainerView c;

    public g2r(ConstraintLayout constraintLayout, DsNavigationBar dsNavigationBar, FragmentContainerView fragmentContainerView) {
        this.f10574a = constraintLayout;
        this.b = dsNavigationBar;
        this.c = fragmentContainerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10574a;
    }
}
