package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dlk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6286a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public dlk(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f6286a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlk)) {
            return false;
        }
        dlk dlkVar = (dlk) obj;
        return Intrinsics.d(this.f6286a, dlkVar.f6286a) && Intrinsics.d(this.b, dlkVar.b) && this.c == dlkVar.c && this.d == dlkVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f6286a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", isSecondScoreChange=", Separators.RPAREN, b1j.n("Score(firstScore=", this.f6286a, ", secondScore=", this.b, ", isFirstScoreChange="), this.c, this.d);
    }
}
