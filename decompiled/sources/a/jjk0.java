package a;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes5.dex */
public final class jjk0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f16623a;
    public final ProgressBar b;
    public final MaterialToolbar c;
    public final FixedWebView d;

    public jjk0(ConstraintLayout constraintLayout, ProgressBar progressBar, MaterialToolbar materialToolbar, FixedWebView fixedWebView) {
        this.f16623a = constraintLayout;
        this.b = progressBar;
        this.c = materialToolbar;
        this.d = fixedWebView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f16623a;
    }
}
