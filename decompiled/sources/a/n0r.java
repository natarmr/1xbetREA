package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: classes5.dex */
public final class n0r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f22713a;
    public final ComposeView b;

    public n0r(LinearLayout linearLayout, ComposeView composeView) {
        this.f22713a = linearLayout;
        this.b = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f22713a;
    }
}
