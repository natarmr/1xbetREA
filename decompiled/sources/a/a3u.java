package a;

import java.io.Serializable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a3u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjl0 f192a;

    public a3u(sjl0 sjl0Var, byte b) {
        sjl0Var.getClass();
        switch (b) {
            case 1:
                this.f192a = sjl0Var;
                break;
            default:
                this.f192a = sjl0Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable a(zje zjeVar) {
        zuu zuuVar;
        if (zjeVar instanceof zuu) {
            zuuVar = (zuu) zjeVar;
            int i = zuuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zuuVar.k = i - Integer.MIN_VALUE;
            } else {
                zuuVar = new zuu(this, zjeVar);
            }
        } else {
            zuuVar = new zuu(this, zjeVar);
        }
        Object objD = zuuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = zuuVar.k;
        if (i2 == 0) {
            z1x.P(objD);
            zuuVar.k = 1;
            objD = this.f192a.d(zuuVar);
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

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object b(long j, long j2, zje zjeVar) {
        z2u z2uVar;
        if (zjeVar instanceof z2u) {
            z2uVar = (z2u) zjeVar;
            int i = z2uVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                z2uVar.k = i - Integer.MIN_VALUE;
            } else {
                z2uVar = new z2u(this, zjeVar);
            }
        } else {
            z2uVar = new z2u(this, zjeVar);
        }
        z2u z2uVar2 = z2uVar;
        Object objF = z2uVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = z2uVar2.k;
        if (i2 == 0) {
            z1x.P(objF);
            z2uVar2.k = 1;
            objF = this.f192a.f(j, j2, z2uVar2);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objF);
        }
        return ((ypl0) objF).c.j;
    }
}
