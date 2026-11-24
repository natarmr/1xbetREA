package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q5t implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q5t f28169a;
    private static final ugi0 descriptor;

    static {
        q5t q5tVar = new q5t();
        f28169a = q5tVar;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.games.GamesForCouponResponse", q5tVar, 27);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("num", true);
        zna0Var.j("mainGameId", true);
        zna0Var.j("constId", true);
        zna0Var.j("fullName", true);
        zna0Var.j("startTs", true);
        zna0Var.j("countryId", true);
        zna0Var.j("gameTypeName", true);
        zna0Var.j("dopInfo", true);
        zna0Var.j("period", true);
        zna0Var.j("periodName", true);
        zna0Var.j("gameVidName", true);
        zna0Var.j("isFinal", true);
        zna0Var.j("mainConstId", true);
        zna0Var.j("kind", true);
        zna0Var.j("hasHeadToHead", true);
        zna0Var.j("subscriptionAvailable", true);
        zna0Var.j("nonStarted", true);
        zna0Var.j("sport", true);
        zna0Var.j("subSport", true);
        zna0Var.j("liga", true);
        zna0Var.j("opponent1", true);
        zna0Var.j("opponent2", true);
        zna0Var.j("opponents", true);
        zna0Var.j("matchInfoObj", true);
        zna0Var.j("mainGameScores", true);
        zna0Var.j("subGameScores", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ1 = mrv.j0(okxVar);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        jiy jiyVarJ3 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(s710Var);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(ysm0Var);
        jiy jiyVarJ8 = mrv.j0(ysm0Var);
        jiy jiyVarJ9 = mrv.j0(okxVar);
        jiy jiyVarJ10 = mrv.j0(ysm0Var);
        jiy jiyVarJ11 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ12 = mrv.j0(sm8Var);
        jiy jiyVarJ13 = mrv.j0(s710Var);
        jiy jiyVarJ14 = mrv.j0(okxVar);
        jiy jiyVarJ15 = mrv.j0(sm8Var);
        jiy jiyVarJ16 = mrv.j0(sm8Var);
        jiy jiyVarJ17 = mrv.j0(sm8Var);
        jiy jiyVarJ18 = mrv.j0(xjl0.f40991a);
        jiy jiyVarJ19 = mrv.j0(i3n0.f14106a);
        jiy jiyVarJ20 = mrv.j0(ulz.f35896a);
        k280 k280Var = k280.f17561a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, jiyVarJ14, jiyVarJ15, jiyVarJ16, jiyVarJ17, jiyVarJ18, jiyVarJ19, jiyVarJ20, mrv.j0(k280Var), mrv.j0(k280Var), mrv.j0(g480.f10652a), mrv.j0(pa30.f26636a), mrv.j0(jv10.f17185a), mrv.j0(jwm0.f17258a)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Integer num;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        ta30 ta30Var = null;
        o480 o480Var = null;
        d380 d380Var = null;
        lv10 lv10Var = null;
        d380 d380Var2 = null;
        int i2 = 0;
        lwm0 lwm0Var = null;
        Integer num2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        rkl0 rkl0Var = null;
        u3n0 u3n0Var = null;
        emz emzVar = null;
        boolean z = true;
        Long l = null;
        Integer num3 = null;
        Long l2 = null;
        Long l3 = null;
        String str = null;
        Long l4 = null;
        Integer num4 = null;
        String str2 = null;
        String str3 = null;
        Integer num5 = null;
        String str4 = null;
        String str5 = null;
        Boolean bool4 = null;
        Long l5 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    z = false;
                    d380Var = d380Var;
                    num2 = num2;
                    l = l;
                    o480Var = o480Var;
                    break;
                case 0:
                    ta30Var = ta30Var;
                    i2 |= 1;
                    d380Var = d380Var;
                    o480Var = o480Var;
                    num2 = num2;
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    ta30Var = ta30Var;
                    break;
                case 1:
                    num = num2;
                    num3 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num3);
                    i2 |= 2;
                    l2 = l2;
                    o480Var = o480Var;
                    num2 = num;
                    ta30Var = ta30Var;
                    break;
                case 2:
                    num = num2;
                    l2 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l2);
                    i2 |= 4;
                    o480Var = o480Var;
                    num2 = num;
                    ta30Var = ta30Var;
                    break;
                case 3:
                    num = num2;
                    l3 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l3);
                    i2 |= 8;
                    o480Var = o480Var;
                    num2 = num;
                    ta30Var = ta30Var;
                    break;
                case 4:
                    num = num2;
                    str = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str);
                    i2 |= 16;
                    o480Var = o480Var;
                    num2 = num;
                    ta30Var = ta30Var;
                    break;
                case 5:
                    num = num2;
                    l4 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l4);
                    i2 |= 32;
                    o480Var = o480Var;
                    num2 = num;
                    ta30Var = ta30Var;
                    break;
                case 6:
                    num = num2;
                    num4 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num4);
                    i2 |= 64;
                    o480Var = o480Var;
                    num2 = num;
                    ta30Var = ta30Var;
                    break;
                case 7:
                    num = num2;
                    str2 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str2);
                    i2 |= 128;
                    o480Var = o480Var;
                    num2 = num;
                    ta30Var = ta30Var;
                    break;
                case 8:
                    num = num2;
                    str3 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str3);
                    i2 |= 256;
                    o480Var = o480Var;
                    num2 = num;
                    ta30Var = ta30Var;
                    break;
                case 9:
                    num = num2;
                    num5 = (Integer) bldVarA.e(ugi0Var, 9, okx.f25427a, num5);
                    i2 |= 512;
                    o480Var = o480Var;
                    num2 = num;
                    ta30Var = ta30Var;
                    break;
                case 10:
                    num = num2;
                    str4 = (String) bldVarA.e(ugi0Var, 10, ysm0.f43175a, str4);
                    i2 |= 1024;
                    o480Var = o480Var;
                    num2 = num;
                    ta30Var = ta30Var;
                    break;
                case 11:
                    num = num2;
                    str5 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str5);
                    i2 |= 2048;
                    o480Var = o480Var;
                    num2 = num;
                    ta30Var = ta30Var;
                    break;
                case 12:
                    num = num2;
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 12, sm8.f32432a, bool4);
                    i2 |= 4096;
                    o480Var = o480Var;
                    num2 = num;
                    ta30Var = ta30Var;
                    break;
                case 13:
                    num = num2;
                    l5 = (Long) bldVarA.e(ugi0Var, 13, s710.f31729a, l5);
                    i2 |= 8192;
                    o480Var = o480Var;
                    num2 = num;
                    ta30Var = ta30Var;
                    break;
                case 14:
                    ta30Var = ta30Var;
                    num2 = (Integer) bldVarA.e(ugi0Var, 14, okx.f25427a, num2);
                    i2 |= 16384;
                    ta30Var = ta30Var;
                    break;
                case 15:
                    bool = (Boolean) bldVarA.e(ugi0Var, 15, sm8.f32432a, bool);
                    i = 32768;
                    i2 |= i;
                    num2 = num2;
                    break;
                case 16:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 16, sm8.f32432a, bool2);
                    i = 65536;
                    i2 |= i;
                    num2 = num2;
                    break;
                case 17:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 17, sm8.f32432a, bool3);
                    i = 131072;
                    i2 |= i;
                    num2 = num2;
                    break;
                case 18:
                    rkl0Var = (rkl0) bldVarA.e(ugi0Var, 18, xjl0.f40991a, rkl0Var);
                    i = 262144;
                    i2 |= i;
                    num2 = num2;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    u3n0Var = (u3n0) bldVarA.e(ugi0Var, 19, i3n0.f14106a, u3n0Var);
                    i = 524288;
                    i2 |= i;
                    num2 = num2;
                    break;
                case 20:
                    emzVar = (emz) bldVarA.e(ugi0Var, 20, ulz.f35896a, emzVar);
                    i = 1048576;
                    i2 |= i;
                    num2 = num2;
                    break;
                case 21:
                    d380Var2 = (d380) bldVarA.e(ugi0Var, 21, k280.f17561a, d380Var2);
                    i = 2097152;
                    i2 |= i;
                    num2 = num2;
                    break;
                case 22:
                    d380Var = (d380) bldVarA.e(ugi0Var, 22, k280.f17561a, d380Var);
                    i = 4194304;
                    i2 |= i;
                    num2 = num2;
                    break;
                case 23:
                    o480Var = (o480) bldVarA.e(ugi0Var, 23, g480.f10652a, o480Var);
                    i = 8388608;
                    i2 |= i;
                    num2 = num2;
                    break;
                case 24:
                    ta30Var = (ta30) bldVarA.e(ugi0Var, 24, pa30.f26636a, ta30Var);
                    i = 16777216;
                    i2 |= i;
                    num2 = num2;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    lv10Var = (lv10) bldVarA.e(ugi0Var, 25, jv10.f17185a, lv10Var);
                    i = 33554432;
                    i2 |= i;
                    num2 = num2;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    lwm0Var = (lwm0) bldVarA.e(ugi0Var, 26, jwm0.f17258a, lwm0Var);
                    i = 67108864;
                    i2 |= i;
                    num2 = num2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        o480 o480Var2 = o480Var;
        Integer num6 = num2;
        Long l6 = l;
        Integer num7 = num3;
        Long l7 = l2;
        d380 d380Var3 = d380Var;
        bldVarA.c(ugi0Var);
        Integer num8 = num5;
        u3n0 u3n0Var2 = u3n0Var;
        String str6 = str4;
        emz emzVar2 = emzVar;
        return new s5t(i2, l6, num7, l7, l3, str, l4, num4, str2, str3, num8, str6, str5, bool4, l5, num6, bool, bool2, bool3, rkl0Var, u3n0Var2, emzVar2, d380Var2, d380Var3, o480Var2, ta30Var, lv10Var, lwm0Var);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        s5t s5tVar = (s5t) obj;
        s5tVar.getClass();
        lwm0 lwm0Var = s5tVar.A;
        lv10 lv10Var = s5tVar.z;
        ta30 ta30Var = s5tVar.y;
        o480 o480Var = s5tVar.x;
        d380 d380Var = s5tVar.w;
        d380 d380Var2 = s5tVar.v;
        emz emzVar = s5tVar.u;
        u3n0 u3n0Var = s5tVar.t;
        rkl0 rkl0Var = s5tVar.s;
        Boolean bool = s5tVar.r;
        Boolean bool2 = s5tVar.q;
        Boolean bool3 = s5tVar.p;
        Integer num = s5tVar.o;
        Long l = s5tVar.n;
        Boolean bool4 = s5tVar.m;
        String str = s5tVar.l;
        String str2 = s5tVar.k;
        Integer num2 = s5tVar.j;
        String str3 = s5tVar.i;
        String str4 = s5tVar.h;
        Integer num3 = s5tVar.g;
        Long l2 = s5tVar.f;
        String str5 = s5tVar.e;
        Long l3 = s5tVar.d;
        Long l4 = s5tVar.c;
        Integer num4 = s5tVar.b;
        Long l5 = s5tVar.f31670a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 9, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 10, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || bool4 != 0) {
            cldVarA.p(ugi0Var, 12, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || l != 0) {
            cldVarA.p(ugi0Var, 13, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 14, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 15, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 16, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 17, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || rkl0Var != null) {
            cldVarA.p(ugi0Var, 18, xjl0.f40991a, rkl0Var);
        }
        if (cldVarA.u(ugi0Var) || u3n0Var != null) {
            cldVarA.p(ugi0Var, 19, i3n0.f14106a, u3n0Var);
        }
        if (cldVarA.u(ugi0Var) || emzVar != null) {
            cldVarA.p(ugi0Var, 20, ulz.f35896a, emzVar);
        }
        if (cldVarA.u(ugi0Var) || d380Var2 != null) {
            cldVarA.p(ugi0Var, 21, k280.f17561a, d380Var2);
        }
        if (cldVarA.u(ugi0Var) || d380Var != null) {
            cldVarA.p(ugi0Var, 22, k280.f17561a, d380Var);
        }
        if (cldVarA.u(ugi0Var) || o480Var != null) {
            cldVarA.p(ugi0Var, 23, g480.f10652a, o480Var);
        }
        if (cldVarA.u(ugi0Var) || ta30Var != null) {
            cldVarA.p(ugi0Var, 24, pa30.f26636a, ta30Var);
        }
        if (cldVarA.u(ugi0Var) || lv10Var != null) {
            cldVarA.p(ugi0Var, 25, jv10.f17185a, lv10Var);
        }
        if (cldVarA.u(ugi0Var) || lwm0Var != null) {
            cldVarA.p(ugi0Var, 26, jwm0.f17258a, lwm0Var);
        }
        cldVarA.c(ugi0Var);
    }
}
