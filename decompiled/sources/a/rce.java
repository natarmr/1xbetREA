package a;

import android.view.View;
import android.widget.FrameLayout;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes2.dex */
public final class rce implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f30235a;
    public final FixedWebView b;

    public rce(FrameLayout frameLayout, FixedWebView fixedWebView) {
        this.f30235a = frameLayout;
        this.b = fixedWebView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f30235a;
    }
}
