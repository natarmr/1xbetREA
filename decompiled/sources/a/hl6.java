package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class hl6 {
    public static final gl6 Companion = new gl6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13242a;
    public final String b;

    public /* synthetic */ hl6(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f13242a = null;
        } else {
            this.f13242a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl6)) {
            return false;
        }
        hl6 hl6Var = (hl6) obj;
        return Intrinsics.d(this.f13242a, hl6Var.f13242a) && Intrinsics.d(this.b, hl6Var.b);
    }

    public final int hashCode() {
        String str = this.f13242a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("BetBuilderSeedsResponse(seedNum1=", this.f13242a, ", seedNum2=", this.b, Separators.RPAREN);
    }
}
