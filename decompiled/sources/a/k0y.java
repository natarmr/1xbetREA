package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k0y implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0y f17491a;
    private static final ugi0 descriptor;

    static {
        k0y k0yVar = new k0y();
        f17491a = k0yVar;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.history.data.models.response.jackpot.JackpotCouponResponse", k0yVar, 16);
        zna0Var.j("BetDate", true);
        zna0Var.j("BetStatus", true);
        zna0Var.j("CouponNumber", true);
        zna0Var.j("BetSum", true);
        zna0Var.j("WinSum", true);
        zna0Var.j("PayOutDate", true);
        zna0Var.j("JackpotWord", true);
        zna0Var.j("JackpotType", true);
        zna0Var.j("TiragNumber", true);
        zna0Var.j("Coef", true);
        zna0Var.j("ConvertedCoef", true);
        zna0Var.j("CountOutcomes", true);
        zna0Var.j("PayoutTypeMessage", true);
        zna0Var.j("PayoutPromoCode", true);
        zna0Var.j("ChampsWithGames", true);
        zna0Var.j("TaxInfo", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = o0y.q;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ1 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(tblVar), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[14].getValue()), mrv.j0(nxu.f24299a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Long l;
        Double d;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = o0y.q;
        Integer num = null;
        String str = null;
        Double d2 = null;
        Integer num2 = null;
        String str2 = null;
        Integer num3 = null;
        int i = 0;
        String str3 = null;
        List list = null;
        pxu pxuVar = null;
        Double d3 = null;
        Double d4 = null;
        Long l2 = null;
        String str4 = null;
        boolean z = true;
        Long l3 = null;
        Integer num4 = null;
        String str5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l3;
                    z = false;
                    str = str;
                    d4 = d4;
                    l3 = l;
                    num = num;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l3);
                    i |= 1;
                    str = str;
                    d3 = d3;
                    d4 = d4;
                    l3 = l;
                    num = num;
                    break;
                case 1:
                    d = d3;
                    num4 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num4);
                    i |= 2;
                    str5 = str5;
                    d3 = d;
                    d4 = d4;
                    num = num;
                    break;
                case 2:
                    d = d3;
                    str5 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str5);
                    i |= 4;
                    d3 = d;
                    d4 = d4;
                    num = num;
                    break;
                case 3:
                    num = num;
                    d4 = d4;
                    d3 = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d3);
                    i |= 8;
                    d4 = d4;
                    num = num;
                    break;
                case 4:
                    num = num;
                    d4 = (Double) bldVarA.e(ugi0Var, 4, tbl.f33669a, d4);
                    i |= 16;
                    d3 = d3;
                    num = num;
                    break;
                case 5:
                    l2 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l2);
                    i |= 32;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 6:
                    str4 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str4);
                    i |= 64;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 7:
                    num3 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num3);
                    i |= 128;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 8:
                    num2 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num2);
                    i |= 256;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 9:
                    d2 = (Double) bldVarA.e(ugi0Var, 9, tbl.f33669a, d2);
                    i |= 512;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 10:
                    str = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str);
                    i |= 1024;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 11:
                    num = (Integer) bldVarA.e(ugi0Var, 11, okx.f25427a, num);
                    i |= 2048;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 12:
                    str2 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str2);
                    i |= 4096;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 13:
                    str3 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str3);
                    i |= 8192;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 14:
                    list = (List) bldVarA.e(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list);
                    i |= 16384;
                    d3 = d3;
                    d4 = d4;
                    break;
                case 15:
                    pxuVar = (pxu) bldVarA.e(ugi0Var, 15, nxu.f24299a, pxuVar);
                    i |= 32768;
                    d3 = d3;
                    d4 = d4;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Integer num5 = num;
        Double d5 = d4;
        Long l4 = l3;
        Integer num6 = num4;
        String str6 = str5;
        bldVarA.c(ugi0Var);
        return new o0y(i, l4, num6, str6, d3, d5, l2, str4, num3, num2, d2, str, num5, str2, str3, list, pxuVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        o0y o0yVar = (o0y) obj;
        o0yVar.getClass();
        pxu pxuVar = o0yVar.p;
        List list = o0yVar.o;
        String str = o0yVar.n;
        String str2 = o0yVar.m;
        Integer num = o0yVar.l;
        String str3 = o0yVar.k;
        Double d = o0yVar.j;
        Integer num2 = o0yVar.i;
        Integer num3 = o0yVar.h;
        String str4 = o0yVar.g;
        Long l = o0yVar.f;
        Double d2 = o0yVar.e;
        Double d3 = o0yVar.d;
        String str5 = o0yVar.c;
        Integer num4 = o0yVar.b;
        Long l2 = o0yVar.f24452a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = o0y.q;
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 4, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 9, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 11, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str2 != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != 0) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || pxuVar != null) {
            cldVarA.p(ugi0Var, 15, nxu.f24299a, pxuVar);
        }
        cldVarA.c(ugi0Var);
    }
}
