package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class vl30 extends xl30 {
    public static final ul30 Companion = new ul30();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37604a;
    public final String b;

    public vl30(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f37604a = null;
        } else {
            this.f37604a = str;
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
        if (!(obj instanceof vl30)) {
            return false;
        }
        vl30 vl30Var = (vl30) obj;
        return Intrinsics.d(this.f37604a, vl30Var.f37604a) && Intrinsics.d(this.b, vl30Var.b);
    }

    public final int hashCode() {
        String str = this.f37604a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("ImageStrippedSize(type=", this.f37604a, ", bytes=", this.b, Separators.RPAREN);
    }
}
