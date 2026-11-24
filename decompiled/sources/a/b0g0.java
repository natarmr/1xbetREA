package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b0g0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0g0 f1763a;
    private static final ugi0 descriptor;

    static {
        b0g0 b0g0Var = new b0g0();
        f1763a = b0g0Var;
        zna0 zna0Var = new zna0("org.xplatform.consultantchat.data.models.RestrictionResponse", b0g0Var, 2);
        zna0Var.j("contentType", true);
        zna0Var.j("lengthLimit", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(ysm0.f43175a), mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Long l = null;
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
                l = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new d0g0(i, l, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        d0g0 d0g0Var = (d0g0) obj;
        d0g0Var.getClass();
        Long l = d0g0Var.b;
        String str = d0g0Var.f5266a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
