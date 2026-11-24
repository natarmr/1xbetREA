package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes2.dex */
public final class nxq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f24294a;
    public final ComposeView b;

    public nxq(ComposeView composeView, ComposeView composeView2) {
        this.f24294a = composeView;
        this.b = composeView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24294a;
    }
}
