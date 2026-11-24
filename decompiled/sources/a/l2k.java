package a;

import android.view.View;
import android.widget.LinearLayout;
import org.xplatform.uikit.components.views.OptimizedScrollRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class l2k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f19313a;
    public final OptimizedScrollRecyclerView b;

    public l2k(LinearLayout linearLayout, OptimizedScrollRecyclerView optimizedScrollRecyclerView) {
        this.f19313a = linearLayout;
        this.b = optimizedScrollRecyclerView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f19313a;
    }
}
