package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class n4n0 {
    public static final i4n0 Companion = new i4n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22907a;
    public final String b;

    public /* synthetic */ n4n0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f22907a = null;
        } else {
            this.f22907a = str;
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
        if (!(obj instanceof n4n0)) {
            return false;
        }
        n4n0 n4n0Var = (n4n0) obj;
        return Intrinsics.d(this.f22907a, n4n0Var.f22907a) && Intrinsics.d(this.b, n4n0Var.b);
    }

    public final int hashCode() {
        String str = this.f22907a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("SubTeamResponse(image=", this.f22907a, ", title=", this.b, Separators.RPAREN);
    }
}
