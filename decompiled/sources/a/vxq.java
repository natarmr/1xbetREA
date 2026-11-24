package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes3.dex */
public final class vxq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f38213a;

    public vxq(ComposeView composeView) {
        this.f38213a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38213a;
    }
}
