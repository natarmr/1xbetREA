package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class uzr implements yzr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36549a;
    public final long b;
    public final boolean c;

    public uzr(String str, long j, boolean z) {
        this.f36549a = str;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzr)) {
            return false;
        }
        uzr uzrVar = (uzr) obj;
        return this.f36549a.equals(uzrVar.f36549a) && this.b == uzrVar.b && this.c == uzrVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(this.f36549a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(f140.o(this.b, "Description(subTitle=", this.f36549a, ", startTime="), ", timerEnabled=", this.c, Separators.RPAREN);
    }
}
