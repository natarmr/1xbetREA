package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tbq implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tbq f33677a;
    private static final ugi0 descriptor;

    static {
        tbq tbqVar = new tbq();
        f33677a = tbqVar;
        zna0 zna0Var = new zna0("org.xplatform.feature.fin_bet.impl.data.model.FinanceEventResponse", tbqVar, 7);
        zna0Var.j("CV", true);
        zna0Var.j("Cf", true);
        zna0Var.j("Price", true);
        zna0Var.j("Seconds", true);
        zna0Var.j("Time", true);
        zna0Var.j("Type", true);
        zna0Var.j("Block", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(ysm0.f43175a);
        tbl tblVar = tbl.f33669a;
        jiy jiyVarJ1 = mrv.j0(tblVar);
        jiy jiyVarJ2 = mrv.j0(tblVar);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(okx.f25427a), mrv.j0(sm8.f32432a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        boolean z = true;
        int i = 0;
        String str = null;
        Double d = null;
        Double d2 = null;
        Long l = null;
        Long l2 = null;
        Integer num = null;
        Boolean bool = null;
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
                    d = (Double) bldVarA.e(ugi0Var, 1, tbl.f33669a, d);
                    i |= 2;
                    break;
                case 2:
                    d2 = (Double) bldVarA.e(ugi0Var, 2, tbl.f33669a, d2);
                    i |= 4;
                    break;
                case 3:
                    l = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l);
                    i |= 8;
                    break;
                case 4:
                    l2 = (Long) bldVarA.e(ugi0Var, 4, s710.f31729a, l2);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num);
                    i |= 32;
                    break;
                case 6:
                    bool = (Boolean) bldVarA.e(ugi0Var, 6, sm8.f32432a, bool);
                    i |= 64;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new vbq(i, str, d, d2, l, l2, num, bool);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        vbq vbqVar = (vbq) obj;
        vbqVar.getClass();
        Boolean bool = vbqVar.g;
        Integer num = vbqVar.f;
        Long l = vbqVar.e;
        Long l2 = vbqVar.d;
        Double d = vbqVar.c;
        Double d2 = vbqVar.b;
        String str = vbqVar.f37151a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 0, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 1, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 2, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 4, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 6, sm8.f32432a, bool);
        }
        cldVarA.c(ugi0Var);
    }
}
