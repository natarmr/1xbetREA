package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18881a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public kts(String str, String str2, boolean z, boolean z2) {
        this.f18881a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kts)) {
            return false;
        }
        kts ktsVar = (kts) obj;
        return this.f18881a.equals(ktsVar.f18881a) && this.b.equals(ktsVar.b) && this.c == ktsVar.c && this.d == ktsVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f18881a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", changeSecond=", Separators.RPAREN, b1j.n("GameSubScoreZip(subFirst=", this.f18881a, ", subSecond=", this.b, ", changeFirst="), this.c, this.d);
    }
}
