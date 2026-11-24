package a;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class niv0 extends miv0 {
    public pfx s;

    public niv0(xiv0 xiv0Var, niv0 niv0Var) {
        super(xiv0Var, niv0Var);
        this.s = null;
        this.s = niv0Var.s;
    }

    @Override // a.uiv0
    public xiv0 b() {
        return xiv0.h(this.c.consumeStableInsets(), null);
    }

    @Override // a.uiv0
    public xiv0 c() {
        return xiv0.h(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // a.uiv0
    public final pfx l() {
        pfx pfxVar = this.s;
        if (pfxVar != null) {
            return pfxVar;
        }
        WindowInsets windowInsets = this.c;
        pfx pfxVarC = pfx.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.s = pfxVarC;
        return pfxVarC;
    }

    @Override // a.uiv0
    public boolean s() {
        return this.c.isConsumed();
    }

    @Override // a.uiv0
    public void z(pfx pfxVar) {
        this.s = pfxVar;
    }

    public niv0(xiv0 xiv0Var, WindowInsets windowInsets) {
        super(xiv0Var, windowInsets);
        this.s = null;
    }
}
