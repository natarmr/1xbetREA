package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes5.dex */
public final class nyq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f24341a;

    public nyq(ComposeView composeView) {
        this.f24341a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24341a;
    }
}
