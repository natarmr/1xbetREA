package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tqt0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tqt0 f34396a;
    private static final ugi0 descriptor;

    static {
        tqt0 tqt0Var = new tqt0();
        f34396a = tqt0Var;
        zna0 zna0Var = new zna0("org.xplatform.onexuser.data.models.profile.registerbonuses.UserBonusInfoResponse", tqt0Var, 4);
        zna0Var.j("UserId", true);
        zna0Var.j("AgreementId", true);
        zna0Var.j("RegisterBonusId", true);
        zna0Var.j("IsRegisterBonusExpired", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Integer num = null;
        Integer num2 = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else if (iF == 2) {
                num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                bool = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new vqt0(i, l, num, num2, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vqt0 vqt0Var = (vqt0) obj;
        vqt0Var.getClass();
        Boolean bool = vqt0Var.d;
        Integer num = vqt0Var.c;
        Integer num2 = vqt0Var.b;
        Long l = vqt0Var.f37869a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
