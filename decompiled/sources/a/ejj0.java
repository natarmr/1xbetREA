package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ejj0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ejj0 f7913a;
    private static final ugi0 descriptor;

    static {
        ejj0 ejj0Var = new ejj0();
        f7913a = ejj0Var;
        zna0 zna0Var = new zna0("org.xplatform.security.impl.data.otp_authenticator.models.SetupTwoFaResponse", ejj0Var, 4);
        zna0Var.j("Account", true);
        zna0Var.j("ManualEntryKey", true);
        zna0Var.j("HashSecretKey", true);
        zna0Var.j("Auth", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(wwp0.f39896a)};
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
        ywp0 ywp0Var = null;
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
            } else if (iF == 2) {
                str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                ywp0Var = (ywp0) bldVarA.e(ugi0Var, 3, wwp0.f39896a, ywp0Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new gjj0(i, str, str2, str3, ywp0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        gjj0 gjj0Var = (gjj0) obj;
        gjj0Var.getClass();
        ywp0 ywp0Var = gjj0Var.d;
        String str = gjj0Var.c;
        String str2 = gjj0Var.b;
        String str3 = gjj0Var.f11400a;
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
        if (cldVarA.u(ugi0Var) || ywp0Var != null) {
            cldVarA.p(ugi0Var, 3, wwp0.f39896a, ywp0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
