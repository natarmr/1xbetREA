package a;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class e8u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final chf0 f7391a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(ru6 ru6Var, zje zjeVar) {
        ppx ppxVar;
        if (zjeVar instanceof ppx) {
            ppxVar = (ppx) zjeVar;
            int i = ppxVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ppxVar.l = i - Integer.MIN_VALUE;
            } else {
                ppxVar = new ppx(this, zjeVar);
            }
        } else {
            ppxVar = new ppx(this, zjeVar);
        }
        Object objI = ppxVar.j;
        Object obj = wne.f39444a;
        int i2 = ppxVar.l;
        boolean z = true;
        if (i2 == 0) {
            z1x.P(objI);
            long j = ru6Var.d;
            ppxVar.i = ru6Var;
            ppxVar.l = 1;
            objI = this.f7391a.I(j, ppxVar);
            if (objI == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ru6Var = ppxVar.i;
            z1x.P(objI);
        }
        Iterable<ru6> iterable = (Iterable) objI;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            z = false;
        } else {
            for (ru6 ru6Var2 : iterable) {
                if (ru6Var2.h != ru6Var.h || ru6Var2.d != ru6Var.d || ru6Var2.e != ru6Var.e || ru6Var2.g != ru6Var.g || ru6Var2.f != ru6Var.f) {
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
