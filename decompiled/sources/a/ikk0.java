package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ikk0 {
    public static final ekk0 Companion = new ekk0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14931a;
    public final String b;
    public final String c;
    public final hkk0 d;

    public /* synthetic */ ikk0(int i, String str, String str2, String str3, hkk0 hkk0Var) {
        if ((i & 1) == 0) {
            this.f14931a = null;
        } else {
            this.f14931a = str;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = hkk0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikk0)) {
            return false;
        }
        ikk0 ikk0Var = (ikk0) obj;
        return Intrinsics.d(this.f14931a, ikk0Var.f14931a) && Intrinsics.d(this.b, ikk0Var.b) && Intrinsics.d(this.c, ikk0Var.c) && Intrinsics.d(this.d, ikk0Var.d);
    }

    public final int hashCode() {
        String str = this.f14931a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        hkk0 hkk0Var = this.d;
        return iHashCode3 + (hkk0Var != null ? hkk0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SocketResponse(id=", this.f14931a, ", ci=", this.b, ", rt=");
        sbN.append(this.c);
        sbN.append(", payload=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
