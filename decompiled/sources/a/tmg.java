package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tmg implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tmg f34193a;
    private static final ugi0 descriptor;

    static {
        tmg tmgVar = new tmg();
        f34193a = tmgVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.playerscomposition.dota.CyberDotaPlayerHeroesResponse", tmgVar, 5);
        zna0Var.j("name", true);
        zna0Var.j("image", true);
        zna0Var.j("imageS3", true);
        zna0Var.j("win_rate", true);
        zna0Var.j("matches_count", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(tbl.f33669a), mrv.j0(okx.f25427a)};
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
        Double d = null;
        Integer num = null;
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
                d = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                num = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new vmg(i, str, str2, str3, d, num);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vmg vmgVar = (vmg) obj;
        vmgVar.getClass();
        Integer num = vmgVar.e;
        Double d = vmgVar.d;
        String str = vmgVar.c;
        String str2 = vmgVar.b;
        String str3 = vmgVar.f37673a;
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
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
