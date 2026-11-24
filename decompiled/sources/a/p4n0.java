package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class p4n0 {
    public static final k4n0 Companion = new k4n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26362a;
    public final String b;

    public /* synthetic */ p4n0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f26362a = null;
        } else {
            this.f26362a = str;
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
        if (!(obj instanceof p4n0)) {
            return false;
        }
        p4n0 p4n0Var = (p4n0) obj;
        return Intrinsics.d(this.f26362a, p4n0Var.f26362a) && Intrinsics.d(this.b, p4n0Var.b);
    }

    public final int hashCode() {
        String str = this.f26362a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("SubTeamResponse(title=", this.f26362a, ", image=", this.b, Separators.RPAREN);
    }
}
