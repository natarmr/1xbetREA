package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wbb implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wbb f38868a;
    private static final ugi0 descriptor;

    static {
        wbb wbbVar = new wbb();
        f38868a = wbbVar;
        zna0 zna0Var = new zna0("org.xplatform.cyber.section.impl.feed.data.model.games.ChampGameResponse", wbbVar, 35);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("num", true);
        zna0Var.j("mainGameId", true);
        zna0Var.j("constId", true);
        zna0Var.j("fullName", true);
        zna0Var.j("startTs", true);
        zna0Var.j("countryId", true);
        zna0Var.j("gameTypeName", true);
        zna0Var.j("gameTypeId", true);
        zna0Var.j("dopInfo", true);
        zna0Var.j("period", true);
        zna0Var.j("periodName", true);
        zna0Var.j("gameVidName", true);
        zna0Var.j("menuSection", true);
        zna0Var.j("isNewChamp", true);
        zna0Var.j("isFinal", true);
        zna0Var.j("globalChampId", true);
        zna0Var.j("isThirdPlace", true);
        zna0Var.j("mainConstId", true);
        zna0Var.j("kind", true);
        zna0Var.j("hasHeadToHead", true);
        zna0Var.j("subscriptionAvailable", true);
        zna0Var.j("isFinished", true);
        zna0Var.j("nonStarted", true);
        zna0Var.j("zonePlay", true);
        zna0Var.j("sport", true);
        zna0Var.j("subSport", true);
        zna0Var.j("opponent1", true);
        zna0Var.j("opponent2", true);
        zna0Var.j("eventGroups", true);
        zna0Var.j("video", true);
        zna0Var.j("scores", true);
        zna0Var.j("matchInfoObj", true);
        zna0Var.j("homeAwayFlag", true);
        zna0Var.j("subGamesForMainGame", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = ybb.J;
        s710 s710Var = s710.f31729a;
        jiy jiyVarJ0 = mrv.j0(s710Var);
        jiy jiyVarJ1 = mrv.j0(s710Var);
        jiy jiyVarJ2 = mrv.j0(s710Var);
        jiy jiyVarJ3 = mrv.j0(s710Var);
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ4 = mrv.j0(ysm0Var);
        jiy jiyVarJ5 = mrv.j0(s710Var);
        okx okxVar = okx.f25427a;
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0(ysm0Var);
        jiy jiyVarJ8 = mrv.j0(s710Var);
        jiy jiyVarJ9 = mrv.j0(ysm0Var);
        jiy jiyVarJ10 = mrv.j0(okxVar);
        jiy jiyVarJ11 = mrv.j0(ysm0Var);
        jiy jiyVarJ12 = mrv.j0(ysm0Var);
        jiy jiyVarJ13 = mrv.j0(okxVar);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ14 = mrv.j0(sm8Var);
        jiy jiyVarJ15 = mrv.j0(sm8Var);
        jiy jiyVarJ16 = mrv.j0(s710Var);
        jiy jiyVarJ17 = mrv.j0(sm8Var);
        jiy jiyVarJ18 = mrv.j0(s710Var);
        jiy jiyVarJ19 = mrv.j0(okxVar);
        jiy jiyVarJ20 = mrv.j0(sm8Var);
        jiy jiyVarJ21 = mrv.j0(sm8Var);
        jiy jiyVarJ22 = mrv.j0(sm8Var);
        jiy jiyVarJ23 = mrv.j0(sm8Var);
        jiy jiyVarJ24 = mrv.j0(okxVar);
        ujl0 ujl0Var = ujl0.f35788a;
        jiy jiyVarJ25 = mrv.j0(ujl0Var);
        jiy jiyVarJ26 = mrv.j0(ujl0Var);
        f2g f2gVar = f2g.f8811a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, jiyVarJ14, jiyVarJ15, jiyVarJ16, jiyVarJ17, jiyVarJ18, jiyVarJ19, jiyVarJ20, jiyVarJ21, jiyVarJ22, jiyVarJ23, jiyVarJ24, jiyVarJ25, jiyVarJ26, mrv.j0(f2gVar), mrv.j0(f2gVar), mrv.j0((jiy) a8zVarArr[29].getValue()), mrv.j0(cxs.f5137a), mrv.j0(hch.f12824a), mrv.j0(qa30.f28375a), mrv.j0(sm8Var), mrv.j0((jiy) a8zVarArr[34].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Boolean bool;
        int i2;
        Boolean bool2;
        int i3;
        int i4;
        int i5;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = ybb.J;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        List list = null;
        Integer num = null;
        Boolean bool6 = null;
        h2g h2gVar = null;
        okl0 okl0Var = null;
        okl0 okl0Var2 = null;
        h2g h2gVar2 = null;
        List list2 = null;
        gxs gxsVar = null;
        jch jchVar = null;
        ua30 ua30Var = null;
        boolean z = true;
        int i6 = 0;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        String str = null;
        Long l5 = null;
        Integer num2 = null;
        String str2 = null;
        Long l6 = null;
        String str3 = null;
        Integer num3 = null;
        String str4 = null;
        String str5 = null;
        Integer num4 = null;
        int i7 = 0;
        Boolean bool7 = null;
        Boolean bool8 = null;
        Long l7 = null;
        Boolean bool9 = null;
        Long l8 = null;
        Integer num5 = null;
        Boolean bool10 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    Boolean bool11 = bool7;
                    str2 = str2;
                    list = list;
                    bool7 = bool11;
                    i7 = i7;
                    z = false;
                    l2 = l2;
                    bool3 = bool3;
                    l = l;
                    bool5 = bool5;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 0:
                    Boolean bool12 = bool7;
                    str2 = str2;
                    l2 = l2;
                    list = list;
                    l = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l);
                    bool7 = bool12;
                    bool3 = bool3;
                    i7 |= 1;
                    bool5 = bool5;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 1:
                    Boolean bool13 = bool7;
                    bool4 = bool4;
                    i = i7 | 2;
                    str2 = str2;
                    l3 = l3;
                    list = list;
                    bool5 = bool5;
                    l2 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l2);
                    bool7 = bool13;
                    bool3 = bool3;
                    i7 = i;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 2:
                    int i8 = i7;
                    bool = bool7;
                    i = i8 | 4;
                    l3 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l3);
                    str2 = str2;
                    l2 = l2;
                    list = list;
                    bool5 = bool5;
                    bool3 = bool3;
                    bool7 = bool;
                    i7 = i;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 3:
                    int i9 = i7;
                    bool = bool7;
                    i = i9 | 8;
                    l4 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l4);
                    str2 = str2;
                    l2 = l2;
                    list = list;
                    bool5 = bool5;
                    bool3 = bool3;
                    bool7 = bool;
                    i7 = i;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 4:
                    int i10 = i7;
                    bool = bool7;
                    i = i10 | 16;
                    str = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str);
                    str2 = str2;
                    l2 = l2;
                    list = list;
                    bool5 = bool5;
                    bool3 = bool3;
                    bool7 = bool;
                    i7 = i;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 5:
                    int i11 = i7;
                    bool = bool7;
                    i = i11 | 32;
                    l5 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l5);
                    str2 = str2;
                    l2 = l2;
                    list = list;
                    bool5 = bool5;
                    bool3 = bool3;
                    bool7 = bool;
                    i7 = i;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 6:
                    int i12 = i7;
                    bool = bool7;
                    i = i12 | 64;
                    num2 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num2);
                    str2 = str2;
                    l2 = l2;
                    list = list;
                    bool5 = bool5;
                    bool3 = bool3;
                    bool7 = bool;
                    i7 = i;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 7:
                    i2 = i7 | 128;
                    str2 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str2);
                    l2 = l2;
                    list = list;
                    bool5 = bool5;
                    bool7 = bool7;
                    i7 = i2;
                    bool3 = bool3;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 8:
                    bool3 = bool3;
                    bool4 = bool4;
                    bool5 = bool5;
                    int i13 = i7;
                    bool = bool7;
                    list = list;
                    i = i13 | 256;
                    l6 = (Long) bldVarA.e(ugi0Var, 8, s710.f31729a, l6);
                    l2 = l2;
                    list = list;
                    bool5 = bool5;
                    bool3 = bool3;
                    bool7 = bool;
                    i7 = i;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 9:
                    i2 = i7 | 512;
                    str3 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str3);
                    l2 = l2;
                    list = list;
                    bool5 = bool5;
                    bool7 = bool7;
                    i7 = i2;
                    bool3 = bool3;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 10:
                    bool3 = bool3;
                    bool4 = bool4;
                    bool5 = bool5;
                    int i14 = i7;
                    bool = bool7;
                    list = list;
                    i = i14 | 1024;
                    num3 = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num3);
                    l2 = l2;
                    list = list;
                    bool5 = bool5;
                    bool3 = bool3;
                    bool7 = bool;
                    i7 = i;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 11:
                    bool3 = bool3;
                    bool4 = bool4;
                    bool5 = bool5;
                    int i15 = i7;
                    bool = bool7;
                    list = list;
                    i = i15 | 2048;
                    str4 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str4);
                    l2 = l2;
                    list = list;
                    bool5 = bool5;
                    bool3 = bool3;
                    bool7 = bool;
                    i7 = i;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 12:
                    bool3 = bool3;
                    bool4 = bool4;
                    bool5 = bool5;
                    int i16 = i7;
                    bool = bool7;
                    list = list;
                    i = i16 | 4096;
                    str5 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str5);
                    l2 = l2;
                    list = list;
                    bool5 = bool5;
                    bool3 = bool3;
                    bool7 = bool;
                    i7 = i;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 13:
                    bool3 = bool3;
                    bool4 = bool4;
                    bool5 = bool5;
                    int i17 = i7;
                    bool = bool7;
                    list = list;
                    i = i17 | 8192;
                    num4 = (Integer) bldVarA.e(ugi0Var, 13, okx.f25427a, num4);
                    l2 = l2;
                    list = list;
                    bool5 = bool5;
                    bool3 = bool3;
                    bool7 = bool;
                    i7 = i;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 14:
                    bool2 = bool5;
                    i3 = i7 | 16384;
                    bool7 = (Boolean) bldVarA.e(ugi0Var, 14, sm8.f32432a, bool7);
                    i7 = i3;
                    bool5 = bool2;
                    bool3 = bool3;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 15:
                    bool2 = bool5;
                    i3 = i7 | 32768;
                    bool8 = (Boolean) bldVarA.e(ugi0Var, 15, sm8.f32432a, bool8);
                    i7 = i3;
                    bool5 = bool2;
                    bool3 = bool3;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 16:
                    bool2 = bool5;
                    i3 = i7 | 65536;
                    l7 = (Long) bldVarA.e(ugi0Var, 16, s710.f31729a, l7);
                    i7 = i3;
                    bool5 = bool2;
                    bool3 = bool3;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 17:
                    bool2 = bool5;
                    i3 = i7 | 131072;
                    bool9 = (Boolean) bldVarA.e(ugi0Var, 17, sm8.f32432a, bool9);
                    i7 = i3;
                    bool5 = bool2;
                    bool3 = bool3;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 18:
                    bool2 = bool5;
                    i3 = i7 | 262144;
                    l8 = (Long) bldVarA.e(ugi0Var, 18, s710.f31729a, l8);
                    i7 = i3;
                    bool5 = bool2;
                    bool3 = bool3;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    bool2 = bool5;
                    i3 = i7 | 524288;
                    num5 = (Integer) bldVarA.e(ugi0Var, 19, okx.f25427a, num5);
                    i7 = i3;
                    bool5 = bool2;
                    bool3 = bool3;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 20:
                    bool2 = bool5;
                    i3 = i7 | 1048576;
                    bool10 = (Boolean) bldVarA.e(ugi0Var, 20, sm8.f32432a, bool10);
                    i7 = i3;
                    bool5 = bool2;
                    bool3 = bool3;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 21:
                    bool3 = bool3;
                    bool4 = bool4;
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 21, sm8.f32432a, bool5);
                    i7 |= 2097152;
                    bool3 = bool3;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 22:
                    bool2 = bool5;
                    bool3 = bool3;
                    i7 |= 4194304;
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 22, sm8.f32432a, bool4);
                    bool5 = bool2;
                    bool3 = bool3;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 23:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 23, sm8.f32432a, bool3);
                    i4 = 8388608;
                    i7 |= i4;
                    l2 = l2;
                    bool5 = bool5;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 24:
                    num = (Integer) bldVarA.e(ugi0Var, 24, okx.f25427a, num);
                    i4 = 16777216;
                    i7 |= i4;
                    l2 = l2;
                    bool5 = bool5;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    okl0Var = (okl0) bldVarA.e(ugi0Var, 25, ujl0.f35788a, okl0Var);
                    i4 = 33554432;
                    i7 |= i4;
                    l2 = l2;
                    bool5 = bool5;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    okl0Var2 = (okl0) bldVarA.e(ugi0Var, 26, ujl0.f35788a, okl0Var2);
                    i4 = 67108864;
                    i7 |= i4;
                    l2 = l2;
                    bool5 = bool5;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    h2gVar = (h2g) bldVarA.e(ugi0Var, 27, f2g.f8811a, h2gVar);
                    i4 = 134217728;
                    i7 |= i4;
                    l2 = l2;
                    bool5 = bool5;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    h2gVar2 = (h2g) bldVarA.e(ugi0Var, 28, f2g.f8811a, h2gVar2);
                    i4 = 268435456;
                    i7 |= i4;
                    l2 = l2;
                    bool5 = bool5;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    list2 = (List) bldVarA.e(ugi0Var, 29, (jiy) a8zVarArr[29].getValue(), list2);
                    i4 = 536870912;
                    i7 |= i4;
                    l2 = l2;
                    bool5 = bool5;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    gxsVar = (gxs) bldVarA.e(ugi0Var, 30, cxs.f5137a, gxsVar);
                    i4 = 1073741824;
                    i7 |= i4;
                    l2 = l2;
                    bool5 = bool5;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    jchVar = (jch) bldVarA.e(ugi0Var, 31, hch.f12824a, jchVar);
                    i4 = Integer.MIN_VALUE;
                    i7 |= i4;
                    l2 = l2;
                    bool5 = bool5;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 32:
                    ua30Var = (ua30) bldVarA.e(ugi0Var, 32, qa30.f28375a, ua30Var);
                    i5 = i6 | 1;
                    i6 = i5;
                    l2 = l2;
                    bool5 = bool5;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 33:
                    bool6 = (Boolean) bldVarA.e(ugi0Var, 33, sm8.f32432a, bool6);
                    i5 = i6 | 2;
                    i6 = i5;
                    l2 = l2;
                    bool5 = bool5;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                case 34:
                    list = (List) bldVarA.e(ugi0Var, 34, (jiy) a8zVarArr[34].getValue(), list);
                    i5 = i6 | 4;
                    i6 = i5;
                    l2 = l2;
                    bool5 = bool5;
                    l2 = l2;
                    bool4 = bool4;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool14 = bool7;
        List list3 = list;
        String str6 = str2;
        Boolean bool15 = bool3;
        Boolean bool16 = bool5;
        Long l9 = l;
        Long l10 = l2;
        Long l11 = l3;
        bldVarA.c(ugi0Var);
        return new ybb(i7, i6, l9, l10, l11, l4, str, l5, num2, str6, l6, str3, num3, str4, str5, num4, bool14, bool8, l7, bool9, l8, num5, bool10, bool16, bool4, bool15, num, okl0Var, okl0Var2, h2gVar, h2gVar2, list2, gxsVar, jchVar, ua30Var, bool6, list3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        ybb ybbVar = (ybb) obj;
        ybbVar.getClass();
        List list = ybbVar.I;
        Boolean bool = ybbVar.H;
        ua30 ua30Var = ybbVar.G;
        jch jchVar = ybbVar.F;
        gxs gxsVar = ybbVar.E;
        List list2 = ybbVar.D;
        h2g h2gVar = ybbVar.C;
        h2g h2gVar2 = ybbVar.B;
        okl0 okl0Var = ybbVar.A;
        okl0 okl0Var2 = ybbVar.z;
        Integer num = ybbVar.y;
        Boolean bool2 = ybbVar.x;
        Boolean bool3 = ybbVar.w;
        Boolean bool4 = ybbVar.v;
        Boolean bool5 = ybbVar.u;
        Integer num2 = ybbVar.t;
        Long l = ybbVar.s;
        Boolean bool6 = ybbVar.r;
        Long l2 = ybbVar.q;
        Boolean bool7 = ybbVar.p;
        Boolean bool8 = ybbVar.o;
        Integer num3 = ybbVar.n;
        String str = ybbVar.m;
        String str2 = ybbVar.l;
        Integer num4 = ybbVar.k;
        String str3 = ybbVar.j;
        Long l3 = ybbVar.i;
        String str4 = ybbVar.h;
        Integer num5 = ybbVar.g;
        Long l4 = ybbVar.f;
        String str5 = ybbVar.e;
        Long l5 = ybbVar.d;
        Long l6 = ybbVar.c;
        Long l7 = ybbVar.b;
        Long l8 = ybbVar.f42335a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = ybb.J;
        if (cldVarA.u(ugi0Var) || l8 != null) {
            cldVarA.p(ugi0Var, 0, s710.f31729a, l8);
        }
        if (cldVarA.u(ugi0Var) || l7 != null) {
            cldVarA.p(ugi0Var, 1, s710.f31729a, l7);
        }
        if (cldVarA.u(ugi0Var) || l6 != null) {
            cldVarA.p(ugi0Var, 2, s710.f31729a, l6);
        }
        if (cldVarA.u(ugi0Var) || l5 != null) {
            cldVarA.p(ugi0Var, 3, s710.f31729a, l5);
        }
        if (cldVarA.u(ugi0Var) || str5 != null) {
            cldVarA.p(ugi0Var, 4, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || l4 != null) {
            cldVarA.p(ugi0Var, 5, s710.f31729a, l4);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 8, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 9, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 11, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || str != 0) {
            cldVarA.p(ugi0Var, 12, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || num3 != 0) {
            cldVarA.p(ugi0Var, 13, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || bool8 != null) {
            cldVarA.p(ugi0Var, 14, sm8.f32432a, bool8);
        }
        if (cldVarA.u(ugi0Var) || bool7 != null) {
            cldVarA.p(ugi0Var, 15, sm8.f32432a, bool7);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 16, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || bool6 != null) {
            cldVarA.p(ugi0Var, 17, sm8.f32432a, bool6);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 18, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 19, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 20, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 21, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 22, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 23, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 24, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || okl0Var2 != null) {
            cldVarA.p(ugi0Var, 25, ujl0.f35788a, okl0Var2);
        }
        if (cldVarA.u(ugi0Var) || okl0Var != null) {
            cldVarA.p(ugi0Var, 26, ujl0.f35788a, okl0Var);
        }
        if (cldVarA.u(ugi0Var) || h2gVar2 != null) {
            cldVarA.p(ugi0Var, 27, f2g.f8811a, h2gVar2);
        }
        if (cldVarA.u(ugi0Var) || h2gVar != null) {
            cldVarA.p(ugi0Var, 28, f2g.f8811a, h2gVar);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 29, (jiy) a8zVarArr[29].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || gxsVar != null) {
            cldVarA.p(ugi0Var, 30, cxs.f5137a, gxsVar);
        }
        if (cldVarA.u(ugi0Var) || jchVar != null) {
            cldVarA.p(ugi0Var, 31, hch.f12824a, jchVar);
        }
        if (cldVarA.u(ugi0Var) || ua30Var != null) {
            cldVarA.p(ugi0Var, 32, qa30.f28375a, ua30Var);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 33, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 34, (jiy) a8zVarArr[34].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
