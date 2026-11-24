package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bji0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bji0 f2710a;
    private static final ugi0 descriptor;

    static {
        bji0 bji0Var = new bji0();
        f2710a = bji0Var;
        zna0 zna0Var = new zna0("com.google.firebase.sessions.settings.SessionConfigs", bji0Var, 5);
        zna0Var.j("sessionsEnabled", false);
        zna0Var.j("sessionSamplingRate", false);
        zna0Var.j("sessionTimeoutSeconds", false);
        zna0Var.j("cacheDurationSeconds", false);
        zna0Var.j("cacheUpdatedTimeSeconds", false);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(sm8.f32432a);
        jiy jiyVarJ1 = mrv.j0(tbl.f33669a);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool);
                i |= 1;
            } else if (iF == 1) {
                d = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d);
                i |= 2;
            } else if (iF == 2) {
                num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                i |= 4;
            } else if (iF == 3) {
                num2 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num2);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                l = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new dji0(i, bool, d, num, num2, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dji0 dji0Var = (dji0) obj;
        dji0Var.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        cldVarA.p(ugi0Var, 0, sm8.f32432a, dji0Var.f6188a);
        cldVarA.p(ugi0Var, 1, tbl.f33669a, dji0Var.b);
        okx okxVar = okx.f25427a;
        cldVarA.p(ugi0Var, 2, okxVar, dji0Var.c);
        cldVarA.p(ugi0Var, 3, okxVar, dji0Var.d);
        cldVarA.p(ugi0Var, 4, s710.f31729a, dji0Var.e);
        cldVarA.c(ugi0Var);
    }

    @Override // a.pjt
    public final jiy[] typeParametersSerializers() {
        return lv00.k;
    }
}
