package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lqf0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lqf0 f20485a;
    private static final ugi0 descriptor;

    static {
        lqf0 lqf0Var = new lqf0();
        f20485a = lqf0Var;
        zna0 zna0Var = new zna0("org.xplatform.resident.data.model.request.ResidentIncreaseBetRequest", lqf0Var, 5);
        zna0Var.j("BS", true);
        zna0Var.j("BINF", true);
        zna0Var.j("GI", false);
        zna0Var.j("LG", false);
        zna0Var.j("WH", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(tbl.f33669a);
        jiy jiyVarJ1 = mrv.j0(zf8.f44290a);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, ysm0Var, ysm0Var, okx.f25427a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        int iJ = 0;
        Double d = null;
        bg8 bg8Var = null;
        String strX = null;
        String strX2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                i |= 1;
            } else if (iF == 1) {
                bg8Var = (bg8) bldVarA.e(ugi0Var, 1, zf8.f44290a, bg8Var);
                i |= 2;
            } else if (iF == 2) {
                strX = bldVarA.x(ugi0Var, 2);
                i |= 4;
            } else if (iF == 3) {
                strX2 = bldVarA.x(ugi0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                iJ = bldVarA.j(ugi0Var, 4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new nqf0(i, d, bg8Var, strX, strX2, iJ);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nqf0 nqf0Var = (nqf0) obj;
        nqf0Var.getClass();
        bg8 bg8Var = nqf0Var.b;
        Double d = nqf0Var.f23957a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || bg8Var != null) {
            cldVarA.p(ugi0Var, 1, zf8.f44290a, bg8Var);
        }
        cldVarA.z(ugi0Var, 2, nqf0Var.c);
        cldVarA.z(ugi0Var, 3, nqf0Var.d);
        cldVarA.i(4, nqf0Var.e, ugi0Var);
        cldVarA.c(ugi0Var);
    }
}
