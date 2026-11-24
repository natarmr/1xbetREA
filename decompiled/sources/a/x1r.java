package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes6.dex */
public final class x1r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f40133a;

    public x1r(ComposeView composeView) {
        this.f40133a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f40133a;
    }
}
