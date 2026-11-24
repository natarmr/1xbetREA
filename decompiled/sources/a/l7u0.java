package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class l7u0 {
    public static final k7u0 Companion = new k7u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f19577a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public Boolean j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7u0)) {
            return false;
        }
        l7u0 l7u0Var = (l7u0) obj;
        return Intrinsics.d(this.f19577a, l7u0Var.f19577a) && Intrinsics.d(this.b, l7u0Var.b) && Intrinsics.d(this.c, l7u0Var.c) && Intrinsics.d(this.d, l7u0Var.d) && Intrinsics.d(this.e, l7u0Var.e) && Intrinsics.d(this.f, l7u0Var.f) && Intrinsics.d(this.g, l7u0Var.g) && Intrinsics.d(this.h, l7u0Var.h) && Intrinsics.d(this.i, l7u0Var.i) && Intrinsics.d(this.j, l7u0Var.j);
    }

    public final int hashCode() {
        Boolean bool = this.f19577a;
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
        Boolean bool8 = this.h;
        int iHashCode8 = (iHashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.i;
        int iHashCode9 = (iHashCode8 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.j;
        return iHashCode9 + (bool10 != null ? bool10.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.f19577a;
        Boolean bool2 = this.b;
        Boolean bool3 = this.c;
        Boolean bool4 = this.d;
        Boolean bool5 = this.e;
        Boolean bool6 = this.f;
        Boolean bool7 = this.g;
        Boolean bool8 = this.h;
        Boolean bool9 = this.i;
        Boolean bool10 = this.j;
        StringBuilder sb = new StringBuilder("VerificationConfig(isNeedVerification=");
        sb.append(bool);
        sb.append(", blockDepositVerification=");
        sb.append(bool2);
        sb.append(", blockWithdrawVerification=");
        defpackage.c.j(sb, bool3, ", hasBlockAuthVerification=", bool4, ", hasVerificationNeedBottom=");
        defpackage.c.j(sb, bool5, ", isNeedCheckLimitsForNewsNotification=", bool6, ", isNeedCheckLimitForPushSend=");
        defpackage.c.j(sb, bool7, ", isNeedCheckEnabledPushForCustomerIO=", bool8, ", isNeedSendPushAttributeToCustomerIO=");
        sb.append(bool9);
        sb.append(", redirectToVerificationAfterLogin=");
        sb.append(bool10);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
