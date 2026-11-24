package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes3.dex */
public final class dyq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f6906a;

    public dyq(ComposeView composeView) {
        this.f6906a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f6906a;
    }
}
