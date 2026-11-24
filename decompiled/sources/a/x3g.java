package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x3g implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x3g f40216a;
    private static final ugi0 descriptor;

    static {
        x3g x3gVar = new x3g();
        f40216a = x3gVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.cyberstatistic.impl.data.model.matches.cs.CyberCSMatchesStatisticMatchTeamPlayerResponse", x3gVar, 7);
        zna0Var.j("name", true);
        zna0Var.j("kills", true);
        zna0Var.j("deaths", true);
        zna0Var.j("assists", true);
        zna0Var.j("kast", true);
        zna0Var.j("adr", true);
        zna0Var.j("rating", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ1 = mrv.j0(okxVar);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(okxVar);
        klq klqVar = klq.f18504a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Float f = null;
        Float f2 = null;
        Float f3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) bldVarA.e(ugi0Var, 0, ysm0.f43175a, str);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num3);
                    i |= 8;
                    break;
                case 4:
                    f = (Float) bldVarA.e(ugi0Var, 4, klq.f18504a, f);
                    i |= 16;
                    break;
                case 5:
                    f2 = (Float) bldVarA.e(ugi0Var, 5, klq.f18504a, f2);
                    i |= 32;
                    break;
                case 6:
                    f3 = (Float) bldVarA.e(ugi0Var, 6, klq.f18504a, f3);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new z3g(i, str, num, num2, num3, f, f2, f3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        z3g z3gVar = (z3g) obj;
        z3gVar.getClass();
        Float f = z3gVar.g;
        Float f2 = z3gVar.f;
        Float f3 = z3gVar.e;
        Integer num = z3gVar.d;
        Integer num2 = z3gVar.c;
        Integer num3 = z3gVar.b;
        String str = z3gVar.f43715a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || f3 != null) {
            cldVarA.p(ugi0Var, 4, klq.f18504a, f3);
        }
        if (cldVarA.u(ugi0Var) || f2 != null) {
            cldVarA.p(ugi0Var, 5, klq.f18504a, f2);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 6, klq.f18504a, f);
        }
        cldVarA.c(ugi0Var);
    }
}
