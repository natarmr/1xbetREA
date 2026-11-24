package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kj40 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kj40 f18369a;
    private static final ugi0 descriptor;

    static {
        kj40 kj40Var = new kj40();
        f18369a = kj40Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.playerscomposition.mlbb.MlbbPlayerResponse", kj40Var, 5);
        zna0Var.j("name", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("role", true);
        zna0Var.j("countryImageS3", true);
        zna0Var.j("stats", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(pj40.f27071a)};
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
        String str4 = null;
        rj40 rj40Var = null;
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
            } else if (iF == 3) {
                str4 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str4);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                rj40Var = (rj40) bldVarA.e(ugi0Var, 4, pj40.f27071a, rj40Var);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new mj40(i, str, str2, str3, str4, rj40Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mj40 mj40Var = (mj40) obj;
        mj40Var.getClass();
        rj40 rj40Var = mj40Var.e;
        String str = mj40Var.d;
        String str2 = mj40Var.c;
        String str3 = mj40Var.b;
        String str4 = mj40Var.f21877a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || rj40Var != null) {
            cldVarA.p(ugi0Var, 4, pj40.f27071a, rj40Var);
        }
        cldVarA.c(ugi0Var);
    }
}
