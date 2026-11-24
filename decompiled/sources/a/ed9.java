package a;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ed9 extends ng80 implements mg80 {
    public final e28 h;
    public final i950 i;
    public final n660 j;
    public n3d0 k;
    public qfk l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed9(swq swqVar, eu00 eu00Var, ym40 ym40Var, n3d0 n3d0Var, ad9 ad9Var) {
        super(ym40Var, swqVar);
        swqVar.getClass();
        ym40Var.getClass();
        ad9Var.getClass();
        this.h = ad9Var;
        v3d0 v3d0Var = n3d0Var.d;
        v3d0Var.getClass();
        t3d0 t3d0Var = n3d0Var.e;
        t3d0Var.getClass();
        i950 i950Var = new i950(v3d0Var, t3d0Var);
        this.i = i950Var;
        pnk0 pnk0Var = new pnk0(this, (byte) 17);
        ad9Var.getClass();
        n660 n660Var = new n660();
        n660Var.f22981a = i950Var;
        n660Var.b = ad9Var;
        n660Var.c = pnk0Var;
        List list = n3d0Var.g;
        list.getClass();
        int iA = wp20.a(r3d.q(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (Object obj : list) {
            linkedHashMap.put(ydx.K((i950) n660Var.f22981a, ((s2d0) obj).e), obj);
        }
        n660Var.d = linkedHashMap;
        this.j = n660Var;
        this.k = n3d0Var;
    }

    public final void q1(f6i f6iVar) {
        f6iVar.getClass();
        n3d0 n3d0Var = this.k;
        if (n3d0Var == null) {
            jf4.n("Repeated call to DeserializedPackageFragmentImpl::initialize");
            return;
        }
        this.k = null;
        m3d0 m3d0Var = n3d0Var.f;
        m3d0Var.getClass();
        this.l = new qfk(this, m3d0Var, this.i, this.h, null, f6iVar, "scope of " + this, new v9k(this, (byte) 13));
    }

    @Override // a.ng80, a.wjj, a.p4
    public final String toString() {
        StringBuilder sb = new StringBuilder("builtins package fragment for ");
        sb.append(this.f);
        sb.append(" from ");
        int i = rek.f30339a;
        ym40 ym40VarC = oek.c(this);
        ym40VarC.getClass();
        sb.append(ym40VarC);
        return sb.toString();
    }

    @Override // a.mg80
    public final cr30 y() {
        qfk qfkVar = this.l;
        if (qfkVar != null) {
            return qfkVar;
        }
        Intrinsics.h("_memberScope");
        throw null;
    }
}
