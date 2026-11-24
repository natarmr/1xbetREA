package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zkg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xr f44530a;
    public final r34 b;
    public final knf0 c;

    public zkg(xr xrVar, r34 r34Var, knf0 knf0Var) {
        knf0Var.getClass();
        this.f44530a = xrVar;
        this.b = r34Var;
        this.c = knf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(long j, zje zjeVar) {
        wkg wkgVar;
        Object g0g0Var;
        wif wifVar;
        knf0 knf0Var = this.c;
        if (zjeVar instanceof wkg) {
            wkgVar = (wkg) zjeVar;
            int i = wkgVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wkgVar.k = i - Integer.MIN_VALUE;
            } else {
                wkgVar = new wkg(this, zjeVar);
            }
        } else {
            wkgVar = new wkg(this, zjeVar);
        }
        wkg wkgVar2 = wkgVar;
        Object objB = wkgVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = wkgVar2.k;
        r34 r34Var = this.b;
        try {
            if (i2 == 0) {
                z1x.P(objB);
                e0g0 e0g0Var = j0g0.b;
                mrf mrfVar = (mrf) ((p7m0) ((qz40) ((a8z) r34Var.b).getValue())).getValue();
                g0g0Var = mrfVar != null ? mrfVar.b : null;
                if (g0g0Var == null) {
                    xr xrVar = this.f44530a;
                    knf0Var.getClass();
                    Integer num = new Integer(1);
                    Integer num2 = new Integer(knf0Var.b());
                    String strC = knf0Var.c();
                    wkgVar2.k = 1;
                    objB = ((pkg) ((e8g) xrVar.b).invoke()).b(j, num, num2, strC, wkgVar2);
                    if (objB == wneVar) {
                        return wneVar;
                    }
                }
                e0g0 e0g0Var2 = j0g0.b;
                wifVar = (wif) ((a8z) r34Var.c).getValue();
                if (g0g0Var instanceof g0g0) {
                    return wifVar;
                }
                return g0g0Var;
            }
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
            g0g0Var = uzb.G0((djf) ((dx5) objB).a());
            e0g0 e0g0Var3 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var4 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        wifVar = (wif) ((a8z) r34Var.c).getValue();
        if (g0g0Var instanceof g0g0) {
            return wifVar;
        }
        return g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object b(long j, zje zjeVar) {
        xkg xkgVar;
        iun iunVar;
        knf0 knf0Var = this.c;
        if (zjeVar instanceof xkg) {
            xkgVar = (xkg) zjeVar;
            int i = xkgVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xkgVar.k = i - Integer.MIN_VALUE;
            } else {
                xkgVar = new xkg(this, zjeVar);
            }
        } else {
            xkgVar = new xkg(this, zjeVar);
        }
        xkg xkgVar2 = xkgVar;
        Object objA = xkgVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = xkgVar2.k;
        Object g0g0Var = null;
        try {
            if (i2 == 0) {
                z1x.P(objA);
                e0g0 e0g0Var = j0g0.b;
                r34 r34Var = this.b;
                if (r34Var.f29768a != 0 && System.currentTimeMillis() - r34Var.f29768a <= 240000) {
                    mrf mrfVar = (mrf) ((p7m0) ((qz40) ((a8z) r34Var.b).getValue())).getValue();
                    if (mrfVar == null || (g0g0Var = mrfVar.c) == null) {
                        g0g0Var = iun.f15405a;
                    }
                } else {
                    r34Var.f29768a = System.currentTimeMillis();
                }
                if (g0g0Var == null) {
                    xr xrVar = this.f44530a;
                    knf0Var.getClass();
                    int iB = knf0Var.b();
                    String strC = knf0Var.c();
                    xkgVar2.k = 1;
                    objA = ((pkg) ((e8g) xrVar.b).invoke()).a(j, 1, iB, strC, xkgVar2);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                }
                e0g0 e0g0Var2 = j0g0.b;
                iunVar = iun.f15405a;
                if (g0g0Var instanceof g0g0) {
                    return iunVar;
                }
                return g0g0Var;
            }
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
            g0g0Var = lpf.a((gpf) ((dx5) objA).a());
            e0g0 e0g0Var3 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var4 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        iunVar = iun.f15405a;
        if (g0g0Var instanceof g0g0) {
            return iunVar;
        }
        return g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(List list, zje zjeVar) {
        ykg ykgVar;
        Serializable g0g0Var;
        if (zjeVar instanceof ykg) {
            ykgVar = (ykg) zjeVar;
            int i = ykgVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ykgVar.k = i - Integer.MIN_VALUE;
            } else {
                ykgVar = new ykg(this, zjeVar);
            }
        } else {
            ykgVar = new ykg(this, zjeVar);
        }
        Object objC = ykgVar.i;
        wne wneVar = wne.f39444a;
        int i2 = ykgVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objC);
                e0g0 e0g0Var = j0g0.b;
                xr xrVar = this.f44530a;
                ykgVar.k = 1;
                objC = ((pkg) ((e8g) xrVar.b).invoke()).c(list, ykgVar);
                if (objC == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objC);
            }
            Iterable iterable = (Iterable) ((dx5) objC).a();
            ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(vic.F((bqf) it.next()));
            }
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = arrayList;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return g0g0Var instanceof g0g0 ? iun.f15405a : g0g0Var;
    }
}
