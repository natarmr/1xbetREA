package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class tij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m6v0 f34011a;
    public final knf0 b;
    public final btt0 c;

    public tij(m6v0 m6v0Var, knf0 knf0Var, btt0 btt0Var) {
        m6v0Var.getClass();
        this.f34011a = m6v0Var;
        this.b = knf0Var;
        this.c = btt0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(zje zjeVar) {
        sij sijVar;
        pij pijVar;
        if (zjeVar instanceof sij) {
            sijVar = (sij) zjeVar;
            int i = sijVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                sijVar.k = i - Integer.MIN_VALUE;
            } else {
                sijVar = new sij(this, zjeVar);
            }
        } else {
            sijVar = new sij(this, zjeVar);
        }
        Object objA = sijVar.i;
        wne wneVar = wne.f39444a;
        int i2 = sijVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = this.c.a();
            String strC = this.b.c();
            sijVar.k = 1;
            objA = ((e7v0) this.f34011a.b.getValue()).a(strA, 22, strC, sijVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        List list = ((p6v0) ((u2t) objA).a()).f26477a;
        if (list == null) {
            return iun.f15405a;
        }
        ArrayList<nij> arrayList = new ArrayList();
        for (Object obj : list) {
            Integer num = ((nij) obj).f23590a;
            if (num != null && num.intValue() != 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (nij nijVar : arrayList) {
            nijVar.getClass();
            Integer num2 = nijVar.f23590a;
            int iIntValue = num2 != null ? num2.intValue() : 1;
            String str = nijVar.b;
            if (str != null) {
                switch (str) {
                    case "1":
                        pijVar = pij.b;
                        break;
                    case "2":
                        pijVar = pij.c;
                        break;
                    case "3":
                        pijVar = pij.d;
                        break;
                    case "4":
                        pijVar = pij.e;
                        break;
                    default:
                        pijVar = pij.f27045a;
                        break;
                }
            } else {
                pijVar = pij.f27045a;
            }
            pij pijVar2 = pijVar;
            Long l = nijVar.c;
            long jLongValue = 1000 * (l != null ? l.longValue() : 0L);
            Boolean bool = nijVar.d;
            arrayList2.add(new kij(iIntValue, pijVar2, jLongValue, bool != null ? bool.booleanValue() : false));
        }
        return arrayList2;
    }
}
