package a;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class piv0 extends oiv0 {
    public pfx t;
    public pfx u;
    public pfx v;

    public piv0(xiv0 xiv0Var, WindowInsets windowInsets) {
        super(xiv0Var, windowInsets);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // a.uiv0
    public pfx k() {
        pfx pfxVar = this.u;
        if (pfxVar != null) {
            return pfxVar;
        }
        pfx pfxVarD = pfx.d(this.c.getMandatorySystemGestureInsets());
        this.u = pfxVarD;
        return pfxVarD;
    }

    @Override // a.uiv0
    public pfx m() {
        pfx pfxVar = this.t;
        if (pfxVar != null) {
            return pfxVar;
        }
        pfx pfxVarD = pfx.d(this.c.getSystemGestureInsets());
        this.t = pfxVarD;
        return pfxVarD;
    }

    @Override // a.uiv0
    public pfx o() {
        pfx pfxVar = this.v;
        if (pfxVar != null) {
            return pfxVar;
        }
        pfx pfxVarD = pfx.d(this.c.getTappableElementInsets());
        this.v = pfxVarD;
        return pfxVarD;
    }

    @Override // a.miv0, a.uiv0
    public xiv0 r(int i, int i2, int i3, int i4) {
        return xiv0.h(this.c.inset(i, i2, i3, i4), null);
    }

    public piv0(xiv0 xiv0Var, piv0 piv0Var) {
        super(xiv0Var, piv0Var);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // a.niv0, a.uiv0
    public void z(pfx pfxVar) {
    }
}
