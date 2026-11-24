package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class i4e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14142a = wv00.h("ConstraintTrkngWrkr");

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(zas0 zas0Var, ppv0 ppv0Var, zje zjeVar) {
        h4e h4eVar;
        if (zjeVar instanceof h4e) {
            h4eVar = (h4e) zjeVar;
            int i = h4eVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                h4eVar.j = i - Integer.MIN_VALUE;
            } else {
                h4eVar = new h4e(zjeVar);
            }
        } else {
            h4eVar = new h4e(zjeVar);
        }
        Object objK = h4eVar.i;
        wne wneVar = wne.f39444a;
        int i2 = h4eVar.j;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objK);
            rf0 rf0Var = new rf0(new fnq(zas0Var.e(ppv0Var), new wib(ppv0Var, yjeVar, (byte) 9), (byte) 4), (byte) 4);
            h4eVar.j = 1;
            objK = ntb.K(rf0Var, h4eVar);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objK);
        }
        return new Integer(((v4e) objK).f36773a);
    }
}
