package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nha implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nha f23523a;
    private static final ugi0 descriptor;

    static {
        nha nhaVar = new nha();
        f23523a = nhaVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.card_football.CardFootballResponse", nhaVar, 5);
        zna0Var.j("AttackCount", true);
        zna0Var.j("Team1", true);
        zna0Var.j("Team2", true);
        zna0Var.j("Goal1", true);
        zna0Var.j("Goal2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        uha uhaVar = uha.f35667a;
        jiy jiyVarJ1 = mrv.j0(uhaVar);
        jiy jiyVarJ2 = mrv.j0(uhaVar);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(sm8Var), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        wha whaVar = null;
        wha whaVar2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                i |= 1;
            } else if (iF == 1) {
                whaVar = (wha) bldVarA.e(ugi0Var, 1, uha.f35667a, whaVar);
                i |= 2;
            } else if (iF == 2) {
                whaVar2 = (wha) bldVarA.e(ugi0Var, 2, uha.f35667a, whaVar2);
                i |= 4;
            } else if (iF == 3) {
                bool = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool);
                i |= 8;
            } else {
                if (iF != 4) {
                    itt0.c(iF);
                    return null;
                }
                bool2 = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool2);
                i |= 16;
            }
        }
        bldVarA.c(ugi0Var);
        return new pha(i, str, whaVar, whaVar2, bool, bool2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        pha phaVar = (pha) obj;
        phaVar.getClass();
        Boolean bool = phaVar.e;
        Boolean bool2 = phaVar.d;
        wha whaVar = phaVar.c;
        wha whaVar2 = phaVar.b;
        String str = phaVar.f26986a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || whaVar2 != null) {
            cldVarA.p(ugi0Var, 1, uha.f35667a, whaVar2);
        }
        if (cldVarA.u(ugi0Var) || whaVar != null) {
            cldVarA.p(ugi0Var, 2, uha.f35667a, whaVar);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
