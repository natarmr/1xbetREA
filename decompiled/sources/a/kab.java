package a;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes6.dex */
public final class kab extends q4 {
    public final k5 f;
    public final boolean g;
    public int h;

    public kab(Context context, k5 k5Var, boolean z) {
        super(context, iun.f15405a);
        this.f = k5Var;
        this.g = z;
    }

    @Override // a.q4, a.yge0
    public final int f(int i) {
        return this.f.b(i, this.h);
    }

    @Override // a.q4, a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        w5 w5Var = (w5) xhe0Var;
        y8b y8bVar = (y8b) A(i);
        if (y8bVar != null) {
            if (this.g) {
                q4.z(this.h, w5Var);
            }
            this.f.j(w5Var, y8bVar);
        }
    }

    @Override // a.q4, a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        return this.f.m(viewGroup, i);
    }

    @Override // a.yge0
    public final boolean r(xhe0 xhe0Var) {
        return false;
    }

    @Override // a.yge0
    public final void u(xhe0 xhe0Var) {
        w5 w5Var = (w5) xhe0Var;
        w5Var.getClass();
        w5Var.t();
    }
}
