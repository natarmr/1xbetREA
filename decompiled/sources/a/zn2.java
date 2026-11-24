package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zn2 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zn2 f44652a;
    private static final ugi0 descriptor;

    static {
        zn2 zn2Var = new zn2();
        f44652a = zn2Var;
        zna0 zna0Var = new zna0("org.xplatform.sportgame.core.data.models.game_details.AlterGameStatInfoResponse", zn2Var, 3);
        zna0Var.j("startDate", true);
        zna0Var.j("opponent1", true);
        zna0Var.j("opponent2", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(s710.f31729a);
        n380 n380Var = n380.f22838a;
        return new jiy[]{jiyVarJ0, mrv.j0(n380Var), mrv.j0(n380Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        p380 p380Var = null;
        p380 p380Var2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else if (iF == 1) {
                p380Var = (p380) bldVarA.e(ugi0Var, 1, n380.f22838a, p380Var);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                p380Var2 = (p380) bldVarA.e(ugi0Var, 2, n380.f22838a, p380Var2);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new bo2(i, l, p380Var, p380Var2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        bo2 bo2Var = (bo2) obj;
        bo2Var.getClass();
        p380 p380Var = bo2Var.c;
        p380 p380Var2 = bo2Var.b;
        Long l = bo2Var.f2911a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || p380Var2 != null) {
            cldVarA.p(ugi0Var, 1, n380.f22838a, p380Var2);
        }
        if (cldVarA.u(ugi0Var) || p380Var != null) {
            cldVarA.p(ugi0Var, 2, n380.f22838a, p380Var);
        }
        cldVarA.c(ugi0Var);
    }
}
