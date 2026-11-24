package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes4.dex */
public final class uyq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f36504a;

    public uyq(ComposeView composeView) {
        this.f36504a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36504a;
    }
}
