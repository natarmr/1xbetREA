package a;

import java.util.LinkedHashMap;
import java.util.Map;
import org.xplatform.limits_kenya.api.domain.LimitKenyaGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class aiu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q200 f942a;

    public aiu(q200 q200Var) {
        this.f942a = q200Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, boolean z2, boolean z3, boolean z4, zje zjeVar) {
        vhu vhuVar;
        if (zjeVar instanceof vhu) {
            vhuVar = (vhu) zjeVar;
            int i = vhuVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                vhuVar.n = i - Integer.MIN_VALUE;
            } else {
                vhuVar = new vhu(this, zjeVar);
            }
        } else {
            vhuVar = new vhu(this, zjeVar);
        }
        Object objA = vhuVar.l;
        wne wneVar = wne.f39444a;
        int i2 = vhuVar.n;
        if (i2 == 0) {
            z1x.P(objA);
            vhuVar.i = z2;
            vhuVar.j = z3;
            vhuVar.k = z4;
            vhuVar.n = 1;
            objA = this.f942a.a(z, vhuVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z4 = vhuVar.k;
            z3 = vhuVar.j;
            z2 = vhuVar.i;
            z1x.P(objA);
        }
        izz izzVar = (izz) objA;
        LinkedHashMap linkedHashMap = izzVar.f15656a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iOrdinal = ((LimitKenyaGroupEnum) entry.getKey()).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    } else if (iOrdinal != 3) {
                        t9f.b();
                        return null;
                    }
                } else if (z3) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            } else if (z2) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = izzVar.b;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            int iOrdinal2 = ((LimitKenyaGroupEnum) entry2.getKey()).ordinal();
            if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 3) {
                        t9f.b();
                        return null;
                    }
                } else if (!z4) {
                }
            }
            linkedHashMap4.put(entry2.getKey(), entry2.getValue());
        }
        return new izz(linkedHashMap2, linkedHashMap4);
    }
}
