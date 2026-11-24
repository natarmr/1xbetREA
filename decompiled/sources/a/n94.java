package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n94 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n94 f23120a;
    private static final ugi0 descriptor;

    static {
        n94 n94Var = new n94();
        f23120a = n94Var;
        zna0 zna0Var = new zna0("org.xplatform.registration.core.data.models.register_responses.AuthInfoResponse", n94Var, 3);
        zna0Var.j("Guid", true);
        zna0Var.j("Token", true);
        zna0Var.j("CodeType", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                str2 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str2);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new p94(str, i, str2, str3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        p94 p94Var = (p94) obj;
        p94Var.getClass();
        String str = p94Var.c;
        String str2 = p94Var.b;
        String str3 = p94Var.f26589a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
