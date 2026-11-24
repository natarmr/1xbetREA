package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes5.dex */
public final class b4r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f1972a;

    public b4r(ComposeView composeView) {
        this.f1972a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1972a;
    }
}
