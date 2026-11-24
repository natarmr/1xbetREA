package a;

import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.uikit.components.tabbar.DsTabBar;

/* JADX INFO: loaded from: classes4.dex */
public final class j0r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f15694a;
    public final DsTabBar b;

    public j0r(FrameLayout frameLayout, DsTabBar dsTabBar) {
        this.f15694a = frameLayout;
        this.b = dsTabBar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f15694a;
    }
}
