package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class iaa0 {
    public static final x9a0 Companion = new x9a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14428a;
    public final String b;

    public /* synthetic */ iaa0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f14428a = null;
        } else {
            this.f14428a = str;
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
        if (!(obj instanceof iaa0)) {
            return false;
        }
        iaa0 iaa0Var = (iaa0) obj;
        return Intrinsics.d(this.f14428a, iaa0Var.f14428a) && Intrinsics.d(this.b, iaa0Var.b);
    }

    public final int hashCode() {
        String str = this.f14428a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("PlayerResponse(id=", this.f14428a, ", name=", this.b, Separators.RPAREN);
    }
}
