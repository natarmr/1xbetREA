package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes6.dex */
public final class e6r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f7300a;

    public e6r(ComposeView composeView) {
        this.f7300a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f7300a;
    }
}
