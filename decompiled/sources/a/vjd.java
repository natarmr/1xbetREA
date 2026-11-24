package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class vjd implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComposeView f37521a;
    public final ComposeView b;

    public vjd(ComposeView composeView, ComposeView composeView2) {
        this.f37521a = composeView;
        this.b = composeView2;
    }

    public static vjd a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.compose_item, viewGroup, false);
        if (viewInflate != null) {
            ComposeView composeView = (ComposeView) viewInflate;
            return new vjd(composeView, composeView);
        }
        hny.u("rootView");
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f37521a;
    }
}
