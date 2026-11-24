package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zf8 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zf8 f44290a;
    private static final ugi0 descriptor;

    static {
        zf8 zf8Var = new zf8();
        f44290a = zf8Var;
        zna0 zna0Var = new zna0("org.xplatform.core.data.bonuses.BonusRequest", zf8Var, 2);
        zna0Var.j("BNTP", true);
        zna0Var.j("BNSE", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(vk10.f37554a), mrv.j0(ysm0.f43175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        uk10 uk10Var = null;
        String str = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                uk10Var = (uk10) bldVarA.e(ugi0Var, 0, vk10.f37554a, uk10Var);
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
        return new bg8(i, uk10Var, str);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bg8 bg8Var = (bg8) obj;
        bg8Var.getClass();
        String str = bg8Var.b;
        uk10 uk10Var = bg8Var.f2543a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || uk10Var != null) {
            cldVarA.p(ugi0Var, 0, vk10.f37554a, uk10Var);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
