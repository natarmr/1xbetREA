package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class rhp {
    public static final qhp Companion = new qhp();
    public static final a8z[] t = {null, null, null, null, null, null, null, null, null, null, null, null, maz.a(wez.f39042a, new dfp(7)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f30502a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Long h;
    public Boolean i;
    public Boolean j;
    public Boolean k;
    public Boolean l;
    public List m;
    public Long n;
    public Long o;
    public Boolean p;
    public Boolean q;
    public Boolean r;
    public Boolean s;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhp)) {
            return false;
        }
        rhp rhpVar = (rhp) obj;
        return Intrinsics.d(this.f30502a, rhpVar.f30502a) && Intrinsics.d(this.b, rhpVar.b) && Intrinsics.d(this.c, rhpVar.c) && Intrinsics.d(this.d, rhpVar.d) && Intrinsics.d(this.e, rhpVar.e) && Intrinsics.d(this.f, rhpVar.f) && Intrinsics.d(this.g, rhpVar.g) && Intrinsics.d(this.h, rhpVar.h) && Intrinsics.d(this.i, rhpVar.i) && Intrinsics.d(this.j, rhpVar.j) && Intrinsics.d(this.k, rhpVar.k) && Intrinsics.d(this.l, rhpVar.l) && Intrinsics.d(this.m, rhpVar.m) && Intrinsics.d(this.n, rhpVar.n) && Intrinsics.d(this.o, rhpVar.o) && Intrinsics.d(this.p, rhpVar.p) && Intrinsics.d(this.q, rhpVar.q) && Intrinsics.d(this.r, rhpVar.r) && Intrinsics.d(this.s, rhpVar.s);
    }

    public final int hashCode() {
        Boolean bool = this.f30502a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.c;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.d;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.e;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f;
        int iHashCode6 = (iHashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.g;
        int iHashCode7 = (iHashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Long l = this.h;
        int iHashCode8 = (iHashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool8 = this.i;
        int iHashCode9 = (iHashCode8 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.j;
        int iHashCode10 = (iHashCode9 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.k;
        int iHashCode11 = (iHashCode10 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.l;
        int iHashCode12 = (iHashCode11 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        List list = this.m;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.n;
        int iHashCode14 = (iHashCode13 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.o;
        int iHashCode15 = (iHashCode14 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool12 = this.p;
        int iHashCode16 = (iHashCode15 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.q;
        int iHashCode17 = (iHashCode16 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.r;
        int iHashCode18 = (iHashCode17 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.s;
        return iHashCode18 + (bool15 != null ? bool15.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.f30502a;
        Boolean bool2 = this.b;
        Boolean bool3 = this.c;
        Boolean bool4 = this.d;
        Boolean bool5 = this.e;
        Boolean bool6 = this.f;
        Boolean bool7 = this.g;
        Long l = this.h;
        Boolean bool8 = this.i;
        Boolean bool9 = this.j;
        Boolean bool10 = this.k;
        Boolean bool11 = this.l;
        List list = this.m;
        Long l2 = this.n;
        Long l3 = this.o;
        Boolean bool12 = this.p;
        Boolean bool13 = this.q;
        Boolean bool14 = this.r;
        Boolean bool15 = this.s;
        StringBuilder sb = new StringBuilder("FeaturesConfig(hasBonusGamesForPTSOnly=");
        sb.append(bool);
        sb.append(", sportCashback=");
        sb.append(bool2);
        sb.append(", needHardUpdate=");
        defpackage.c.j(sb, bool3, ", needUpdate=", bool4, ", hasBlockRulesAgreement=");
        defpackage.c.j(sb, bool5, ", isCouponClearAfterBetByDefault=", bool6, ", hasPopularOnboardRegOrAuth=");
        sb.append(bool7);
        sb.append(", popularOnboardRegOrAuthTimer=");
        sb.append(l);
        sb.append(", hasFastBet=");
        defpackage.c.j(sb, bool8, ", newAccountLogonReg=", bool9, ", newChangePassword=");
        defpackage.c.j(sb, bool10, ", isBettingEnabled=", bool11, ", bettingEnabledGeo=");
        sb.append(list);
        sb.append(", halloweenLuckyWheelDateStart=");
        sb.append(l2);
        sb.append(", halloweenLuckyWheelDateEnd=");
        sb.append(l3);
        sb.append(", hasGamesWildFreebet=");
        sb.append(bool12);
        sb.append(", hasTopGamesBottom=");
        defpackage.c.j(sb, bool13, ", isCheckNewPromocodes=", bool14, ", hasUFC=");
        return defpackage.c.e(sb, bool15, Separators.RPAREN);
    }
}
