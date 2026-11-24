package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wuq implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wuq f39801a;
    private static final ugi0 descriptor;

    static {
        wuq wuqVar = new wuq();
        f39801a = wuqVar;
        zna0 zna0Var = new zna0("org.xplatform.statistic.forecast.data.models.ForecastStatisticResponse", wuqVar, 2);
        zna0Var.j("response", true);
        zna0Var.j("sportId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(kuq.f18923a), mrv.j0(okx.f25427a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        muq muqVar = null;
        Integer num = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                muqVar = (muq) bldVarA.e(ugi0Var, 0, kuq.f18923a, muqVar);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new yuq(i, muqVar, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        yuq yuqVar = (yuq) obj;
        yuqVar.getClass();
        Integer num = yuqVar.b;
        muq muqVar = yuqVar.f43280a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || muqVar != null) {
            cldVarA.p(ugi0Var, 0, kuq.f18923a, muqVar);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
