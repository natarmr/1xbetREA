package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes6.dex */
public final class d6r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f5564a;

    public d6r(ComposeView composeView) {
        this.f5564a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f5564a;
    }
}
