package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p8r implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p8r f26572a;
    private static final ugi0 descriptor;

    static {
        p8r p8rVar = new p8r();
        f26572a = p8rVar;
        zna0 zna0Var = new zna0("org.xplatform.limits_ne.impl.data.models.responses.FreeValueConfigurationTimeMinMaxResponse", p8rVar, 2);
        zna0Var.j("value", true);
        zna0Var.j("measure", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(tbl.f33669a), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Double d = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
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
        return new r8r(i, d, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        r8r r8rVar = (r8r) obj;
        r8rVar.getClass();
        String str = r8rVar.b;
        Double d = r8rVar.f30041a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
