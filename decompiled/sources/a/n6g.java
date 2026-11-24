package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class n6g implements q6g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f22996a;
    public final long b;

    public n6g(jkm jkmVar, long j) {
        this.f22996a = jkmVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6g)) {
            return false;
        }
        n6g n6gVar = (n6g) obj;
        return this.f22996a.equals(n6gVar.f22996a) && this.b == n6gVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f22996a.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorState(lottieConfig=" + this.f22996a + ", countDownTimeMillis=" + this.b + Separators.RPAREN;
    }
}
