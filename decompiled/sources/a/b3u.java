package a;

import java.io.Serializable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b3u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjl0 f1927a;

    public b3u(sjl0 sjl0Var, byte b) {
        sjl0Var.getClass();
        switch (b) {
            case 1:
                this.f1927a = sjl0Var;
                break;
            default:
                this.f1927a = sjl0Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable a(zje zjeVar) {
        avu avuVar;
        if (zjeVar instanceof avu) {
            avuVar = (avu) zjeVar;
            int i = avuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                avuVar.k = i - Integer.MIN_VALUE;
            } else {
                avuVar = new avu(this, zjeVar);
            }
        } else {
            avuVar = new avu(this, zjeVar);
        }
        Object objD = avuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = avuVar.k;
        if (i2 == 0) {
            z1x.P(objD);
            avuVar.k = 1;
            objD = this.f1927a.d(avuVar);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        Iterable iterable = (Iterable) objD;
        int iA = wp20.a(r3d.q(iterable, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : iterable) {
            linkedHashMap.put(new Long(((ril0) obj).f30549a), obj);
        }
        return linkedHashMap;
    }
}
