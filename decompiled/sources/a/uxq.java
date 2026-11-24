package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes3.dex */
public final class uxq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f36453a;

    public uxq(ComposeView composeView) {
        this.f36453a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36453a;
    }
}
