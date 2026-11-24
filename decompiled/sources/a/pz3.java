package a;

/* JADX INFO: loaded from: classes.dex */
public final class pz3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pz3 f27825a = new pz3();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(gbe0 gbe0Var, o1x o1xVar, zje zjeVar) {
        oz3 oz3Var;
        if (zjeVar instanceof oz3) {
            oz3Var = (oz3) zjeVar;
            int i = oz3Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                oz3Var.l = i - Integer.MIN_VALUE;
            } else {
                oz3Var = new oz3(this, zjeVar);
            }
        } else {
            oz3Var = new oz3(this, zjeVar);
        }
        Object objC = oz3Var.j;
        Object obj = wne.f39444a;
        int i2 = oz3Var.l;
        if (i2 == 0) {
            z1x.P(objC);
            oz3Var.i = o1xVar;
            oz3Var.l = 1;
            objC = gbe0Var.c(o1xVar, oz3Var);
            if (objC == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o1xVar = oz3Var.i;
            z1x.P(objC);
        }
        u1x u1xVar = (u1x) objC;
        if (u1xVar instanceof hhn0) {
            hhn0 hhn0Var = (hhn0) u1xVar;
            return new kz3(x0x.r(hhn0Var.f13073a, o1xVar.f24504a, 1), hhn0Var);
        }
        if (!(u1xVar instanceof r1o)) {
            t9f.b();
            return null;
        }
        r1o r1oVar = (r1o) u1xVar;
        dyw dywVar = r1oVar.f29691a;
        return new iz3(dywVar != null ? x0x.r(dywVar, o1xVar.f24504a, 1) : null, r1oVar);
    }
}
