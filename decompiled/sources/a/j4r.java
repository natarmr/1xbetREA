package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final class j4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f15898a;
    public final DsBottomBar b;
    public final ConstraintLayout c;
    public final DsNavigationBarBasic d;
    public final FrameLayout e;
    public final ComposeView f;
    public final ViewPager g;

    public j4r(ConstraintLayout constraintLayout, DsBottomBar dsBottomBar, ConstraintLayout constraintLayout2, DsNavigationBarBasic dsNavigationBarBasic, FrameLayout frameLayout, ComposeView composeView, ViewPager viewPager) {
        this.f15898a = constraintLayout;
        this.b = dsBottomBar;
        this.c = constraintLayout2;
        this.d = dsNavigationBarBasic;
        this.e = frameLayout;
        this.f = composeView;
        this.g = viewPager;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f15898a;
    }
}
