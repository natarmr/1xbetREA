package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes6.dex */
public final class nvr0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f24201a;

    public nvr0(ComposeView composeView) {
        this.f24201a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24201a;
    }
}
