package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cc9 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cc9 f4099a;
    private static final ugi0 descriptor;

    static {
        cc9 cc9Var = new cc9();
        f4099a = cc9Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.make_bet.data.model.BuilderEventRequest", cc9Var, 5);
        zna0Var.j("Coef", false);
        zna0Var.j("Param", false);
        zna0Var.j("Player", false);
        zna0Var.j("PlayerName", false);
        zna0Var.j("Type", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ0 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        return new jiy[]{ysm0Var, tbl.f33669a, s710Var, jiyVarJ0, s710Var};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        String strX = null;
        double dT = 0.0d;
        long jR = 0;
        long jR2 = 0;
        boolean z = true;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                dT = bldVarA.t(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                jR = bldVarA.r(ugi0Var, 2);
                i |= 4;
            } else if (iF == 3) {
                str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                jR2 = bldVarA.r(ugi0Var, 4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new ec9(dT, i, jR, jR2, strX, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ec9 ec9Var = (ec9) obj;
        ec9Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.z(ugi0Var, 0, ec9Var.f7553a);
        cldVarA.j(ugi0Var, 1, ec9Var.b);
        cldVarA.n(ugi0Var, 2, ec9Var.c);
        cldVarA.p(ugi0Var, 3, ysm0.f43175a, ec9Var.d);
        cldVarA.n(ugi0Var, 4, ec9Var.e);
        cldVarA.c(ugi0Var);
    }
}
