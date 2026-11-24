package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aeu0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aeu0 f747a;
    private static final ugi0 descriptor;

    static {
        aeu0 aeu0Var = new aeu0();
        f747a = aeu0Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.VictoryFormulaResponse", aeu0Var, 5);
        zna0Var.j("P1", true);
        zna0Var.j("P2", true);
        zna0Var.j("F1", true);
        zna0Var.j("F2", true);
        zna0Var.j("RG", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
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
        String str5 = null;
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
                str5 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str5);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new ceu0(i, str, str2, str3, str4, str5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ceu0 ceu0Var = (ceu0) obj;
        ceu0Var.getClass();
        String str = ceu0Var.e;
        String str2 = ceu0Var.d;
        String str3 = ceu0Var.c;
        String str4 = ceu0Var.b;
        String str5 = ceu0Var.f4231a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
