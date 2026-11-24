package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.BonusStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CitizenshipStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CityStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CountryStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.CurrencyStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.DocumentStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.PhoneStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.RegionStateModel;
import org.xplatform.registration.simple.impl.presentation.state.models.fields.SocialStateModel;

/* JADX INFO: loaded from: classes5.dex */
public final class r1f0 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final Integer D;
    public final SocialStateModel E;
    public final Integer F;
    public final boolean G;
    public final List H;
    public final Long I;
    public final Long J;
    public final boolean K;
    public final boolean L;
    public final q7f0 M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29678a;
    public final boolean b;
    public final BonusStateModel c;
    public final CityStateModel d;
    public final boolean e;
    public final boolean f;
    public final CountryStateModel g;
    public final CurrencyStateModel h;
    public final Long i;
    public final DocumentStateModel j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final CitizenshipStateModel o;
    public final String p;
    public final String q;
    public final PhoneStateModel r;
    public final Boolean s;
    public final String t;
    public final String u;
    public final RegionStateModel v;
    public final String w;
    public final boolean x;
    public final boolean y;
    public final String z;

    public r1f0(String str, boolean z, BonusStateModel bonusStateModel, CityStateModel cityStateModel, boolean z2, boolean z3, CountryStateModel countryStateModel, CurrencyStateModel currencyStateModel, Long l, DocumentStateModel documentStateModel, String str2, String str3, String str4, String str5, CitizenshipStateModel citizenshipStateModel, String str6, String str7, PhoneStateModel phoneStateModel, Boolean bool, String str8, String str9, RegionStateModel regionStateModel, String str10, boolean z4, boolean z5, String str11, boolean z6, boolean z7, boolean z8, Integer num, SocialStateModel socialStateModel, Integer num2, boolean z9, List list, Long l2, Long l3, boolean z10, boolean z11, q7f0 q7f0Var) {
        list.getClass();
        this.f29678a = str;
        this.b = z;
        this.c = bonusStateModel;
        this.d = cityStateModel;
        this.e = z2;
        this.f = z3;
        this.g = countryStateModel;
        this.h = currencyStateModel;
        this.i = l;
        this.j = documentStateModel;
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.n = str5;
        this.o = citizenshipStateModel;
        this.p = str6;
        this.q = str7;
        this.r = phoneStateModel;
        this.s = bool;
        this.t = str8;
        this.u = str9;
        this.v = regionStateModel;
        this.w = str10;
        this.x = z4;
        this.y = z5;
        this.z = str11;
        this.A = z6;
        this.B = z7;
        this.C = z8;
        this.D = num;
        this.E = socialStateModel;
        this.F = num2;
        this.G = z9;
        this.H = list;
        this.I = l2;
        this.J = l3;
        this.K = z10;
        this.L = z11;
        this.M = q7f0Var;
    }

    public static r1f0 a(r1f0 r1f0Var, String str, boolean z, BonusStateModel bonusStateModel, CityStateModel cityStateModel, boolean z2, boolean z3, CountryStateModel countryStateModel, CurrencyStateModel currencyStateModel, Long l, DocumentStateModel documentStateModel, String str2, String str3, String str4, String str5, CitizenshipStateModel citizenshipStateModel, String str6, String str7, PhoneStateModel phoneStateModel, Boolean bool, String str8, String str9, RegionStateModel regionStateModel, String str10, boolean z4, boolean z5, String str11, boolean z6, boolean z7, boolean z8, Integer num, SocialStateModel socialStateModel, Integer num2, boolean z9, List list, Long l2, Long l3, boolean z10, boolean z11, q7f0 q7f0Var, int i, int i2) {
        String str12 = (i & 1) != 0 ? r1f0Var.f29678a : str;
        boolean z12 = (i & 2) != 0 ? r1f0Var.b : z;
        BonusStateModel bonusStateModel2 = (i & 4) != 0 ? r1f0Var.c : bonusStateModel;
        CityStateModel cityStateModel2 = (i & 8) != 0 ? r1f0Var.d : cityStateModel;
        boolean z13 = (i & 16) != 0 ? r1f0Var.e : z2;
        boolean z14 = (i & 32) != 0 ? r1f0Var.f : z3;
        CountryStateModel countryStateModel2 = (i & 64) != 0 ? r1f0Var.g : countryStateModel;
        CurrencyStateModel currencyStateModel2 = (i & 128) != 0 ? r1f0Var.h : currencyStateModel;
        Long l4 = (i & 256) != 0 ? r1f0Var.i : l;
        DocumentStateModel documentStateModel2 = (i & 512) != 0 ? r1f0Var.j : documentStateModel;
        String str13 = (i & 1024) != 0 ? r1f0Var.k : str2;
        String str14 = (i & 2048) != 0 ? r1f0Var.l : str3;
        String str15 = (i & 4096) != 0 ? r1f0Var.m : str4;
        String str16 = (i & 8192) != 0 ? r1f0Var.n : str5;
        String str17 = str12;
        CitizenshipStateModel citizenshipStateModel2 = (i & 16384) != 0 ? r1f0Var.o : citizenshipStateModel;
        String str18 = (i & 32768) != 0 ? r1f0Var.p : str6;
        String str19 = (i & 65536) != 0 ? r1f0Var.q : str7;
        PhoneStateModel phoneStateModel2 = (i & 131072) != 0 ? r1f0Var.r : phoneStateModel;
        Boolean bool2 = (i & 262144) != 0 ? r1f0Var.s : bool;
        String str20 = (i & 524288) != 0 ? r1f0Var.t : str8;
        String str21 = (i & 1048576) != 0 ? r1f0Var.u : str9;
        RegionStateModel regionStateModel2 = (i & 2097152) != 0 ? r1f0Var.v : regionStateModel;
        String str22 = (i & 4194304) != 0 ? r1f0Var.w : str10;
        boolean z15 = (i & 8388608) != 0 ? r1f0Var.x : z4;
        boolean z16 = (i & 16777216) != 0 ? r1f0Var.y : z5;
        String str23 = (i & 33554432) != 0 ? r1f0Var.z : str11;
        boolean z17 = (i & 67108864) != 0 ? r1f0Var.A : z6;
        boolean z18 = (i & 134217728) != 0 ? r1f0Var.B : z7;
        boolean z19 = (i & 268435456) != 0 ? r1f0Var.C : z8;
        Integer num3 = (i & 536870912) != 0 ? r1f0Var.D : num;
        SocialStateModel socialStateModel2 = (i & 1073741824) != 0 ? r1f0Var.E : socialStateModel;
        Integer num4 = (i & Integer.MIN_VALUE) != 0 ? r1f0Var.F : num2;
        boolean z20 = (i2 & 1) != 0 ? r1f0Var.G : z9;
        List list2 = (i2 & 2) != 0 ? r1f0Var.H : list;
        Long l5 = (i2 & 4) != 0 ? r1f0Var.I : l2;
        Long l6 = (i2 & 8) != 0 ? r1f0Var.J : l3;
        boolean z21 = (i2 & 16) != 0 ? r1f0Var.K : z10;
        boolean z22 = (i2 & 32) != 0 ? r1f0Var.L : z11;
        q7f0 q7f0Var2 = (i2 & 64) != 0 ? r1f0Var.M : q7f0Var;
        r1f0Var.getClass();
        list2.getClass();
        return new r1f0(str17, z12, bonusStateModel2, cityStateModel2, z13, z14, countryStateModel2, currencyStateModel2, l4, documentStateModel2, str13, str14, str15, str16, citizenshipStateModel2, str18, str19, phoneStateModel2, bool2, str20, str21, regionStateModel2, str22, z15, z16, str23, z17, z18, z19, num3, socialStateModel2, num4, z20, list2, l5, l6, z21, z22, q7f0Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1f0)) {
            return false;
        }
        r1f0 r1f0Var = (r1f0) obj;
        return Intrinsics.d(this.f29678a, r1f0Var.f29678a) && this.b == r1f0Var.b && Intrinsics.d(this.c, r1f0Var.c) && Intrinsics.d(this.d, r1f0Var.d) && this.e == r1f0Var.e && this.f == r1f0Var.f && Intrinsics.d(this.g, r1f0Var.g) && Intrinsics.d(this.h, r1f0Var.h) && Intrinsics.d(this.i, r1f0Var.i) && Intrinsics.d(this.j, r1f0Var.j) && Intrinsics.d(this.k, r1f0Var.k) && Intrinsics.d(this.l, r1f0Var.l) && Intrinsics.d(this.m, r1f0Var.m) && Intrinsics.d(this.n, r1f0Var.n) && Intrinsics.d(this.o, r1f0Var.o) && Intrinsics.d(this.p, r1f0Var.p) && Intrinsics.d(this.q, r1f0Var.q) && Intrinsics.d(this.r, r1f0Var.r) && Intrinsics.d(this.s, r1f0Var.s) && Intrinsics.d(this.t, r1f0Var.t) && Intrinsics.d(this.u, r1f0Var.u) && Intrinsics.d(this.v, r1f0Var.v) && Intrinsics.d(this.w, r1f0Var.w) && this.x == r1f0Var.x && this.y == r1f0Var.y && Intrinsics.d(this.z, r1f0Var.z) && this.A == r1f0Var.A && this.B == r1f0Var.B && this.C == r1f0Var.C && Intrinsics.d(this.D, r1f0Var.D) && Intrinsics.d(this.E, r1f0Var.E) && Intrinsics.d(this.F, r1f0Var.F) && this.G == r1f0Var.G && Intrinsics.d(this.H, r1f0Var.H) && Intrinsics.d(this.I, r1f0Var.I) && Intrinsics.d(this.J, r1f0Var.J) && this.K == r1f0Var.K && this.L == r1f0Var.L && this.M == r1f0Var.M;
    }

    public final int hashCode() {
        String str = this.f29678a;
        int iE = brm0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        BonusStateModel bonusStateModel = this.c;
        int iHashCode = (iE + (bonusStateModel == null ? 0 : bonusStateModel.hashCode())) * 31;
        CityStateModel cityStateModel = this.d;
        int iE2 = brm0.e(brm0.e((iHashCode + (cityStateModel == null ? 0 : cityStateModel.hashCode())) * 31, 31, this.e), 31, this.f);
        CountryStateModel countryStateModel = this.g;
        int iHashCode2 = (iE2 + (countryStateModel == null ? 0 : countryStateModel.hashCode())) * 31;
        CurrencyStateModel currencyStateModel = this.h;
        int iHashCode3 = (iHashCode2 + (currencyStateModel == null ? 0 : currencyStateModel.hashCode())) * 31;
        Long l = this.i;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        DocumentStateModel documentStateModel = this.j;
        int iHashCode5 = (iHashCode4 + (documentStateModel == null ? 0 : documentStateModel.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.m;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        CitizenshipStateModel citizenshipStateModel = this.o;
        int iHashCode10 = (iHashCode9 + (citizenshipStateModel == null ? 0 : citizenshipStateModel.hashCode())) * 31;
        String str6 = this.p;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.q;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        PhoneStateModel phoneStateModel = this.r;
        int iHashCode13 = (iHashCode12 + (phoneStateModel == null ? 0 : phoneStateModel.hashCode())) * 31;
        Boolean bool = this.s;
        int iHashCode14 = (iHashCode13 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.t;
        int iHashCode15 = (iHashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.u;
        int iHashCode16 = (iHashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        RegionStateModel regionStateModel = this.v;
        int iHashCode17 = (iHashCode16 + (regionStateModel == null ? 0 : regionStateModel.hashCode())) * 31;
        String str10 = this.w;
        int iE3 = brm0.e(brm0.e((iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31, 31, this.x), 31, this.y);
        String str11 = this.z;
        int iE4 = brm0.e(brm0.e(brm0.e((iE3 + (str11 == null ? 0 : str11.hashCode())) * 31, 31, this.A), 31, this.B), 31, this.C);
        Integer num = this.D;
        int iHashCode18 = (iE4 + (num == null ? 0 : num.hashCode())) * 31;
        SocialStateModel socialStateModel = this.E;
        int iHashCode19 = (iHashCode18 + (socialStateModel == null ? 0 : socialStateModel.hashCode())) * 31;
        Integer num2 = this.F;
        int iA = dw9.a(brm0.e((iHashCode19 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.G), 31, this.H);
        Long l2 = this.I;
        int iHashCode20 = (iA + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.J;
        int iE5 = brm0.e(brm0.e((iHashCode20 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.K), 31, this.L);
        q7f0 q7f0Var = this.M;
        return iE5 + (q7f0Var != null ? q7f0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("RegistrationFieldsStateModel(address=", this.f29678a, ", ageConfirmation=", this.b, ", bonusStateModel=");
        sbU.append(this.c);
        sbU.append(", cityStateModel=");
        sbU.append(this.d);
        sbU.append(", commercialCommunication=");
        ua80.u(", notifyNewsCall=", ", countryStateModel=", sbU, this.e, this.f);
        sbU.append(this.g);
        sbU.append(", currencyStateModel=");
        sbU.append(this.h);
        sbU.append(", date=");
        sbU.append(this.i);
        sbU.append(", documentStateModel=");
        sbU.append(this.j);
        sbU.append(", email=");
        f140.v(sbU, this.k, ", firstName=", this.l, ", lastName=");
        f140.v(sbU, this.m, ", middleName=", this.n, ", citizenshipStateModel=");
        sbU.append(this.o);
        sbU.append(", passportNumber=");
        sbU.append(this.p);
        sbU.append(", password=");
        sbU.append(this.q);
        sbU.append(", phoneStateModel=");
        sbU.append(this.r);
        sbU.append(", politicalExposedPerson=");
        defpackage.c.h(this.s, ", postCode=", this.t, ", promoCode=", sbU);
        sbU.append(this.u);
        sbU.append(", regionStateModel=");
        sbU.append(this.v);
        sbU.append(", repeatPassword=");
        brm0.C(this.w, ", rulesConfirmation=", ", rulesConfirmationAll=", sbU, this.x);
        f140.s(", secondLastName=", this.z, ", sendEmailBets=", sbU, this.y);
        ua80.u(", sendEmailNews=", ", sharePersonalDataConfirmation=", sbU, this.A, this.B);
        sbU.append(this.C);
        sbU.append(", socialTypeId=");
        sbU.append(this.D);
        sbU.append(", socialStateModel=");
        sbU.append(this.E);
        sbU.append(", genderTypeId=");
        sbU.append(this.F);
        sbU.append(", passwordRequirementBlockExpanded=");
        vqd.y(sbU, ", bonusList=", this.H, ", passportDateExpire=", this.G);
        cs0.A(sbU, this.I, ", passportDateIssue=", this.J, ", socialBlockExpand=");
        ua80.u(", sendSmsEvents=", ", registrationType=", sbU, this.K, this.L);
        sbU.append(this.M);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
