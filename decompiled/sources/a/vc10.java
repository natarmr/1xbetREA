package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes2.dex */
public final class vc10 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f37167a;
    public final ComposeView b;

    public vc10(FrameLayout frameLayout, ComposeView composeView) {
        this.f37167a = frameLayout;
        this.b = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f37167a;
    }
}
