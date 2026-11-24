package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jv6 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jv6 f17193a;
    private static final ugi0 descriptor;

    static {
        jv6 jv6Var = new jv6();
        f17193a = jv6Var;
        zna0 zna0Var = new zna0("org.xplatform.betting.core.make_bet.data.model.BetEventResponse", jv6Var, 34);
        zna0Var.j("Coef", true);
        zna0Var.j("CV", true);
        zna0Var.j("PV", true);
        zna0Var.j("Param", true);
        zna0Var.j("ParamMobile", true);
        zna0Var.j("Type", true);
        zna0Var.j("UiFeature", true);
        zna0Var.j("GameId", true);
        zna0Var.j("Kind", true);
        zna0Var.j("PlayerId", true);
        zna0Var.j("Block", true);
        zna0Var.j("Seconds", true);
        zna0Var.j("Expired", true);
        zna0Var.j("Price", true);
        zna0Var.j("InstrumentId", true);
        zna0Var.j("IsRelation", true);
        zna0Var.j("IsBannedExpress", true);
        zna0Var.j("FullScore", true);
        zna0Var.j("PeriodScores", true);
        zna0Var.j("ExtraKind", true);
        zna0Var.j("MS1", true);
        zna0Var.j("MS2", true);
        zna0Var.j("FS1", true);
        zna0Var.j("FS2", true);
        zna0Var.j("PS", true);
        zna0Var.j("SpecialCoef", true);
        zna0Var.j("TimeSec", true);
        zna0Var.j("TimeDirection", true);
        zna0Var.j("OriginalPlayerId", true);
        zna0Var.j("FullName", true);
        zna0Var.j("Finish", true);
        zna0Var.j("GameConstId", true);
        zna0Var.j("OptionLowerCf", true);
        zna0Var.j("OptionLowerCfView", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        tbl tblVar = tbl.f33669a;
        jiy jiyVarJ0 = mrv.j0(tblVar);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ1 = mrv.j0(ysm0Var);
        jiy jiyVarJ2 = mrv.j0(ysm0Var);
        jiy jiyVarJ3 = mrv.j0(tblVar);
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ5 = mrv.j0(s710Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(s710Var);
        jiy jiyVarJ8 = mrv.j0(okxVar);
        jiy jiyVarJ9 = mrv.j0(s710Var);
        sm8 sm8Var = sm8.f32432a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, mrv.j0(sm8Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(sm8Var), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(ysm0Var), mrv.j0(tblVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(sm8Var), mrv.j0(okxVar), mrv.j0(tblVar), mrv.j0(ysm0Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Integer num;
        int i;
        int i2;
        int i3;
        int i4;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        String str = null;
        String str2 = null;
        Integer num2 = null;
        String str3 = null;
        Integer num3 = null;
        Integer num4 = null;
        Double d = null;
        Integer num5 = null;
        Integer num6 = null;
        String str4 = null;
        Boolean bool = null;
        Integer num7 = null;
        Double d2 = null;
        String str5 = null;
        boolean z = true;
        int i5 = 0;
        Double d3 = null;
        String str6 = null;
        String str7 = null;
        Double d4 = null;
        String str8 = null;
        Long l = null;
        Integer num8 = null;
        Long l2 = null;
        Integer num9 = null;
        Long l3 = null;
        Boolean bool2 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        int i6 = 0;
        Integer num13 = null;
        Integer num14 = null;
        Boolean bool3 = null;
        Integer num15 = null;
        String str9 = null;
        Integer num16 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    Integer num17 = num13;
                    d3 = d3;
                    str2 = str2;
                    num13 = num17;
                    i6 = i6;
                    z = false;
                    str = str;
                    str6 = str6;
                    num3 = num3;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 0:
                    int i7 = i6;
                    i6 = i7 | 1;
                    str2 = str2;
                    num13 = num13;
                    d3 = (Double) bldVarA.e(ugi0Var, 0, tbl.f33669a, d3);
                    str = str;
                    str6 = str6;
                    num3 = num3;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 1:
                    num2 = num2;
                    int i8 = i6;
                    str7 = str7;
                    str2 = str2;
                    num3 = num3;
                    str6 = (String) bldVarA.e(ugi0Var, 1, ysm0.f43175a, str6);
                    num13 = num13;
                    str = str;
                    i6 = i8 | 2;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 2:
                    str = str;
                    num2 = num2;
                    num = num3;
                    int i9 = i6;
                    i6 = i9 | 4;
                    str2 = str2;
                    num13 = num13;
                    str7 = (String) bldVarA.e(ugi0Var, 2, ysm0.f43175a, str7);
                    num3 = num;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 3:
                    str = str;
                    num2 = num2;
                    num = num3;
                    int i10 = i6;
                    i6 = i10 | 8;
                    str2 = str2;
                    num13 = num13;
                    d4 = (Double) bldVarA.e(ugi0Var, 3, tbl.f33669a, d4);
                    num3 = num;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 4:
                    str = str;
                    num2 = num2;
                    num = num3;
                    int i11 = i6;
                    i6 = i11 | 16;
                    str2 = str2;
                    num13 = num13;
                    str8 = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str8);
                    num3 = num;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 5:
                    str = str;
                    num2 = num2;
                    num = num3;
                    int i12 = i6;
                    i6 = i12 | 32;
                    str2 = str2;
                    num13 = num13;
                    l = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l);
                    num3 = num;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 6:
                    str = str;
                    num2 = num2;
                    num = num3;
                    int i13 = i6;
                    i6 = i13 | 64;
                    str2 = str2;
                    num13 = num13;
                    num8 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num8);
                    num3 = num;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 7:
                    i = i6 | 128;
                    l2 = (Long) bldVarA.e(ugi0Var, 7, s710.f31729a, l2);
                    str6 = str6;
                    str2 = str2;
                    num3 = num3;
                    num13 = num13;
                    i6 = i;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 8:
                    str = str;
                    num2 = num2;
                    num = num3;
                    int i14 = i6;
                    i6 = i14 | 256;
                    str2 = str2;
                    num13 = num13;
                    num9 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num9);
                    num3 = num;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 9:
                    i = i6 | 512;
                    l3 = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l3);
                    str6 = str6;
                    str2 = str2;
                    num3 = num3;
                    num13 = num13;
                    i6 = i;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 10:
                    str = str;
                    num2 = num2;
                    num = num3;
                    int i15 = i6;
                    i6 = i15 | 1024;
                    str2 = str2;
                    num13 = num13;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 10, sm8.f32432a, bool2);
                    num3 = num;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 11:
                    str = str;
                    num2 = num2;
                    num = num3;
                    int i16 = i6;
                    i6 = i16 | 2048;
                    str2 = str2;
                    num13 = num13;
                    num10 = (Integer) bldVarA.e(ugi0Var, 11, okx.f25427a, num10);
                    num3 = num;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 12:
                    str = str;
                    num2 = num2;
                    num = num3;
                    int i17 = i6;
                    i6 = i17 | 4096;
                    str2 = str2;
                    num13 = num13;
                    num11 = (Integer) bldVarA.e(ugi0Var, 12, okx.f25427a, num11);
                    num3 = num;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 13:
                    str = str;
                    num2 = num2;
                    num = num3;
                    i6 |= 8192;
                    str2 = str2;
                    num13 = num13;
                    num12 = (Integer) bldVarA.e(ugi0Var, 13, okx.f25427a, num12);
                    num3 = num;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 14:
                    num = num3;
                    i2 = i6 | 16384;
                    num13 = (Integer) bldVarA.e(ugi0Var, 14, okx.f25427a, num13);
                    i6 = i2;
                    num3 = num;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 15:
                    num = num3;
                    i2 = i6 | 32768;
                    num14 = (Integer) bldVarA.e(ugi0Var, 15, okx.f25427a, num14);
                    i6 = i2;
                    num3 = num;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 16:
                    num = num3;
                    i2 = i6 | 65536;
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 16, sm8.f32432a, bool3);
                    i6 = i2;
                    num3 = num;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 17:
                    num = num3;
                    i2 = i6 | 131072;
                    num15 = (Integer) bldVarA.e(ugi0Var, 17, okx.f25427a, num15);
                    i6 = i2;
                    num3 = num;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 18:
                    num = num3;
                    i2 = i6 | 262144;
                    str9 = (String) bldVarA.e(ugi0Var, 18, ysm0.f43175a, str9);
                    i6 = i2;
                    num3 = num;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    num = num3;
                    i2 = i6 | 524288;
                    num16 = (Integer) bldVarA.e(ugi0Var, 19, okx.f25427a, num16);
                    i6 = i2;
                    num3 = num;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 20:
                    str = str;
                    num2 = num2;
                    num3 = (Integer) bldVarA.e(ugi0Var, 20, okx.f25427a, num3);
                    i6 |= 1048576;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 21:
                    num = num3;
                    str = str;
                    i6 |= 2097152;
                    num2 = (Integer) bldVarA.e(ugi0Var, 21, okx.f25427a, num2);
                    num3 = num;
                    str = str;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 22:
                    str2 = (String) bldVarA.e(ugi0Var, 22, ysm0.f43175a, str2);
                    i3 = 4194304;
                    i6 |= i3;
                    str6 = str6;
                    num3 = num3;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 23:
                    str = (String) bldVarA.e(ugi0Var, 23, ysm0.f43175a, str);
                    i3 = 8388608;
                    i6 |= i3;
                    str6 = str6;
                    num3 = num3;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 24:
                    str3 = (String) bldVarA.e(ugi0Var, 24, ysm0.f43175a, str3);
                    i3 = 16777216;
                    i6 |= i3;
                    str6 = str6;
                    num3 = num3;
                    str6 = str6;
                    num2 = num2;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    d = (Double) bldVarA.e(ugi0Var, 25, tbl.f33669a, d);
                    i3 = 33554432;
                    i6 |= i3;
                    str6 = str6;
                    num3 = num3;
                    str6 = str6;
                    num2 = num2;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    num5 = (Integer) bldVarA.e(ugi0Var, 26, okx.f25427a, num5);
                    i3 = 67108864;
                    i6 |= i3;
                    str6 = str6;
                    num3 = num3;
                    str6 = str6;
                    num2 = num2;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    num4 = (Integer) bldVarA.e(ugi0Var, 27, okx.f25427a, num4);
                    i3 = 134217728;
                    i6 |= i3;
                    str6 = str6;
                    num3 = num3;
                    str6 = str6;
                    num2 = num2;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    num6 = (Integer) bldVarA.e(ugi0Var, 28, okx.f25427a, num6);
                    i3 = 268435456;
                    i6 |= i3;
                    str6 = str6;
                    num3 = num3;
                    str6 = str6;
                    num2 = num2;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    str4 = (String) bldVarA.e(ugi0Var, 29, ysm0.f43175a, str4);
                    i3 = 536870912;
                    i6 |= i3;
                    str6 = str6;
                    num3 = num3;
                    str6 = str6;
                    num2 = num2;
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    bool = (Boolean) bldVarA.e(ugi0Var, 30, sm8.f32432a, bool);
                    i3 = 1073741824;
                    i6 |= i3;
                    str6 = str6;
                    num3 = num3;
                    str6 = str6;
                    num2 = num2;
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    num7 = (Integer) bldVarA.e(ugi0Var, 31, okx.f25427a, num7);
                    i3 = Integer.MIN_VALUE;
                    i6 |= i3;
                    str6 = str6;
                    num3 = num3;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 32:
                    d2 = (Double) bldVarA.e(ugi0Var, 32, tbl.f33669a, d2);
                    i4 = i5 | 1;
                    i5 = i4;
                    str6 = str6;
                    num3 = num3;
                    str6 = str6;
                    num2 = num2;
                    break;
                case 33:
                    str5 = (String) bldVarA.e(ugi0Var, 33, ysm0.f43175a, str5);
                    i4 = i5 | 2;
                    i5 = i4;
                    str6 = str6;
                    num3 = num3;
                    str6 = str6;
                    num2 = num2;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Integer num18 = num13;
        String str10 = str2;
        Double d5 = d3;
        String str11 = str;
        Integer num19 = num3;
        String str12 = str6;
        String str13 = str7;
        bldVarA.c(ugi0Var);
        Double d6 = d;
        return new qv6(i6, i5, d5, str12, str13, d4, str8, l, num8, l2, num9, l3, bool2, num10, num11, num12, num18, num14, bool3, num15, str9, num16, num19, num2, str10, str11, str3, d6, num5, num4, num6, str4, bool, num7, d2, str5);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        qv6 qv6Var = (qv6) obj;
        qv6Var.getClass();
        String str = qv6Var.H;
        Double d = qv6Var.G;
        Integer num = qv6Var.F;
        Boolean bool = qv6Var.E;
        String str2 = qv6Var.D;
        Integer num2 = qv6Var.C;
        Integer num3 = qv6Var.B;
        Integer num4 = qv6Var.A;
        Double d2 = qv6Var.z;
        String str3 = qv6Var.y;
        String str4 = qv6Var.x;
        String str5 = qv6Var.w;
        Integer num5 = qv6Var.v;
        Integer num6 = qv6Var.u;
        Integer num7 = qv6Var.t;
        String str6 = qv6Var.s;
        Integer num8 = qv6Var.r;
        Boolean bool2 = qv6Var.q;
        Integer num9 = qv6Var.p;
        Integer num10 = qv6Var.o;
        Integer num11 = qv6Var.n;
        Integer num12 = qv6Var.m;
        Integer num13 = qv6Var.l;
        Boolean bool3 = qv6Var.k;
        Long l = qv6Var.j;
        Integer num14 = qv6Var.i;
        Long l2 = qv6Var.h;
        Integer num15 = qv6Var.g;
        Long l3 = qv6Var.f;
        String str7 = qv6Var.e;
        Double d3 = qv6Var.d;
        String str8 = qv6Var.c;
        String str9 = qv6Var.b;
        Double d4 = qv6Var.f29373a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || d4 != null) {
            cldVarA.p(ugi0Var, 0, tbl.f33669a, d4);
        }
        if (cldVarA.u(ugi0Var) || str9 != null) {
            cldVarA.p(ugi0Var, 1, ysm0.f43175a, str9);
        }
        if (cldVarA.u(ugi0Var) || str8 != null) {
            cldVarA.p(ugi0Var, 2, ysm0.f43175a, str8);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 3, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || str7 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str7);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || num15 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num15);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 7, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num14 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num14);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 10, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || num13 != null) {
            cldVarA.p(ugi0Var, 11, okx.f25427a, num13);
        }
        if (cldVarA.u(ugi0Var) || num12 != 0) {
            cldVarA.p(ugi0Var, 12, okx.f25427a, num12);
        }
        if (cldVarA.u(ugi0Var) || num11 != 0) {
            cldVarA.p(ugi0Var, 13, okx.f25427a, num11);
        }
        if (cldVarA.u(ugi0Var) || num10 != null) {
            cldVarA.p(ugi0Var, 14, okx.f25427a, num10);
        }
        if (cldVarA.u(ugi0Var) || num9 != null) {
            cldVarA.p(ugi0Var, 15, okx.f25427a, num9);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 16, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || num8 != null) {
            cldVarA.p(ugi0Var, 17, okx.f25427a, num8);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 18, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || num7 != null) {
            cldVarA.p(ugi0Var, 19, okx.f25427a, num7);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 20, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 21, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 22, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 23, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 24, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 25, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 26, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 27, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 28, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 29, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 30, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 31, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 32, tbl.f33669a, d);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 33, ysm0.f43175a, str);
        }
        cldVarA.c(ugi0Var);
    }
}
