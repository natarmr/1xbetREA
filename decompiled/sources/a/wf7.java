package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wf7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wf7 f39056a;
    private static final ugi0 descriptor;

    static {
        wf7 wf7Var = new wf7();
        f39056a = wf7Var;
        zna0 zna0Var = new zna0("org.xplatform.limits.ie.impl.data.models.requests.BetLimitsWithPeriodValueRequest", wf7Var, 4);
        zna0Var.j("limitValue", false);
        zna0Var.j("limitType", false);
        zna0Var.j("currency", false);
        zna0Var.j("numberOfPeriods", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{tbl.f33669a, okx.f25427a, ysm0.f43175a, s710.f31729a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        int iJ = 0;
        double dT = 0.0d;
        String strX = null;
        long jR = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                dT = bldVarA.t(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                iJ = bldVarA.j(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                strX = bldVarA.x(ugi0Var, 2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                jR = bldVarA.r(ugi0Var, 3);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new yf7(i, dT, iJ, strX, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        yf7 yf7Var = (yf7) obj;
        yf7Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.j(ugi0Var, 0, yf7Var.f42526a);
        cldVarA.i(1, yf7Var.b, ugi0Var);
        cldVarA.z(ugi0Var, 2, yf7Var.c);
        cldVarA.n(ugi0Var, 3, yf7Var.d);
        cldVarA.c(ugi0Var);
    }
}
