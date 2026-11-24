package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gzl0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gzl0 f12185a;
    private static final ugi0 descriptor;

    static {
        gzl0 gzl0Var = new gzl0();
        f12185a = gzl0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.tournaments.data.models.StageItemResponse", gzl0Var, 3);
        zna0Var.j("blockPrize", true);
        zna0Var.j("crmNecessaryPoints", true);
        zna0Var.j("crmStageId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        return new jiy[]{mrv.j0(x88.f40451a), mrv.j0(okx.f25427a), mrv.j0(s710.f31729a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        z88 z88Var = null;
        Integer num = null;
        Long l = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            if (iF == -1) {
                z = false;
            } else if (iF == 0) {
                z88Var = (z88) bldVarA.e(ugi0Var, 0, x88.f40451a, z88Var);
                i |= 1;
            } else if (iF == 1) {
                num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                i |= 2;
            } else {
                if (iF != 2) {
                    itt0.c(iF);
                    return null;
                }
                l = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l);
                i |= 4;
            }
        }
        bldVarA.c(ugi0Var);
        return new izl0(i, z88Var, num, l);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        izl0 izl0Var = (izl0) obj;
        izl0Var.getClass();
        Long l = izl0Var.c;
        Integer num = izl0Var.b;
        z88 z88Var = izl0Var.f15640a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || z88Var != null) {
            cldVarA.p(ugi0Var, 0, x88.f40451a, z88Var);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
