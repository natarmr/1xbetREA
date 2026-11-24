package a;

/* JADX INFO: loaded from: classes.dex */
public final class lev {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k050 f19923a = new k050();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        kev kevVar;
        k050 k050Var;
        if (zjeVar instanceof kev) {
            kevVar = (kev) zjeVar;
            int i = kevVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                kevVar.l = i - Integer.MIN_VALUE;
            } else {
                kevVar = new kev(this, zjeVar);
            }
        } else {
            kevVar = new kev(this, zjeVar);
        }
        Object obj = kevVar.j;
        wne wneVar = wne.f39444a;
        int i2 = kevVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050Var = this.f19923a;
            kevVar.i = k050Var;
            kevVar.l = 1;
            if (k050Var.d(kevVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = kevVar.i;
            z1x.P(obj);
        }
        return new m050(k050Var);
    }
}
