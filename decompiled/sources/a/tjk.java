package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes3.dex */
public final class tjk implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f34051a;
    public final DsNavigationBarBasic b;
    public final ProgressBar c;
    public final FixedWebView d;

    public tjk(FrameLayout frameLayout, DsNavigationBarBasic dsNavigationBarBasic, ProgressBar progressBar, FixedWebView fixedWebView) {
        this.f34051a = frameLayout;
        this.b = dsNavigationBarBasic;
        this.c = progressBar;
        this.d = fixedWebView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f34051a;
    }
}
