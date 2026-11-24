package a;

import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mit0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mit0 f21863a;
    private static final ugi0 descriptor;

    static {
        mit0 mit0Var = new mit0();
        f21863a = mit0Var;
        zna0 zna0Var = new zna0("org.xplatform.coupon.impl.coupon.data.models.UpdateCouponResponse", mit0Var, 58);
        zna0Var.j("BonusCode", true);
        zna0Var.j("CfView", true);
        zna0Var.j("CheckCf", true);
        zna0Var.j("Code", true);
        zna0Var.j("Events", true);
        zna0Var.j("ExpresCoef", true);
        zna0Var.j("Groups", true);
        zna0Var.j("GroupsSumms", true);
        zna0Var.j("Lng", true);
        zna0Var.j("NeedUpdateLine", true);
        zna0Var.j("Source", true);
        zna0Var.j("Sport", true);
        zna0Var.j("Summ", true);
        zna0Var.j("TerminalCode", true);
        zna0Var.j("Top", true);
        zna0Var.j("UserId", true);
        zna0Var.j("UserIdBonus", true);
        zna0Var.j("Vid", true);
        zna0Var.j("WithLobby", true);
        zna0Var.j("avanceBet", true);
        zna0Var.j("betGUID", true);
        zna0Var.j("changeCf", true);
        zna0Var.j("expressNum", true);
        zna0Var.j("notWait", true);
        zna0Var.j("partner", true);
        zna0Var.j("promo", true);
        zna0Var.j("InitialBet", true);
        zna0Var.j("BetStep", true);
        zna0Var.j("EventsIndexes", true);
        zna0Var.j("minBet", true);
        zna0Var.j("maxBet", true);
        zna0Var.j("MinBetSystems", true);
        zna0Var.j("lnC", true);
        zna0Var.j("lvC", true);
        zna0Var.j("Coef", true);
        zna0Var.j("CoefView", true);
        zna0Var.j("AntiExpressCoef", true);
        zna0Var.j("UnlimitedBet", true);
        zna0Var.j("RestrictionWarning", true);
        zna0Var.j("RestrictionWarningGameIds", true);
        zna0Var.j("MaxPayout", true);
        zna0Var.j("promoCodes", true);
        zna0Var.j("HyperBonusPercent", true);
        zna0Var.j("MinHyperBonusBetLimit", true);
        zna0Var.j("MaxHyperBonusLimit", true);
        zna0Var.j("exceptionText", true);
        zna0Var.j("NegAsiaBetFlg", true);
        zna0Var.j("CoefType", true);
        zna0Var.j("EventCountToBoost", true);
        zna0Var.j("MinEventCoefToBoost", true);
        zna0Var.j("IsExpressBoost", true);
        zna0Var.j("MinEventCountToBoost", true);
        zna0Var.j("NotValid", true);
        zna0Var.j("specialTypes", true);
        zna0Var.j("OptionLowerCf", true);
        zna0Var.j("OptionLowerCfView", true);
        zna0Var.j("PossibleWinCoef", true);
        zna0Var.j("EachWayBet", true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        a8z[] a8zVarArr = oit0.g0;
        okx okxVar = okx.f25427a;
        jiy jiyVarJ0 = mrv.j0(okxVar);
        jiy jiyVarJ1 = mrv.j0(okxVar);
        jiy jiyVarJ2 = mrv.j0(okxVar);
        jiy jiyVarJ3 = mrv.j0(okxVar);
        jiy jiyVarJ4 = mrv.j0((jiy) a8zVarArr[4].getValue());
        jiy jiyVarJ5 = mrv.j0(okxVar);
        jiy jiyVarJ6 = mrv.j0(okxVar);
        jiy jiyVarJ7 = mrv.j0((jiy) a8zVarArr[7].getValue());
        ysm0 ysm0Var = ysm0.f43175a;
        jiy jiyVarJ8 = mrv.j0(ysm0Var);
        sm8 sm8Var = sm8.f32432a;
        jiy jiyVarJ9 = mrv.j0(sm8Var);
        jiy jiyVarJ10 = mrv.j0(okxVar);
        jiy jiyVarJ11 = mrv.j0(okxVar);
        tbl tblVar = tbl.f33669a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, jiyVarJ10, jiyVarJ11, mrv.j0(tblVar), mrv.j0(ysm0Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0(sm8Var), mrv.j0(okxVar), mrv.j0(sm8Var), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0((jiy) a8zVarArr[28].getValue()), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0((jiy) a8zVarArr[31].getValue()), mrv.j0(sm8Var), mrv.j0(sm8Var), mrv.j0(tblVar), mrv.j0(ysm0Var), mrv.j0(tblVar), mrv.j0(sm8Var), mrv.j0(ysm0Var), mrv.j0((jiy) a8zVarArr[39].getValue()), mrv.j0(tblVar), mrv.j0((jiy) a8zVarArr[41].getValue()), mrv.j0(okxVar), mrv.j0(tblVar), mrv.j0(tblVar), mrv.j0(ysm0Var), mrv.j0(sm8Var), mrv.j0(okxVar), mrv.j0(okxVar), mrv.j0(ysm0Var), mrv.j0(sm8Var), mrv.j0(okxVar), mrv.j0(sm8Var), mrv.j0(okxVar), mrv.j0(tblVar), mrv.j0(ysm0Var), mrv.j0(tblVar), mrv.j0(sm8Var)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        int i;
        Integer num;
        int i2;
        int i3;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        a8z[] a8zVarArr = oit0.g0;
        Integer num2 = null;
        Integer num3 = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        int i4 = 0;
        Boolean bool4 = null;
        Integer num4 = null;
        Integer num5 = null;
        Double d = null;
        String str3 = null;
        Double d2 = null;
        boolean z = true;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        List list = null;
        Integer num10 = null;
        Integer num11 = null;
        List list2 = null;
        String str4 = null;
        Boolean bool5 = null;
        Integer num12 = null;
        Integer num13 = null;
        Double d3 = null;
        String str5 = null;
        int i5 = 0;
        Integer num14 = null;
        Integer num15 = null;
        Integer num16 = null;
        Integer num17 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        String str6 = null;
        Boolean bool8 = null;
        Integer num18 = null;
        Boolean bool9 = null;
        Integer num19 = null;
        String str7 = null;
        Double d4 = null;
        Double d5 = null;
        List list3 = null;
        Double d6 = null;
        Double d7 = null;
        List list4 = null;
        Boolean bool10 = null;
        Boolean bool11 = null;
        Double d8 = null;
        String str8 = null;
        Double d9 = null;
        Boolean bool12 = null;
        String str9 = null;
        List list5 = null;
        Double d10 = null;
        List list6 = null;
        Integer num20 = null;
        Double d11 = null;
        Double d12 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    num3 = num3;
                    String str10 = str;
                    int i6 = i5;
                    Integer num21 = num14;
                    z = false;
                    num7 = num7;
                    num6 = num6;
                    bool = bool;
                    num14 = num21;
                    i5 = i6;
                    str = str10;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 0:
                    num2 = num2;
                    num3 = num3;
                    String str11 = str;
                    int i7 = i5;
                    i5 = i7 | 1;
                    bool = bool;
                    num14 = num14;
                    num7 = num7;
                    str = str11;
                    num6 = (Integer) bldVarA.e(ugi0Var, 0, okx.f25427a, num6);
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 1:
                    num3 = num3;
                    String str12 = str;
                    int i8 = i5;
                    i = i8 | 2;
                    num8 = num8;
                    bool = bool;
                    str = str12;
                    num7 = (Integer) bldVarA.e(ugi0Var, 1, okx.f25427a, num7);
                    num14 = num14;
                    num2 = num2;
                    i5 = i;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 2:
                    int i9 = i5;
                    num = num14;
                    i = i9 | 4;
                    num8 = (Integer) bldVarA.e(ugi0Var, 2, okx.f25427a, num8);
                    num7 = num7;
                    bool = bool;
                    str = str;
                    num2 = num2;
                    num14 = num;
                    i5 = i;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 3:
                    int i10 = i5;
                    num = num14;
                    i = i10 | 8;
                    num9 = (Integer) bldVarA.e(ugi0Var, 3, okx.f25427a, num9);
                    num7 = num7;
                    bool = bool;
                    str = str;
                    num2 = num2;
                    num14 = num;
                    i5 = i;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 4:
                    int i11 = i5;
                    num = num14;
                    i = i11 | 16;
                    list = (List) bldVarA.e(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list);
                    num7 = num7;
                    bool = bool;
                    str = str;
                    num2 = num2;
                    num14 = num;
                    i5 = i;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 5:
                    int i12 = i5;
                    num = num14;
                    i = i12 | 32;
                    num10 = (Integer) bldVarA.e(ugi0Var, 5, okx.f25427a, num10);
                    num7 = num7;
                    bool = bool;
                    str = str;
                    num2 = num2;
                    num14 = num;
                    i5 = i;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 6:
                    int i13 = i5;
                    num = num14;
                    i = i13 | 64;
                    num11 = (Integer) bldVarA.e(ugi0Var, 6, okx.f25427a, num11);
                    num7 = num7;
                    bool = bool;
                    str = str;
                    num2 = num2;
                    num14 = num;
                    i5 = i;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 7:
                    int i14 = i5;
                    num = num14;
                    i = i14 | 128;
                    list2 = (List) bldVarA.e(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list2);
                    num7 = num7;
                    bool = bool;
                    str = str;
                    num2 = num2;
                    num14 = num;
                    i5 = i;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 8:
                    i2 = i5 | 256;
                    str4 = (String) bldVarA.e(ugi0Var, 8, ysm0.f43175a, str4);
                    num7 = num7;
                    bool = bool;
                    str = str;
                    num14 = num14;
                    i5 = i2;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 9:
                    i2 = i5 | 512;
                    bool5 = (Boolean) bldVarA.e(ugi0Var, 9, sm8.f32432a, bool5);
                    num7 = num7;
                    bool = bool;
                    str = str;
                    num14 = num14;
                    i5 = i2;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 10:
                    int i15 = i5;
                    num = num14;
                    i = i15 | 1024;
                    num12 = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num12);
                    num7 = num7;
                    bool = bool;
                    str = str;
                    num2 = num2;
                    num14 = num;
                    i5 = i;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 11:
                    int i16 = i5;
                    num = num14;
                    i = i16 | 2048;
                    num13 = (Integer) bldVarA.e(ugi0Var, 11, okx.f25427a, num13);
                    num7 = num7;
                    bool = bool;
                    str = str;
                    num2 = num2;
                    num14 = num;
                    i5 = i;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 12:
                    int i17 = i5;
                    num = num14;
                    i = i17 | 4096;
                    d3 = (Double) bldVarA.e(ugi0Var, 12, tbl.f33669a, d3);
                    num7 = num7;
                    bool = bool;
                    str = str;
                    num2 = num2;
                    num14 = num;
                    i5 = i;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 13:
                    int i18 = i5;
                    num = num14;
                    i = i18 | 8192;
                    str5 = (String) bldVarA.e(ugi0Var, 13, ysm0.f43175a, str5);
                    num7 = num7;
                    bool = bool;
                    str = str;
                    num2 = num2;
                    num14 = num;
                    i5 = i;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 14:
                    i3 = i5 | 16384;
                    num14 = (Integer) bldVarA.e(ugi0Var, 14, okx.f25427a, num14);
                    i5 = i3;
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 15:
                    i3 = i5 | 32768;
                    num15 = (Integer) bldVarA.e(ugi0Var, 15, okx.f25427a, num15);
                    i5 = i3;
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 16:
                    i3 = i5 | 65536;
                    num16 = (Integer) bldVarA.e(ugi0Var, 16, okx.f25427a, num16);
                    i5 = i3;
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 17:
                    i3 = i5 | 131072;
                    num17 = (Integer) bldVarA.e(ugi0Var, 17, okx.f25427a, num17);
                    i5 = i3;
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 18:
                    i3 = i5 | 262144;
                    bool6 = (Boolean) bldVarA.e(ugi0Var, 18, sm8.f32432a, bool6);
                    i5 = i3;
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    num2 = num2;
                    num3 = num3;
                    str = str;
                    i5 |= 524288;
                    bool7 = (Boolean) bldVarA.e(ugi0Var, 19, sm8.f32432a, bool7);
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 20:
                    i3 = i5 | 1048576;
                    str6 = (String) bldVarA.e(ugi0Var, 20, ysm0.f43175a, str6);
                    i5 = i3;
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 21:
                    num2 = num2;
                    num3 = num3;
                    str = str;
                    i5 |= 2097152;
                    bool8 = (Boolean) bldVarA.e(ugi0Var, 21, sm8.f32432a, bool8);
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 22:
                    i3 = i5 | 4194304;
                    num18 = (Integer) bldVarA.e(ugi0Var, 22, okx.f25427a, num18);
                    i5 = i3;
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 23:
                    i3 = i5 | 8388608;
                    bool9 = (Boolean) bldVarA.e(ugi0Var, 23, sm8.f32432a, bool9);
                    i5 = i3;
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 24:
                    i3 = i5 | 16777216;
                    num19 = (Integer) bldVarA.e(ugi0Var, 24, okx.f25427a, num19);
                    i5 = i3;
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    i3 = i5 | 33554432;
                    str7 = (String) bldVarA.e(ugi0Var, 25, ysm0.f43175a, str7);
                    i5 = i3;
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    i3 = i5 | 67108864;
                    d4 = (Double) bldVarA.e(ugi0Var, 26, tbl.f33669a, d4);
                    i5 = i3;
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    i3 = i5 | 134217728;
                    d5 = (Double) bldVarA.e(ugi0Var, 27, tbl.f33669a, d5);
                    i5 = i3;
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    i3 = i5 | 268435456;
                    list3 = (List) bldVarA.e(ugi0Var, 28, (jiy) a8zVarArr[28].getValue(), list3);
                    i5 = i3;
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    i3 = i5 | 536870912;
                    d6 = (Double) bldVarA.e(ugi0Var, 29, tbl.f33669a, d6);
                    i5 = i3;
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    i3 = i5 | 1073741824;
                    d7 = (Double) bldVarA.e(ugi0Var, 30, tbl.f33669a, d7);
                    i5 = i3;
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    i3 = i5 | Integer.MIN_VALUE;
                    list4 = (List) bldVarA.e(ugi0Var, 31, (jiy) a8zVarArr[31].getValue(), list4);
                    i5 = i3;
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 32:
                    num2 = num2;
                    num3 = num3;
                    str = str;
                    i4 |= 1;
                    bool10 = (Boolean) bldVarA.e(ugi0Var, 32, sm8.f32432a, bool10);
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 33:
                    num2 = num2;
                    num3 = num3;
                    str = str;
                    i4 |= 2;
                    bool11 = (Boolean) bldVarA.e(ugi0Var, 33, sm8.f32432a, bool11);
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 34:
                    num2 = num2;
                    num3 = num3;
                    str = str;
                    i4 |= 4;
                    d8 = (Double) bldVarA.e(ugi0Var, 34, tbl.f33669a, d8);
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 35:
                    num2 = num2;
                    num3 = num3;
                    str = str;
                    i4 |= 8;
                    str8 = (String) bldVarA.e(ugi0Var, 35, ysm0.f43175a, str8);
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 36:
                    num2 = num2;
                    num3 = num3;
                    str = str;
                    i4 |= 16;
                    d9 = (Double) bldVarA.e(ugi0Var, 36, tbl.f33669a, d9);
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 37:
                    num2 = num2;
                    num3 = num3;
                    str = str;
                    i4 |= 32;
                    bool12 = (Boolean) bldVarA.e(ugi0Var, 37, sm8.f32432a, bool12);
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 38:
                    num2 = num2;
                    num3 = num3;
                    str = str;
                    i4 |= 64;
                    str9 = (String) bldVarA.e(ugi0Var, 38, ysm0.f43175a, str9);
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 39:
                    num2 = num2;
                    num3 = num3;
                    str = str;
                    i4 |= 128;
                    list5 = (List) bldVarA.e(ugi0Var, 39, (jiy) a8zVarArr[39].getValue(), list5);
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 40:
                    num2 = num2;
                    num3 = num3;
                    str = str;
                    i4 |= 256;
                    d10 = (Double) bldVarA.e(ugi0Var, 40, tbl.f33669a, d10);
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 41:
                    num2 = num2;
                    num3 = num3;
                    str = str;
                    i4 |= 512;
                    list6 = (List) bldVarA.e(ugi0Var, 41, (jiy) a8zVarArr[41].getValue(), list6);
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 42:
                    num2 = num2;
                    num3 = num3;
                    str = str;
                    i4 |= 1024;
                    num20 = (Integer) bldVarA.e(ugi0Var, 42, okx.f25427a, num20);
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 43:
                    num2 = num2;
                    num3 = num3;
                    str = str;
                    i4 |= 2048;
                    d11 = (Double) bldVarA.e(ugi0Var, 43, tbl.f33669a, d11);
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 44:
                    num2 = num2;
                    num3 = num3;
                    str = str;
                    i4 |= 4096;
                    d12 = (Double) bldVarA.e(ugi0Var, 44, tbl.f33669a, d12);
                    str = str;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 45:
                    num2 = num2;
                    num3 = num3;
                    str = (String) bldVarA.e(ugi0Var, 45, ysm0.f43175a, str);
                    i4 |= 8192;
                    num2 = num2;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 46:
                    bool = (Boolean) bldVarA.e(ugi0Var, 46, sm8.f32432a, bool);
                    i4 |= 16384;
                    num3 = num3;
                    num7 = num7;
                    str = str;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 47:
                    num3 = (Integer) bldVarA.e(ugi0Var, 47, okx.f25427a, num3);
                    i4 |= 32768;
                    num3 = num3;
                    num7 = num7;
                    str = str;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 48:
                    num2 = (Integer) bldVarA.e(ugi0Var, 48, okx.f25427a, num2);
                    i4 |= 65536;
                    num3 = num3;
                    num7 = num7;
                    str = str;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 49:
                    str2 = (String) bldVarA.e(ugi0Var, 49, ysm0.f43175a, str2);
                    i4 |= 131072;
                    num3 = num3;
                    num7 = num7;
                    str = str;
                    num7 = num7;
                    num3 = num3;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    bool4 = (Boolean) bldVarA.e(ugi0Var, 50, sm8.f32432a, bool4);
                    i4 |= 262144;
                    num3 = num3;
                    num7 = num7;
                    str = str;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 51:
                    num4 = (Integer) bldVarA.e(ugi0Var, 51, okx.f25427a, num4);
                    i4 |= 524288;
                    num3 = num3;
                    num7 = num7;
                    str = str;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 52:
                    bool3 = (Boolean) bldVarA.e(ugi0Var, 52, sm8.f32432a, bool3);
                    i4 |= 1048576;
                    num3 = num3;
                    num7 = num7;
                    str = str;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 53:
                    num5 = (Integer) bldVarA.e(ugi0Var, 53, okx.f25427a, num5);
                    i4 |= 2097152;
                    num3 = num3;
                    num7 = num7;
                    str = str;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 54:
                    d = (Double) bldVarA.e(ugi0Var, 54, tbl.f33669a, d);
                    i4 |= 4194304;
                    num3 = num3;
                    num7 = num7;
                    str = str;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 55:
                    str3 = (String) bldVarA.e(ugi0Var, 55, ysm0.f43175a, str3);
                    i4 |= 8388608;
                    num3 = num3;
                    num7 = num7;
                    str = str;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 56:
                    d2 = (Double) bldVarA.e(ugi0Var, 56, tbl.f33669a, d2);
                    i4 |= 16777216;
                    num3 = num3;
                    num7 = num7;
                    str = str;
                    num7 = num7;
                    num3 = num3;
                    break;
                case 57:
                    bool2 = (Boolean) bldVarA.e(ugi0Var, 57, sm8.f32432a, bool2);
                    i4 |= 33554432;
                    num3 = num3;
                    num7 = num7;
                    str = str;
                    num7 = num7;
                    num3 = num3;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Integer num22 = num3;
        String str13 = str;
        Integer num23 = num8;
        int i19 = i5;
        Integer num24 = num14;
        Boolean bool13 = bool;
        Integer num25 = num6;
        Integer num26 = num7;
        bldVarA.c(ugi0Var);
        return new oit0(i19, i4, num25, num26, num23, num9, list, num10, num11, list2, str4, bool5, num12, num13, d3, str5, num24, num15, num16, num17, bool6, bool7, str6, bool8, num18, bool9, num19, str7, d4, d5, list3, d6, d7, list4, bool10, bool11, d8, str8, d9, bool12, str9, list5, d10, list6, num20, d11, d12, str13, bool13, num22, num2, str2, bool4, num4, bool3, num5, d, str3, d2, bool2);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:235:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:241:0x0404  */
    /* JADX WARN: Code duplicated, block: B:247:0x0418  */
    /* JADX WARN: Code duplicated, block: B:253:0x042c  */
    /* JADX WARN: Code duplicated, block: B:259:0x0440  */
    /* JADX WARN: Code duplicated, block: B:265:0x0454  */
    /* JADX WARN: Code duplicated, block: B:271:0x0468  */
    /* JADX WARN: Code duplicated, block: B:277:0x0482  */
    /* JADX WARN: Code duplicated, block: B:283:0x0496  */
    /* JADX WARN: Code duplicated, block: B:289:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:295:0x04be  */
    /* JADX WARN: Code duplicated, block: B:301:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:307:0x04e6  */
    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        oit0 oit0Var;
        oit0 oit0Var2 = (oit0) obj;
        oit0Var2.getClass();
        Double d = oit0Var2.R;
        Integer num = oit0Var2.Q;
        List list = oit0Var2.P;
        Double d2 = oit0Var2.O;
        List list2 = oit0Var2.N;
        String str = oit0Var2.M;
        Boolean bool = oit0Var2.L;
        Double d3 = oit0Var2.K;
        String str2 = oit0Var2.J;
        Double d4 = oit0Var2.I;
        Boolean bool2 = oit0Var2.H;
        Boolean bool3 = oit0Var2.G;
        List list3 = oit0Var2.F;
        Double d5 = oit0Var2.E;
        Double d6 = oit0Var2.D;
        List list4 = oit0Var2.C;
        Double d7 = oit0Var2.B;
        Double d8 = oit0Var2.A;
        String str3 = oit0Var2.z;
        Integer num2 = oit0Var2.y;
        Boolean bool4 = oit0Var2.x;
        Integer num3 = oit0Var2.w;
        Boolean bool5 = oit0Var2.v;
        String str4 = oit0Var2.u;
        Boolean bool6 = oit0Var2.t;
        Boolean bool7 = oit0Var2.s;
        Integer num4 = oit0Var2.r;
        Integer num5 = oit0Var2.q;
        Integer num6 = oit0Var2.p;
        Integer num7 = oit0Var2.o;
        String str5 = oit0Var2.n;
        Double d9 = oit0Var2.m;
        Integer num8 = oit0Var2.l;
        Integer num9 = oit0Var2.k;
        Boolean bool8 = oit0Var2.j;
        String str6 = oit0Var2.i;
        List list5 = oit0Var2.h;
        Integer num10 = oit0Var2.g;
        Integer num11 = oit0Var2.f;
        List list6 = oit0Var2.e;
        Integer num12 = oit0Var2.d;
        Integer num13 = oit0Var2.c;
        Integer num14 = oit0Var2.b;
        Integer num15 = oit0Var2.f25328a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        a8z[] a8zVarArr = oit0.g0;
        if (cldVarA.u(ugi0Var) || num15 != null) {
            cldVarA.p(ugi0Var, 0, okx.f25427a, num15);
        }
        if (cldVarA.u(ugi0Var) || num14 != null) {
            cldVarA.p(ugi0Var, 1, okx.f25427a, num14);
        }
        if (cldVarA.u(ugi0Var) || num13 != null) {
            cldVarA.p(ugi0Var, 2, okx.f25427a, num13);
        }
        if (cldVarA.u(ugi0Var) || num12 != null) {
            cldVarA.p(ugi0Var, 3, okx.f25427a, num12);
        }
        if (cldVarA.u(ugi0Var) || list6 != null) {
            cldVarA.p(ugi0Var, 4, (jiy) a8zVarArr[4].getValue(), list6);
        }
        if (cldVarA.u(ugi0Var) || num11 != null) {
            cldVarA.p(ugi0Var, 5, okx.f25427a, num11);
        }
        if (cldVarA.u(ugi0Var) || num10 != null) {
            cldVarA.p(ugi0Var, 6, okx.f25427a, num10);
        }
        if (cldVarA.u(ugi0Var) || list5 != null) {
            cldVarA.p(ugi0Var, 7, (jiy) a8zVarArr[7].getValue(), list5);
        }
        if (cldVarA.u(ugi0Var) || str6 != null) {
            cldVarA.p(ugi0Var, 8, ysm0.f43175a, str6);
        }
        if (cldVarA.u(ugi0Var) || bool8 != null) {
            cldVarA.p(ugi0Var, 9, sm8.f32432a, bool8);
        }
        if (cldVarA.u(ugi0Var) || num9 != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num9);
        }
        if (cldVarA.u(ugi0Var) || num8 != null) {
            cldVarA.p(ugi0Var, 11, okx.f25427a, num8);
        }
        if (cldVarA.u(ugi0Var) || d9 != 0) {
            cldVarA.p(ugi0Var, 12, tbl.f33669a, d9);
        }
        if (cldVarA.u(ugi0Var) || str5 != 0) {
            cldVarA.p(ugi0Var, 13, ysm0.f43175a, str5);
        }
        if (cldVarA.u(ugi0Var) || num7 != null) {
            cldVarA.p(ugi0Var, 14, okx.f25427a, num7);
        }
        if (cldVarA.u(ugi0Var) || num6 != null) {
            cldVarA.p(ugi0Var, 15, okx.f25427a, num6);
        }
        if (cldVarA.u(ugi0Var) || num5 != null) {
            cldVarA.p(ugi0Var, 16, okx.f25427a, num5);
        }
        if (cldVarA.u(ugi0Var) || num4 != null) {
            cldVarA.p(ugi0Var, 17, okx.f25427a, num4);
        }
        if (cldVarA.u(ugi0Var) || bool7 != null) {
            cldVarA.p(ugi0Var, 18, sm8.f32432a, bool7);
        }
        if (cldVarA.u(ugi0Var) || bool6 != null) {
            cldVarA.p(ugi0Var, 19, sm8.f32432a, bool6);
        }
        if (cldVarA.u(ugi0Var) || str4 != null) {
            cldVarA.p(ugi0Var, 20, ysm0.f43175a, str4);
        }
        if (cldVarA.u(ugi0Var) || bool5 != null) {
            cldVarA.p(ugi0Var, 21, sm8.f32432a, bool5);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 22, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || bool4 != null) {
            cldVarA.p(ugi0Var, 23, sm8.f32432a, bool4);
        }
        if (cldVarA.u(ugi0Var) || num2 != null) {
            cldVarA.p(ugi0Var, 24, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || str3 != null) {
            cldVarA.p(ugi0Var, 25, ysm0.f43175a, str3);
        }
        if (cldVarA.u(ugi0Var) || d8 != null) {
            cldVarA.p(ugi0Var, 26, tbl.f33669a, d8);
        }
        if (cldVarA.u(ugi0Var) || d7 != null) {
            cldVarA.p(ugi0Var, 27, tbl.f33669a, d7);
        }
        if (cldVarA.u(ugi0Var) || list4 != null) {
            cldVarA.p(ugi0Var, 28, (jiy) a8zVarArr[28].getValue(), list4);
        }
        if (cldVarA.u(ugi0Var) || d6 != null) {
            cldVarA.p(ugi0Var, 29, tbl.f33669a, d6);
        }
        if (cldVarA.u(ugi0Var) || d5 != null) {
            cldVarA.p(ugi0Var, 30, tbl.f33669a, d5);
        }
        if (cldVarA.u(ugi0Var) || list3 != null) {
            cldVarA.p(ugi0Var, 31, (jiy) a8zVarArr[31].getValue(), list3);
        }
        if (cldVarA.u(ugi0Var) || bool3 != null) {
            cldVarA.p(ugi0Var, 32, sm8.f32432a, bool3);
        }
        if (cldVarA.u(ugi0Var) || bool2 != null) {
            cldVarA.p(ugi0Var, 33, sm8.f32432a, bool2);
        }
        if (cldVarA.u(ugi0Var) || d4 != null) {
            cldVarA.p(ugi0Var, 34, tbl.f33669a, d4);
        }
        if (cldVarA.u(ugi0Var) || str2 != null) {
            cldVarA.p(ugi0Var, 35, ysm0.f43175a, str2);
        }
        if (cldVarA.u(ugi0Var) || d3 != null) {
            cldVarA.p(ugi0Var, 36, tbl.f33669a, d3);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 37, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || str != null) {
            cldVarA.p(ugi0Var, 38, ysm0.f43175a, str);
        }
        if (cldVarA.u(ugi0Var) || list2 != null) {
            cldVarA.p(ugi0Var, 39, (jiy) a8zVarArr[39].getValue(), list2);
        }
        if (cldVarA.u(ugi0Var) || d2 != null) {
            cldVarA.p(ugi0Var, 40, tbl.f33669a, d2);
        }
        if (cldVarA.u(ugi0Var) || list != null) {
            cldVarA.p(ugi0Var, 41, (jiy) a8zVarArr[41].getValue(), list);
        }
        if (cldVarA.u(ugi0Var) || num != null) {
            cldVarA.p(ugi0Var, 42, okx.f25427a, num);
        }
        if (cldVarA.u(ugi0Var) || d != null) {
            cldVarA.p(ugi0Var, 43, tbl.f33669a, d);
        }
        if (!cldVarA.u(ugi0Var)) {
            oit0Var = oit0Var2;
            if (oit0Var.S != null) {
            }
            if (cldVarA.u(ugi0Var) || oit0Var.T != null) {
                cldVarA.p(ugi0Var, 45, ysm0.f43175a, oit0Var.T);
            }
            if (cldVarA.u(ugi0Var) || oit0Var.U != null) {
                cldVarA.p(ugi0Var, 46, sm8.f32432a, oit0Var.U);
            }
            if (cldVarA.u(ugi0Var) || oit0Var.V != null) {
                cldVarA.p(ugi0Var, 47, okx.f25427a, oit0Var.V);
            }
            if (cldVarA.u(ugi0Var) || oit0Var.W != null) {
                cldVarA.p(ugi0Var, 48, okx.f25427a, oit0Var.W);
            }
            if (cldVarA.u(ugi0Var) || oit0Var.X != null) {
                cldVarA.p(ugi0Var, 49, ysm0.f43175a, oit0Var.X);
            }
            if (cldVarA.u(ugi0Var) || oit0Var.Y != null) {
                cldVarA.p(ugi0Var, 50, sm8.f32432a, oit0Var.Y);
            }
            if (cldVarA.u(ugi0Var) || oit0Var.Z != null) {
                cldVarA.p(ugi0Var, 51, okx.f25427a, oit0Var.Z);
            }
            if (cldVarA.u(ugi0Var) || !Intrinsics.d(oit0Var.a0, Boolean.FALSE)) {
                cldVarA.p(ugi0Var, 52, sm8.f32432a, oit0Var.a0);
            }
            if (cldVarA.u(ugi0Var) || oit0Var.b0 != null) {
                cldVarA.p(ugi0Var, 53, okx.f25427a, oit0Var.b0);
            }
            if (cldVarA.u(ugi0Var) || oit0Var.c0 != null) {
                cldVarA.p(ugi0Var, 54, tbl.f33669a, oit0Var.c0);
            }
            if (cldVarA.u(ugi0Var) || oit0Var.d0 != null) {
                cldVarA.p(ugi0Var, 55, ysm0.f43175a, oit0Var.d0);
            }
            if (cldVarA.u(ugi0Var) || oit0Var.e0 != null) {
                cldVarA.p(ugi0Var, 56, tbl.f33669a, oit0Var.e0);
            }
            if (cldVarA.u(ugi0Var) || oit0Var.f0 != null) {
                cldVarA.p(ugi0Var, 57, sm8.f32432a, oit0Var.f0);
            }
            cldVarA.c(ugi0Var);
        }
        oit0Var = oit0Var2;
        cldVarA.p(ugi0Var, 44, tbl.f33669a, oit0Var.S);
        if (cldVarA.u(ugi0Var)) {
            cldVarA.p(ugi0Var, 45, ysm0.f43175a, oit0Var.T);
        } else {
            cldVarA.p(ugi0Var, 45, ysm0.f43175a, oit0Var.T);
        }
        if (cldVarA.u(ugi0Var)) {
            cldVarA.p(ugi0Var, 46, sm8.f32432a, oit0Var.U);
        } else {
            cldVarA.p(ugi0Var, 46, sm8.f32432a, oit0Var.U);
        }
        if (cldVarA.u(ugi0Var)) {
            cldVarA.p(ugi0Var, 47, okx.f25427a, oit0Var.V);
        } else {
            cldVarA.p(ugi0Var, 47, okx.f25427a, oit0Var.V);
        }
        if (cldVarA.u(ugi0Var)) {
            cldVarA.p(ugi0Var, 48, okx.f25427a, oit0Var.W);
        } else {
            cldVarA.p(ugi0Var, 48, okx.f25427a, oit0Var.W);
        }
        if (cldVarA.u(ugi0Var)) {
            cldVarA.p(ugi0Var, 49, ysm0.f43175a, oit0Var.X);
        } else {
            cldVarA.p(ugi0Var, 49, ysm0.f43175a, oit0Var.X);
        }
        if (cldVarA.u(ugi0Var)) {
            cldVarA.p(ugi0Var, 50, sm8.f32432a, oit0Var.Y);
        } else {
            cldVarA.p(ugi0Var, 50, sm8.f32432a, oit0Var.Y);
        }
        if (cldVarA.u(ugi0Var)) {
            cldVarA.p(ugi0Var, 51, okx.f25427a, oit0Var.Z);
        } else {
            cldVarA.p(ugi0Var, 51, okx.f25427a, oit0Var.Z);
        }
        if (cldVarA.u(ugi0Var)) {
            cldVarA.p(ugi0Var, 52, sm8.f32432a, oit0Var.a0);
        } else {
            cldVarA.p(ugi0Var, 52, sm8.f32432a, oit0Var.a0);
        }
        if (cldVarA.u(ugi0Var)) {
            cldVarA.p(ugi0Var, 53, okx.f25427a, oit0Var.b0);
        } else {
            cldVarA.p(ugi0Var, 53, okx.f25427a, oit0Var.b0);
        }
        if (cldVarA.u(ugi0Var)) {
            cldVarA.p(ugi0Var, 54, tbl.f33669a, oit0Var.c0);
        } else {
            cldVarA.p(ugi0Var, 54, tbl.f33669a, oit0Var.c0);
        }
        if (cldVarA.u(ugi0Var)) {
            cldVarA.p(ugi0Var, 55, ysm0.f43175a, oit0Var.d0);
        } else {
            cldVarA.p(ugi0Var, 55, ysm0.f43175a, oit0Var.d0);
        }
        if (cldVarA.u(ugi0Var)) {
            cldVarA.p(ugi0Var, 56, tbl.f33669a, oit0Var.e0);
        } else {
            cldVarA.p(ugi0Var, 56, tbl.f33669a, oit0Var.e0);
        }
        if (cldVarA.u(ugi0Var)) {
            cldVarA.p(ugi0Var, 57, sm8.f32432a, oit0Var.f0);
        } else {
            cldVarA.p(ugi0Var, 57, sm8.f32432a, oit0Var.f0);
        }
        cldVarA.c(ugi0Var);
    }
}
