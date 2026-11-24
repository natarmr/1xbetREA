package a;

import java.util.LinkedHashMap;
import java.util.Map;
import org.xplatform.limits_ee.api.domain.LimitGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class zhu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p200 f44410a;

    public zhu(p200 p200Var) {
        this.f44410a = p200Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, boolean z2, zje zjeVar) {
        uhu uhuVar;
        if (zjeVar instanceof uhu) {
            uhuVar = (uhu) zjeVar;
            int i = uhuVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                uhuVar.m = i - Integer.MIN_VALUE;
            } else {
                uhuVar = new uhu(this, zjeVar);
            }
        } else {
            uhuVar = new uhu(this, zjeVar);
        }
        Object objA = uhuVar.k;
        wne wneVar = wne.f39444a;
        int i2 = uhuVar.m;
        if (i2 == 0) {
            z1x.P(objA);
            uhuVar.i = z;
            uhuVar.j = z2;
            uhuVar.m = 1;
            objA = this.f44410a.a(uhuVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = uhuVar.j;
            z = uhuVar.i;
            z1x.P(objA);
        }
        hzz hzzVar = (hzz) objA;
        LinkedHashMap linkedHashMap = hzzVar.f13925a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iOrdinal = ((LimitGroupEnum) entry.getKey()).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                } else if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
            } else if (z) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap3 = hzzVar.b;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            int iOrdinal2 = ((LimitGroupEnum) entry2.getKey()).ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        t9f.b();
                        return null;
                    }
                } else if (!z2) {
                }
            }
            linkedHashMap4.put(entry2.getKey(), entry2.getValue());
        }
        return new hzz(linkedHashMap2, linkedHashMap4);
    }
}
