package a;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qtd0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qtd0 f29295a;
    private static final ugi0 descriptor;

    static {
        qtd0 qtd0Var = new qtd0();
        f29295a = qtd0Var;
        zna0 zna0Var = new zna0("org.xplatform.statistic.races.data.models.RacesStatisticResponse", qtd0Var, 2);
        zna0Var.j("sportId", true);
        zna0Var.j("response", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(s710.f31729a), mrv.j0(ltd0.f20626a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        ntd0 ntd0Var = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                i |= 1;
            } else {
                if (iF != 1) {
                    itt0.c(iF);
                    return null;
                }
                ntd0Var = (ntd0) bldVarA.e(ugi0Var, 1, ltd0.f20626a, ntd0Var);
                i |= 2;
            }
        }
        bldVarA.c(ugi0Var);
        return new std0(i, l, ntd0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        std0 std0Var = (std0) obj;
        std0Var.getClass();
        ntd0 ntd0Var = std0Var.b;
        Long l = std0Var.f32768a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || ntd0Var != null) {
            cldVarA.p(ugi0Var, 1, ltd0.f20626a, ntd0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
