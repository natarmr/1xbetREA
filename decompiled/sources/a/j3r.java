package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes3.dex */
public final class j3r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f15850a;

    public j3r(ComposeView composeView) {
        this.f15850a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f15850a;
    }
}
