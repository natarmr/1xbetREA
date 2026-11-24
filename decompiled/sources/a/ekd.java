package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes5.dex */
public final class ekd implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f7946a;
    public final ComposeView b;

    public ekd(ComposeView composeView, ComposeView composeView2) {
        this.f7946a = composeView;
        this.b = composeView2;
    }

    public static ekd a(View view) {
        ComposeView composeView = (ComposeView) view;
        return new ekd(composeView, composeView);
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f7946a;
    }
}
