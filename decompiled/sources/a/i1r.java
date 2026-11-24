package a;

import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.uikit.components.tabbar.DsTabBar;

/* JADX INFO: loaded from: classes3.dex */
public final class i1r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f14013a;
    public final DsTabBar b;

    public i1r(FrameLayout frameLayout, DsTabBar dsTabBar) {
        this.f14013a = frameLayout;
        this.b = dsTabBar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f14013a;
    }
}
