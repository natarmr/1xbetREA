package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b2y implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b2y f1876a;
    private static final ugi0 descriptor;

    static {
        b2y b2yVar = new b2y();
        f1876a = b2yVar;
        zna0 zna0Var = new zna0("org.xplatform.bethistory.history.data.models.response.jackpot.JackpotGameResponse", b2yVar, 25);
        zna0Var.j("GameNumber", true);
        zna0Var.j("StartDate", true);
        zna0Var.j("GameName", true);
        zna0Var.j("GameNameEng", true);
        zna0Var.j("IsFinished", true);
        zna0Var.j("IsLive", true);
        zna0Var.j("StatisticId", true);
        zna0Var.j("Score", true);
        zna0Var.j("SportId", true);
        zna0Var.j("BukGameId", true);
        zna0Var.j("Opponent1Name", true);
        zna0Var.j("Opponent2Name", true);
        zna0Var.j("Period", true);
        zna0Var.j("PeriodString", true);
        zna0Var.j("ChosenOutcomes", true);
        zna0Var.j("StringChosenOutcomes", true);
        zna0Var.j("EventResults", true);
        zna0Var.j("UserEventResult", true);
        zna0Var.j("Opponent1TranslateId", true);
        zna0Var.j("Opponent2TranslateId", true);
        zna0Var.j("Opponent1Image", true);
        zna0Var.j("Opponent2Image", true);
        zna0Var.j("OpponentCountryId1", true);
        zna0Var.j("OpponentCountryId2", true);
        zna0Var.j("ConstId", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = f2y.z;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ4 = mrv.j0(sm8Var);
        jiy jiyVarJ5 = mrv.j0(sm8Var);
        jiy jiyVarJ6 = mrv.j0(ysm0Var);
        jiy jiyVarJ7 = mrv.j0(ysm0Var);
        jiy jiyVarJ8 = mrv.j0(s710Var);
        jiy jiyVarJ9 = mrv.j0(s710Var);
        jiy jiyVarJ10 = mrv.j0(ysm0Var);
        jiy jiyVarJ11 = mrv.j0(ysm0Var);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[14].getValue()), mrv.j0((jiy) a8zVarArr[15].getValue()), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(s710Var), mrv.j0(s710Var), mrv.j0(s710Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Long l;
        Integer num;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = f2y.z;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        String str = null;
        Integer num2 = null;
        String str2 = null;
        int i2 = 0;
        String str3 = null;
        List list = null;
        List list2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Long l5 = null;
        Long l6 = null;
        boolean z = true;
        Long l7 = null;
        Long l8 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str6 = null;
        String str7 = null;
        Long l9 = null;
        Long l10 = null;
        String str8 = null;
        String str9 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    l = l7;
                    z = false;
                    l3 = l3;
                    str3 = str3;
                    l7 = l;
                    l2 = l2;
                    break;
                case 0:
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l7);
                    i2 |= 1;
                    l3 = l3;
                    num2 = num2;
                    str3 = str3;
                    l7 = l;
                    l2 = l2;
                    break;
                case 1:
                    num = num2;
                    l8 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l8);
                    i2 |= 2;
                    str4 = str4;
                    num2 = num;
                    str3 = str3;
                    l2 = l2;
                    break;
                case 2:
                    num = num2;
                    str4 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str4);
                    i2 |= 4;
                    num2 = num;
                    str3 = str3;
                    l2 = l2;
                    break;
                case 3:
                    num = num2;
                    str5 = (String) bldVarA.e(ugi0Var, 3, ysm0.f43175a, str5);
                    i2 |= 8;
                    num2 = num;
                    str3 = str3;
                    l2 = l2;
                    break;
                case 4:
                    num = num2;
                    bool = (Boolean) bldVarA.e(ugi0Var, 4, sm8.f32432a, bool);
                    i2 |= 16;
                    num2 = num;
                    str3 = str3;
                    l2 = l2;
                    break;
                case 5:
                    num = num2;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 5, sm8.f32432a, bool2);
                    i2 |= 32;
                    num2 = num;
                    str3 = str3;
                    l2 = l2;
                    break;
                case 6:
                    num = num2;
                    str6 = (String) bldVarA.e(ugi0Var, 6, ysm0.f43175a, str6);
                    i2 |= 64;
                    num2 = num;
                    str3 = str3;
                    l2 = l2;
                    break;
                case 7:
                    num = num2;
                    str7 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str7);
                    i2 |= 128;
                    num2 = num;
                    str3 = str3;
                    l2 = l2;
                    break;
                case 8:
                    num = num2;
                    l9 = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l9);
                    i2 |= 256;
                    num2 = num;
                    str3 = str3;
                    l2 = l2;
                    break;
                case 9:
                    num = num2;
                    l10 = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l10);
                    i2 |= 512;
                    num2 = num;
                    str3 = str3;
                    l2 = l2;
                    break;
                case 10:
                    num = num2;
                    str8 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str8);
                    i2 |= 1024;
                    num2 = num;
                    str3 = str3;
                    l2 = l2;
                    break;
                case 11:
                    num = num2;
                    str9 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str9);
                    i2 |= 2048;
                    num2 = num;
                    str3 = str3;
                    l2 = l2;
                    break;
                case 12:
                    l2 = l2;
                    str3 = str3;
                    num2 = (Integer) bldVarA.e(ugi0Var, 12, okx.f25427a, num2);
                    i2 |= 4096;
                    str3 = str3;
                    l2 = l2;
                    break;
                case 13:
                    l2 = l2;
                    str3 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str3);
                    i2 |= 8192;
                    num2 = num2;
                    l2 = l2;
                    break;
                case 14:
                    num2 = num2;
                    str3 = str3;
                    list = (List) bldVarA.e(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list);
                    i2 |= 16384;
                    num2 = num2;
                    str3 = str3;
                    break;
                case 15:
                    list2 = (List) bldVarA.e(ugi0Var, 15, (jiy) a8zVarArr[15].getValue(), list2);
                    i = 32768;
                    i2 |= i;
                    num2 = num2;
                    str3 = str3;
                    break;
                case 16:
                    num3 = (Integer) bldVarA.e(ugi0Var, 16, okx.f25427a, num3);
                    i = 65536;
                    i2 |= i;
                    num2 = num2;
                    str3 = str3;
                    break;
                case 17:
                    num4 = (Integer) bldVarA.e(ugi0Var, 17, okx.f25427a, num4);
                    i = 131072;
                    i2 |= i;
                    num2 = num2;
                    str3 = str3;
                    break;
                case 18:
                    l5 = (Long) bldVarA.e(ugi0Var, 18, s710.f31729a, l5);
                    i = 262144;
                    i2 |= i;
                    num2 = num2;
                    str3 = str3;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    l6 = (Long) bldVarA.e(ugi0Var, 19, s710.f31729a, l6);
                    i = 524288;
                    i2 |= i;
                    num2 = num2;
                    str3 = str3;
                    break;
                case 20:
                    str2 = (String) bldVarA.e(ugi0Var, 20, ysm0.f43175a, str2);
                    i = 1048576;
                    i2 |= i;
                    num2 = num2;
                    str3 = str3;
                    break;
                case 21:
                    str = (String) bldVarA.e(ugi0Var, 21, ysm0.f43175a, str);
                    i = 2097152;
                    i2 |= i;
                    num2 = num2;
                    str3 = str3;
                    break;
                case 22:
                    l4 = (Long) bldVarA.e(ugi0Var, 22, s710.f31729a, l4);
                    i = 4194304;
                    i2 |= i;
                    num2 = num2;
                    str3 = str3;
                    break;
                case 23:
                    l3 = (Long) bldVarA.e(ugi0Var, 23, s710.f31729a, l3);
                    i = 8388608;
                    i2 |= i;
                    num2 = num2;
                    str3 = str3;
                    break;
                case 24:
                    l2 = (Long) bldVarA.e(ugi0Var, 24, s710.f31729a, l2);
                    i = 16777216;
                    i2 |= i;
                    num2 = num2;
                    str3 = str3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Long l11 = l2;
        String str10 = str3;
        Long l12 = l7;
        Long l13 = l8;
        String str11 = str4;
        bldVarA.c(ugi0Var);
        Long l14 = l10;
        Long l15 = l6;
        return new f2y(i2, l12, l13, str11, str5, bool, bool2, str6, str7, l9, l14, str8, str9, num2, str10, list, list2, num3, num4, l5, l15, str2, str, l4, l3, l11);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        f2y f2yVar = (f2y) obj;
        f2yVar.getClass();
        Long l = f2yVar.y;
        Long l2 = f2yVar.x;
        Long l3 = f2yVar.w;
        String str = f2yVar.v;
        String str2 = f2yVar.u;
        Long l4 = f2yVar.t;
        Long l5 = f2yVar.s;
        Integer num = f2yVar.r;
        Integer num2 = f2yVar.q;
        List list = f2yVar.p;
        List list2 = f2yVar.o;
        String str3 = f2yVar.n;
        Integer num3 = f2yVar.m;
        String str4 = f2yVar.l;
        String str5 = f2yVar.k;
        Long l6 = f2yVar.j;
        Long l7 = f2yVar.i;
        String str6 = f2yVar.h;
        String str7 = f2yVar.g;
        Boolean bool = f2yVar.f;
        Boolean bool2 = f2yVar.e;
        String str8 = f2yVar.d;
        String str9 = f2yVar.c;
        Long l8 = f2yVar.b;
        Long l9 = f2yVar.f8837a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = f2y.z;
        if (cldVarA.u(ugi0Var) || l9 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l9);
        }
        if (cldVarA.u(ugi0Var) || l8 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l8);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 3, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 4, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 5, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 6, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || l7 != null) {
            cldVarA.p(ugi0Var, 8, s710.f31729a, l7);
        }
        if (cldVarA.u(ugi0Var) || l6 != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l6);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || num3 != 0) {
            cldVarA.p(ugi0Var, 12, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str3 != 0) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 14, (jiy) a8zVarArr[14].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 15, (jiy) a8zVarArr[15].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 16, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 17, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 18, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 19, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 20, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 21, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 22, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 23, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 24, s710.f31729a, l);
        }
        cldVarA.c(ugi0Var);
    }
}
