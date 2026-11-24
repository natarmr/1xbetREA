package a;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class w9m0 extends syx {
    public final /* synthetic */ byte e = 1;
    public int f;
    public int g;
    public final qv5 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9m0(jev0 jev0Var) {
        super((byte) 0);
        jev0Var.getClass();
        this.h = jev0Var;
        this.f = -1;
        this.g = -1;
    }

    @Override // a.syx
    public final int n(RecyclerView recyclerView, xhe0 xhe0Var) {
        byte b = this.e;
        recyclerView.getClass();
        xhe0Var.getClass();
        switch (b) {
            case 0:
                cp cpVar = xhe0Var instanceof cp ? (cp) xhe0Var : null;
                if (cpVar != null) {
                    Object objU = cpVar.u();
                    if ((objU instanceof iam0 ? (iam0) objU : null) != null) {
                        return syx.q(3);
                    }
                }
                return syx.q(0);
            default:
                cp cpVar2 = xhe0Var instanceof cp ? (cp) xhe0Var : null;
                if (cpVar2 != null) {
                    Object objU2 = cpVar2.u();
                    if ((objU2 instanceof lev0 ? (lev0) objU2 : null) != null) {
                        return syx.q(3);
                    }
                }
                return syx.q(0);
        }
    }

    @Override // a.syx
    public final boolean p() {
        switch (this.e) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    @Override // a.syx
    public final boolean s(RecyclerView recyclerView, xhe0 xhe0Var, xhe0 xhe0Var2) {
        int iNextIndex;
        byte b = this.e;
        int i = 0;
        qv5 qv5Var = this.h;
        recyclerView.getClass();
        xhe0Var.getClass();
        switch (b) {
            case 0:
                o9m0 o9m0Var = (o9m0) qv5Var;
                int iD = xhe0Var.d();
                int iD2 = xhe0Var2.d();
                List list = o9m0Var.e.f;
                list.getClass();
                p6t0 p6t0Var = (p6t0) CollectionsKt.W(iD2, list);
                ?? r5 = iD2 + (p6t0Var != null ? p6t0Var instanceof bsv : 0);
                o9m0Var.i(iD, r5);
                o9m0Var.f.invoke(Integer.valueOf(iD), Integer.valueOf((int) r5));
                if (xhe0Var.f == 2) {
                    cp cpVar = xhe0Var instanceof cp ? (cp) xhe0Var : null;
                    if (cpVar != null) {
                        zdx.t(cpVar, cpVar.d());
                        int iD3 = cpVar.d();
                        yge0 adapter = recyclerView.getAdapter();
                        zdx.u(cpVar, iD3, (adapter != null ? adapter.d() : 0) - 1);
                    }
                }
                if (xhe0Var2.f == 2) {
                    cp cpVar2 = xhe0Var2 instanceof cp ? (cp) xhe0Var2 : null;
                    if (cpVar2 != null) {
                        zdx.t(cpVar2, cpVar2.d());
                        int iD4 = cpVar2.d();
                        yge0 adapter2 = recyclerView.getAdapter();
                        zdx.u(cpVar2, iD4, (adapter2 != null ? adapter2.d() : 0) - 1);
                    }
                }
                if (this.f == -1) {
                    this.f = xhe0Var2.d();
                }
                this.g = xhe0Var.c();
                break;
            default:
                jev0 jev0Var = (jev0) qv5Var;
                int iD5 = xhe0Var.d();
                int iD6 = xhe0Var2.d();
                yn90 yn90Var = jev0Var.f;
                yz3 yz3Var = jev0Var.e;
                List list2 = yz3Var.f;
                list2.getClass();
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                    } else if (!(((p6t0) it.next()) instanceof dev0)) {
                        i++;
                    }
                }
                List list3 = yz3Var.f;
                list3.getClass();
                ListIterator listIterator = list3.listIterator(list3.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (((p6t0) listIterator.previous()) instanceof dev0) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                if (iD6 != i) {
                    jev0Var.i(iD5, iD6);
                    yn90Var.invoke(Integer.valueOf(iD5), Integer.valueOf(iD6));
                    if (iD5 + 1 <= iNextIndex && iNextIndex <= iD6) {
                        int i2 = iNextIndex - 1;
                        jev0Var.i(i2, iNextIndex);
                        yn90Var.invoke(Integer.valueOf(i2), Integer.valueOf(iNextIndex));
                    } else if (iD6 <= iNextIndex && iNextIndex < iD5) {
                        int i3 = iNextIndex + 1;
                        jev0Var.i(i3, iNextIndex);
                        yn90Var.invoke(Integer.valueOf(i3), Integer.valueOf(iNextIndex));
                    }
                }
                if (this.f == -1) {
                    this.f = xhe0Var2.d();
                }
                this.g = xhe0Var.c();
                break;
        }
        return true;
    }

    @Override // a.syx
    public final void t(xhe0 xhe0Var, int i) {
        byte b = this.e;
        qv5 qv5Var = this.h;
        switch (b) {
            case 0:
                if (i == 0) {
                    if (this.f != this.g) {
                        ((o9m0) qv5Var).g.invoke();
                    }
                    this.f = -1;
                }
                break;
            default:
                if (i == 0) {
                    if (this.f != this.g) {
                        ((jev0) qv5Var).g.invoke();
                    }
                    this.f = -1;
                }
                break;
        }
    }

    @Override // a.syx
    public final void u(xhe0 xhe0Var) {
        byte b = this.e;
        xhe0Var.getClass();
    }

    public w9m0(o9m0 o9m0Var) {
        super((byte) 0);
        this.h = o9m0Var;
        this.f = -1;
        this.g = -1;
    }
}
