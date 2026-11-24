package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class o8d {
    public static final n8d Companion = new n8d();
    public static final a8z[] a0;
    public final Boolean A;
    public final Boolean B;
    public final Boolean C;
    public final Boolean D;
    public final Boolean E;
    public final Boolean F;
    public final Boolean G;
    public final String H;
    public final String I;
    public final Boolean J;
    public final List K;
    public final String L;
    public final String M;
    public final Boolean N;
    public final Boolean O;
    public final Boolean P;
    public final Boolean Q;
    public final Boolean R;
    public final Boolean S;
    public final Boolean T;
    public final Boolean U;
    public final Boolean V;
    public final Boolean W;
    public final List X;
    public final Boolean Y;
    public final Boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f24824a;
    public final String b;
    public final String c;
    public final List d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;
    public final String k;
    public final String l;
    public final String m;
    public final Boolean n;
    public final Boolean o;
    public final jxw p;
    public final Integer q;
    public final Integer r;
    public final Boolean s;
    public final Boolean t;
    public final Boolean u;
    public final Boolean v;
    public final Boolean w;
    public final Boolean x;
    public final Boolean y;
    public final Boolean z;

    static {
        wez wezVar = wez.f39042a;
        a0 = new a8z[]{null, null, null, maz.a(wezVar, new a7d((byte) 1)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new a7d((byte) 2)), null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new a7d((byte) 3)), null, null};
    }

    public /* synthetic */ o8d(int i, int i2, Integer num, String str, String str2, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str3, String str4, String str5, Boolean bool7, Boolean bool8, jxw jxwVar, Integer num2, Integer num3, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, String str6, String str7, Boolean bool24, List list2, String str8, String str9, Boolean bool25, Boolean bool26, Boolean bool27, Boolean bool28, Boolean bool29, Boolean bool30, Boolean bool31, Boolean bool32, Boolean bool33, Boolean bool34, List list3, Boolean bool35, Boolean bool36) {
        if ((i & 1) == 0) {
            this.f24824a = null;
        } else {
            this.f24824a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool4;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = bool6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str3;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str4;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = str5;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool7;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = bool8;
        }
        if ((i & 32768) == 0) {
            this.p = null;
        } else {
            this.p = jxwVar;
        }
        if ((i & 65536) == 0) {
            this.q = null;
        } else {
            this.q = num2;
        }
        if ((i & 131072) == 0) {
            this.r = null;
        } else {
            this.r = num3;
        }
        if ((i & 262144) == 0) {
            this.s = null;
        } else {
            this.s = bool9;
        }
        if ((i & 524288) == 0) {
            this.t = null;
        } else {
            this.t = bool10;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = bool11;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = bool12;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = bool13;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = bool14;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = bool15;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = bool16;
        }
        if ((67108864 & i) == 0) {
            this.A = null;
        } else {
            this.A = bool17;
        }
        if ((134217728 & i) == 0) {
            this.B = null;
        } else {
            this.B = bool18;
        }
        if ((268435456 & i) == 0) {
            this.C = null;
        } else {
            this.C = bool19;
        }
        if ((536870912 & i) == 0) {
            this.D = null;
        } else {
            this.D = bool20;
        }
        if ((1073741824 & i) == 0) {
            this.E = null;
        } else {
            this.E = bool21;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = bool22;
        }
        if ((i2 & 1) == 0) {
            this.G = null;
        } else {
            this.G = bool23;
        }
        if ((i2 & 2) == 0) {
            this.H = null;
        } else {
            this.H = str6;
        }
        if ((i2 & 4) == 0) {
            this.I = null;
        } else {
            this.I = str7;
        }
        if ((i2 & 8) == 0) {
            this.J = null;
        } else {
            this.J = bool24;
        }
        if ((i2 & 16) == 0) {
            this.K = null;
        } else {
            this.K = list2;
        }
        if ((i2 & 32) == 0) {
            this.L = null;
        } else {
            this.L = str8;
        }
        if ((i2 & 64) == 0) {
            this.M = null;
        } else {
            this.M = str9;
        }
        if ((i2 & 128) == 0) {
            this.N = null;
        } else {
            this.N = bool25;
        }
        if ((i2 & 256) == 0) {
            this.O = null;
        } else {
            this.O = bool26;
        }
        if ((i2 & 512) == 0) {
            this.P = null;
        } else {
            this.P = bool27;
        }
        if ((i2 & 1024) == 0) {
            this.Q = null;
        } else {
            this.Q = bool28;
        }
        if ((i2 & 2048) == 0) {
            this.R = null;
        } else {
            this.R = bool29;
        }
        if ((i2 & 4096) == 0) {
            this.S = null;
        } else {
            this.S = bool30;
        }
        if ((i2 & 8192) == 0) {
            this.T = null;
        } else {
            this.T = bool31;
        }
        if ((i2 & 16384) == 0) {
            this.U = null;
        } else {
            this.U = bool32;
        }
        if ((i2 & 32768) == 0) {
            this.V = null;
        } else {
            this.V = bool33;
        }
        if ((i2 & 65536) == 0) {
            this.W = null;
        } else {
            this.W = bool34;
        }
        if ((i2 & 131072) == 0) {
            this.X = null;
        } else {
            this.X = list3;
        }
        if ((i2 & 262144) == 0) {
            this.Y = null;
        } else {
            this.Y = bool35;
        }
        if ((i2 & 524288) == 0) {
            this.Z = null;
        } else {
            this.Z = bool36;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8d)) {
            return false;
        }
        o8d o8dVar = (o8d) obj;
        return Intrinsics.d(this.f24824a, o8dVar.f24824a) && Intrinsics.d(this.b, o8dVar.b) && Intrinsics.d(this.c, o8dVar.c) && Intrinsics.d(this.d, o8dVar.d) && Intrinsics.d(this.e, o8dVar.e) && Intrinsics.d(this.f, o8dVar.f) && Intrinsics.d(this.g, o8dVar.g) && Intrinsics.d(this.h, o8dVar.h) && Intrinsics.d(this.i, o8dVar.i) && Intrinsics.d(this.j, o8dVar.j) && Intrinsics.d(this.k, o8dVar.k) && Intrinsics.d(this.l, o8dVar.l) && Intrinsics.d(this.m, o8dVar.m) && Intrinsics.d(this.n, o8dVar.n) && Intrinsics.d(this.o, o8dVar.o) && this.p == o8dVar.p && Intrinsics.d(this.q, o8dVar.q) && Intrinsics.d(this.r, o8dVar.r) && Intrinsics.d(this.s, o8dVar.s) && Intrinsics.d(this.t, o8dVar.t) && Intrinsics.d(this.u, o8dVar.u) && Intrinsics.d(this.v, o8dVar.v) && Intrinsics.d(this.w, o8dVar.w) && Intrinsics.d(this.x, o8dVar.x) && Intrinsics.d(this.y, o8dVar.y) && Intrinsics.d(this.z, o8dVar.z) && Intrinsics.d(this.A, o8dVar.A) && Intrinsics.d(this.B, o8dVar.B) && Intrinsics.d(this.C, o8dVar.C) && Intrinsics.d(this.D, o8dVar.D) && Intrinsics.d(this.E, o8dVar.E) && Intrinsics.d(this.F, o8dVar.F) && Intrinsics.d(this.G, o8dVar.G) && Intrinsics.d(this.H, o8dVar.H) && Intrinsics.d(this.I, o8dVar.I) && Intrinsics.d(this.J, o8dVar.J) && Intrinsics.d(this.K, o8dVar.K) && Intrinsics.d(this.L, o8dVar.L) && Intrinsics.d(this.M, o8dVar.M) && Intrinsics.d(this.N, o8dVar.N) && Intrinsics.d(this.O, o8dVar.O) && Intrinsics.d(this.P, o8dVar.P) && Intrinsics.d(this.Q, o8dVar.Q) && Intrinsics.d(this.R, o8dVar.R) && Intrinsics.d(this.S, o8dVar.S) && Intrinsics.d(this.T, o8dVar.T) && Intrinsics.d(this.U, o8dVar.U) && Intrinsics.d(this.V, o8dVar.V) && Intrinsics.d(this.W, o8dVar.W) && Intrinsics.d(this.X, o8dVar.X) && Intrinsics.d(this.Y, o8dVar.Y) && Intrinsics.d(this.Z, o8dVar.Z);
    }

    public final int hashCode() {
        Integer num = this.f24824a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.g;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.h;
        int iHashCode8 = (iHashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.i;
        int iHashCode9 = (iHashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.j;
        int iHashCode10 = (iHashCode9 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.m;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool7 = this.n;
        int iHashCode14 = (iHashCode13 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.o;
        int iHashCode15 = (iHashCode14 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        jxw jxwVar = this.p;
        int iHashCode16 = (iHashCode15 + (jxwVar == null ? 0 : jxwVar.hashCode())) * 31;
        Integer num2 = this.q;
        int iHashCode17 = (iHashCode16 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.r;
        int iHashCode18 = (iHashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool9 = this.s;
        int iHashCode19 = (iHashCode18 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.t;
        int iHashCode20 = (iHashCode19 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.u;
        int iHashCode21 = (iHashCode20 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.v;
        int iHashCode22 = (iHashCode21 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.w;
        int iHashCode23 = (iHashCode22 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.x;
        int iHashCode24 = (iHashCode23 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.y;
        int iHashCode25 = (iHashCode24 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.z;
        int iHashCode26 = (iHashCode25 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.A;
        int iHashCode27 = (iHashCode26 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.B;
        int iHashCode28 = (iHashCode27 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.C;
        int iHashCode29 = (iHashCode28 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.D;
        int iHashCode30 = (iHashCode29 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.E;
        int iHashCode31 = (iHashCode30 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.F;
        int iHashCode32 = (iHashCode31 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        Boolean bool23 = this.G;
        int iHashCode33 = (iHashCode32 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        String str6 = this.H;
        int iHashCode34 = (iHashCode33 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.I;
        int iHashCode35 = (iHashCode34 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool24 = this.J;
        int iHashCode36 = (iHashCode35 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        List list2 = this.K;
        int iHashCode37 = (iHashCode36 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str8 = this.L;
        int iHashCode38 = (iHashCode37 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.M;
        int iHashCode39 = (iHashCode38 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool25 = this.N;
        int iHashCode40 = (iHashCode39 + (bool25 == null ? 0 : bool25.hashCode())) * 31;
        Boolean bool26 = this.O;
        int iHashCode41 = (iHashCode40 + (bool26 == null ? 0 : bool26.hashCode())) * 31;
        Boolean bool27 = this.P;
        int iHashCode42 = (iHashCode41 + (bool27 == null ? 0 : bool27.hashCode())) * 31;
        Boolean bool28 = this.Q;
        int iHashCode43 = (iHashCode42 + (bool28 == null ? 0 : bool28.hashCode())) * 31;
        Boolean bool29 = this.R;
        int iHashCode44 = (iHashCode43 + (bool29 == null ? 0 : bool29.hashCode())) * 31;
        Boolean bool30 = this.S;
        int iHashCode45 = (iHashCode44 + (bool30 == null ? 0 : bool30.hashCode())) * 31;
        Boolean bool31 = this.T;
        int iHashCode46 = (iHashCode45 + (bool31 == null ? 0 : bool31.hashCode())) * 31;
        Boolean bool32 = this.U;
        int iHashCode47 = (iHashCode46 + (bool32 == null ? 0 : bool32.hashCode())) * 31;
        Boolean bool33 = this.V;
        int iHashCode48 = (iHashCode47 + (bool33 == null ? 0 : bool33.hashCode())) * 31;
        Boolean bool34 = this.W;
        int iHashCode49 = (iHashCode48 + (bool34 == null ? 0 : bool34.hashCode())) * 31;
        List list3 = this.X;
        int iHashCode50 = (iHashCode49 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool35 = this.Y;
        int iHashCode51 = (iHashCode50 + (bool35 == null ? 0 : bool35.hashCode())) * 31;
        Boolean bool36 = this.Z;
        return iHashCode51 + (bool36 != null ? bool36.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f24824a, "Common(projectId=", ", siteDomain=", this.b, ", kibanaAppName=");
        cs0.y(this.c, ", availableThemes=", ", domainChecker=", sbN, this.d);
        defpackage.c.j(sbN, this.e, ", sendStartNotification=", this.f, ", canChangePhone=");
        defpackage.c.j(sbN, this.g, ", showSettingsTips=", this.h, ", showCouponTips=");
        defpackage.c.j(sbN, this.i, ", hasCustomerIo=", this.j, ", socialAppKey=");
        f140.v(sbN, this.k, ", socialAppKeyStage=", this.l, ", xSocialAppKey=");
        h97.v(this.n, this.m, ", showBetConstructorTips=", ", showOnboardingTips=", sbN);
        sbN.append(this.o);
        sbN.append(", identificationFlowConfig=");
        sbN.append(this.p);
        sbN.append(", sipTxtType=");
        rz4.y(sbN, this.q, ", lottieAnimationConfigTypeId=", this.r, ", customReceivingBTagFromBWPartnersServer=");
        defpackage.c.j(sbN, this.s, ", customReceivingBTagFromB22PartnersServer=", this.t, ", customReceivingBTagFromBetPariPartnersServer=");
        defpackage.c.j(sbN, this.u, ", showNewGameScreenTips=", this.v, ", needWidgetSettings=");
        defpackage.c.j(sbN, this.w, ", showRatingChartTips=", this.x, ", betCoeffTypeVisibleInHistory=");
        defpackage.c.j(sbN, this.y, ", hasChoicePhoneCodeForBindingPhone=", this.z, ", authLottieAnimationEnable=");
        defpackage.c.j(sbN, this.A, ", showInsightsTips=", this.B, ", hasItsMeRegulatorRegistration=");
        defpackage.c.j(sbN, this.C, ", hasBingoTop=", this.D, ", hasAggregatorTournamentTop=");
        defpackage.c.j(sbN, this.E, ", hasBalanceManagementTop=", this.F, ", hasBankNumberForChangeProfileScreen=");
        defpackage.c.h(this.G, ", tournamentBgName=", this.H, ", tournamentPrizeName=", sbN);
        h97.v(this.J, this.I, ", isBwUgandaRegistration=", ", countriesWithStandartVerifyDocs=", sbN);
        h97.y(", demoLogin=", this.L, ", demoPass=", sbN, this.K);
        h97.v(this.N, this.M, ", startScreenPartnersLogoAvailable=", ", hasPaymentAccountNumber=", sbN);
        defpackage.c.j(sbN, this.O, ", hasClaimButtonOnBonuses=", this.P, ", shopPopularPersonalizationTips=");
        defpackage.c.j(sbN, this.Q, ", showBonusesSubscriptionAlert=", this.R, ", sendInstallLog=");
        defpackage.c.j(sbN, this.S, ", notNeedCheckCurrentGeoIsAllowedCountry=", this.T, ", showOrganizer=");
        defpackage.c.j(sbN, this.U, ", checkVerificationSuccessDisabled=", this.V, ", hasCUIDInstallAF=");
        sbN.append(this.W);
        sbN.append(", oldDocCountriesArray=");
        sbN.append(this.X);
        sbN.append(", cyberTeamDetailsNeedTeamImageBackground=");
        sbN.append(this.Y);
        sbN.append(", federalTaxLegislationInfoEnabled=");
        sbN.append(this.Z);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
