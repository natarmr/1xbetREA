package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ct30 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ct30 f4917a;
    private static final ugi0 descriptor;

    static {
        ct30 ct30Var = new ct30();
        f4917a = ct30Var;
        zna0 zna0Var = new zna0("org.xplatform.bonus_games.impl.memories.data.models.MemoryResponse", ct30Var, 6);
        zna0Var.j("UI", true);
        zna0Var.j("PT", true);
        zna0Var.j("RT", true);
        zna0Var.j("GM", true);
        zna0Var.j("BAC", true);
        zna0Var.j("BL", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ur30.f36146a), mrv.j0(s710Var), mrv.j0(tbl.f33669a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        Long l = null;
        Integer num = null;
        Integer num2 = null;
        wr30 wr30Var = null;
        Long l2 = null;
        Double d = null;
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
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num2);
                    i |= 4;
                    break;
                case 3:
                    wr30Var = (wr30) bldVarA.e(ugi0Var, 3, ur30.f36146a, wr30Var);
                    i |= 8;
                    break;
                case 4:
                    l2 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l2);
                    i |= 16;
                    break;
                case 5:
                    d = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d);
                    i |= 32;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new et30(i, l, num, num2, wr30Var, l2, d);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        et30 et30Var = (et30) obj;
        et30Var.getClass();
        Double d = et30Var.f;
        Long l = et30Var.e;
        wr30 wr30Var = et30Var.d;
        Integer num = et30Var.c;
        Integer num2 = et30Var.b;
        Long l2 = et30Var.f8358a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || wr30Var != null) {
            cldVarA.p(ugi0Var, 3, ur30.f36146a, wr30Var);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 5, tbl.f33669a, d);
        }
        cldVarA.c(ugi0Var);
    }
}
