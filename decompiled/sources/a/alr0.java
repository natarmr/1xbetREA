package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class alr0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final alr0 f1082a;
    private static final ugi0 descriptor;

    static {
        alr0 alr0Var = new alr0();
        f1082a = alr0Var;
        zna0 zna0Var = new zna0("org.xplatform.toto_bet.active_tirage.data.model.response.TotoBetResponse", alr0Var, 9);
        zna0Var.j("TiragNumber", true);
        zna0Var.j("EndReceiptDate", true);
        zna0Var.j("EndTiragDate", true);
        zna0Var.j("Pool", true);
        zna0Var.j("Jackpot", true);
        zna0Var.j("UpdateDate", true);
        zna0Var.j("MinBetSum", true);
        zna0Var.j("MaxBetSum", true);
        zna0Var.j("ChampsWithGames", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = clr0.j;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(tblVar), mrv.j0(ysm0.f43175a), mrv.j0(s710Var), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0((jiy) a8zVarArr[8].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = clr0.j;
        List list = null;
        boolean z = true;
        Double d = null;
        int i = 0;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Double d2 = null;
        String str = null;
        Long l4 = null;
        Double d3 = null;
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
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    break;
                case 2:
                    l3 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l3);
                    i |= 4;
                    break;
                case 3:
                    d2 = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d2);
                    i |= 8;
                    break;
                case 4:
                    str = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str);
                    i |= 16;
                    break;
                case 5:
                    l4 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l4);
                    i |= 32;
                    break;
                case 6:
                    d3 = (Double) bldVarA.e(ugi0Var, 6, tbl.f33669a, d3);
                    i |= 64;
                    break;
                case 7:
                    d = (Double) bldVarA.e(ugi0Var, 7, tbl.f33669a, d);
                    i |= 128;
                    break;
                case 8:
                    list = (List) bldVarA.e(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list);
                    i |= 256;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        bldVarA.c(ugi0Var);
        return new clr0(i, l, l2, l3, d2, str, l4, d3, d, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        clr0 clr0Var = (clr0) obj;
        clr0Var.getClass();
        List list = clr0Var.i;
        Double d = clr0Var.h;
        Double d2 = clr0Var.g;
        Long l = clr0Var.f;
        String str = clr0Var.e;
        Double d3 = clr0Var.d;
        Long l2 = clr0Var.c;
        Long l3 = clr0Var.b;
        Long l4 = clr0Var.f4574a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = clr0.j;
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 6, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 7, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 8, (jiy) a8zVarArr[8].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
