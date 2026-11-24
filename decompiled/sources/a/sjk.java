package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes3.dex */
public final class sjk implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f32307a;
    public final ProgressBar b;
    public final MaterialToolbar c;
    public final FixedWebView d;

    public sjk(FrameLayout frameLayout, ProgressBar progressBar, MaterialToolbar materialToolbar, FixedWebView fixedWebView) {
        this.f32307a = frameLayout;
        this.b = progressBar;
        this.c = materialToolbar;
        this.d = fixedWebView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f32307a;
    }
}
