package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bdo0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bdo0 f2408a;
    private static final ugi0 descriptor;

    static {
        bdo0 bdo0Var = new bdo0();
        f2408a = bdo0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.player.players_statistic.data.models.TabResponse", bdo0Var, 4);
        zna0Var.j("title", true);
        zna0Var.j("titleRefType", true);
        zna0Var.j("titleRefId", true);
        zna0Var.j("table", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(okx.f25427a), mrv.j0(ysm0Var), mrv.j0(jko0.f16681a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        String str2 = null;
        rko0 rko0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else if (iF == 2) {
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                rko0Var = (rko0) bldVarA.e(ugi0Var, 3, jko0.f16681a, rko0Var);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new fdo0(i, str, num, str2, rko0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        fdo0 fdo0Var = (fdo0) obj;
        fdo0Var.getClass();
        rko0 rko0Var = fdo0Var.d;
        String str = fdo0Var.c;
        Integer num = fdo0Var.b;
        String str2 = fdo0Var.f9368a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || rko0Var != null) {
            cldVarA.p(ugi0Var, 3, jko0.f16681a, rko0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
