package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes5.dex */
public final class myq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f22614a;
    public final ComposeView b;

    public myq(ComposeView composeView, ComposeView composeView2) {
        this.f22614a = composeView;
        this.b = composeView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f22614a;
    }
}
