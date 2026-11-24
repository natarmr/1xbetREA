package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class x5i0 {
    public static final u5i0 Companion = new u5i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40319a;
    public final String b;

    public /* synthetic */ x5i0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f40319a = null;
        } else {
            this.f40319a = str;
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
        if (!(obj instanceof x5i0)) {
            return false;
        }
        x5i0 x5i0Var = (x5i0) obj;
        return Intrinsics.d(this.f40319a, x5i0Var.f40319a) && Intrinsics.d(this.b, x5i0Var.b);
    }

    public final int hashCode() {
        String str = this.f40319a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("SelectorResponse(id=", this.f40319a, ", title=", this.b, Separators.RPAREN);
    }
}
