package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s8r implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s8r f31815a;
    private static final ugi0 descriptor;

    static {
        s8r s8rVar = new s8r();
        f31815a = s8rVar;
        zna0 zna0Var = new zna0("org.xplatform.limits_ne.impl.data.models.responses.FreeValueConfigurationTimeResponse", s8rVar, 2);
        zna0Var.j("min", true);
        zna0Var.j("max", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        p8r p8rVar = p8r.f26572a;
        return new jiy[]{mrv.j0(p8rVar), mrv.j0(p8rVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        r8r r8rVar = null;
        r8r r8rVar2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                r8rVar = (r8r) bldVarA.e(ugi0Var, 0, p8r.f26572a, r8rVar);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                r8rVar2 = (r8r) bldVarA.e(ugi0Var, 1, p8r.f26572a, r8rVar2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new u8r(i, r8rVar, r8rVar2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        u8r u8rVar = (u8r) obj;
        u8rVar.getClass();
        r8r r8rVar = u8rVar.b;
        r8r r8rVar2 = u8rVar.f35244a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || r8rVar2 != null) {
            cldVarA.p(ugi0Var, 0, p8r.f26572a, r8rVar2);
        }
        if (cldVarA.u(ugi0Var) || r8rVar != null) {
            cldVarA.p(ugi0Var, 1, p8r.f26572a, r8rVar);
        }
        cldVarA.c(ugi0Var);
    }
}
