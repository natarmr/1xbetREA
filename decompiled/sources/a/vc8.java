package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes3.dex */
public final class vc8 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f37174a;

    public vc8(ComposeView composeView) {
        this.f37174a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f37174a;
    }
}
