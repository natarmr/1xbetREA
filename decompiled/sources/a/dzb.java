package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dzb implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dzb f6935a;
    private static final ugi0 descriptor;

    static {
        dzb dzbVar = new dzb();
        f6935a = dzbVar;
        zna0 zna0Var = new zna0("org.xplatform.app_start.impl.data.model.response.CheckBlockResponse", dzbVar, 2);
        zna0Var.j("allowedCountry", true);
        zna0Var.j("allowedPartner", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                bool = (Boolean) bldVarA.e(ugi0Var, 0, sm8.f32432a, bool);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                bool2 = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new fzb(i, bool, bool2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fzb fzbVar = (fzb) obj;
        fzbVar.getClass();
        Boolean bool = fzbVar.b;
        Boolean bool2 = fzbVar.f10400a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 0, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
