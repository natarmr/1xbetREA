package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class iu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f15375a;
    public final ComposeView b;

    public iu0(FrameLayout frameLayout, ComposeView composeView) {
        this.f15375a = frameLayout;
        this.b = composeView;
    }

    public static iu0 a(View view) {
        ComposeView composeView = (ComposeView) yum0.f(view, R.id.composeView);
        if (composeView != null) {
            return new iu0((FrameLayout) view, composeView);
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.composeView)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f15375a;
    }
}
