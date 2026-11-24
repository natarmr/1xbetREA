package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kj30 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kj30 f18367a;
    private static final ugi0 descriptor;

    static {
        kj30 kj30Var = new kj30();
        f18367a = kj30Var;
        zna0 zna0Var = new zna0("org.xplatform.cyber.game.core.data.model.feed.MbCyberWithSubGameResponse", kj30Var, 36);
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
        zna0Var.j("updateTs", true);
        zna0Var.j("liga", true);
        zna0Var.j("opponent1", true);
        zna0Var.j("opponent2", true);
        zna0Var.j("eventGroups", true);
        zna0Var.j("statisticInfo", true);
        zna0Var.j("video", true);
        zna0Var.j("subGamesForMainGame", true);
        zna0Var.j("matchInfoObj", true);
        zna0Var.j("scores", true);
        zna0Var.j("alterVideos", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = mj30.K;
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
        jiy jiyVarJ8 = mrv.j0(okxVar);
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
        jiy jiyVarJ25 = mrv.j0(s710Var);
        jiy jiyVarJ26 = mrv.j0(uz5.f36520a);
        f2g f2gVar = f2g.f8811a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, jiyVarJ12, jiyVarJ13, jiyVarJ14, jiyVarJ15, jiyVarJ16, jiyVarJ17, jiyVarJ18, jiyVarJ19, jiyVarJ20, jiyVarJ21, jiyVarJ22, jiyVarJ23, jiyVarJ24, jiyVarJ25, jiyVarJ26, mrv.j0(f2gVar), mrv.j0(f2gVar), mrv.j0((jiy) a8zVarArr[29].getValue()), mrv.j0(bss.f3147a), mrv.j0(cxs.f5137a), mrv.j0((jiy) a8zVarArr[32].getValue()), mrv.j0(ibr.f14504a), mrv.j0(hch.f12824a), mrv.j0((jiy) a8zVarArr[35].getValue())};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Boolean bool;
        int i2;
        int i3;
        int i4;
        int i5;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = mj30.K;
        Boolean bool2 = null;
        Boolean bool3 = null;
        List list = null;
        jch jchVar = null;
        Integer num = null;
        mbr mbrVar = null;
        h2g h2gVar = null;
        Long l = null;
        wz5 wz5Var = null;
        h2g h2gVar2 = null;
        List list2 = null;
        dss dssVar = null;
        gxs gxsVar = null;
        List list3 = null;
        boolean z = true;
        int i6 = 0;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        String str = null;
        Long l6 = null;
        Integer num2 = null;
        String str2 = null;
        Integer num3 = null;
        String str3 = null;
        Integer num4 = null;
        String str4 = null;
        String str5 = null;
        Integer num5 = null;
        int i7 = 0;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Long l7 = null;
        Boolean bool6 = null;
        Long l8 = null;
        Integer num6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    Boolean bool9 = bool4;
                    bool3 = bool3;
                    list = list;
                    str2 = str2;
                    jchVar = jchVar;
                    bool4 = bool9;
                    i7 = i7;
                    z = false;
                    l3 = l3;
                    bool2 = bool2;
                    l2 = l2;
                    bool3 = bool3;
                    l3 = l3;
                    list = list;
                    break;
                case 0:
                    Boolean bool10 = bool4;
                    bool3 = bool3;
                    list = list;
                    i = i7 | 1;
                    str2 = str2;
                    l3 = l3;
                    jchVar = jchVar;
                    l2 = (Long) bldVarA.e(ugi0Var, 0, s710.f31729a, l2);
                    bool4 = bool10;
                    bool2 = bool2;
                    i7 = i;
                    bool3 = bool3;
                    l3 = l3;
                    list = list;
                    break;
                case 1:
                    Boolean bool11 = bool4;
                    list = list;
                    str2 = str2;
                    l4 = l4;
                    jchVar = jchVar;
                    bool3 = bool3;
                    l3 = (Long) bldVarA.e(ugi0Var, 1, s710.f31729a, l3);
                    bool4 = bool11;
                    bool2 = bool2;
                    i7 |= 2;
                    l3 = l3;
                    list = list;
                    break;
                case 2:
                    int i8 = i7;
                    bool = bool4;
                    i = i8 | 4;
                    l4 = (Long) bldVarA.e(ugi0Var, 2, s710.f31729a, l4);
                    str2 = str2;
                    l3 = l3;
                    jchVar = jchVar;
                    bool2 = bool2;
                    bool4 = bool;
                    i7 = i;
                    bool3 = bool3;
                    l3 = l3;
                    list = list;
                    break;
                case 3:
                    int i9 = i7;
                    bool = bool4;
                    i = i9 | 8;
                    l5 = (Long) bldVarA.e(ugi0Var, 3, s710.f31729a, l5);
                    str2 = str2;
                    l3 = l3;
                    jchVar = jchVar;
                    bool2 = bool2;
                    bool4 = bool;
                    i7 = i;
                    bool3 = bool3;
                    l3 = l3;
                    list = list;
                    break;
                case 4:
                    int i10 = i7;
                    bool = bool4;
                    i = i10 | 16;
                    str = (String) bldVarA.e(ugi0Var, 4, ysm0.f43175a, str);
                    str2 = str2;
                    l3 = l3;
                    jchVar = jchVar;
                    bool2 = bool2;
                    bool4 = bool;
                    i7 = i;
                    bool3 = bool3;
                    l3 = l3;
                    list = list;
                    break;
                case 5:
                    int i11 = i7;
                    bool = bool4;
                    i = i11 | 32;
                    l6 = (Long) bldVarA.e(ugi0Var, 5, s710.f31729a, l6);
                    str2 = str2;
                    l3 = l3;
                    jchVar = jchVar;
                    bool2 = bool2;
                    bool4 = bool;
                    i7 = i;
                    bool3 = bool3;
                    l3 = l3;
                    list = list;
                    break;
                case 6:
                    int i12 = i7;
                    bool = bool4;
                    i = i12 | 64;
                    num2 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num2);
                    str2 = str2;
                    l3 = l3;
                    jchVar = jchVar;
                    bool2 = bool2;
                    bool4 = bool;
                    i7 = i;
                    bool3 = bool3;
                    l3 = l3;
                    list = list;
                    break;
                case 7:
                    i2 = i7 | 128;
                    str2 = (String) bldVarA.e(ugi0Var, 7, ysm0.f43175a, str2);
                    l3 = l3;
                    jchVar = jchVar;
                    bool3 = bool3;
                    bool4 = bool4;
                    i7 = i2;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case 8:
                    i2 = i7 | 256;
                    num3 = (Integer) bldVarA.e(ugi0Var, 8, okx.f25427a, num3);
                    l3 = l3;
                    jchVar = jchVar;
                    bool3 = bool3;
                    bool4 = bool4;
                    i7 = i2;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case 9:
                    bool2 = bool2;
                    bool3 = bool3;
                    list = list;
                    int i13 = i7;
                    bool = bool4;
                    jchVar = jchVar;
                    i = i13 | 512;
                    str3 = (String) bldVarA.e(ugi0Var, 9, ysm0.f43175a, str3);
                    l3 = l3;
                    jchVar = jchVar;
                    bool2 = bool2;
                    bool4 = bool;
                    i7 = i;
                    bool3 = bool3;
                    l3 = l3;
                    list = list;
                    break;
                case 10:
                    bool2 = bool2;
                    bool3 = bool3;
                    list = list;
                    int i14 = i7;
                    bool = bool4;
                    jchVar = jchVar;
                    i = i14 | 1024;
                    num4 = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num4);
                    l3 = l3;
                    jchVar = jchVar;
                    bool2 = bool2;
                    bool4 = bool;
                    i7 = i;
                    bool3 = bool3;
                    l3 = l3;
                    list = list;
                    break;
                case 11:
                    bool2 = bool2;
                    bool3 = bool3;
                    list = list;
                    int i15 = i7;
                    bool = bool4;
                    jchVar = jchVar;
                    i = i15 | 2048;
                    str4 = (String) bldVarA.e(ugi0Var, 11, ysm0.f43175a, str4);
                    l3 = l3;
                    jchVar = jchVar;
                    bool2 = bool2;
                    bool4 = bool;
                    i7 = i;
                    bool3 = bool3;
                    l3 = l3;
                    list = list;
                    break;
                case 12:
                    bool2 = bool2;
                    bool3 = bool3;
                    list = list;
                    int i16 = i7;
                    bool = bool4;
                    jchVar = jchVar;
                    i = i16 | 4096;
                    str5 = (String) bldVarA.e(ugi0Var, 12, ysm0.f43175a, str5);
                    l3 = l3;
                    jchVar = jchVar;
                    bool2 = bool2;
                    bool4 = bool;
                    i7 = i;
                    bool3 = bool3;
                    l3 = l3;
                    list = list;
                    break;
                case 13:
                    bool2 = bool2;
                    bool3 = bool3;
                    list = list;
                    int i17 = i7;
                    bool = bool4;
                    jchVar = jchVar;
                    i = i17 | 8192;
                    num5 = (Integer) bldVarA.e(ugi0Var, 13, okx.f25427a, num5);
                    l3 = l3;
                    jchVar = jchVar;
                    bool2 = bool2;
                    bool4 = bool;
                    i7 = i;
                    bool3 = bool3;
                    l3 = l3;
                    list = list;
                    break;
                case 14:
                    i3 = i7 | 16384;
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 14, sm8.f32432a, bool4);
                    i7 = i3;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case 15:
                    i3 = i7 | 32768;
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 15, sm8.f32432a, bool5);
                    i7 = i3;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case 16:
                    i3 = i7 | 65536;
                    l7 = (Long) bldVarA.e(ugi0Var, 16, s710.f31729a, l7);
                    i7 = i3;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case 17:
                    i3 = i7 | 131072;
                    bool6 = (Boolean) bldVarA.e(ugi0Var, 17, sm8.f32432a, bool6);
                    i7 = i3;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case 18:
                    i3 = i7 | 262144;
                    l8 = (Long) bldVarA.e(ugi0Var, 18, s710.f31729a, l8);
                    i7 = i3;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    i3 = i7 | 524288;
                    num6 = (Integer) bldVarA.e(ugi0Var, 19, okx.f25427a, num6);
                    i7 = i3;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case 20:
                    i3 = i7 | 1048576;
                    bool7 = (Boolean) bldVarA.e(ugi0Var, 20, sm8.f32432a, bool7);
                    i7 = i3;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case 21:
                    bool2 = bool2;
                    list = list;
                    bool3 = bool3;
                    i7 |= 2097152;
                    bool8 = (Boolean) bldVarA.e(ugi0Var, 21, sm8.f32432a, bool8);
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case 22:
                    list = list;
                    bool2 = bool2;
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 22, sm8.f32432a, bool3);
                    i7 |= 4194304;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case 23:
                    list = list;
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 23, sm8.f32432a, bool2);
                    i7 |= 8388608;
                    l3 = l3;
                    bool3 = bool3;
                    l3 = l3;
                    list = list;
                    break;
                case 24:
                    num = (Integer) bldVarA.e(ugi0Var, 24, okx.f25427a, num);
                    i4 = 16777216;
                    i7 |= i4;
                    list = list;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    l = (Long) bldVarA.e(ugi0Var, 25, s710.f31729a, l);
                    i4 = 33554432;
                    i7 |= i4;
                    list = list;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    wz5Var = (wz5) bldVarA.e(ugi0Var, 26, uz5.f36520a, wz5Var);
                    i4 = 67108864;
                    i7 |= i4;
                    list = list;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    h2gVar = (h2g) bldVarA.e(ugi0Var, 27, f2g.f8811a, h2gVar);
                    i4 = 134217728;
                    i7 |= i4;
                    list = list;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    h2gVar2 = (h2g) bldVarA.e(ugi0Var, 28, f2g.f8811a, h2gVar2);
                    i4 = 268435456;
                    i7 |= i4;
                    list = list;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    list2 = (List) bldVarA.e(ugi0Var, 29, (jiy) a8zVarArr[29].getValue(), list2);
                    i4 = 536870912;
                    i7 |= i4;
                    list = list;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    dssVar = (dss) bldVarA.e(ugi0Var, 30, bss.f3147a, dssVar);
                    i4 = 1073741824;
                    i7 |= i4;
                    list = list;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    gxsVar = (gxs) bldVarA.e(ugi0Var, 31, cxs.f5137a, gxsVar);
                    i4 = Integer.MIN_VALUE;
                    i7 |= i4;
                    list = list;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case 32:
                    list3 = (List) bldVarA.e(ugi0Var, 32, (jiy) a8zVarArr[32].getValue(), list3);
                    i5 = i6 | 1;
                    i6 = i5;
                    list = list;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case 33:
                    mbrVar = (mbr) bldVarA.e(ugi0Var, 33, ibr.f14504a, mbrVar);
                    i5 = i6 | 2;
                    i6 = i5;
                    list = list;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case 34:
                    jchVar = (jch) bldVarA.e(ugi0Var, 34, hch.f12824a, jchVar);
                    i5 = i6 | 4;
                    i6 = i5;
                    list = list;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                case 35:
                    list = (List) bldVarA.e(ugi0Var, 35, (jiy) a8zVarArr[35].getValue(), list);
                    i5 = i6 | 8;
                    i6 = i5;
                    list = list;
                    bool3 = bool3;
                    bool2 = bool2;
                    l3 = l3;
                    list = list;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool12 = bool4;
        jch jchVar2 = jchVar;
        String str6 = str2;
        Boolean bool13 = bool3;
        Long l9 = l2;
        Long l10 = l3;
        Long l11 = l4;
        bldVarA.c(ugi0Var);
        Long l12 = l;
        return new mj30(i7, i6, l9, l10, l11, l5, str, l6, num2, str6, num3, str3, num4, str4, str5, num5, bool12, bool5, l7, bool6, l8, num6, bool7, bool8, bool13, bool2, num, l12, wz5Var, h2gVar, h2gVar2, list2, dssVar, gxsVar, list3, mbrVar, jchVar2, list);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        mj30 mj30Var = (mj30) obj;
        mj30Var.getClass();
        List list = mj30Var.J;
        jch jchVar = mj30Var.I;
        mbr mbrVar = mj30Var.H;
        List list2 = mj30Var.G;
        gxs gxsVar = mj30Var.F;
        dss dssVar = mj30Var.E;
        List list3 = mj30Var.D;
        h2g h2gVar = mj30Var.C;
        h2g h2gVar2 = mj30Var.B;
        wz5 wz5Var = mj30Var.A;
        Long l = mj30Var.z;
        Integer num = mj30Var.y;
        Boolean bool = mj30Var.x;
        Boolean bool2 = mj30Var.w;
        Boolean bool3 = mj30Var.v;
        Boolean bool4 = mj30Var.u;
        Integer num2 = mj30Var.t;
        Long l2 = mj30Var.s;
        Boolean bool5 = mj30Var.r;
        Long l3 = mj30Var.q;
        Boolean bool6 = mj30Var.p;
        Boolean bool7 = mj30Var.o;
        Integer num3 = mj30Var.n;
        String str = mj30Var.m;
        String str2 = mj30Var.l;
        Integer num4 = mj30Var.k;
        String str3 = mj30Var.j;
        Integer num5 = mj30Var.i;
        String str4 = mj30Var.h;
        Integer num6 = mj30Var.g;
        Long l4 = mj30Var.f;
        String str5 = mj30Var.e;
        Long l5 = mj30Var.d;
        Long l6 = mj30Var.c;
        Long l7 = mj30Var.b;
        Long l8 = mj30Var.f21875a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = mj30.K;
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
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 7, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 8, okx.f25427a, num5);
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
        if (cldVarA.u(ugi0Var) || bool7 != null) {
            cldVarA.p(ugi0Var, 14, sm8.f32432a, bool7);
        }
        if (cldVarA.u(ugi0Var) || bool6 != null) {
            cldVarA.p(ugi0Var, 15, sm8.f32432a, bool6);
        }
        if (cldVarA.u(ugi0Var) || l3 != null) {
            cldVarA.p(ugi0Var, 16, s710.f31729a, l3);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 17, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || l2 != null) {
            cldVarA.p(ugi0Var, 18, s710.f31729a, l2);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 19, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 20, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 21, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 22, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 23, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 24, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 25, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || wz5Var != null) {
            cldVarA.p(ugi0Var, 26, uz5.f36520a, wz5Var);
        }
        if (cldVarA.u(ugi0Var) || h2gVar2 != null) {
            cldVarA.p(ugi0Var, 27, f2g.f8811a, h2gVar2);
        }
        if (cldVarA.u(ugi0Var) || h2gVar != null) {
            cldVarA.p(ugi0Var, 28, f2g.f8811a, h2gVar);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 29, (jiy) a8zVarArr[29].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || dssVar != null) {
            cldVarA.p(ugi0Var, 30, bss.f3147a, dssVar);
        }
        if (cldVarA.u(ugi0Var) || gxsVar != null) {
            cldVarA.p(ugi0Var, 31, cxs.f5137a, gxsVar);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 32, (jiy) a8zVarArr[32].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || mbrVar != null) {
            cldVarA.p(ugi0Var, 33, ibr.f14504a, mbrVar);
        }
        if (cldVarA.u(ugi0Var) || jchVar != null) {
            cldVarA.p(ugi0Var, 34, hch.f12824a, jchVar);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 35, (jiy) a8zVarArr[35].getValue(), list);
        }
        cldVarA.c(ugi0Var);
    }
}
