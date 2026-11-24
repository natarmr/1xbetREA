package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes5.dex */
public final class ezq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f8682a;
    public final ComposeView b;

    public ezq(ComposeView composeView, ComposeView composeView2) {
        this.f8682a = composeView;
        this.b = composeView2;
    }

    public static ezq a(View view) {
        ComposeView composeView = (ComposeView) view;
        return new ezq(composeView, composeView);
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f8682a;
    }
}
