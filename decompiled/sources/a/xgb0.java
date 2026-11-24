package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xgb0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xgb0 f40830a;
    private static final ugi0 descriptor;

    static {
        xgb0 xgb0Var = new xgb0();
        f40830a = xgb0Var;
        zna0 zna0Var = new zna0("org.xplatform.popular.impl.data.personalization.config.model.PopularPersonalizationConfigResponse", xgb0Var, 1);
        zna0Var.j("code", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new zgb0(i, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zgb0 zgb0Var = (zgb0) obj;
        zgb0Var.getClass();
        String str = zgb0Var.f44337a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
