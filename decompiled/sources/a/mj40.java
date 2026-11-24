package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class mj40 {
    public static final lj40 Companion = new lj40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21877a;
    public final String b;
    public final String c;
    public final String d;
    public final rj40 e;

    public /* synthetic */ mj40(int i, String str, String str2, String str3, String str4, rj40 rj40Var) {
        if ((i & 1) == 0) {
            this.f21877a = null;
        } else {
            this.f21877a = str;
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
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = rj40Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj40)) {
            return false;
        }
        mj40 mj40Var = (mj40) obj;
        return Intrinsics.d(this.f21877a, mj40Var.f21877a) && Intrinsics.d(this.b, mj40Var.b) && Intrinsics.d(this.c, mj40Var.c) && Intrinsics.d(this.d, mj40Var.d) && Intrinsics.d(this.e, mj40Var.e);
    }

    public final int hashCode() {
        String str = this.f21877a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        rj40 rj40Var = this.e;
        return iHashCode4 + (rj40Var != null ? rj40Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MlbbPlayerResponse(name=", this.f21877a, ", image=", this.b, ", role=");
        f140.v(sbN, this.c, ", countryImage=", this.d, ", stats=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
