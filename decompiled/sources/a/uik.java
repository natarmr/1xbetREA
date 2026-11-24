package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes5.dex */
public final class uik implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f35734a;

    public uik(ComposeView composeView) {
        this.f35734a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f35734a;
    }
}
