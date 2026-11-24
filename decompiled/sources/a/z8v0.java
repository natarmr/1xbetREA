package a;

/* JADX INFO: loaded from: classes5.dex */
public final class z8v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btt0 f43987a;
    public final x8v0 b;
    public final knf0 c;

    public z8v0(btt0 btt0Var, x8v0 x8v0Var, knf0 knf0Var) {
        btt0Var.getClass();
        knf0Var.getClass();
        this.f43987a = btt0Var;
        this.b = x8v0Var;
        this.c = knf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        y8v0 y8v0Var;
        if (zjeVar instanceof y8v0) {
            y8v0Var = (y8v0) zjeVar;
            int i = y8v0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                y8v0Var.k = i - Integer.MIN_VALUE;
            } else {
                y8v0Var = new y8v0(this, zjeVar);
            }
        } else {
            y8v0Var = new y8v0(this, zjeVar);
        }
        Object objA = y8v0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = y8v0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = this.f43987a.a();
            String strC = this.c.c();
            y8v0Var.k = 1;
            objA = ((p8v0) this.b.f40481a.invoke()).a(strA, strC, y8v0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        vqt0 vqt0Var = (vqt0) ((q16) objA).a();
        Long l = vqt0Var.f37869a;
        long jLongValue = l != null ? l.longValue() : 0L;
        Integer num = vqt0Var.b;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = vqt0Var.c;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Boolean bool = vqt0Var.d;
        return new sqt0(iIntValue, iIntValue2, jLongValue, bool != null ? bool.booleanValue() : false);
    }
}
