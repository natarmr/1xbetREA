package a;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class wx6 extends syx {
    public final t530 e;
    public int f;
    public int g;
    public xhe0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx6(t530 t530Var) {
        super((byte) 0);
        t530Var.getClass();
        this.e = t530Var;
        this.f = -1;
        this.g = -1;
    }

    @Override // a.syx
    public final boolean c(RecyclerView recyclerView, xhe0 xhe0Var, xhe0 xhe0Var2) {
        recyclerView.getClass();
        xhe0Var.getClass();
        xhe0Var2.getClass();
        cp cpVar = xhe0Var2 instanceof cp ? (cp) xhe0Var2 : null;
        Object objU = cpVar != null ? cpVar.u() : null;
        gw20 gw20Var = objU instanceof gw20 ? (gw20) objU : null;
        return (gw20Var != null ? gw20Var.c : null) == cw20.f5060a;
    }

    @Override // a.syx
    public final int n(RecyclerView recyclerView, xhe0 xhe0Var) {
        recyclerView.getClass();
        xhe0Var.getClass();
        cp cpVar = xhe0Var instanceof cp ? (cp) xhe0Var : null;
        if (cpVar != null) {
            Object objU = cpVar.u();
            gw20 gw20Var = objU instanceof gw20 ? (gw20) objU : null;
            if (gw20Var != null && gw20Var.c == cw20.f5060a) {
                return syx.q(3);
            }
        }
        return syx.q(0);
    }

    @Override // a.syx
    public final int o(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        recyclerView.getClass();
        xhe0 xhe0Var = this.h;
        int iD = xhe0Var != null ? xhe0Var.d() : -1;
        if (iD != -1 && i2 != 0) {
            int i4 = iD + (i2 > 0 ? 1 : -1);
            yz3 yz3Var = this.e.e;
            if (i4 < 0 || i4 >= yz3Var.f.size()) {
                return 0;
            }
            Object obj = yz3Var.f.get(i4);
            gw20 gw20Var = obj instanceof gw20 ? (gw20) obj : null;
            if ((gw20Var != null ? gw20Var.c : null) != cw20.f5060a) {
                return 0;
            }
        }
        return super.o(recyclerView, i, i2, i3, j);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    @Override // a.syx
    public final boolean s(RecyclerView recyclerView, xhe0 xhe0Var, xhe0 xhe0Var2) {
        boolean z;
        recyclerView.getClass();
        xhe0Var.getClass();
        int iD = xhe0Var.d();
        int iD2 = xhe0Var2.d();
        t530 t530Var = this.e;
        yz3 yz3Var = t530Var.e;
        Object obj = yz3Var.f.get(iD2);
        gw20 gw20Var = obj instanceof gw20 ? (gw20) obj : null;
        Object obj2 = yz3Var.f.get(iD);
        gw20 gw20Var2 = obj2 instanceof gw20 ? (gw20) obj2 : null;
        cw20 cw20Var = gw20Var != null ? gw20Var.c : null;
        cw20 cw20Var2 = cw20.f5060a;
        if (cw20Var != cw20Var2) {
            z = false;
        } else {
            if ((gw20Var2 != null ? gw20Var2.c : null) == cw20Var2) {
                t530Var.f.invoke(Integer.valueOf(iD), Integer.valueOf(iD2));
                t530Var.i(iD, iD2);
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            if (this.f == -1) {
                this.f = xhe0Var.d();
            }
            this.g = xhe0Var2.d();
        }
        return z;
    }

    @Override // a.syx
    public final void t(xhe0 xhe0Var, int i) {
        if (i != 0) {
            if (i != 2) {
                return;
            }
            this.h = xhe0Var;
            return;
        }
        int i2 = this.f;
        if (i2 != -1 && i2 != this.g) {
            this.e.g.invoke();
        }
        this.f = -1;
        this.g = -1;
        this.h = null;
    }
}
