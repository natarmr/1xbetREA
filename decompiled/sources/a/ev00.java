package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ev00 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ev00 f8447a;
    private static final ugi0 descriptor;

    static {
        ev00 ev00Var = new ev00();
        f8447a = ev00Var;
        zna0 zna0Var = new zna0("org.xplatform.app_start.impl.domain.model.LogData", ev00Var, 5);
        zna0Var.j("userId", false);
        zna0Var.j("wifiName", false);
        zna0Var.j("carrierName", false);
        zna0Var.j("crashLogs", false);
        zna0Var.j("timestamp", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{ysm0Var, ysm0Var, ysm0Var, ysm0Var, s710.f31729a};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        int i = 0;
        String strX = null;
        String strX2 = null;
        String strX3 = null;
        String strX4 = null;
        long jR = 0;
        boolean z = true;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                strX = bldVarA.x(ugi0Var, 0);
                i |= 1;
            } else if (iF == 1) {
                strX2 = bldVarA.x(ugi0Var, 1);
                i |= 2;
            } else if (iF == 2) {
                strX3 = bldVarA.x(ugi0Var, 2);
                i |= 4;
            } else if (iF == 3) {
                strX4 = bldVarA.x(ugi0Var, 3);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                jR = bldVarA.r(ugi0Var, 4);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new gv00(i, strX, strX2, strX3, strX4, jR);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gv00 gv00Var = (gv00) obj;
        gv00Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        String str = gv00Var.f11954a;
        long j = gv00Var.e;
        cldVarA.z(ugi0Var, 0, str);
        cldVarA.z(ugi0Var, 1, gv00Var.b);
        cldVarA.z(ugi0Var, 2, gv00Var.c);
        cldVarA.z(ugi0Var, 3, gv00Var.d);
        if (cldVarA.u(ugi0Var) || j != System.currentTimeMillis()) {
            cldVarA.n(ugi0Var, 4, j);
        }
        cldVarA.c(ugi0Var);
    }
}
