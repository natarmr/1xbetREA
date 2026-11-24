package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes6.dex */
public final class aid implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f919a;
    public final ComposeView b;

    public aid(ComposeView composeView, ComposeView composeView2) {
        this.f919a = composeView;
        this.b = composeView2;
    }

    public static aid a(View view) {
        if (view != null) {
            ComposeView composeView = (ComposeView) view;
            return new aid(composeView, composeView);
        }
        hny.u("rootView");
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f919a;
    }
}
