package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tn5 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tn5 f34219a;
    private static final ugi0 descriptor;

    static {
        tn5 tn5Var = new tn5();
        f34219a = tn5Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.match_progress.match_progress_cricket.data.responses.BallByBallResponse", tn5Var, 3);
        zna0Var.j("number", true);
        zna0Var.j("cricketBalls", true);
        zna0Var.j("cricketPoints", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(zcf.f44164a), mrv.j0(fdf.f9356a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        bdf bdfVar = null;
        hdf hdfVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                bdfVar = (bdf) bldVarA.e(ugi0Var, 1, zcf.f44164a, bdfVar);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                hdfVar = (hdf) bldVarA.e(ugi0Var, 2, fdf.f9356a, hdfVar);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new vn5(i, str, bdfVar, hdfVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vn5 vn5Var = (vn5) obj;
        vn5Var.getClass();
        hdf hdfVar = vn5Var.c;
        bdf bdfVar = vn5Var.b;
        String str = vn5Var.f37701a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bdfVar != null) {
            cldVarA.p(ugi0Var, 1, zcf.f44164a, bdfVar);
        }
        if (cldVarA.u(ugi0Var) || hdfVar != null) {
            cldVarA.p(ugi0Var, 2, fdf.f9356a, hdfVar);
        }
        cldVarA.c(ugi0Var);
    }
}
