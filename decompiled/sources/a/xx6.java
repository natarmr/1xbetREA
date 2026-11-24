package a;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class xx6 extends syx {
    public final u530 e;
    public int f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx6(u530 u530Var) {
        super((byte) 0);
        u530Var.getClass();
        this.e = u530Var;
        this.f = -1;
        this.g = -1;
    }

    @Override // a.syx
    public final int n(RecyclerView recyclerView, xhe0 xhe0Var) {
        recyclerView.getClass();
        xhe0Var.getClass();
        cp cpVar = xhe0Var instanceof cp ? (cp) xhe0Var : null;
        if (cpVar != null) {
            Object objU = cpVar.u();
            hw20 hw20Var = objU instanceof hw20 ? (hw20) objU : null;
            if (hw20Var != null && hw20Var.c == dw20.f6775a) {
                return syx.q(3);
            }
        }
        return syx.q(0);
    }

    @Override // a.syx
    public final boolean p() {
        return true;
    }

    @Override // a.syx
    public final boolean s(RecyclerView recyclerView, xhe0 xhe0Var, xhe0 xhe0Var2) {
        recyclerView.getClass();
        xhe0Var.getClass();
        int iD = xhe0Var.d();
        int iD2 = xhe0Var2.d();
        u530 u530Var = this.e;
        yz3 yz3Var = u530Var.e;
        Object obj = yz3Var.f.get(iD2);
        hw20 hw20Var = obj instanceof hw20 ? (hw20) obj : null;
        Object obj2 = yz3Var.f.get(iD);
        hw20 hw20Var2 = obj2 instanceof hw20 ? (hw20) obj2 : null;
        dw20 dw20Var = hw20Var != null ? hw20Var.c : null;
        dw20 dw20Var2 = dw20.f6775a;
        if (dw20Var == dw20Var2) {
            if ((hw20Var2 != null ? hw20Var2.c : null) == dw20Var2) {
                u530Var.f.invoke(Integer.valueOf(iD), Integer.valueOf(iD2));
                u530Var.i(iD, iD2);
            }
        }
        if (this.f == -1) {
            this.f = xhe0Var2.d();
        }
        this.g = xhe0Var.c();
        return true;
    }

    @Override // a.syx
    public final void t(xhe0 xhe0Var, int i) {
        int i2;
        if (i != 0 || (i2 = this.f) == -1 || i2 == this.g) {
            return;
        }
        this.e.g.invoke();
        this.f = -1;
    }

    @Override // a.syx
    public final void u(xhe0 xhe0Var) {
        xhe0Var.getClass();
    }
}
