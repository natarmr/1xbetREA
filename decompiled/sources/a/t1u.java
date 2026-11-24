package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class t1u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gxu f33185a;

    public /* synthetic */ t1u(gxu gxuVar) {
        this.f33185a = gxuVar;
    }

    public kjo0 a(int i, String str) {
        eia0 eia0Var = (eia0) this.f33185a.b;
        eia0Var.getClass();
        kjo0 kjo0Var = (kjo0) eia0Var.c.get(str + i);
        return kjo0Var == null ? kjo0.UNKNOWN : kjo0Var;
    }

    public List b(int i, String str) {
        eia0 eia0Var = (eia0) this.f33185a.b;
        eia0Var.getClass();
        List list = (List) eia0Var.e.d.get(str + i);
        return list == null ? iun.f15405a : list;
    }
}
