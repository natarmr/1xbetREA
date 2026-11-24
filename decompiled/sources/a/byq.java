package a;

import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.uikit.components.tabbar.DsTabBar;

/* JADX INFO: loaded from: classes3.dex */
public final class byq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f3431a;
    public final DsTabBar b;

    public byq(FrameLayout frameLayout, DsTabBar dsTabBar) {
        this.f3431a = frameLayout;
        this.b = dsTabBar;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3431a;
    }
}
