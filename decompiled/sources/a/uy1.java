package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes3.dex */
public final class uy1 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f36467a;

    public uy1(ComposeView composeView) {
        this.f36467a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f36467a;
    }
}
