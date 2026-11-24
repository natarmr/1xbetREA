package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class lrr0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lrr0 f20547a;
    private static final ugi0 descriptor;

    static {
        lrr0 lrr0Var = new lrr0();
        f20547a = lrr0Var;
        zna0 zna0Var = new zna0("org.xplatform.toto_jackpot.impl.data.model.TotoJackpotTiragResponse", lrr0Var, 10);
        zna0Var.j("TiragNumber", true);
        zna0Var.j("EndReceiptDate", true);
        zna0Var.j("EndTiragDate", true);
        zna0Var.j("Pool", true);
        zna0Var.j("MaxJackpotBanner", true);
        zna0Var.j("UpdateDate", true);
        zna0Var.j("MinBetSum", true);
        zna0Var.j("MaxBetSum", true);
        zna0Var.j("MaxPool", true);
        zna0Var.j("ChampsWithGames", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = nrr0.k;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(s710Var);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0((jiy) a8zVarArr[9].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = nrr0.k;
        List list = null;
        Double d = null;
        boolean z = true;
        Double d2 = null;
        int i = 0;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        String str = null;
        String str2 = null;
        Long l4 = null;
        Double d3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    continue;
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
                    str = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str2);
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
                    d2 = (Double) bldVarA.e(ugi0Var, 7, tbl.f33669a, d2);
                    i |= 128;
                    break;
                case 8:
                    d = (Double) bldVarA.e(ugi0Var, 8, tbl.f33669a, d);
                    i |= 256;
                    break;
                case 9:
                    list = (List) bldVarA.e(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
            a8zVarArr = a8zVarArr;
        }
        bldVarA.c(ugi0Var);
        return new nrr0(i, l, l2, l3, str, str2, l4, d3, d2, d, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nrr0 nrr0Var = (nrr0) obj;
        nrr0Var.getClass();
        List list = nrr0Var.j;
        Double d = nrr0Var.i;
        Double d2 = nrr0Var.h;
        Double d3 = nrr0Var.g;
        Long l = nrr0Var.f;
        String str = nrr0Var.e;
        String str2 = nrr0Var.d;
        Long l2 = nrr0Var.c;
        Long l3 = nrr0Var.b;
        Long l4 = nrr0Var.f24019a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = nrr0.k;
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 6, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 7, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 8, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 9, (jiy) a8zVarArr[9].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
