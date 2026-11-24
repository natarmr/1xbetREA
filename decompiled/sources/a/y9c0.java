package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes4.dex */
public final class y9c0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f42238a;

    public y9c0(ComposeView composeView) {
        this.f42238a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f42238a;
    }
}
