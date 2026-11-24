package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class b5s0 {
    public static final w4s0 Companion = new w4s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2019a;
    public final String b;

    public /* synthetic */ b5s0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f2019a = null;
        } else {
            this.f2019a = str;
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
        if (!(obj instanceof b5s0)) {
            return false;
        }
        b5s0 b5s0Var = (b5s0) obj;
        return Intrinsics.d(this.f2019a, b5s0Var.f2019a) && Intrinsics.d(this.b, b5s0Var.b);
    }

    public final int hashCode() {
        String str = this.f2019a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("TournamentResponse(id=", this.f2019a, ", title=", this.b, Separators.RPAREN);
    }
}
