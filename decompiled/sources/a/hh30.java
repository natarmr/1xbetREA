package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hh30 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hh30 f13043a;
    private static final ugi0 descriptor;

    static {
        hh30 hh30Var = new hh30();
        f13043a = hh30Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.cyberstatistic.impl.data.model.matches.MatchesPlayersStatisticsResponse", hh30Var, 6);
        zna0Var.j("rating", true);
        zna0Var.j("adr", true);
        zna0Var.j("kpr", true);
        zna0Var.j("dpr", true);
        zna0Var.j("kast", true);
        zna0Var.j("impact", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        klq klqVar = klq.f18504a;
        return new jiy[]{mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar), mrv.j0(klqVar)};
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
        Float f5 = null;
        Float f6 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    f = (Float) bldVarA.e(ugi0Var, 0, klq.f18504a, f);
                    i |= 1;
                    break;
                case 1:
                    f2 = (Float) bldVarA.e(ugi0Var, 1, klq.f18504a, f2);
                    i |= 2;
                    break;
                case 2:
                    f3 = (Float) bldVarA.e(ugi0Var, 2, klq.f18504a, f3);
                    i |= 4;
                    break;
                case 3:
                    f4 = (Float) bldVarA.e(ugi0Var, 3, klq.f18504a, f4);
                    i |= 8;
                    break;
                case 4:
                    f5 = (Float) bldVarA.e(ugi0Var, 4, klq.f18504a, f5);
                    i |= 16;
                    break;
                case 5:
                    f6 = (Float) bldVarA.e(ugi0Var, 5, klq.f18504a, f6);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new jh30(i, f, f2, f3, f4, f5, f6);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        jh30 jh30Var = (jh30) obj;
        jh30Var.getClass();
        Float f = jh30Var.f;
        Float f2 = jh30Var.e;
        Float f3 = jh30Var.d;
        Float f4 = jh30Var.c;
        Float f5 = jh30Var.b;
        Float f6 = jh30Var.f16509a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || f6 != null) {
            cldVarA.p(ugi0Var, 0, klq.f18504a, f6);
        }
        if (cldVarA.u(ugi0Var) || f5 != null) {
            cldVarA.p(ugi0Var, 1, klq.f18504a, f5);
        }
        if (cldVarA.u(ugi0Var) || f4 != null) {
            cldVarA.p(ugi0Var, 2, klq.f18504a, f4);
        }
        if (cldVarA.u(ugi0Var) || f3 != null) {
            cldVarA.p(ugi0Var, 3, klq.f18504a, f3);
        }
        if (cldVarA.u(ugi0Var) || f2 != null) {
            cldVarA.p(ugi0Var, 4, klq.f18504a, f2);
        }
        if (cldVarA.u(ugi0Var) || f != null) {
            cldVarA.p(ugi0Var, 5, klq.f18504a, f);
        }
        cldVarA.c(ugi0Var);
    }
}
