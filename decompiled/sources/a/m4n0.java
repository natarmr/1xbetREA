package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class m4n0 {
    public static final h4n0 Companion = new h4n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21180a;
    public final String b;

    public /* synthetic */ m4n0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f21180a = null;
        } else {
            this.f21180a = str;
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
        if (!(obj instanceof m4n0)) {
            return false;
        }
        m4n0 m4n0Var = (m4n0) obj;
        return Intrinsics.d(this.f21180a, m4n0Var.f21180a) && Intrinsics.d(this.b, m4n0Var.b);
    }

    public final int hashCode() {
        String str = this.f21180a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("SubTeamResponse(title=", this.f21180a, ", image=", this.b, Separators.RPAREN);
    }
}
