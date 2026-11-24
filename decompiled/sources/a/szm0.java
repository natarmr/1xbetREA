package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class szm0 {
    public static final pzm0 Companion = new pzm0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33077a;
    public final String b;

    public /* synthetic */ szm0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f33077a = null;
        } else {
            this.f33077a = str;
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
        if (!(obj instanceof szm0)) {
            return false;
        }
        szm0 szm0Var = (szm0) obj;
        return Intrinsics.d(this.f33077a, szm0Var.f33077a) && Intrinsics.d(this.b, szm0Var.b);
    }

    public final int hashCode() {
        String str = this.f33077a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("SubScoreResponse(opponent1=", this.f33077a, ", opponent2=", this.b, Separators.RPAREN);
    }
}
