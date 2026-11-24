package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class d3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f5417a;
    public final ComposeView b;

    public d3r(FrameLayout frameLayout, ComposeView composeView) {
        this.f5417a = frameLayout;
        this.b = composeView;
    }

    public static d3r a(View view) {
        ComposeView composeView = (ComposeView) yum0.f(view, R.id.composeView);
        if (composeView != null) {
            return new d3r((FrameLayout) view, composeView);
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.composeView)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f5417a;
    }
}
