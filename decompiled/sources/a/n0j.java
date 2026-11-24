package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes2.dex */
public final class n0j implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f22699a;
    public final ComposeView b;

    public n0j(ComposeView composeView, ComposeView composeView2) {
        this.f22699a = composeView;
        this.b = composeView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f22699a;
    }
}
