package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class xf80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lqd f40779a = new lqd(new r580(2));

    public static final mm40 a(mm40 mm40Var) {
        return mm40Var.e(new yf80());
    }

    public static final vf80 b(fet fetVar) {
        fetVar.e0(282942128);
        bz2 bz2Var = (bz2) fetVar.k(f40779a);
        if (bz2Var == null) {
            fetVar.r(false);
            return null;
        }
        boolean zG = fetVar.g(bz2Var);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            Object az2Var = new az2(bz2Var.f3444a, bz2Var.b, bz2Var.c, bz2Var.d);
            fetVar.o0(az2Var);
            objP = az2Var;
        }
        vf80 vf80Var = (vf80) objP;
        fetVar.r(false);
        return vf80Var;
    }
}
