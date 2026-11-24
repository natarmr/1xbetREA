package a;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class kpu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pru f18692a;
    public final kki b;
    public final wtt c;

    public kpu(pru pruVar, kki kkiVar, wtt wttVar) {
        this.f18692a = pruVar;
        this.b = kkiVar;
        this.c = wttVar;
    }

    public static etc0 a(soc0 soc0Var) {
        return new etc0(false, zuc0.PLAIN_LIST, 0, soc0Var);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:62:0x0107  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(boolean z, boolean z2, boolean z3, zje zjeVar) {
        jpu jpuVar;
        lc00 lc00VarB;
        toc0 toc0Var;
        lc00 lc00Var;
        lc00 lc00Var2;
        Throwable th;
        toc0 toc0Var2;
        Object g0g0Var;
        if (zjeVar instanceof jpu) {
            jpuVar = (jpu) zjeVar;
            int i = jpuVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                jpuVar.p = i - Integer.MIN_VALUE;
            } else {
                jpuVar = new jpu(this, zjeVar);
            }
        } else {
            jpuVar = new jpu(this, zjeVar);
        }
        Object obj = jpuVar.n;
        wne wneVar = wne.f39444a;
        int i2 = jpuVar.p;
        if (i2 == 0) {
            z1x.P(obj);
            lc00VarB = kotlin.collections.a.b();
            sff0 sff0VarA = this.f18692a.a();
            toc0Var = sff0VarA.l;
            boolean zA = this.c.a();
            if (toc0Var.y) {
                lc00VarB.add(a(soc0.c));
            }
            if (sff0VarA.U) {
                lc00VarB.add(a(soc0.k));
            }
            if (toc0Var.f34278a && !zA && z3) {
                try {
                    e0g0 e0g0Var = j0g0.b;
                    kki kkiVar = this.b;
                    jpuVar.k = lc00VarB;
                    jpuVar.l = lc00VarB;
                    jpuVar.m = toc0Var;
                    jpuVar.i = z;
                    jpuVar.j = z2;
                    jpuVar.p = 1;
                    Object objO = kkiVar.o(jpuVar);
                    if (objO == wneVar) {
                        return wneVar;
                    }
                    lc00Var2 = lc00VarB;
                    lc00Var = lc00Var2;
                    obj = objO;
                    toc0Var2 = toc0Var;
                } catch (Throwable th2) {
                    lc00Var2 = lc00VarB;
                    lc00Var = lc00Var2;
                    th = th2;
                    toc0Var2 = toc0Var;
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
            } else {
                lc00Var = lc00VarB;
            }
            if (toc0Var.g) {
                lc00VarB.add(a(soc0.b));
            }
            if (toc0Var.j) {
                lc00VarB.add(a(soc0.d));
            }
            if (z) {
                lc00VarB.add(a(soc0.e));
            }
            if (toc0Var.l) {
                lc00VarB.add(a(soc0.f));
            }
            if (toc0Var.b) {
                lc00VarB.add(a(soc0.g));
            }
            if (toc0Var.m) {
                lc00VarB.add(a(soc0.h));
            }
            if (z2) {
                lc00VarB.add(a(soc0.i));
            }
            return kotlin.collections.a.a(lc00Var);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z2 = jpuVar.j;
        z = jpuVar.i;
        toc0Var2 = jpuVar.m;
        lc00Var2 = jpuVar.l;
        lc00Var = jpuVar.k;
        try {
            z1x.P(obj);
        } catch (Throwable th3) {
            th = th3;
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        g0g0Var = (List) obj;
        e0g0 e0g0Var4 = j0g0.b;
        toc0Var = toc0Var2;
        if (!(g0g0Var instanceof g0g0) && !((List) g0g0Var).isEmpty()) {
            lc00Var2.add(a(soc0.j));
        }
        lc00VarB = lc00Var2;
        if (toc0Var.g) {
            lc00VarB.add(a(soc0.b));
        }
        if (toc0Var.j) {
            lc00VarB.add(a(soc0.d));
        }
        if (z) {
            lc00VarB.add(a(soc0.e));
        }
        if (toc0Var.l) {
            lc00VarB.add(a(soc0.f));
        }
        if (toc0Var.b) {
            lc00VarB.add(a(soc0.g));
        }
        if (toc0Var.m) {
            lc00VarB.add(a(soc0.h));
        }
        if (z2) {
            lc00VarB.add(a(soc0.i));
        }
        return kotlin.collections.a.a(lc00Var);
    }
}
