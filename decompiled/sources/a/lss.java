package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lss implements qss {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f20596a;
    public final short b;

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public lss(long j, mdm mdmVar) {
        this.f20596a = mdmVar;
        this.b = (int) j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lss)) {
            return false;
        }
        lss lssVar = (lss) obj;
        return this.f20596a.equals(lssVar.f20596a) && ((long) this.b) == ((long) lssVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f20596a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(lottieConfig=" + this.f20596a + ", countDownTimeMillis=" + this.b + Separators.RPAREN;
    }
}
