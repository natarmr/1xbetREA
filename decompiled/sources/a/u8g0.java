package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u8g0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u8g0 f35230a;
    private static final ugi0 descriptor;

    static {
        u8g0 u8g0Var = new u8g0();
        f35230a = u8g0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.player.players_statistic_cricket.data.models.ResultsResponse", u8g0Var, 2);
        zna0Var.j("title", true);
        zna0Var.j("table", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(kko0.f18451a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        sko0 sko0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                sko0Var = (sko0) bldVarA.e(ugi0Var, 1, kko0.f18451a, sko0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new y8g0(i, str, sko0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        y8g0 y8g0Var = (y8g0) obj;
        y8g0Var.getClass();
        sko0 sko0Var = y8g0Var.b;
        String str = y8g0Var.f42193a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || sko0Var != null) {
            cldVarA.p(ugi0Var, 1, kko0.f18451a, sko0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
