package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes3.dex */
public final class bs6 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f3113a;
    public final ComposeView b;

    public bs6(FrameLayout frameLayout, ComposeView composeView) {
        this.f3113a = frameLayout;
        this.b = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3113a;
    }
}
