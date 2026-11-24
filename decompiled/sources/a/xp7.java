package a;

/* JADX INFO: loaded from: classes5.dex */
public final class xp7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zri f41254a;
    public final pmi b;

    public xp7(zri zriVar, pmi pmiVar) {
        this.f41254a = zriVar;
        this.b = pmiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, zje zjeVar) {
        wp7 wp7Var;
        zri zriVar;
        int i2;
        if (zjeVar instanceof wp7) {
            wp7Var = (wp7) zjeVar;
            int i3 = wp7Var.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wp7Var.n = i3 - Integer.MIN_VALUE;
            } else {
                wp7Var = new wp7(this, zjeVar);
            }
        } else {
            wp7Var = new wp7(this, zjeVar);
        }
        Object objX = wp7Var.l;
        Object obj = wne.f39444a;
        int i4 = wp7Var.n;
        if (i4 == 0) {
            z1x.P(objX);
            zriVar = this.f41254a;
            wp7Var.k = zriVar;
            wp7Var.i = i;
            wp7Var.j = i;
            wp7Var.n = 1;
            objX = this.b.x(wp7Var);
            if (objX != obj) {
                i2 = i;
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                z1x.P(objX);
                return objX;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = wp7Var.j;
        i2 = wp7Var.i;
        zriVar = wp7Var.k;
        z1x.P(objX);
        int iIntValue = ((Number) objX).intValue();
        wp7Var.k = null;
        wp7Var.i = i2;
        wp7Var.n = 2;
        Object objE = zriVar.e(i, iIntValue, wp7Var);
        return objE == obj ? obj : objE;
    }
}
