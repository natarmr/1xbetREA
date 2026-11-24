package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fyo implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fyo f10368a;
    private static final ugi0 descriptor;

    static {
        fyo fyoVar = new fyo();
        f10368a = fyoVar;
        zna0 zna0Var = new zna0("org.xplatform.security.impl.data.fast_change_password.models.FastChangePasswordRequest", fyoVar, 2);
        zna0Var.j("Data", false);
        zna0Var.j("VerifyToken", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{hyo.f13867a, mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        jyo jyoVar = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                jyoVar = (jyo) bldVarA.m(ugi0Var, 0, hyo.f13867a, jyoVar);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new kyo(i, jyoVar, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kyo kyoVar = (kyo) obj;
        kyoVar.getClass();
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        hyo hyoVar = hyo.f13867a;
        jyo jyoVar = kyoVar.f19115a;
        String str = kyoVar.b;
        cldVarA.m(ugi0Var, 0, hyoVar, jyoVar);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
