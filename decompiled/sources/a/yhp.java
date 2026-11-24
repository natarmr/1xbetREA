package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class yhp implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f42648a;
    public final ComposeView b;

    public yhp(FrameLayout frameLayout, ComposeView composeView) {
        this.f42648a = frameLayout;
        this.b = composeView;
    }

    public static yhp a(View view) {
        ComposeView composeView = (ComposeView) yum0.f(view, R.id.composeView);
        if (composeView != null) {
            return new yhp((FrameLayout) view, composeView);
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.composeView)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f42648a;
    }
}
