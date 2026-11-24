package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g7r implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g7r f10830a;
    private static final ugi0 descriptor;

    static {
        g7r g7rVar = new g7r();
        f10830a = g7rVar;
        zna0 zna0Var = new zna0("org.xplatform.captcha.impl.data.models.FrameParams", g7rVar, 1);
        zna0Var.j("detail", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(i7r.f14306a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        k7r k7rVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else {
                if (iF != 0) {
                    itt0.c(iF);
                    return null;
                }
                k7rVar = (k7r) bldVarA.e(ugi0Var, 0, i7r.f14306a, k7rVar);
                i = 1;
            }
        }
        bldVarA.c(ugi0Var);
        return new o7r(i, k7rVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        o7r o7rVar = (o7r) obj;
        o7rVar.getClass();
        k7r k7rVar = o7rVar.f24799a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || k7rVar != null) {
            cldVarA.p(ugi0Var, 0, i7r.f14306a, k7rVar);
        }
        cldVarA.c(ugi0Var);
    }
}
