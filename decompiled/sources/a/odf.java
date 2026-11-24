package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class odf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final odf f25072a;
    private static final ugi0 descriptor;

    static {
        odf odfVar = new odf();
        f25072a = odfVar;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.games.CricketScoreResponse", odfVar, 1);
        zna0Var.j("wicketScore", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(xcv0.f40668a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        zcv0 zcv0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                zcv0Var = (zcv0) bldVarA.e(ugi0Var, 0, xcv0.f40668a, zcv0Var);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new sdf(i, zcv0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        sdf sdfVar = (sdf) obj;
        sdfVar.getClass();
        zcv0 zcv0Var = sdfVar.f32032a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || zcv0Var != null) {
            cldVarA.p(ugi0Var, 0, xcv0.f40668a, zcv0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
