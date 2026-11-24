package a;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class dwu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ram0 f6816a;

    public dwu(ram0 ram0Var) {
        ram0Var.getClass();
        this.f6816a = ram0Var;
    }

    public final zj2 a(List list, dam0 dam0Var) {
        list.getClass();
        mie0 mie0Var = new mie0();
        ram0 ram0Var = this.f6816a;
        ram0Var.getClass();
        qam0 qam0Var = ram0Var.f30143a;
        LinkedHashMap linkedHashMap = qam0Var.c;
        Object objA = linkedHashMap.get(dam0Var);
        if (objA == null) {
            objA = q7m0.a(xun.f41520a);
            linkedHashMap.put(dam0Var, objA);
        }
        qz40 qz40Var = (qz40) objA;
        ((p7m0) qz40Var).n(qam0Var.b(dam0Var));
        return new zj2(qz40Var, list, mie0Var, (byte) 13);
    }
}
