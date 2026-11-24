package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes2.dex */
public final class v0r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f36594a;
    public final ComposeView b;

    public v0r(ComposeView composeView, ComposeView composeView2) {
        this.f36594a = composeView;
        this.b = composeView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36594a;
    }
}
