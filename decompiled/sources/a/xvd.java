package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes3.dex */
public final class xvd implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f41553a;

    public xvd(ComposeView composeView) {
        this.f41553a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f41553a;
    }
}
