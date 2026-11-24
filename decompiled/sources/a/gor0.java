package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gor0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gor0 f11646a;
    private static final ugi0 descriptor;

    static {
        gor0 gor0Var = new gor0();
        f11646a = gor0Var;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.history.data.models.response.TotoHistoryItemResponse", gor0Var, 20);
        zna0Var.j("BetId", true);
        zna0Var.j("BetDate", true);
        zna0Var.j("BetCurrency", true);
        zna0Var.j("CouponNumber", true);
        zna0Var.j("TotoWord", true);
        zna0Var.j("TotoName", true);
        zna0Var.j("TotoType", true);
        zna0Var.j("BetSum", true);
        zna0Var.j("WinSum", true);
        zna0Var.j("CurISO", true);
        zna0Var.j("BetStatus", true);
        zna0Var.j("Coef", true);
        zna0Var.j("ConvertedCoef", true);
        zna0Var.j("IsApproved", true);
        zna0Var.j("IsPromoBet", true);
        zna0Var.j("PayOutDate", true);
        zna0Var.j("CountOutcomes", true);
        zna0Var.j("ChampsWithGames", true);
        zna0Var.j("TaxInfo", true);
        zna0Var.j("BetApproveId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = kor0.u;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ6 = mrv.j0(okxVar);
        tbl tblVar = tbl.f33669a;
        jiy jiyVarJ7 = mrv.j0(tblVar);
        jiy jiyVarJ8 = mrv.j0(tblVar);
        jiy jiyVarJ9 = mrv.j0(ysm0Var);
        jiy jiyVarJ10 = mrv.j0(okxVar);
        jiy jiyVarJ11 = mrv.j0(tblVar);
        jiy jiyVarJ12 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0((jiy) a8zVarArr[17].getValue()), mrv.j0(nxu.f24299a), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Long l;
        Double d;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = kor0.u;
        Double d2 = null;
        Integer num = null;
        String str = null;
        Double d3 = null;
        String str2 = null;
        Double d4 = null;
        int i2 = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Long l2 = null;
        Long l3 = null;
        List list = null;
        pxu pxuVar = null;
        Long l4 = null;
        boolean z = true;
        Long l5 = null;
        Long l6 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l5;
                    z = false;
                    num = num;
                    d4 = d4;
                    l5 = l;
                    d2 = d2;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l5);
                    i2 |= 1;
                    num = num;
                    d4 = d4;
                    d3 = d3;
                    l5 = l;
                    d2 = d2;
                    break;
                case 1:
                    d = d4;
                    l6 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l6);
                    i2 |= 2;
                    str3 = str3;
                    d4 = d;
                    d3 = d3;
                    d2 = d2;
                    break;
                case 2:
                    d = d4;
                    str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                    i2 |= 4;
                    d4 = d;
                    d3 = d3;
                    d2 = d2;
                    break;
                case 3:
                    d = d4;
                    str4 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str4);
                    i2 |= 8;
                    d4 = d;
                    d3 = d3;
                    d2 = d2;
                    break;
                case 4:
                    d = d4;
                    str5 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str5);
                    i2 |= 16;
                    d4 = d;
                    d3 = d3;
                    d2 = d2;
                    break;
                case 5:
                    d = d4;
                    str6 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str6);
                    i2 |= 32;
                    d4 = d;
                    d3 = d3;
                    d2 = d2;
                    break;
                case 6:
                    d = d4;
                    num2 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num2);
                    i2 |= 64;
                    d4 = d;
                    d3 = d3;
                    d2 = d2;
                    break;
                case 7:
                    d2 = d2;
                    d3 = d3;
                    d4 = (Double) bldVarA.e(ugi0Var, 7, tbl.f33669a, d4);
                    i2 |= 128;
                    d3 = d3;
                    d2 = d2;
                    break;
                case 8:
                    d2 = d2;
                    d3 = (Double) bldVarA.e(ugi0Var, 8, tbl.f33669a, d3);
                    i2 |= 256;
                    d4 = d4;
                    d2 = d2;
                    break;
                case 9:
                    d3 = d3;
                    d4 = d4;
                    str = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str);
                    i2 |= 512;
                    d4 = d4;
                    d3 = d3;
                    break;
                case 10:
                    d3 = d3;
                    d4 = d4;
                    num = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num);
                    i2 |= 1024;
                    d4 = d4;
                    d3 = d3;
                    break;
                case 11:
                    d3 = d3;
                    d4 = d4;
                    d2 = (Double) bldVarA.e(ugi0Var, 11, tbl.f33669a, d2);
                    i2 |= 2048;
                    d4 = d4;
                    d3 = d3;
                    break;
                case 12:
                    d3 = d3;
                    d4 = d4;
                    str2 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str2);
                    i2 |= 4096;
                    d4 = d4;
                    d3 = d3;
                    break;
                case 13:
                    d3 = d3;
                    d4 = d4;
                    bool = (Boolean) bldVarA.e(ugi0Var, 13, sm8.f32432a, bool);
                    i2 |= 8192;
                    d4 = d4;
                    d3 = d3;
                    break;
                case 14:
                    d3 = d3;
                    d4 = d4;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 14, sm8.f32432a, bool2);
                    i2 |= 16384;
                    d4 = d4;
                    d3 = d3;
                    break;
                case 15:
                    l2 = (Long) bldVarA.e(ugi0Var, 15, s710.f31729a, l2);
                    i = 32768;
                    i2 |= i;
                    d4 = d4;
                    d3 = d3;
                    break;
                case 16:
                    l3 = (Long) bldVarA.e(ugi0Var, 16, s710.f31729a, l3);
                    i = 65536;
                    i2 |= i;
                    d4 = d4;
                    d3 = d3;
                    break;
                case 17:
                    list = (List) bldVarA.e(ugi0Var, 17, (jiy) a8zVarArr[17].getValue(), list);
                    i = 131072;
                    i2 |= i;
                    d4 = d4;
                    d3 = d3;
                    break;
                case 18:
                    pxuVar = (pxu) bldVarA.e(ugi0Var, 18, nxu.f24299a, pxuVar);
                    i = 262144;
                    i2 |= i;
                    d4 = d4;
                    d3 = d3;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    l4 = (Long) bldVarA.e(ugi0Var, 19, s710.f31729a, l4);
                    i = 524288;
                    i2 |= i;
                    d4 = d4;
                    d3 = d3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Double d5 = d2;
        Double d6 = d4;
        Long l7 = l5;
        Long l8 = l6;
        String str7 = str3;
        bldVarA.c(ugi0Var);
        Long l9 = l4;
        return new kor0(i2, l7, l8, str7, str4, str5, str6, num2, d6, d3, str, num, d5, str2, bool, bool2, l2, l3, list, pxuVar, l9);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        kor0 kor0Var = (kor0) obj;
        kor0Var.getClass();
        Long l = kor0Var.t;
        pxu pxuVar = kor0Var.s;
        List list = kor0Var.r;
        Long l2 = kor0Var.q;
        Long l3 = kor0Var.p;
        Boolean bool = kor0Var.o;
        Boolean bool2 = kor0Var.n;
        String str = kor0Var.m;
        Double d = kor0Var.l;
        Integer num = kor0Var.k;
        String str2 = kor0Var.j;
        Double d2 = kor0Var.i;
        Double d3 = kor0Var.h;
        Integer num2 = kor0Var.g;
        String str3 = kor0Var.f;
        String str4 = kor0Var.e;
        String str5 = kor0Var.d;
        String str6 = kor0Var.c;
        Long l4 = kor0Var.b;
        Long l5 = kor0Var.f18644a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = kor0.u;
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 7, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 8, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 11, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool2 != 0) {
            cldVarA.p(ugi0Var, 13, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 14, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 15, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 16, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 17, (jiy) a8zVarArr[17].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || pxuVar != null) {
            cldVarA.p(ugi0Var, 18, nxu.f24299a, pxuVar);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 19, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
