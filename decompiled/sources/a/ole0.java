package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ole0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ole0 f25450a;
    private static final ugi0 descriptor;

    static {
        ole0 ole0Var = new ole0();
        f25450a = ole0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.referee.referee_tour.data.models.RefereeTourInfoResponse", ole0Var, 10);
        zna0Var.j("tournament", true);
        zna0Var.j("numGames", true);
        zna0Var.j("foulsPerGame", true);
        zna0Var.j("foulsPerTackle", true);
        zna0Var.j("penaltiesAwardedAgainstPerGame", true);
        zna0Var.j("yellowCdsPerGame", true);
        zna0Var.j("redCdsPerGame", true);
        zna0Var.j("yellowCds", true);
        zna0Var.j("redCds", true);
        zna0Var.j("penalties", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(kle0.f18482a);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ1 = mrv.j0(okxVar);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Integer num = null;
        boolean z = true;
        Integer num2 = null;
        int i = 0;
        mle0 mle0Var = null;
        Integer num3 = null;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        Double d5 = null;
        Integer num4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    mle0Var = (mle0) bldVarA.e(ugi0Var, 0, kle0.f18482a, mle0Var);
                    i |= 1;
                    break;
                case 1:
                    num3 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num3);
                    i |= 2;
                    break;
                case 2:
                    d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                    i |= 4;
                    break;
                case 3:
                    d2 = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d2);
                    i |= 8;
                    break;
                case 4:
                    d3 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d3);
                    i |= 16;
                    break;
                case 5:
                    d4 = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d4);
                    i |= 32;
                    break;
                case 6:
                    d5 = (Double) bldVarA.e(ugi0Var, 6, tbl.f33669a, d5);
                    i |= 64;
                    break;
                case 7:
                    num4 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num4);
                    i |= 128;
                    break;
                case 8:
                    num2 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num2);
                    i |= 256;
                    break;
                case 9:
                    num = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new qle0(i, mle0Var, num3, d, d2, d3, d4, d5, num4, num2, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qle0 qle0Var = (qle0) obj;
        qle0Var.getClass();
        Integer num = qle0Var.j;
        Integer num2 = qle0Var.i;
        Integer num3 = qle0Var.h;
        Double d = qle0Var.g;
        Double d2 = qle0Var.f;
        Double d3 = qle0Var.e;
        Double d4 = qle0Var.d;
        Double d5 = qle0Var.c;
        Integer num4 = qle0Var.b;
        mle0 mle0Var = qle0Var.f28930a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || mle0Var != null) {
            cldVarA.p(ugi0Var, 0, kle0.f18482a, mle0Var);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || d5 != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d5);
        }
        if (cldVarA.u(ugi0Var) || d4 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d4);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 5, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 6, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
