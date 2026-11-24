package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bfa implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bfa f2493a;
    private static final ugi0 descriptor;

    static {
        bfa bfaVar = new bfa();
        f2493a = bfaVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.games.card_ckricket.CardCricketRoundResponse", bfaVar, 4);
        zna0Var.j("Bat", true);
        zna0Var.j("Bow", true);
        zna0Var.j("P", true);
        zna0Var.j("W", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        moa moaVar = moa.f22125a;
        return new jiy[]{mrv.j0(moaVar), mrv.j0(moaVar), mrv.j0(okx.f25427a), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        ooa ooaVar = null;
        ooa ooaVar2 = null;
        Integer num = null;
        Boolean bool = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                ooaVar = (ooa) bldVarA.e(ugi0Var, 0, moa.f22125a, ooaVar);
                i |= 1;
            } else if (iF == 1) {
                ooaVar2 = (ooa) bldVarA.e(ugi0Var, 1, moa.f22125a, ooaVar2);
                i |= 2;
            } else if (iF == 2) {
                num = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num);
                i |= 4;
            } else {
                if (iF != 3) {
                    itt0.c(iF);
                    return null;
                }
                bool = (Boolean) bldVarA.e(ugi0Var, 3, sm8.f32432a, bool);
                i |= 8;
            }
        }
        bldVarA.c(ugi0Var);
        return new dfa(i, ooaVar, ooaVar2, num, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dfa dfaVar = (dfa) obj;
        dfaVar.getClass();
        Boolean bool = dfaVar.d;
        Integer num = dfaVar.c;
        ooa ooaVar = dfaVar.b;
        ooa ooaVar2 = dfaVar.f5990a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || ooaVar2 != null) {
            cldVarA.p(ugi0Var, 0, moa.f22125a, ooaVar2);
        }
        if (cldVarA.u(ugi0Var) || ooaVar != null) {
            cldVarA.p(ugi0Var, 1, moa.f22125a, ooaVar);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 3, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
