package a;

import java.util.LinkedHashMap;
import java.util.Map;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class biu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r200 f2674a;

    public biu(r200 r200Var) {
        r200Var.getClass();
        this.f2674a = r200Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, zje zjeVar) {
        whu whuVar;
        if (zjeVar instanceof whu) {
            whuVar = (whu) zjeVar;
            int i = whuVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                whuVar.o = i - Integer.MIN_VALUE;
            } else {
                whuVar = new whu(this, zjeVar);
            }
        } else {
            whuVar = new whu(this, zjeVar);
        }
        Object objB = whuVar.m;
        wne wneVar = wne.f39444a;
        int i2 = whuVar.o;
        if (i2 == 0) {
            z1x.P(objB);
            whuVar.i = z2;
            whuVar.j = z3;
            whuVar.k = z4;
            whuVar.l = z5;
            whuVar.o = 1;
            objB = this.f2674a.b(z, whuVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z5 = whuVar.l;
            z4 = whuVar.k;
            z3 = whuVar.j;
            z2 = whuVar.i;
            z1x.P(objB);
        }
        jzz jzzVar = (jzz) objB;
        LinkedHashMap linkedHashMap = jzzVar.f17437a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iOrdinal = ((LimitNeGroupEnum) entry.getKey()).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2 || iOrdinal == 3) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    } else if (iOrdinal != 4) {
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
        LinkedHashMap linkedHashMap3 = jzzVar.b;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            int iOrdinal2 = ((LimitNeGroupEnum) entry2.getKey()).ordinal();
            if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            t9f.b();
                            return null;
                        }
                    } else if (!z4) {
                    }
                } else if (!z5) {
                }
            }
            linkedHashMap4.put(entry2.getKey(), entry2.getValue());
        }
        return new jzz(linkedHashMap2, linkedHashMap4);
    }
}
