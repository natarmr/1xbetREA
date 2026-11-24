package a;

import java.util.LinkedHashMap;
import java.util.Map;
import org.xplatform.limits_africa.api.domain.LimitGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class diu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s200 f6153a;

    public diu(s200 s200Var) {
        this.f6153a = s200Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, boolean z2, boolean z3, zje zjeVar) {
        yhu yhuVar;
        if (zjeVar instanceof yhu) {
            yhuVar = (yhu) zjeVar;
            int i = yhuVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                yhuVar.n = i - Integer.MIN_VALUE;
            } else {
                yhuVar = new yhu(this, zjeVar);
            }
        } else {
            yhuVar = new yhu(this, zjeVar);
        }
        Object objA = yhuVar.l;
        wne wneVar = wne.f39444a;
        int i2 = yhuVar.n;
        if (i2 == 0) {
            z1x.P(objA);
            yhuVar.i = z;
            yhuVar.j = z2;
            yhuVar.k = z3;
            yhuVar.n = 1;
            objA = this.f6153a.a(yhuVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = yhuVar.k;
            z2 = yhuVar.j;
            z = yhuVar.i;
            z1x.P(objA);
        }
        gzz gzzVar = (gzz) objA;
        LinkedHashMap linkedHashMap = gzzVar.f12206a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iOrdinal = ((LimitGroupEnum) entry.getKey()).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    } else if (iOrdinal != 3) {
                        t9f.b();
                        return null;
                    }
                } else if (z2) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            } else if (z) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = gzzVar.b;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            int iOrdinal2 = ((LimitGroupEnum) entry2.getKey()).ordinal();
            if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 3) {
                        t9f.b();
                        return null;
                    }
                } else if (!z3) {
                }
            }
            linkedHashMap4.put(entry2.getKey(), entry2.getValue());
        }
        return new gzz(linkedHashMap2, linkedHashMap4);
    }
}
