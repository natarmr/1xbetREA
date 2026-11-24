package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes3.dex */
public final class txq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f34713a;
    public final ComposeView b;

    public txq(ComposeView composeView, ComposeView composeView2) {
        this.f34713a = composeView;
        this.b = composeView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f34713a;
    }
}
