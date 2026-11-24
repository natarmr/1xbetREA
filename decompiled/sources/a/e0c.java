package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class e0c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n660 f6982a;

    public /* synthetic */ e0c(n660 n660Var) {
        this.f6982a = n660Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(zje zjeVar) {
        enu enuVar;
        Object g0g0Var;
        if (zjeVar instanceof enu) {
            enuVar = (enu) zjeVar;
            int i = enuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                enuVar.k = i - Integer.MIN_VALUE;
            } else {
                enuVar = new enu(this, zjeVar);
            }
        } else {
            enuVar = new enu(this, zjeVar);
        }
        Object objT = enuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = enuVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objT);
                e0g0 e0g0Var = j0g0.b;
                n660 n660Var = this.f6982a;
                enuVar.k = 1;
                objT = n660Var.t(enuVar);
                if (objT == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objT);
            }
            g0g0Var = (List) objT;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return g0g0Var instanceof g0g0 ? iun.f15405a : g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(zje zjeVar, ynb0 ynb0Var, String str) throws Throwable {
        d0c d0cVar;
        Object g0g0Var;
        if (zjeVar instanceof d0c) {
            d0cVar = (d0c) zjeVar;
            int i = d0cVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                d0cVar.k = i - Integer.MIN_VALUE;
            } else {
                d0cVar = new d0c(this, zjeVar);
            }
        } else {
            d0cVar = new d0c(this, zjeVar);
        }
        Object objG = d0cVar.i;
        wne wneVar = wne.f39444a;
        int i2 = d0cVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objG);
                e0g0 e0g0Var = j0g0.b;
                n660 n660Var = this.f6982a;
                d0cVar.k = 1;
                objG = n660Var.g(d0cVar, ynb0Var, str);
                if (objG == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objG);
            }
            g0g0Var = (f0c) objG;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            return g0g0Var;
        }
        if (!(thA instanceof zhi0) || ((zhi0) thA).c != i2o.OldPasswordIncorrect) {
            throw thA;
        }
        String message = thA.getMessage();
        if (message == null) {
            message = "";
        }
        throw new x4x(message);
    }
}
