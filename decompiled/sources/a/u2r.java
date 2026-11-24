package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes3.dex */
public final class u2r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f34960a;

    public u2r(ComposeView composeView) {
        this.f34960a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f34960a;
    }
}
