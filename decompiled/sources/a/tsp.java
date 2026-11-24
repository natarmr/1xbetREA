package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tsp implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tsp f34471a;
    private static final ugi0 descriptor;

    static {
        tsp tspVar = new tsp();
        f34471a = tspVar;
        zna0 zna0Var = new zna0("org.xplatform.ufc.impl.game.data.fight.model.FightResponse", tspVar, 7);
        zna0Var.j("fightID", true);
        zna0Var.j("cardSegment", true);
        zna0Var.j("weightClass", true);
        zna0Var.j("result", true);
        zna0Var.j("red", true);
        zna0Var.j("blue", true);
        zna0Var.j("stats", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        jiy jiyVarJ1 = mrv.j0(ysm0.f43175a);
        jiy jiyVarJ2 = mrv.j0(f8v0.f9128a);
        jiy jiyVarJ3 = mrv.j0(ysp.f43180a);
        ksp kspVar = ksp.f18825a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, mrv.j0(kspVar), mrv.j0(kspVar), mrv.j0(sup.f32832a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        String str = null;
        e8v0 e8v0Var = null;
        atp atpVar = null;
        msp mspVar = null;
        msp mspVar2 = null;
        uup uupVar = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    i |= 1;
                    break;
                case 1:
                    str = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str);
                    i |= 2;
                    break;
                case 2:
                    e8v0Var = (e8v0) bldVarA.e(ugi0Var, 2, f8v0.f9128a, e8v0Var);
                    i |= 4;
                    break;
                case 3:
                    atpVar = (atp) bldVarA.e(ugi0Var, 3, ysp.f43180a, atpVar);
                    i |= 8;
                    break;
                case 4:
                    mspVar = (msp) bldVarA.e(ugi0Var, 4, ksp.f18825a, mspVar);
                    i |= 16;
                    break;
                case 5:
                    mspVar2 = (msp) bldVarA.e(ugi0Var, 5, ksp.f18825a, mspVar2);
                    i |= 32;
                    break;
                case 6:
                    uupVar = (uup) bldVarA.e(ugi0Var, 6, sup.f32832a, uupVar);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new vsp(i, l, str, e8v0Var, atpVar, mspVar, mspVar2, uupVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vsp vspVar = (vsp) obj;
        vspVar.getClass();
        uup uupVar = vspVar.g;
        msp mspVar = vspVar.f;
        msp mspVar2 = vspVar.e;
        atp atpVar = vspVar.d;
        e8v0 e8v0Var = vspVar.c;
        String str = vspVar.b;
        Long l = vspVar.f37961a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || e8v0Var != null) {
            cldVarA.p(ugi0Var, 2, f8v0.f9128a, e8v0Var);
        }
        if (cldVarA.u(ugi0Var) || atpVar != null) {
            cldVarA.p(ugi0Var, 3, ysp.f43180a, atpVar);
        }
        if (cldVarA.u(ugi0Var) || mspVar2 != null) {
            cldVarA.p(ugi0Var, 4, ksp.f18825a, mspVar2);
        }
        if (cldVarA.u(ugi0Var) || mspVar != null) {
            cldVarA.p(ugi0Var, 5, ksp.f18825a, mspVar);
        }
        if (cldVarA.u(ugi0Var) || uupVar != null) {
            cldVarA.p(ugi0Var, 6, sup.f32832a, uupVar);
        }
        cldVarA.c(ugi0Var);
    }
}
