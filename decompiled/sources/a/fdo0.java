package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class fdo0 {
    public static final ddo0 Companion = new ddo0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9368a;
    public final Integer b;
    public final String c;
    public final rko0 d;

    static {
        nko0 nko0Var = rko0.Companion;
    }

    public /* synthetic */ fdo0(int i, String str, Integer num, String str2, rko0 rko0Var) {
        if ((i & 1) == 0) {
            this.f9368a = null;
        } else {
            this.f9368a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = rko0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdo0)) {
            return false;
        }
        fdo0 fdo0Var = (fdo0) obj;
        return Intrinsics.d(this.f9368a, fdo0Var.f9368a) && Intrinsics.d(this.b, fdo0Var.b) && Intrinsics.d(this.c, fdo0Var.c) && Intrinsics.d(this.d, fdo0Var.d);
    }

    public final int hashCode() {
        String str = this.f9368a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        rko0 rko0Var = this.d;
        return iHashCode3 + (rko0Var != null ? rko0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "TabResponse(title=", this.f9368a, ", titleRefType=", ", titleRefId=");
        sbP.append(this.c);
        sbP.append(", table=");
        sbP.append(this.d);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
