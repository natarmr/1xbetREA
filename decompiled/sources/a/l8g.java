package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class l8g implements o8g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f19602a;
    public final long b;

    public l8g(jkm jkmVar, long j) {
        this.f19602a = jkmVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8g)) {
            return false;
        }
        l8g l8gVar = (l8g) obj;
        return this.f19602a.equals(l8gVar.f19602a) && this.b == l8gVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f19602a.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorState(lottieConfig=" + this.f19602a + ", countDownTimeMillis=" + this.b + Separators.RPAREN;
    }
}
