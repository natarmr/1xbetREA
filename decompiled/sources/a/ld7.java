package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ld7 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ld7 f19836a;
    private static final ugi0 descriptor;

    static {
        ld7 ld7Var = new ld7();
        f19836a = ld7Var;
        zna0 zna0Var = new zna0("org.xplatform.bet_history.history.data.model.aggregator.BetInfos", ld7Var, 14);
        zna0Var.j("betDate", true);
        zna0Var.j("winDate", true);
        zna0Var.j("betId", true);
        zna0Var.j("betSum", true);
        zna0Var.j("betSumProvider", true);
        zna0Var.j("winSum", true);
        zna0Var.j("winSumProvider", true);
        zna0Var.j("currencyCode", true);
        zna0Var.j("currencyCodeProvider", true);
        zna0Var.j("gameId", true);
        zna0Var.j("gameName", true);
        zna0Var.j("typeGame", true);
        zna0Var.j("productId", true);
        zna0Var.j("productName", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        tbl tblVar = tbl.f33669a;
        jiy jiyVarJ3 = mrv.j0(tblVar);
        jiy jiyVarJ4 = mrv.j0(tblVar);
        jiy jiyVarJ5 = mrv.j0(tblVar);
        jiy jiyVarJ6 = mrv.j0(tblVar);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Long l;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Long l2 = null;
        String str = null;
        Long l3 = null;
        Long l4 = null;
        String str2 = null;
        int i = 0;
        String str3 = null;
        Long l5 = null;
        Long l6 = null;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        String str4 = null;
        boolean z = true;
        Long l7 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l7;
                    z = false;
                    str = str;
                    l6 = l6;
                    l7 = l;
                    l2 = l2;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l7);
                    i |= 1;
                    l5 = l5;
                    str = str;
                    l6 = l6;
                    l7 = l;
                    l2 = l2;
                    break;
                case 1:
                    l2 = l2;
                    l5 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l5);
                    i |= 2;
                    l6 = l6;
                    l2 = l2;
                    break;
                case 2:
                    l2 = l2;
                    l6 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l6);
                    i |= 4;
                    l5 = l5;
                    l2 = l2;
                    break;
                case 3:
                    d = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d);
                    i |= 8;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 4:
                    d2 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d2);
                    i |= 16;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 5:
                    d3 = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d3);
                    i |= 32;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 6:
                    d4 = (Double) bldVarA.e(ugi0Var, 6, tbl.f33669a, d4);
                    i |= 64;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 7:
                    str4 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str4);
                    i |= 128;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 8:
                    str2 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str2);
                    i |= 256;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 9:
                    l3 = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l3);
                    i |= 512;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 10:
                    str = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str);
                    i |= 1024;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 11:
                    l2 = (Long) bldVarA.e(ugi0Var, 11, s710.f31729a, l2);
                    i |= 2048;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 12:
                    l4 = (Long) bldVarA.e(ugi0Var, 12, s710.f31729a, l4);
                    i |= 4096;
                    l5 = l5;
                    l6 = l6;
                    break;
                case 13:
                    str3 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str3);
                    i |= 8192;
                    l5 = l5;
                    l6 = l6;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Long l8 = l2;
        Long l9 = l7;
        bldVarA.c(ugi0Var);
        return new nd7(i, l9, l5, l6, d, d2, d3, d4, str4, str2, l3, str, l8, l4, str3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nd7 nd7Var = (nd7) obj;
        nd7Var.getClass();
        String str = nd7Var.n;
        Long l = nd7Var.m;
        Long l2 = nd7Var.l;
        String str2 = nd7Var.k;
        Long l3 = nd7Var.j;
        String str3 = nd7Var.i;
        String str4 = nd7Var.h;
        Double d = nd7Var.g;
        Double d2 = nd7Var.f;
        Double d3 = nd7Var.e;
        Double d4 = nd7Var.d;
        Long l4 = nd7Var.c;
        Long l5 = nd7Var.b;
        Long l6 = nd7Var.f23326a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l6 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l6);
        }
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || d4 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d4);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 5, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 6, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 11, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != 0) {
            cldVarA.p(ugi0Var, 12, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str != 0) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
