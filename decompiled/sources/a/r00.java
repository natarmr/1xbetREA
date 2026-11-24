package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r00 implements w00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29603a;
    public final String b;

    public r00(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f29603a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r00)) {
            return false;
        }
        r00 r00Var = (r00) obj;
        return Intrinsics.d(this.f29603a, r00Var.f29603a) && Intrinsics.d(this.b, r00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29603a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Duel(firstTeamTitle=", this.f29603a, ", secondTeamTitle=", this.b, Separators.RPAREN);
    }
}
