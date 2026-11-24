package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i7r implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i7r f14306a;
    private static final ugi0 descriptor;

    static {
        i7r i7rVar = new i7r();
        f14306a = i7rVar;
        zna0 zna0Var = new zna0("org.xplatform.captcha.impl.data.models.FrameParams.Detail", i7rVar, 2);
        zna0Var.j("lng", true);
        zna0Var.j("fp", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(l7r.f19573a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        n7r n7rVar = null;
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
                n7rVar = (n7r) bldVarA.e(ugi0Var, 1, l7r.f19573a, n7rVar);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new k7r(i, str, n7rVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        k7r k7rVar = (k7r) obj;
        k7rVar.getClass();
        n7r n7rVar = k7rVar.b;
        String str = k7rVar.f17838a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || n7rVar != null) {
            cldVarA.p(ugi0Var, 1, l7r.f19573a, n7rVar);
        }
        cldVarA.c(ugi0Var);
    }
}
