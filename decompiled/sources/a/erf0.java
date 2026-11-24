package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class erf0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final erf0 f8279a;
    private static final ugi0 descriptor;

    static {
        erf0 erf0Var = new erf0();
        f8279a = erf0Var;
        zna0 zna0Var = new zna0("org.xplatform.resident.data.model.response.ResidentResponse", erf0Var, 2);
        zna0Var.j("BT_INFO", true);
        zna0Var.j("GAME", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(urf0.f36161a), mrv.j0(xof0.f41216a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        wrf0 wrf0Var = null;
        zof0 zof0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                wrf0Var = (wrf0) bldVarA.e(ugi0Var, 0, urf0.f36161a, wrf0Var);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                zof0Var = (zof0) bldVarA.e(ugi0Var, 1, xof0.f41216a, zof0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new grf0(i, wrf0Var, zof0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        grf0 grf0Var = (grf0) obj;
        grf0Var.getClass();
        zof0 zof0Var = grf0Var.b;
        wrf0 wrf0Var = grf0Var.f11777a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || wrf0Var != null) {
            cldVarA.p(ugi0Var, 0, urf0.f36161a, wrf0Var);
        }
        if (cldVarA.u(ugi0Var) || zof0Var != null) {
            cldVarA.p(ugi0Var, 1, xof0.f41216a, zof0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
