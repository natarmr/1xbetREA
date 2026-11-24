package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nca0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nca0 f23283a;
    private static final ugi0 descriptor;

    static {
        nca0 nca0Var = new nca0();
        f23283a = nca0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.player.impl.player.player_transfers.data.model.PlayerTransferValueResponse", nca0Var, 4);
        zna0Var.j("date", true);
        zna0Var.j("team1", true);
        zna0Var.j("team2", true);
        zna0Var.j("transferType", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var)};
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
                str4 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str4);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new pca0(i, str, str2, str3, str4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pca0 pca0Var = (pca0) obj;
        pca0Var.getClass();
        String str = pca0Var.d;
        String str2 = pca0Var.c;
        String str3 = pca0Var.b;
        String str4 = pca0Var.f26750a;
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
        cldVarA.c(ugi0Var);
    }
}
