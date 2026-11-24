package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes6.dex */
public final class w5q implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f38595a;
    public final ComposeView b;

    public w5q(FrameLayout frameLayout, ComposeView composeView) {
        this.f38595a = frameLayout;
        this.b = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38595a;
    }
}
