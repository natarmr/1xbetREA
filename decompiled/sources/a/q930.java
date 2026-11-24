package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class q930 {
    public static final p930 Companion = new p930();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28328a;
    public final String b;

    public /* synthetic */ q930(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f28328a = null;
        } else {
            this.f28328a = str;
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
        if (!(obj instanceof q930)) {
            return false;
        }
        q930 q930Var = (q930) obj;
        return Intrinsics.d(this.f28328a, q930Var.f28328a) && Intrinsics.d(this.b, q930Var.b);
    }

    public final int hashCode() {
        String str = this.f28328a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("MatchDomain(dataHex=", this.f28328a, ", ivHex=", this.b, Separators.RPAREN);
    }
}
