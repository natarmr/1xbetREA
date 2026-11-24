package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dnr0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dnr0 f6384a;
    private static final ugi0 descriptor;

    static {
        dnr0 dnr0Var = new dnr0();
        f6384a = dnr0Var;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.history.data.models.response.TotoGameResponse", dnr0Var, 26);
        zna0Var.j("GameNumber", true);
        zna0Var.j("StartDate", true);
        zna0Var.j("GameName", true);
        zna0Var.j("PeriodString", true);
        zna0Var.j("Score", true);
        zna0Var.j("SportId", true);
        zna0Var.j("BukGameId", true);
        zna0Var.j("Opponent1Name", true);
        zna0Var.j("Opponent2Name", true);
        zna0Var.j("Period", true);
        zna0Var.j("BetsPercents", true);
        zna0Var.j("Total", true);
        zna0Var.j("ChosenOutcomes", true);
        zna0Var.j("StringChosenOutcomes", true);
        zna0Var.j("EventResults", true);
        zna0Var.j("UserEventResult", true);
        zna0Var.j("OpponentClId1", true);
        zna0Var.j("OpponentClId2", true);
        zna0Var.j("OpponentImg1", true);
        zna0Var.j("OpponentImg2", true);
        zna0Var.j("OpponentCountryId1", true);
        zna0Var.j("OpponentCountryId2", true);
        zna0Var.j("ConstId", true);
        zna0Var.j("VidId", true);
        zna0Var.j("TypeId", true);
        zna0Var.j("eventParams", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = nnr0.A;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(s710Var);
        jiy jiyVarJ6 = mrv.j0(s710Var);
        jiy jiyVarJ7 = mrv.j0(ysm0Var);
        jiy jiyVarJ8 = mrv.j0(ysm0Var);
        jiy jiyVarJ9 = mrv.j0(s710Var);
        jiy jiyVarJ10 = mrv.j0((jiy) a8zVarArr[10].getValue());
        jiy jiyVarJ11 = mrv.j0(tbl.f33669a);
        jiy jiyVarJ12 = mrv.j0((jiy) a8zVarArr[12].getValue());
        jiy jiyVarJ13 = mrv.j0((jiy) a8zVarArr[13].getValue());
        jiy jiyVarJ14 = mrv.j0(s710Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, jiyVarJ14, mrv.j0(okxVar), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(okxVar), mrv.j0(hnr0.f13362a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        List list;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = nnr0.A;
        Integer num = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        lnr0 lnr0Var = null;
        Long l4 = null;
        int i2 = 0;
        List list2 = null;
        Long l5 = null;
        Integer num2 = null;
        Long l6 = null;
        Long l7 = null;
        String str = null;
        String str2 = null;
        boolean z = true;
        Long l8 = null;
        Long l9 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Long l10 = null;
        Long l11 = null;
        String str6 = null;
        String str7 = null;
        Long l12 = null;
        List list3 = null;
        Double d = null;
        List list4 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    l2 = l2;
                    list2 = list2;
                    l8 = l8;
                    l = l;
                    break;
                case 0:
                    num = num;
                    i2 |= 1;
                    l2 = l2;
                    list2 = list2;
                    l = l;
                    l8 = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l8);
                    num = num;
                    break;
                case 1:
                    list = list2;
                    l9 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l9);
                    i2 |= 2;
                    str3 = str3;
                    list2 = list;
                    l = l;
                    num = num;
                    break;
                case 2:
                    list = list2;
                    str3 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str3);
                    i2 |= 4;
                    list2 = list;
                    l = l;
                    num = num;
                    break;
                case 3:
                    list = list2;
                    str4 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str4);
                    i2 |= 8;
                    list2 = list;
                    l = l;
                    num = num;
                    break;
                case 4:
                    list = list2;
                    str5 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str5);
                    i2 |= 16;
                    list2 = list;
                    l = l;
                    num = num;
                    break;
                case 5:
                    list = list2;
                    l10 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l10);
                    i2 |= 32;
                    list2 = list;
                    l = l;
                    num = num;
                    break;
                case 6:
                    list = list2;
                    l11 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l11);
                    i2 |= 64;
                    list2 = list;
                    l = l;
                    num = num;
                    break;
                case 7:
                    list = list2;
                    str6 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str6);
                    i2 |= 128;
                    list2 = list;
                    l = l;
                    num = num;
                    break;
                case 8:
                    list = list2;
                    str7 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str7);
                    i2 |= 256;
                    list2 = list;
                    l = l;
                    num = num;
                    break;
                case 9:
                    list = list2;
                    l12 = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l12);
                    i2 |= 512;
                    list2 = list;
                    l = l;
                    num = num;
                    break;
                case 10:
                    list = list2;
                    list3 = (List) bldVarA.e(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list3);
                    i2 |= 1024;
                    list2 = list;
                    l = l;
                    num = num;
                    break;
                case 11:
                    list = list2;
                    d = (Double) bldVarA.e(ugi0Var, 11, tbl.f33669a, d);
                    i2 |= 2048;
                    list2 = list;
                    l = l;
                    num = num;
                    break;
                case 12:
                    list = list2;
                    list4 = (List) bldVarA.e(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list4);
                    i2 |= 4096;
                    list2 = list;
                    l = l;
                    num = num;
                    break;
                case 13:
                    num = num;
                    l = l;
                    list2 = (List) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list2);
                    i2 |= 8192;
                    l = l;
                    num = num;
                    break;
                case 14:
                    list2 = list2;
                    l5 = (Long) bldVarA.e(ugi0Var, 14, s710.f31729a, l5);
                    i2 |= 16384;
                    list2 = list2;
                    break;
                case 15:
                    num2 = (Integer) bldVarA.e(ugi0Var, 15, okx.f25427a, num2);
                    i = 32768;
                    i2 |= i;
                    list2 = list2;
                    break;
                case 16:
                    l6 = (Long) bldVarA.e(ugi0Var, 16, s710.f31729a, l6);
                    i = 65536;
                    i2 |= i;
                    list2 = list2;
                    break;
                case 17:
                    l7 = (Long) bldVarA.e(ugi0Var, 17, s710.f31729a, l7);
                    i = 131072;
                    i2 |= i;
                    list2 = list2;
                    break;
                case 18:
                    str = (String) bldVarA.e(ugi0Var, 18, ysm0.f43175a, str);
                    i = 262144;
                    i2 |= i;
                    list2 = list2;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    str2 = (String) bldVarA.e(ugi0Var, 19, ysm0.f43175a, str2);
                    i = 524288;
                    i2 |= i;
                    list2 = list2;
                    break;
                case 20:
                    l4 = (Long) bldVarA.e(ugi0Var, 20, s710.f31729a, l4);
                    i = 1048576;
                    i2 |= i;
                    list2 = list2;
                    break;
                case 21:
                    l3 = (Long) bldVarA.e(ugi0Var, 21, s710.f31729a, l3);
                    i = 2097152;
                    i2 |= i;
                    list2 = list2;
                    break;
                case 22:
                    l2 = (Long) bldVarA.e(ugi0Var, 22, s710.f31729a, l2);
                    i = 4194304;
                    i2 |= i;
                    list2 = list2;
                    break;
                case 23:
                    l = (Long) bldVarA.e(ugi0Var, 23, s710.f31729a, l);
                    i = 8388608;
                    i2 |= i;
                    list2 = list2;
                    break;
                case 24:
                    num = (Integer) bldVarA.e(ugi0Var, 24, okx.f25427a, num);
                    i = 16777216;
                    i2 |= i;
                    list2 = list2;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    lnr0Var = (lnr0) bldVarA.e(ugi0Var, 25, hnr0.f13362a, lnr0Var);
                    i = 33554432;
                    i2 |= i;
                    list2 = list2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Long l13 = l;
        List list5 = list2;
        Long l14 = l8;
        Long l15 = l9;
        String str8 = str3;
        Long l16 = l2;
        bldVarA.c(ugi0Var);
        Long l17 = l12;
        String str9 = str2;
        return new nnr0(i2, l14, l15, str8, str4, str5, l10, l11, str6, str7, l17, list3, d, list4, list5, l5, num2, l6, l7, str, str9, l4, l3, l16, l13, num, lnr0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nnr0 nnr0Var = (nnr0) obj;
        nnr0Var.getClass();
        lnr0 lnr0Var = nnr0Var.z;
        Integer num = nnr0Var.y;
        Long l = nnr0Var.x;
        Long l2 = nnr0Var.w;
        Long l3 = nnr0Var.v;
        Long l4 = nnr0Var.u;
        String str = nnr0Var.t;
        String str2 = nnr0Var.s;
        Long l5 = nnr0Var.r;
        Long l6 = nnr0Var.q;
        Integer num2 = nnr0Var.p;
        Long l7 = nnr0Var.o;
        List list = nnr0Var.n;
        List list2 = nnr0Var.m;
        Double d = nnr0Var.l;
        List list3 = nnr0Var.k;
        Long l8 = nnr0Var.j;
        String str3 = nnr0Var.i;
        String str4 = nnr0Var.h;
        Long l9 = nnr0Var.g;
        Long l10 = nnr0Var.f;
        String str5 = nnr0Var.e;
        String str6 = nnr0Var.d;
        String str7 = nnr0Var.c;
        Long l11 = nnr0Var.b;
        Long l12 = nnr0Var.f23837a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = nnr0.A;
        if (cldVarA.u(ugi0Var) || l12 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l12);
        }
        if (cldVarA.u(ugi0Var) || l11 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l11);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || l10 != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l10);
        }
        if (cldVarA.u(ugi0Var) || l9 != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l9);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || l8 != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l8);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 10, (jiy) a8zVarArr[10].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 11, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || list2 != 0) {
            cldVarA.p(ugi0Var, 12, (jiy) a8zVarArr[12].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != 0) {
            cldVarA.p(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l7 != null) {
            cldVarA.p(ugi0Var, 14, s710.f31729a, l7);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 15, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || l6 != null) {
            cldVarA.p(ugi0Var, 16, s710.f31729a, l6);
        }
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 17, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 18, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 19, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 20, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 21, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 22, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 23, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 24, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || lnr0Var != null) {
            cldVarA.p(ugi0Var, 25, hnr0.f13362a, lnr0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
