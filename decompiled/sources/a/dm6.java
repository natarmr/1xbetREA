package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class dm6 {
    public static final cm6 Companion = new cm6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f6308a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ dm6(int i, Integer num, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f6308a = null;
        } else {
            this.f6308a = num;
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
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm6)) {
            return false;
        }
        dm6 dm6Var = (dm6) obj;
        return Intrinsics.d(this.f6308a, dm6Var.f6308a) && Intrinsics.d(this.b, dm6Var.b) && Intrinsics.d(this.c, dm6Var.c) && Intrinsics.d(this.d, dm6Var.d);
    }

    public final int hashCode() {
        Integer num = this.f6308a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(h97.n(this.f6308a, "BetBuilderTabloStatisticElementResponse(id=", ", s1=", this.b, ", s2="), this.c, ", statName=", this.d, Separators.RPAREN);
    }
}
