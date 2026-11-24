package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yrf0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yrf0 f43119a;
    private static final ugi0 descriptor;

    static {
        yrf0 yrf0Var = new yrf0();
        f43119a = yrf0Var;
        zna0 zna0Var = new zna0("org.xplatform.resident.data.model.request.ResidentStartGameRequest", yrf0Var, 5);
        zna0Var.j("WH", false);
        zna0Var.j("LG", false);
        zna0Var.j("BS", true);
        zna0Var.j("BAC", false);
        zna0Var.j("BINF", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{okx.f25427a, ysm0.f43175a, mrv.j0(tbl.f33669a), s710.f31729a, mrv.j0(zf8.f44290a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        String strX = null;
        Double d = null;
        bg8 bg8Var = null;
        long jR = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                iJ = bldVarA.j(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                d = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d);
                i |= 4;
            } else if (iF == 3) {
                jR = bldVarA.r(ugi0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                bg8Var = (bg8) bldVarA.e(ugi0Var, 4, zf8.f44290a, bg8Var);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new asf0(i, iJ, strX, d, jR, bg8Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        asf0 asf0Var = (asf0) obj;
        asf0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        int i = asf0Var.f1390a;
        bg8 bg8Var = asf0Var.e;
        Double d = asf0Var.c;
        cldVarA.i(0, i, ugi0Var);
        cldVarA.z(ugi0Var, 1, asf0Var.b);
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        cldVarA.n(ugi0Var, 3, asf0Var.d);
        if (cldVarA.u(ugi0Var) || bg8Var != null) {
            cldVarA.p(ugi0Var, 4, zf8.f44290a, bg8Var);
        }
        cldVarA.c(ugi0Var);
    }
}
