package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class tyr0 {
    public static final syr0 Companion = new syr0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34771a;
    public final String b;
    public final String c;

    public /* synthetic */ tyr0(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f34771a = null;
        } else {
            this.f34771a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyr0)) {
            return false;
        }
        tyr0 tyr0Var = (tyr0) obj;
        return Intrinsics.d(this.f34771a, tyr0Var.f34771a) && Intrinsics.d(this.b, tyr0Var.b) && Intrinsics.d(this.c, tyr0Var.c);
    }

    public final int hashCode() {
        String str = this.f34771a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(b1j.n("BlockImage(backgroundMediaValue=", this.f34771a, ", listMediaValue=", this.b, ", verticalImage="), this.c, Separators.RPAREN);
    }
}
