package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class erf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final erf f8278a;
    private static final ugi0 descriptor;

    static {
        erf erfVar = new erf();
        f8278a = erfVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.cs2.Cs2RoundedGameLogResponse", erfVar, 4);
        zna0Var.j("ctScore", true);
        zna0Var.j("tScore", true);
        zna0Var.j("winner", true);
        zna0Var.j("winType", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(hsf.f13579a), mrv.j0(msf.f22317a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        gsf gsfVar = null;
        lsf lsfVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                num = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num);
                i |= 1;
            } else if (iF == 1) {
                num2 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num2);
                i |= 2;
            } else if (iF == 2) {
                gsfVar = (gsf) bldVarA.e(ugi0Var, 2, hsf.f13579a, gsfVar);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                lsfVar = (lsf) bldVarA.e(ugi0Var, 3, msf.f22317a, lsfVar);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new grf(i, num, num2, gsfVar, lsfVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        grf grfVar = (grf) obj;
        grfVar.getClass();
        lsf lsfVar = grfVar.d;
        gsf gsfVar = grfVar.c;
        Integer num = grfVar.b;
        Integer num2 = grfVar.f11776a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || gsfVar != null) {
            cldVarA.p(ugi0Var, 2, hsf.f13579a, gsfVar);
        }
        if (cldVarA.u(ugi0Var) || lsfVar != null) {
            cldVarA.p(ugi0Var, 3, msf.f22317a, lsfVar);
        }
        cldVarA.c(ugi0Var);
    }
}
