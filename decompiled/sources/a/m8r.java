package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m8r implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m8r f21383a;
    private static final ugi0 descriptor;

    static {
        m8r m8rVar = new m8r();
        f21383a = m8rVar;
        zna0 zna0Var = new zna0("org.xplatform.limits_ne.impl.data.models.responses.FreeValueConfigurationMoneyResponse", m8rVar, 2);
        zna0Var.j("min", true);
        zna0Var.j("max", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        j8r j8rVar = j8r.f16099a;
        return new jiy[]{mrv.j0(j8rVar), mrv.j0(j8rVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        l8r l8rVar = null;
        l8r l8rVar2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l8rVar = (l8r) bldVarA.e(ugi0Var, 0, j8r.f16099a, l8rVar);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                l8rVar2 = (l8r) bldVarA.e(ugi0Var, 1, j8r.f16099a, l8rVar2);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new o8r(i, l8rVar, l8rVar2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        o8r o8rVar = (o8r) obj;
        o8rVar.getClass();
        l8r l8rVar = o8rVar.b;
        l8r l8rVar2 = o8rVar.f24844a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l8rVar2 != null) {
            cldVarA.p(ugi0Var, 0, j8r.f16099a, l8rVar2);
        }
        if (cldVarA.u(ugi0Var) || l8rVar != null) {
            cldVarA.p(ugi0Var, 1, j8r.f16099a, l8rVar);
        }
        cldVarA.c(ugi0Var);
    }
}
