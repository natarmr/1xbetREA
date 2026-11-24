package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bkr0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bkr0 f2764a;
    private static final ugi0 descriptor;

    static {
        bkr0 bkr0Var = new bkr0();
        f2764a = bkr0Var;
        zna0 zna0Var = new zna0("org.xplatform.toto_bet.active_tirage.data.model.response.TotoBetGameResponse", bkr0Var, 26);
        zna0Var.j("GameNumber", true);
        zna0Var.j("StartDate", true);
        zna0Var.j("ChampId", true);
        zna0Var.j("ChampName", true);
        zna0Var.j("GameName", true);
        zna0Var.j("Score", true);
        zna0Var.j("SportId", true);
        zna0Var.j("BukGameId", true);
        zna0Var.j("Opponent1Name", true);
        zna0Var.j("Opponent2Name", true);
        zna0Var.j("PeriodString", true);
        zna0Var.j("BetsPercents", true);
        zna0Var.j("Total", true);
        zna0Var.j("ChosenOutcomes", true);
        zna0Var.j("EventResults", true);
        zna0Var.j("UserEventResult", true);
        zna0Var.j("OpponentClId1", true);
        zna0Var.j("OpponentClId2", true);
        zna0Var.j("OpponentImg1", true);
        zna0Var.j("OpponentImg2", true);
        zna0Var.j("ChampCountryId", true);
        zna0Var.j("OpponentCountryId1", true);
        zna0Var.j("OpponentCountryId2", true);
        zna0Var.j("ConstId", true);
        zna0Var.j("VidId", true);
        zna0Var.j("TypeId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = dkr0.A;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[11].getValue()), mrv.j0(tbl.f33669a), mrv.j0((jiy) a8zVarArr[13].getValue()), mrv.j0(s710Var), mrv.j0(okxVar), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        List list;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = dkr0.A;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        Integer num = null;
        int i2 = 0;
        List list2 = null;
        Long l6 = null;
        Integer num2 = null;
        Long l7 = null;
        Long l8 = null;
        String str = null;
        String str2 = null;
        boolean z = true;
        Integer num3 = null;
        Long l9 = null;
        Long l10 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Long l11 = null;
        Integer num4 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        List list3 = null;
        Double d = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    l3 = l3;
                    list2 = list2;
                    num3 = num3;
                    l2 = l2;
                    break;
                case 0:
                    l = l;
                    i2 |= 1;
                    l3 = l3;
                    list2 = list2;
                    l2 = l2;
                    num3 = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num3);
                    l = l;
                    break;
                case 1:
                    list = list2;
                    l9 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l9);
                    i2 |= 2;
                    l10 = l10;
                    list2 = list;
                    l2 = l2;
                    l = l;
                    break;
                case 2:
                    list = list2;
                    l10 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l10);
                    i2 |= 4;
                    list2 = list;
                    l2 = l2;
                    l = l;
                    break;
                case 3:
                    list = list2;
                    str3 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str3);
                    i2 |= 8;
                    list2 = list;
                    l2 = l2;
                    l = l;
                    break;
                case 4:
                    list = list2;
                    str4 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str4);
                    i2 |= 16;
                    list2 = list;
                    l2 = l2;
                    l = l;
                    break;
                case 5:
                    list = list2;
                    str5 = (String) bldVarA.e(ugi0Var, 5, ysm0.f43175a, str5);
                    i2 |= 32;
                    list2 = list;
                    l2 = l2;
                    l = l;
                    break;
                case 6:
                    list = list2;
                    l11 = (Long) bldVarA.e(ugi0Var, 6, s710.f31729a, l11);
                    i2 |= 64;
                    list2 = list;
                    l2 = l2;
                    l = l;
                    break;
                case 7:
                    list = list2;
                    num4 = (Integer) bldVarA.e(ugi0Var, 7, okx.f25427a, num4);
                    i2 |= 128;
                    list2 = list;
                    l2 = l2;
                    l = l;
                    break;
                case 8:
                    list = list2;
                    str6 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str6);
                    i2 |= 256;
                    list2 = list;
                    l2 = l2;
                    l = l;
                    break;
                case 9:
                    list = list2;
                    str7 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str7);
                    i2 |= 512;
                    list2 = list;
                    l2 = l2;
                    l = l;
                    break;
                case 10:
                    list = list2;
                    str8 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str8);
                    i2 |= 1024;
                    list2 = list;
                    l2 = l2;
                    l = l;
                    break;
                case 11:
                    list = list2;
                    list3 = (List) bldVarA.e(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list3);
                    i2 |= 2048;
                    list2 = list;
                    l2 = l2;
                    l = l;
                    break;
                case 12:
                    list = list2;
                    d = (Double) bldVarA.e(ugi0Var, 12, tbl.f33669a, d);
                    i2 |= 4096;
                    list2 = list;
                    l2 = l2;
                    l = l;
                    break;
                case 13:
                    l = l;
                    l2 = l2;
                    list2 = (List) bldVarA.e(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list2);
                    i2 |= 8192;
                    l2 = l2;
                    l = l;
                    break;
                case 14:
                    list2 = list2;
                    l6 = (Long) bldVarA.e(ugi0Var, 14, s710.f31729a, l6);
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
                    l7 = (Long) bldVarA.e(ugi0Var, 16, s710.f31729a, l7);
                    i = 65536;
                    i2 |= i;
                    list2 = list2;
                    break;
                case 17:
                    l8 = (Long) bldVarA.e(ugi0Var, 17, s710.f31729a, l8);
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
                    num = (Integer) bldVarA.e(ugi0Var, 20, okx.f25427a, num);
                    i = 1048576;
                    i2 |= i;
                    list2 = list2;
                    break;
                case 21:
                    l4 = (Long) bldVarA.e(ugi0Var, 21, s710.f31729a, l4);
                    i = 2097152;
                    i2 |= i;
                    list2 = list2;
                    break;
                case 22:
                    l3 = (Long) bldVarA.e(ugi0Var, 22, s710.f31729a, l3);
                    i = 4194304;
                    i2 |= i;
                    list2 = list2;
                    break;
                case 23:
                    l2 = (Long) bldVarA.e(ugi0Var, 23, s710.f31729a, l2);
                    i = 8388608;
                    i2 |= i;
                    list2 = list2;
                    break;
                case 24:
                    l = (Long) bldVarA.e(ugi0Var, 24, s710.f31729a, l);
                    i = 16777216;
                    i2 |= i;
                    list2 = list2;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    l5 = (Long) bldVarA.e(ugi0Var, 25, s710.f31729a, l5);
                    i = 33554432;
                    i2 |= i;
                    list2 = list2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Long l12 = l2;
        List list4 = list2;
        Integer num5 = num3;
        Long l13 = l9;
        Long l14 = l10;
        Long l15 = l3;
        bldVarA.c(ugi0Var);
        String str9 = str7;
        String str10 = str2;
        return new dkr0(i2, num5, l13, l14, str3, str4, str5, l11, num4, str6, str9, str8, list3, d, list4, l6, num2, l7, l8, str, str10, num, l4, l15, l12, l, l5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        dkr0 dkr0Var = (dkr0) obj;
        dkr0Var.getClass();
        Long l = dkr0Var.z;
        Long l2 = dkr0Var.y;
        Long l3 = dkr0Var.x;
        Long l4 = dkr0Var.w;
        Long l5 = dkr0Var.v;
        Integer num = dkr0Var.u;
        String str = dkr0Var.t;
        String str2 = dkr0Var.s;
        Long l6 = dkr0Var.r;
        Long l7 = dkr0Var.q;
        Integer num2 = dkr0Var.p;
        Long l8 = dkr0Var.o;
        List list = dkr0Var.n;
        Double d = dkr0Var.m;
        List list2 = dkr0Var.l;
        String str3 = dkr0Var.k;
        String str4 = dkr0Var.j;
        String str5 = dkr0Var.i;
        Integer num3 = dkr0Var.h;
        Long l9 = dkr0Var.g;
        String str6 = dkr0Var.f;
        String str7 = dkr0Var.e;
        String str8 = dkr0Var.d;
        Long l10 = dkr0Var.c;
        Long l11 = dkr0Var.b;
        Integer num4 = dkr0Var.f6247a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = dkr0.A;
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || l11 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l11);
        }
        if (cldVarA.u(ugi0Var) || l10 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l10);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 5, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || l9 != null) {
            cldVarA.p(ugi0Var, 6, s710.f31729a, l9);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 7, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 11, (jiy) a8zVarArr[11].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || d != 0) {
            cldVarA.p(ugi0Var, 12, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || list != 0) {
            cldVarA.p(ugi0Var, 13, (jiy) a8zVarArr[13].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || l8 != null) {
            cldVarA.p(ugi0Var, 14, s710.f31729a, l8);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 15, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || l7 != null) {
            cldVarA.p(ugi0Var, 16, s710.f31729a, l7);
        }
        if (cldVarA.u(ugi0Var) || l6 != null) {
            cldVarA.p(ugi0Var, 17, s710.f31729a, l6);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 18, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 19, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 20, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 21, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 22, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 23, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 24, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 25, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
