package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import org.xplatform.ui_core.viewcomponents.loader.LoaderView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final class vyq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f38261a;
    public final LoaderView b;
    public final DsNavigationBar c;
    public final ComposeView d;
    public final ViewPager2 e;

    public vyq(ConstraintLayout constraintLayout, LoaderView loaderView, DsNavigationBar dsNavigationBar, ComposeView composeView, ViewPager2 viewPager2) {
        this.f38261a = constraintLayout;
        this.b = loaderView;
        this.c = dsNavigationBar;
        this.d = composeView;
        this.e = viewPager2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38261a;
    }
}
