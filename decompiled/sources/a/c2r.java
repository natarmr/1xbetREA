package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes5.dex */
public final class c2r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f3638a;

    public c2r(ComposeView composeView) {
        this.f3638a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3638a;
    }
}
