package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class jsx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f17074a;
    public final ComposeView b;

    public jsx(FrameLayout frameLayout, ComposeView composeView) {
        this.f17074a = frameLayout;
        this.b = composeView;
    }

    public static jsx a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.item_call_item, viewGroup, false);
        ComposeView composeView = (ComposeView) yum0.f(viewInflate, R.id.composeView);
        if (composeView != null) {
            return new jsx((FrameLayout) viewInflate, composeView);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.composeView)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f17074a;
    }
}
