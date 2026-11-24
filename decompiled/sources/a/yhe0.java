package a;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yhe0 extends p6 {
    public final zhe0 d;
    public final WeakHashMap e = new WeakHashMap();

    public yhe0(zhe0 zhe0Var) {
        this.d = zhe0Var;
    }

    @Override // a.p6
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        p6 p6Var = (p6) this.e.get(view);
        return p6Var != null ? p6Var.a(view, accessibilityEvent) : this.f26429a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // a.p6
    public final ok50 b(View view) {
        p6 p6Var = (p6) this.e.get(view);
        return p6Var != null ? p6Var.b(view) : super.b(view);
    }

    @Override // a.p6
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        p6 p6Var = (p6) this.e.get(view);
        if (p6Var != null) {
            p6Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // a.p6
    public final void d(View view, k7 k7Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = k7Var.f17795a;
        zhe0 zhe0Var = this.d;
        RecyclerView recyclerView = zhe0Var.d;
        RecyclerView recyclerView2 = zhe0Var.d;
        boolean zA0 = recyclerView.a0();
        View.AccessibilityDelegate accessibilityDelegate = this.f26429a;
        if (zA0 || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().l0(view, k7Var);
        p6 p6Var = (p6) this.e.get(view);
        if (p6Var != null) {
            p6Var.d(view, k7Var);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // a.p6
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        p6 p6Var = (p6) this.e.get(view);
        if (p6Var != null) {
            p6Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // a.p6
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        p6 p6Var = (p6) this.e.get(viewGroup);
        return p6Var != null ? p6Var.f(viewGroup, view, accessibilityEvent) : this.f26429a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // a.p6
    public final boolean g(View view, int i, Bundle bundle) {
        zhe0 zhe0Var = this.d;
        RecyclerView recyclerView = zhe0Var.d;
        RecyclerView recyclerView2 = zhe0Var.d;
        if (recyclerView.a0() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        p6 p6Var = (p6) this.e.get(view);
        if (p6Var != null) {
            if (p6Var.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        msj msjVar = recyclerView2.getLayoutManager().b.c;
        return false;
    }

    @Override // a.p6
    public final void h(View view, int i) {
        p6 p6Var = (p6) this.e.get(view);
        if (p6Var != null) {
            p6Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // a.p6
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        p6 p6Var = (p6) this.e.get(view);
        if (p6Var != null) {
            p6Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
