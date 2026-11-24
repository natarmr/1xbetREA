package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class t490 {
    public static final s490 Companion = new s490();
    public static final a8z[] v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f33309a;
    public Integer b;
    public List c;
    public List d;
    public String e;
    public String f;
    public String g;
    public List h;
    public List i;
    public Boolean j;
    public Boolean k;
    public Boolean l;
    public Boolean m;
    public Boolean n;
    public Boolean o;
    public Boolean p;
    public Boolean q;
    public String r;
    public Boolean s;
    public Boolean t;
    public List u;

    static {
        wez wezVar = wez.f39042a;
        v = new a8z[]{null, null, maz.a(wezVar, new i280((byte) 19)), maz.a(wezVar, new i280((byte) 20)), null, null, null, maz.a(wezVar, new i280((byte) 21)), maz.a(wezVar, new i280((byte) 22)), null, null, null, null, null, null, null, null, null, null, null, maz.a(wezVar, new i280((byte) 23))};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t490)) {
            return false;
        }
        t490 t490Var = (t490) obj;
        return Intrinsics.d(this.f33309a, t490Var.f33309a) && Intrinsics.d(this.b, t490Var.b) && Intrinsics.d(this.c, t490Var.c) && Intrinsics.d(this.d, t490Var.d) && Intrinsics.d(this.e, t490Var.e) && Intrinsics.d(this.f, t490Var.f) && Intrinsics.d(this.g, t490Var.g) && Intrinsics.d(this.h, t490Var.h) && Intrinsics.d(this.i, t490Var.i) && Intrinsics.d(this.j, t490Var.j) && Intrinsics.d(this.k, t490Var.k) && Intrinsics.d(this.l, t490Var.l) && Intrinsics.d(this.m, t490Var.m) && Intrinsics.d(this.n, t490Var.n) && Intrinsics.d(this.o, t490Var.o) && Intrinsics.d(this.p, t490Var.p) && Intrinsics.d(this.q, t490Var.q) && Intrinsics.d(this.r, t490Var.r) && Intrinsics.d(this.s, t490Var.s) && Intrinsics.d(this.t, t490Var.t) && Intrinsics.d(this.u, t490Var.u);
    }

    public final int hashCode() {
        String str = this.f33309a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list3 = this.h;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.i;
        int iHashCode9 = (iHashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool = this.j;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.k;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.l;
        int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.m;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.n;
        int iHashCode14 = (iHashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.o;
        int iHashCode15 = (iHashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.p;
        int iHashCode16 = (iHashCode15 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.q;
        int iHashCode17 = (iHashCode16 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        String str5 = this.r;
        int iHashCode18 = (iHashCode17 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool9 = this.s;
        int iHashCode19 = (iHashCode18 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.t;
        int iHashCode20 = (iHashCode19 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        List list5 = this.u;
        return iHashCode20 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f33309a;
        Integer num = this.b;
        List list = this.c;
        List list2 = this.d;
        String str2 = this.e;
        String str3 = this.f;
        String str4 = this.g;
        List list3 = this.h;
        List list4 = this.i;
        Boolean bool = this.j;
        Boolean bool2 = this.k;
        Boolean bool3 = this.l;
        Boolean bool4 = this.m;
        Boolean bool5 = this.n;
        Boolean bool6 = this.o;
        Boolean bool7 = this.p;
        Boolean bool8 = this.q;
        String str5 = this.r;
        Boolean bool9 = this.s;
        Boolean bool10 = this.t;
        List list5 = this.u;
        StringBuilder sbP = axq.p(num, "PaymentConfig(paymentHost=", str, ", popularSportsCount=", ", popularTab=");
        b1j.y(", popularCategories=", ", referralLink=", sbP, list, list2);
        f140.v(sbP, str2, ", registrationAgreements=", str3, ", xGamesName=");
        cs0.y(str4, ", restorePasswordAllowedCountries=", ", restorePasswordForbiddenCountries=", sbP, list3);
        sbP.append(list4);
        sbP.append(", redirectToPaymentAfterLogin=");
        sbP.append(bool);
        sbP.append(", hasPaymentRequests=");
        defpackage.c.j(sbP, bool2, ", hasPaymentAccountNumberKz=", bool3, ", hasExpressBoost=");
        defpackage.c.j(sbP, bool4, ", hasBetsOnFavorite=", bool5, ", isNewPromotions=");
        defpackage.c.j(sbP, bool6, ", hasCheckPushAlert=", bool7, ", isAutomaticSubscriptionFavorite=");
        defpackage.c.h(bool8, ", consultantChatUrl=", str5, ", hasSportCustomBanner=", sbP);
        defpackage.c.j(sbP, bool9, ", swipeStakeMustBeSet=", bool10, ", mlPopularAllowedGeo=");
        return dw9.r(sbP, list5, Separators.RPAREN);
    }
}
