package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class srh0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final srh0 f32676a;
    private static final ugi0 descriptor;

    static {
        srh0 srh0Var = new srh0();
        f32676a = srh0Var;
        zna0 zna0Var = new zna0("org.xplatform.security.impl.data.models.SecurityLevelGetResponse.TypeSecurityItemResponseValue", srh0Var, 2);
        zna0Var.j("Descriptions", true);
        zna0Var.j("State", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Boolean bool = null;
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
                bool = (Boolean) bldVarA.e(ugi0Var, 1, sm8.f32432a, bool);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new urh0(i, bool, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        urh0 urh0Var = (urh0) obj;
        urh0Var.getClass();
        Boolean bool = urh0Var.b;
        String str = urh0Var.f36163a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 1, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
