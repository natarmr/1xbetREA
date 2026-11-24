package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xrf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xrf f41368a;
    private static final ugi0 descriptor;

    static {
        xrf xrfVar = new xrf();
        f41368a = xrfVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.cs2.Cs2SuicideGameLogResponse", xrfVar, 3);
        zna0Var.j("player", true);
        zna0Var.j("side", true);
        zna0Var.j("weapon", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{mrv.j0(ysm0Var), mrv.j0(hsf.f13579a), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        gsf gsfVar = null;
        String str2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                gsfVar = (gsf) bldVarA.e(ugi0Var, 1, hsf.f13579a, gsfVar);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                str2 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new zrf(i, str, gsfVar, str2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        zrf zrfVar = (zrf) obj;
        zrfVar.getClass();
        String str = zrfVar.c;
        gsf gsfVar = zrfVar.b;
        String str2 = zrfVar.f44851a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || gsfVar != null) {
            cldVarA.p(ugi0Var, 1, hsf.f13579a, gsfVar);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
