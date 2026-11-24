package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s5s implements u5s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31668a;
    public final boolean b;
    public final long c;

    public s5s(long j, boolean z, long j2) {
        this.f31668a = j;
        this.b = z;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5s)) {
            return false;
        }
        s5s s5sVar = (s5s) obj;
        return this.f31668a == s5sVar.f31668a && this.b == s5sVar.b && this.c == s5sVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + brm0.e(Long.hashCode(this.f31668a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.n(kng0.r(this.f31668a, "Success(gameId=", ", live=", this.b), this.c, ", champId=", Separators.RPAREN);
    }
}
