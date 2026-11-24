package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes3.dex */
public final class g6r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f10781a;

    public g6r(ComposeView composeView) {
        this.f10781a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f10781a;
    }
}
