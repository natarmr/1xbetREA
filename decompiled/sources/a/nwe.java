package a;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class nwe extends syx {
    public final tre e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwe(tre treVar) {
        super((byte) 0);
        treVar.getClass();
        this.e = treVar;
    }

    @Override // a.syx
    public final boolean c(RecyclerView recyclerView, xhe0 xhe0Var, xhe0 xhe0Var2) {
        recyclerView.getClass();
        xhe0Var.getClass();
        xhe0Var2.getClass();
        int iD = xhe0Var2.d();
        List list = this.e.e.f;
        list.getClass();
        return !(((p6t0) CollectionsKt.W(iD, CollectionsKt.L0(list))) instanceof xpc);
    }

    @Override // a.syx
    public final int n(RecyclerView recyclerView, xhe0 xhe0Var) {
        recyclerView.getClass();
        xhe0Var.getClass();
        int iD = xhe0Var.d();
        List list = this.e.e.f;
        list.getClass();
        return ((p6t0) CollectionsKt.W(iD, CollectionsKt.L0(list))) instanceof xpc ? syx.q(0) : syx.q(3);
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
        tre treVar = this.e;
        List list = treVar.e.f;
        list.getClass();
        p6t0 p6t0Var = (p6t0) CollectionsKt.W(iD, CollectionsKt.L0(list));
        List list2 = treVar.e.f;
        list2.getClass();
        p6t0 p6t0Var2 = (p6t0) CollectionsKt.W(iD2, CollectionsKt.L0(list2));
        if ((p6t0Var instanceof xpc) || (p6t0Var2 instanceof xpc)) {
            return false;
        }
        int iD3 = xhe0Var.d();
        int iD4 = xhe0Var2.d();
        if (treVar.j) {
            treVar.h = iD3;
            treVar.j = false;
        }
        treVar.i = iD4;
        treVar.i(iD3, iD4);
        treVar.f.invoke();
        return true;
    }

    @Override // a.syx
    public final void t(xhe0 xhe0Var, int i) {
        if (i == 0) {
            tre treVar = this.e;
            treVar.g.invoke(Integer.valueOf(treVar.h), Integer.valueOf(treVar.i));
            treVar.h = 0;
            treVar.i = 0;
            treVar.j = true;
        }
    }

    @Override // a.syx
    public final void u(xhe0 xhe0Var) {
        xhe0Var.getClass();
    }
}
