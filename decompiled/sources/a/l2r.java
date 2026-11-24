package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes4.dex */
public final class l2r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f19325a;
    public final ComposeView b;

    public l2r(ComposeView composeView, ComposeView composeView2) {
        this.f19325a = composeView;
        this.b = composeView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f19325a;
    }
}
