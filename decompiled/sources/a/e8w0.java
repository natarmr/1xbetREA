package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e8w0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e8w0 f7394a;
    public static final zna0 b;

    static {
        e8w0 e8w0Var = new e8w0();
        f7394a = e8w0Var;
        zna0 zna0Var = new zna0("org.xplatform.secret.impl.keystore.StoredKeyData", e8w0Var, 4);
        zna0Var.j("publicKey", true);
        zna0Var.j("privateKey", true);
        zna0Var.j("encryptedPrivateKey", true);
        zna0Var.j("iv", true);
        b = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        zna0 zna0Var = b;
        bld bldVarA = rkjVar.a(zna0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int iF = bldVarA.f(zna0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(zna0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                str2 = (String) bldVarA.e(zna0Var, 1, ysm0.f43175a, str2);
                i |= 2;
            } else if (iF == 2) {
                str3 = (String) bldVarA.e(zna0Var, 2, ysm0.f43175a, str3);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                str4 = (String) bldVarA.e(zna0Var, 3, ysm0.f43175a, str4);
                i |= 8;
            }
        }
        bldVarA.c(zna0Var);
        return new n8w0(i, str, str2, str3, str4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        n8w0 n8w0Var = (n8w0) obj;
        n8w0Var.getClass();
        String str = n8w0Var.d;
        String str2 = n8w0Var.c;
        String str3 = n8w0Var.b;
        String str4 = n8w0Var.f23110a;
        zna0 zna0Var = b;
        cld cldVarA = bwnVar.a(zna0Var);
        if (cldVarA.u(zna0Var) || str4 != null) {
            cldVarA.p(zna0Var, 0, ysm0.f43175a, str4);
        }
        if (cldVarA.u(zna0Var) || str3 != null) {
            cldVarA.p(zna0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(zna0Var) || str2 != null) {
            cldVarA.p(zna0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(zna0Var) || str != null) {
            cldVarA.p(zna0Var, 3, ysm0.f43175a, str);
        }
        cldVarA.c(zna0Var);
    }
}
