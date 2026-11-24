package a;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yiu0 extends yke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ziu0 f42714a;
    public int b = 0;

    public yiu0() {
    }

    @Override // a.yke
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        y(coordinatorLayout, view, i);
        ziu0 ziu0Var = this.f42714a;
        if (ziu0Var == null) {
            ziu0Var = new ziu0(view);
            this.f42714a = ziu0Var;
        }
        View view2 = ziu0Var.f44455a;
        ziu0Var.b = view2.getTop();
        ziu0Var.c = view2.getLeft();
        this.f42714a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.f42714a.b(i2);
        this.b = 0;
        return true;
    }

    public final int x() {
        ziu0 ziu0Var = this.f42714a;
        if (ziu0Var != null) {
            return ziu0Var.d;
        }
        return 0;
    }

    public void y(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.r(view, i);
    }

    public yiu0(int i) {
    }
}
