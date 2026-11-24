package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes2.dex */
public final class i51 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f14170a;
    public final ComposeView b;

    public i51(ComposeView composeView, ComposeView composeView2) {
        this.f14170a = composeView;
        this.b = composeView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f14170a;
    }
}
