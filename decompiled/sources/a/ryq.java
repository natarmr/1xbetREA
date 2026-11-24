package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes3.dex */
public final class ryq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f31325a;

    public ryq(ComposeView composeView) {
        this.f31325a = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f31325a;
    }
}
