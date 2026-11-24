package a;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class zhe0 extends p6 {
    public final RecyclerView d;
    public final yhe0 e;

    public zhe0(RecyclerView recyclerView) {
        this.d = recyclerView;
        yhe0 yhe0Var = this.e;
        if (yhe0Var != null) {
            this.e = yhe0Var;
        } else {
            this.e = new yhe0(this);
        }
    }

    @Override // a.p6
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.a0()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().i0(accessibilityEvent);
        }
    }

    @Override // a.p6
    public final void d(View view, k7 k7Var) {
        this.f26429a.onInitializeAccessibilityNodeInfo(view, k7Var.f17795a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.a0() || recyclerView.getLayoutManager() == null) {
            return;
        }
        androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.j0(recyclerView2.c, recyclerView2.H1, k7Var);
    }

    @Override // a.p6
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.a0() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().x0(i, bundle);
    }
}
