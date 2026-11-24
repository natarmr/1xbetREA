package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class iba0 {
    public static final hba0 Companion = new hba0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14478a;
    public final String b;
    public final Integer c;

    public /* synthetic */ iba0(int i, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f14478a = null;
        } else {
            this.f14478a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iba0)) {
            return false;
        }
        iba0 iba0Var = (iba0) obj;
        return Intrinsics.d(this.f14478a, iba0Var.f14478a) && Intrinsics.d(this.b, iba0Var.b) && Intrinsics.d(this.c, iba0Var.c);
    }

    public final int hashCode() {
        String str = this.f14478a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(b1j.n("PlayerSupportItemResponse(name=", this.f14478a, ", image=", this.b, ", count="), this.c, Separators.RPAREN);
    }
}
