package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i2y implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i2y f14071a;
    private static final ugi0 descriptor;

    static {
        i2y i2yVar = new i2y();
        f14071a = i2yVar;
        zna0 zna0Var = new zna0("org.xplatform.bet_history.history.data.model.toto.JackpotHistoryItemResponse", i2yVar, 14);
        zna0Var.j("BetId", true);
        zna0Var.j("BetDate", true);
        zna0Var.j("CouponNumber", true);
        zna0Var.j("JackpotWord", true);
        zna0Var.j("JackpotType", true);
        zna0Var.j("BetSum", true);
        zna0Var.j("WinSum", true);
        zna0Var.j("CurIso", true);
        zna0Var.j("BetStatus", true);
        zna0Var.j("Coef", true);
        zna0Var.j("ConvertedCoef", true);
        zna0Var.j("PayoutTypeMessage", true);
        zna0Var.j("ChampsWithGames", true);
        zna0Var.j("TaxInfo", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = m2y.o;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ4 = mrv.j0(okxVar);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(tblVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[12].getValue()), mrv.j0(nxu.f24299a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Long l;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = m2y.o;
        String str = null;
        String str2 = null;
        Double d = null;
        Integer num = null;
        List list = null;
        String str3 = null;
        int i = 0;
        pxu pxuVar = null;
        Long l2 = null;
        String str4 = null;
        String str5 = null;
        Integer num2 = null;
        Double d2 = null;
        Double d3 = null;
        boolean z = true;
        Long l3 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l3;
                    z = false;
                    str2 = str2;
                    str4 = str4;
                    l3 = l;
                    str = str;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l3);
                    i |= 1;
                    l2 = l2;
                    str2 = str2;
                    str4 = str4;
                    l3 = l;
                    str = str;
                    break;
                case 1:
                    str = str;
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    i |= 2;
                    str4 = str4;
                    str = str;
                    break;
                case 2:
                    str = str;
                    str4 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str4);
                    i |= 4;
                    l2 = l2;
                    str = str;
                    break;
                case 3:
                    str5 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str5);
                    i |= 8;
                    l2 = l2;
                    str4 = str4;
                    break;
                case 4:
                    num2 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num2);
                    i |= 16;
                    l2 = l2;
                    str4 = str4;
                    break;
                case 5:
                    d2 = (Double) bldVarA.e(ugi0Var, 5, tbl.f33669a, d2);
                    i |= 32;
                    l2 = l2;
                    str4 = str4;
                    break;
                case 6:
                    d3 = (Double) bldVarA.e(ugi0Var, 6, tbl.f33669a, d3);
                    i |= 64;
                    l2 = l2;
                    str4 = str4;
                    break;
                case 7:
                    str3 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str3);
                    i |= 128;
                    l2 = l2;
                    str4 = str4;
                    break;
                case 8:
                    num = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num);
                    i |= 256;
                    l2 = l2;
                    str4 = str4;
                    break;
                case 9:
                    d = (Double) bldVarA.e(ugi0Var, 9, tbl.f33669a, d);
                    i |= 512;
                    l2 = l2;
                    str4 = str4;
                    break;
                case 10:
                    str2 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str2);
                    i |= 1024;
                    l2 = l2;
                    str4 = str4;
                    break;
                case 11:
                    str = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str);
                    i |= 2048;
                    l2 = l2;
                    str4 = str4;
                    break;
                case 12:
                    list = (List) bldVarA.e(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list);
                    i |= 4096;
                    l2 = l2;
                    str4 = str4;
                    break;
                case 13:
                    pxuVar = (pxu) bldVarA.e(ugi0Var, 13, nxu.f24299a, pxuVar);
                    i |= 8192;
                    l2 = l2;
                    str4 = str4;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str6 = str;
        Long l4 = l3;
        bldVarA.c(ugi0Var);
        return new m2y(i, l4, l2, str4, str5, num2, d2, d3, str3, num, d, str2, str6, list, pxuVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        m2y m2yVar = (m2y) obj;
        m2yVar.getClass();
        pxu pxuVar = m2yVar.n;
        List list = m2yVar.m;
        String str = m2yVar.l;
        String str2 = m2yVar.k;
        Double d = m2yVar.j;
        Integer num = m2yVar.i;
        String str3 = m2yVar.h;
        Double d2 = m2yVar.g;
        Double d3 = m2yVar.f;
        Integer num2 = m2yVar.e;
        String str4 = m2yVar.d;
        String str5 = m2yVar.c;
        Long l = m2yVar.b;
        Long l2 = m2yVar.f21086a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = m2y.o;
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 5, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 6, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 9, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != 0) {
            cldVarA.p(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || pxuVar != 0) {
            cldVarA.p(ugi0Var, 13, nxu.f24299a, pxuVar);
        }
        cldVarA.c(ugi0Var);
    }
}
