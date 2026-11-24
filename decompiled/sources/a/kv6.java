package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kv6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kv6 f18941a;
    private static final ugi0 descriptor;

    static {
        kv6 kv6Var = new kv6();
        f18941a = kv6Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_constructor.impl.bets.data.models.BetEventResponse", kv6Var, 6);
        zna0Var.j("c", true);
        zna0Var.j("p", true);
        zna0Var.j("b", true);
        zna0Var.j("t", true);
        zna0Var.j("cv", true);
        zna0Var.j("eventParams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        tbl tblVar = tbl.f33669a;
        return new jiy[]{mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(sm8.f32432a), mrv.j0(s710.f31729a), mrv.j0(ysm0.f43175a), mrv.j0(nv6.f24175a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Double d = null;
        Double d2 = null;
        Boolean bool = null;
        Long l = null;
        String str = null;
        pv6 pv6Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    break;
                case 0:
                    d = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d);
                    i |= 1;
                    break;
                case 1:
                    d2 = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d2);
                    i |= 2;
                    break;
                case 2:
                    bool = (Boolean) bldVarA.e(ugi0Var, 2, sm8.f32432a, bool);
                    i |= 4;
                    break;
                case 3:
                    l = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l);
                    i |= 8;
                    break;
                case 4:
                    str = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str);
                    i |= 16;
                    break;
                case 5:
                    pv6Var = (pv6) bldVarA.e(ugi0Var, 5, nv6.f24175a, pv6Var);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new rv6(i, d, d2, bool, l, str, pv6Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        rv6 rv6Var = (rv6) obj;
        rv6Var.getClass();
        pv6 pv6Var = rv6Var.f;
        String str = rv6Var.e;
        Long l = rv6Var.d;
        Boolean bool = rv6Var.c;
        Double d = rv6Var.b;
        Double d2 = rv6Var.f31156a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 2, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || pv6Var != null) {
            cldVarA.p(ugi0Var, 5, nv6.f24175a, pv6Var);
        }
        cldVarA.c(ugi0Var);
    }
}
