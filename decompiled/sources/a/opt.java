package a;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class opt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g45 f25659a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(zje zjeVar) {
        npt nptVar;
        v9k0 v9k0Var;
        if (zjeVar instanceof npt) {
            nptVar = (npt) zjeVar;
            int i = nptVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nptVar.k = i - Integer.MIN_VALUE;
            } else {
                nptVar = new npt(this, zjeVar);
            }
        } else {
            nptVar = new npt(this, zjeVar);
        }
        Object objS = nptVar.i;
        wne wneVar = wne.f39444a;
        int i2 = nptVar.k;
        g45 g45Var = this.f25659a;
        if (i2 == 0) {
            z1x.P(objS);
            nptVar.k = 1;
            objS = g45Var.s(nptVar);
            if (objS == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objS);
        }
        gxb gxbVar = (gxb) objS;
        gxb gxbVar2 = (gxb) ((i7e) g45Var.c).i.getValue();
        int i3 = gxbVar2.d;
        if (i3 > gxbVar.d) {
            g45Var.a0(i3);
        }
        vxy vxyVar = gxbVar2.j;
        int i4 = vxyVar.f38222a;
        vxy vxyVar2 = gxbVar.j;
        vxy vxyVar3 = i4 > vxyVar2.f38222a ? vxyVar : vxyVar2;
        v9k0 v9k0Var2 = gxbVar.f;
        if (v9k0Var2 != null) {
            long j = v9k0Var2.f37040a;
            v9k0 v9k0Var3 = gxbVar2.f;
            v9k0Var = new v9k0(v9k0Var3 != null ? v9k0Var3.b : null, j);
        } else {
            v9k0Var = null;
        }
        List list = gxbVar2.i;
        int iA = wp20.a(r3d.q(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : list) {
            linkedHashMap.put(((xrt0) obj).a(), obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (xrt0 xrt0Var : gxbVar.i) {
            linkedHashMap2.put(xrt0Var.a(), xrt0Var);
        }
        g45Var.j0(gxb.a(gxbVar, false, Math.max(gxbVar2.d, gxbVar.d), 0, v9k0Var, false, CollectionsKt.L0(linkedHashMap2.values()), vxyVar3, 215));
        return gxbVar2;
    }
}
