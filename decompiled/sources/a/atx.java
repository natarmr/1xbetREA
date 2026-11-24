package a;

import android.view.View;
import org.xplatform.ui_core.viewcomponents.views.FrozenRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class atx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrozenRecyclerView f1453a;
    public final FrozenRecyclerView b;

    public atx(FrozenRecyclerView frozenRecyclerView, FrozenRecyclerView frozenRecyclerView2) {
        this.f1453a = frozenRecyclerView;
        this.b = frozenRecyclerView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f1453a;
    }
}
