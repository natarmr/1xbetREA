package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes4.dex */
public final class tyq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f34768a;

    public tyq(ComposeView composeView) {
        this.f34768a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f34768a;
    }
}
