package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ycq implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ycq f42393a;
    private static final ugi0 descriptor;

    static {
        ycq ycqVar = new ycq();
        f42393a = ycqVar;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.generate_coupon.data.model.FindCouponDescResponse", ycqVar, 26);
        zna0Var.j(TokenNames.C, true);
        zna0Var.j("CP", true);
        zna0Var.j("CV", true);
        zna0Var.j("GS", true);
        zna0Var.j("GTI", true);
        zna0Var.j("GVI", true);
        zna0Var.j("MG", true);
        zna0Var.j(TokenNames.I, true);
        zna0Var.j("KND", true);
        zna0Var.j(TokenNames.L, true);
        zna0Var.j("MN", true);
        zna0Var.j("N", true);
        zna0Var.j("O1", true);
        zna0Var.j("O1IMG", true);
        zna0Var.j("O2", true);
        zna0Var.j("O2IMG", true);
        zna0Var.j("P", true);
        zna0Var.j(TokenNames.S, true);
        zna0Var.j("SI", true);
        zna0Var.j("SN", true);
        zna0Var.j(TokenNames.T, true);
        zna0Var.j("TG", true);
        zna0Var.j("TN", true);
        zna0Var.j(TokenNames.V, true);
        zna0Var.j("PRMS", true);
        zna0Var.j("PNS", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = adq.A;
        tbl tblVar = tbl.f33669a;
        jiy jiyVarJ0 = mrv.j0(tblVar);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ1 = mrv.j0(okxVar);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(s710Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[13].getValue()), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[15].getValue()), mrv.j0(tblVar), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[24].getValue()), mrv.j0((jiy) a8zVarArr[25].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        List list;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = adq.A;
        List list2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list3 = null;
        Long l = null;
        int i2 = 0;
        List list4 = null;
        String str4 = null;
        List list5 = null;
        Double d = null;
        Long l2 = null;
        Long l3 = null;
        String str5 = null;
        boolean z = true;
        Double d2 = null;
        Integer num = null;
        String str6 = null;
        Long l4 = null;
        Integer num2 = null;
        Integer num3 = null;
        Long l5 = null;
        Long l6 = null;
        Integer num4 = null;
        String str7 = null;
        String str8 = null;
        Integer num5 = null;
        String str9 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    str2 = str2;
                    list4 = list4;
                    d2 = d2;
                    str = str;
                    break;
                case 0:
                    list2 = list2;
                    i2 |= 1;
                    str2 = str2;
                    list4 = list4;
                    str = str;
                    d2 = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d2);
                    list2 = list2;
                    break;
                case 1:
                    list = list4;
                    num = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num);
                    i2 |= 2;
                    str6 = str6;
                    list4 = list;
                    str = str;
                    list2 = list2;
                    break;
                case 2:
                    list = list4;
                    str6 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str6);
                    i2 |= 4;
                    list4 = list;
                    str = str;
                    list2 = list2;
                    break;
                case 3:
                    list = list4;
                    l4 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l4);
                    i2 |= 8;
                    list4 = list;
                    str = str;
                    list2 = list2;
                    break;
                case 4:
                    list = list4;
                    num2 = (Integer) bldVarA.e(ugi0Var, 4, okx.f25427a, num2);
                    i2 |= 16;
                    list4 = list;
                    str = str;
                    list2 = list2;
                    break;
                case 5:
                    list = list4;
                    num3 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num3);
                    i2 |= 32;
                    list4 = list;
                    str = str;
                    list2 = list2;
                    break;
                case 6:
                    list = list4;
                    l5 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l5);
                    i2 |= 64;
                    list4 = list;
                    str = str;
                    list2 = list2;
                    break;
                case 7:
                    list = list4;
                    l6 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l6);
                    i2 |= 128;
                    list4 = list;
                    str = str;
                    list2 = list2;
                    break;
                case 8:
                    list = list4;
                    num4 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num4);
                    i2 |= 256;
                    list4 = list;
                    str = str;
                    list2 = list2;
                    break;
                case 9:
                    list = list4;
                    str7 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str7);
                    i2 |= 512;
                    list4 = list;
                    str = str;
                    list2 = list2;
                    break;
                case 10:
                    list = list4;
                    str8 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str8);
                    i2 |= 1024;
                    list4 = list;
                    str = str;
                    list2 = list2;
                    break;
                case 11:
                    list = list4;
                    num5 = (Integer) bldVarA.e(ugi0Var, 11, okx.f25427a, num5);
                    i2 |= 2048;
                    list4 = list;
                    str = str;
                    list2 = list2;
                    break;
                case 12:
                    list = list4;
                    str9 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str9);
                    i2 |= 4096;
                    list4 = list;
                    str = str;
                    list2 = list2;
                    break;
                case 13:
                    list2 = list2;
                    str = str;
                    list4 = (List) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list4);
                    i2 |= 8192;
                    str = str;
                    list2 = list2;
                    break;
                case 14:
                    list4 = list4;
                    str4 = (String) bldVarA.e(ugi0Var, 14, ysm0.f43175a, str4);
                    i2 |= 16384;
                    list4 = list4;
                    break;
                case 15:
                    list5 = (List) bldVarA.e(ugi0Var, 15, (jiy) a8zVarArr[15].getValue(), list5);
                    i = 32768;
                    i2 |= i;
                    list4 = list4;
                    break;
                case 16:
                    d = (Double) bldVarA.e(ugi0Var, 16, tbl.f33669a, d);
                    i = 65536;
                    i2 |= i;
                    list4 = list4;
                    break;
                case 17:
                    l2 = (Long) bldVarA.e(ugi0Var, 17, s710.f31729a, l2);
                    i = 131072;
                    i2 |= i;
                    list4 = list4;
                    break;
                case 18:
                    l3 = (Long) bldVarA.e(ugi0Var, 18, s710.f31729a, l3);
                    i = 262144;
                    i2 |= i;
                    list4 = list4;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    str5 = (String) bldVarA.e(ugi0Var, 19, ysm0.f43175a, str5);
                    i = 524288;
                    i2 |= i;
                    list4 = list4;
                    break;
                case 20:
                    l = (Long) bldVarA.e(ugi0Var, 20, s710.f31729a, l);
                    i = 1048576;
                    i2 |= i;
                    list4 = list4;
                    break;
                case 21:
                    str3 = (String) bldVarA.e(ugi0Var, 21, ysm0.f43175a, str3);
                    i = 2097152;
                    i2 |= i;
                    list4 = list4;
                    break;
                case 22:
                    str2 = (String) bldVarA.e(ugi0Var, 22, ysm0.f43175a, str2);
                    i = 4194304;
                    i2 |= i;
                    list4 = list4;
                    break;
                case 23:
                    str = (String) bldVarA.e(ugi0Var, 23, ysm0.f43175a, str);
                    i = 8388608;
                    i2 |= i;
                    list4 = list4;
                    break;
                case 24:
                    list2 = (List) bldVarA.e(ugi0Var, 24, (jiy) a8zVarArr[24].getValue(), list2);
                    i = 16777216;
                    i2 |= i;
                    list4 = list4;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    list3 = (List) bldVarA.e(ugi0Var, 25, (jiy) a8zVarArr[25].getValue(), list3);
                    i = 33554432;
                    i2 |= i;
                    list4 = list4;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        String str10 = str;
        List list6 = list4;
        Double d3 = d2;
        Integer num6 = num;
        String str11 = str6;
        String str12 = str2;
        bldVarA.c(ugi0Var);
        String str13 = str7;
        String str14 = str5;
        return new adq(i2, d3, num6, str11, l4, num2, num3, l5, l6, num4, str13, str8, num5, str9, list6, str4, list5, d, l2, l3, str14, l, str3, str12, str10, list2, list3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        adq adqVar = (adq) obj;
        adqVar.getClass();
        List list = adqVar.z;
        List list2 = adqVar.y;
        String str = adqVar.x;
        String str2 = adqVar.w;
        String str3 = adqVar.v;
        Long l = adqVar.u;
        String str4 = adqVar.t;
        Long l2 = adqVar.s;
        Long l3 = adqVar.r;
        Double d = adqVar.q;
        List list3 = adqVar.p;
        String str5 = adqVar.o;
        List list4 = adqVar.n;
        String str6 = adqVar.m;
        Integer num = adqVar.l;
        String str7 = adqVar.k;
        String str8 = adqVar.j;
        Integer num2 = adqVar.i;
        Long l4 = adqVar.h;
        Long l5 = adqVar.g;
        Integer num3 = adqVar.f;
        Integer num4 = adqVar.e;
        Long l6 = adqVar.d;
        String str9 = adqVar.c;
        Integer num5 = adqVar.b;
        Double d2 = adqVar.f692a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = adq.A;
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || l6 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l6);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 4, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 11, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || str6 != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || list4 != 0) {
            cldVarA.p(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 14, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 15, (jiy) a8zVarArr[15].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 16, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 17, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 18, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 19, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 20, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 21, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 22, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 23, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 24, (jiy) a8zVarArr[24].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 25, (jiy) a8zVarArr[25].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
