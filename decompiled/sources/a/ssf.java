package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ssf implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ssf f32723a;
    private static final ugi0 descriptor;

    static {
        ssf ssfVar = new ssf();
        f32723a = ssfVar;
        zna0 zna0Var = new zna0("org.xplatform.special_event.impl.cyber_info.cs.data.model.CsGroupTeamResponse.Score", ssfVar, 5);
        zna0Var.j("totalMatches", true);
        zna0Var.j("matchWins", true);
        zna0Var.j("matchLosses", true);
        zna0Var.j("roundWins", true);
        zna0Var.j("roundLosses", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        okx okxVar = okx.f25427a;
        return new jiy[]{mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
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
                num3 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num3);
                i |= 4;
            } else if (iF == 3) {
                num4 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num4);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                num5 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num5);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new usf(i, num, num2, num3, num4, num5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        usf usfVar = (usf) obj;
        usfVar.getClass();
        Integer num = usfVar.e;
        Integer num2 = usfVar.d;
        Integer num3 = usfVar.c;
        Integer num4 = usfVar.b;
        Integer num5 = usfVar.f36207a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
