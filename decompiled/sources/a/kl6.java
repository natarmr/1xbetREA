package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class kl6 {
    public static final jl6 Companion = new jl6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f18470a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final String f;

    public /* synthetic */ kl6(int i, Boolean bool, Long l, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f18470a = null;
        } else {
            this.f18470a = l;
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
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl6)) {
            return false;
        }
        kl6 kl6Var = (kl6) obj;
        return Intrinsics.d(this.f18470a, kl6Var.f18470a) && Intrinsics.d(this.b, kl6Var.b) && Intrinsics.d(this.c, kl6Var.c) && Intrinsics.d(this.d, kl6Var.d) && Intrinsics.d(this.e, kl6Var.e) && Intrinsics.d(this.f, kl6Var.f);
    }

    public final int hashCode() {
        Long l = this.f18470a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f18470a, "BetBuilderSportResponse(id=", ", name=", this.b, ", nameEng=");
        h97.v(this.d, this.c, ", isCyber=", ", timeName=", sbS);
        return ua80.m(sbS, this.e, ", timesName=", this.f, Separators.RPAREN);
    }
}
