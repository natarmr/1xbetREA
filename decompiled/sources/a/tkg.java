package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tkg implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tkg f34092a;
    private static final ugi0 descriptor;

    static {
        tkg tkgVar = new tkg();
        f34092a = tkgVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.playerscomposition.cs.CyberCs2CompositionPlayerStatLineupResponse", tkgVar, 4);
        zna0Var.j("rating", true);
        zna0Var.j("adr", true);
        zna0Var.j("kpr", true);
        zna0Var.j("dpr", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        klq klqVar = klq.f18504a;
        return new jiy[]{mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        Float f4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                f = (Float) bldVarA.e(ugi0Var, 0, klq.f18504a, f);
                i |= 1;
            } else if (iF == 1) {
                f2 = (Float) bldVarA.e(ugi0Var, 1, klq.f18504a, f2);
                i |= 2;
            } else if (iF == 2) {
                f3 = (Float) bldVarA.e(ugi0Var, 2, klq.f18504a, f3);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                f4 = (Float) bldVarA.e(ugi0Var, 3, klq.f18504a, f4);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new vkg(i, f, f2, f3, f4);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vkg vkgVar = (vkg) obj;
        vkgVar.getClass();
        Float f = vkgVar.d;
        Float f2 = vkgVar.c;
        Float f3 = vkgVar.b;
        Float f4 = vkgVar.f37570a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || f4 != null) {
            cldVarA.p(ugi0Var, 0, klq.f18504a, f4);
        }
        if (cldVarA.u(ugi0Var) || f3 != null) {
            cldVarA.p(ugi0Var, 1, klq.f18504a, f3);
        }
        if (cldVarA.u(ugi0Var) || f2 != null) {
            cldVarA.p(ugi0Var, 2, klq.f18504a, f2);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 3, klq.f18504a, f);
        }
        cldVarA.c(ugi0Var);
    }
}
